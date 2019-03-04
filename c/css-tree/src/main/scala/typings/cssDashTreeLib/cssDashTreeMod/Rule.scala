package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule
  extends CssNodeCommon
     with CssNode {
  var block: Block
  var prelude: SelectorList | Raw
  @JSName("type")
  var type_Rule: cssDashTreeLib.cssDashTreeLibStrings.Rule
}

object Rule {
  @scala.inline
  def apply(
    block: Block,
    prelude: SelectorList | Raw,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Rule,
    loc: CssLocation = null
  ): Rule = {
    val __obj = js.Dynamic.literal(block = block, prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Rule]
  }
}

