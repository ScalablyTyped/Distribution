package typings
package baseuiLib.blockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockOverrides extends js.Object {
  var Block: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object BlockOverrides {
  @scala.inline
  def apply(Block: baseuiLib.Override[_] = null): BlockOverrides = {
    val __obj = js.Dynamic.literal()
    if (Block != null) __obj.updateDynamic("Block")(Block.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockOverrides]
  }
}

