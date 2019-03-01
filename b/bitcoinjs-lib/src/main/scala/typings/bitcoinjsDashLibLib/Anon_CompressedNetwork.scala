package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompressedNetwork extends js.Object {
  var compressed: js.UndefOr[scala.Boolean] = js.undefined
  var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.undefined
  var rng: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Rng] = js.undefined
}

object Anon_CompressedNetwork {
  @scala.inline
  def apply(
    compressed: js.UndefOr[scala.Boolean] = js.undefined,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network = null,
    rng: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Rng = null
  ): Anon_CompressedNetwork = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed)
    if (network != null) __obj.updateDynamic("network")(network)
    if (rng != null) __obj.updateDynamic("rng")(rng)
    __obj.asInstanceOf[Anon_CompressedNetwork]
  }
}

