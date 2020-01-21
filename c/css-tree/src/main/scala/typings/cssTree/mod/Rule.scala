package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule
  extends CssNodeCommon
     with CssNode {
  var block: Block
  var prelude: SelectorList | Raw
  @JSName("type")
  var type_Rule: typings.cssTree.cssTreeStrings.Rule
}

object Rule {
  @scala.inline
  def apply(
    block: Block,
    prelude: SelectorList | Raw,
    `type`: typings.cssTree.cssTreeStrings.Rule,
    loc: CssLocation = null
  ): Rule = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

