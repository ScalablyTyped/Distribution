package typings.bitcoinjsLib.ecpairMod

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPairOptions extends js.Object {
  var compressed: js.UndefOr[Boolean] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
  var rng: js.UndefOr[js.Function1[/* arg0 */ Double, Buffer]] = js.undefined
}

object ECPairOptions {
  @scala.inline
  def apply(
    compressed: js.UndefOr[Boolean] = js.undefined,
    network: Network = null,
    rng: /* arg0 */ Double => Buffer = null
  ): ECPairOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction1(rng))
    __obj.asInstanceOf[ECPairOptions]
  }
}

