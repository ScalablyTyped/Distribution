package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoClassSelectorPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain] | Null = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_PseudoClassSelectorPlain: typings.cssTree.cssTreeStrings.PseudoClassSelector = js.native
}
object PseudoClassSelectorPlain {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector): PseudoClassSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoClassSelectorPlain]
  }
  
  @scala.inline
  implicit class PseudoClassSelectorPlainOps[Self <: PseudoClassSelectorPlain] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: CssNodePlain*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
}
