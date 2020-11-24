package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttribExpanded extends js.Object {
  
  var attribExpanded: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorItem: String = js.native
  
  var selectorTrigger: String = js.native
}
object AttribExpanded {
  
  @scala.inline
  def apply(attribExpanded: String, selectorInit: String, selectorItem: String, selectorTrigger: String): AttribExpanded = {
    val __obj = js.Dynamic.literal(attribExpanded = attribExpanded.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItem = selectorItem.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribExpanded]
  }
  
  @scala.inline
  implicit class AttribExpandedOps[Self <: AttribExpanded] (val x: Self) extends AnyVal {
    
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
    def setAttribExpanded(value: String): Self = this.set("attribExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorItem(value: String): Self = this.set("selectorItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTrigger(value: String): Self = this.set("selectorTrigger", value.asInstanceOf[js.Any])
  }
}
