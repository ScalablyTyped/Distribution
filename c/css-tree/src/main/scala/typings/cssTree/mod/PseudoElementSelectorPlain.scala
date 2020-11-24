package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoElementSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_PseudoElementSelectorPlain: typings.cssTree.cssTreeStrings.PseudoElementSelector = js.native
}
object PseudoElementSelectorPlain {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.PseudoElementSelector): PseudoElementSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementSelectorPlain]
  }
  
  @scala.inline
  implicit class PseudoElementSelectorPlainOps[Self <: PseudoElementSelectorPlain] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.cssTree.cssTreeStrings.PseudoElementSelector): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
}
