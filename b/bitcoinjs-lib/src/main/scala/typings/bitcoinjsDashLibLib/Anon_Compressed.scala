package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compressed extends js.Object {
  var compressed: js.UndefOr[scala.Boolean] = js.undefined
  var network: js.UndefOr[bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network] = js.undefined
}

object Anon_Compressed {
  @scala.inline
  def apply(
    compressed: js.UndefOr[scala.Boolean] = js.undefined,
    network: bitcoinjsDashLibLib.bitcoinjsDashLibMod.Network = null
  ): Anon_Compressed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed)
    if (network != null) __obj.updateDynamic("network")(network)
    __obj.asInstanceOf[Anon_Compressed]
  }
}

