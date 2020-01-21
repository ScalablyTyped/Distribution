package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulePlain
  extends CssNodeCommon
     with CssNodePlain {
  var block: BlockPlain
  var prelude: SelectorListPlain | Raw
  @JSName("type")
  var type_RulePlain: typings.cssTree.cssTreeStrings.Rule
}

object RulePlain {
  @scala.inline
  def apply(
    block: BlockPlain,
    prelude: SelectorListPlain | Raw,
    `type`: typings.cssTree.cssTreeStrings.Rule,
    loc: CssLocation = null
  ): RulePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePlain]
  }
}

