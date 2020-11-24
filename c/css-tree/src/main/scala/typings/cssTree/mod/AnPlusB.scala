package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnPlusB
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var a: String | Null = js.native
  
  var b: String | Null = js.native
  
  @JSName("type")
  var type_AnPlusB: typings.cssTree.cssTreeStrings.AnPlusB = js.native
}
object AnPlusB {
  
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.AnPlusB): AnPlusB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnPlusB]
  }
  
  @scala.inline
  implicit class AnPlusBOps[Self <: AnPlusB] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.cssTree.cssTreeStrings.AnPlusB): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA(value: String): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANull: Self = this.set("a", null)
    
    @scala.inline
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBNull: Self = this.set("b", null)
  }
}
