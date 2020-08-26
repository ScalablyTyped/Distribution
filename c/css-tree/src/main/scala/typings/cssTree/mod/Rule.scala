package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule
  extends CssNodeCommon
     with CssNode {
  var block: Block = js.native
  var prelude: SelectorList | Raw = js.native
  @JSName("type")
  var type_Rule: typings.cssTree.cssTreeStrings.Rule = js.native
}

object Rule {
  @scala.inline
  def apply(block: Block, prelude: SelectorList | Raw, `type`: typings.cssTree.cssTreeStrings.Rule): Rule = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrelude(value: SelectorList | Raw): Self = this.set("prelude", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Rule): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

