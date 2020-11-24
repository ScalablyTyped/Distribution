package typings.ckeditorCkeditor5Engine.mod.view.observer

import typings.ckeditorCkeditor5Engine.mod.view.Element
import typings.ckeditorCkeditor5Engine.mod.view.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutatedChildren extends js.Object {
  
  var newChildren: js.Array[Node] = js.native
  
  var node: Element = js.native
  
  var oldChildren: js.Array[Node] = js.native
  
  var `type`: String = js.native
}
object MutatedChildren {
  
  @scala.inline
  def apply(newChildren: js.Array[Node], node: Element, oldChildren: js.Array[Node], `type`: String): MutatedChildren = {
    val __obj = js.Dynamic.literal(newChildren = newChildren.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldChildren = oldChildren.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatedChildren]
  }
  
  @scala.inline
  implicit class MutatedChildrenOps[Self <: MutatedChildren] (val x: Self) extends AnyVal {
    
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
    def setNewChildrenVarargs(value: Node*): Self = this.set("newChildren", js.Array(value :_*))
    
    @scala.inline
    def setNewChildren(value: js.Array[Node]): Self = this.set("newChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Element): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldChildrenVarargs(value: Node*): Self = this.set("oldChildren", js.Array(value :_*))
    
    @scala.inline
    def setOldChildren(value: js.Array[Node]): Self = this.set("oldChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
