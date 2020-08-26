package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationList
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] = js.native
  @JSName("type")
  var type_DeclarationList: typings.cssTree.cssTreeStrings.DeclarationList = js.native
}

object DeclarationList {
  @scala.inline
  def apply(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.DeclarationList): DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationList]
  }
  @scala.inline
  implicit class DeclarationListOps[Self <: DeclarationList] (val x: Self) extends AnyVal {
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
    def setChildren(value: List[CssNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.DeclarationList): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

