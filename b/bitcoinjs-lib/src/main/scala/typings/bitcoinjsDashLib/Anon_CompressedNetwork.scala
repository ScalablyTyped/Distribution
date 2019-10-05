package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.bitcoinjsDashLibMod.Network
import typings.bitcoinjsDashLib.bitcoinjsDashLibMod.Rng
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompressedNetwork extends js.Object {
  var compressed: js.UndefOr[Boolean] = js.undefined
  var network: js.UndefOr[Network] = js.undefined
  var rng: js.UndefOr[Rng] = js.undefined
}

object Anon_CompressedNetwork {
  @scala.inline
  def apply(
    compressed: js.UndefOr[Boolean] = js.undefined,
    network: Network = null,
    rng: /* size */ Double => Buffer = null
  ): Anon_CompressedNetwork = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed)
    if (network != null) __obj.updateDynamic("network")(network)
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction1(rng))
    __obj.asInstanceOf[Anon_CompressedNetwork]
  }
}

