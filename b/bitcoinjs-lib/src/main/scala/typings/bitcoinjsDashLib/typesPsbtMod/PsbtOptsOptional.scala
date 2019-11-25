package typings.bitcoinjsDashLib.typesPsbtMod

import typings.bitcoinjsDashLib.typesNetworksMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtOptsOptional extends js.Object {
  var maximumFeeRate: js.UndefOr[Double] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
}

object PsbtOptsOptional {
  @scala.inline
  def apply(maximumFeeRate: Int | Double = null, network: Network = null): PsbtOptsOptional = {
    val __obj = js.Dynamic.literal()
    if (maximumFeeRate != null) __obj.updateDynamic("maximumFeeRate")(maximumFeeRate.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOptsOptional]
  }
}

