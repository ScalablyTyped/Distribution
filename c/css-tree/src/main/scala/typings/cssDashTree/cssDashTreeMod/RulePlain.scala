package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulePlain
  extends CssNodeCommon
     with CssNodePlain {
  var block: BlockPlain
  var prelude: SelectorListPlain | Raw
  @JSName("type")
  var type_RulePlain: typings.cssDashTree.cssDashTreeStrings.Rule
}

object RulePlain {
  @scala.inline
  def apply(
    block: BlockPlain,
    prelude: SelectorListPlain | Raw,
    `type`: typings.cssDashTree.cssDashTreeStrings.Rule,
    loc: CssLocation = null
  ): RulePlain = {
    val __obj = js.Dynamic.literal(block = block, prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[RulePlain]
  }
}

