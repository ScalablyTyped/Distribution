package typings.bitcoinjsLib.psbtMod

import typings.bitcoinjsLib.networksMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtOptsOptional extends js.Object {
  var maximumFeeRate: js.UndefOr[Double] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
}

object PsbtOptsOptional {
  @scala.inline
  def apply(maximumFeeRate: js.UndefOr[Double] = js.undefined, network: Network = null): PsbtOptsOptional = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumFeeRate)) __obj.updateDynamic("maximumFeeRate")(maximumFeeRate.get.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOptsOptional]
  }
}

