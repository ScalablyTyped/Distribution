package typings.baseui.blockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockOverrides extends js.Object {
  var Block: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object BlockOverrides {
  @scala.inline
  def apply(
    Block: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): BlockOverrides = {
    val __obj = js.Dynamic.literal()
    if (Block != null) __obj.updateDynamic("Block")(Block.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockOverrides]
  }
}

