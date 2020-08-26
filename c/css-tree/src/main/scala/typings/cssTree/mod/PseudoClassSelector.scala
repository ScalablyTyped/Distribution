package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PseudoClassSelector
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] | Null = js.native
  var name: String = js.native
  @JSName("type")
  var type_PseudoClassSelector: typings.cssTree.cssTreeStrings.PseudoClassSelector = js.native
}

object PseudoClassSelector {
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector): PseudoClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoClassSelector]
  }
  @scala.inline
  implicit class PseudoClassSelectorOps[Self <: PseudoClassSelector] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.PseudoClassSelector): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: List[CssNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
  
}

