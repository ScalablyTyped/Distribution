package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttribShowLessText extends js.Object {
  
  var attribShowLessText: String = js.native
  
  var attribShowMoreText: String = js.native
  
  var classExpandBtn: String = js.native
  
  var classExpandText: String = js.native
  
  var classExpanded: String = js.native
  
  var classHideExpand: String = js.native
  
  var minHeight: Double = js.native
  
  var selectorInit: String = js.native
}
object AttribShowLessText {
  
  @scala.inline
  def apply(
    attribShowLessText: String,
    attribShowMoreText: String,
    classExpandBtn: String,
    classExpandText: String,
    classExpanded: String,
    classHideExpand: String,
    minHeight: Double,
    selectorInit: String
  ): AttribShowLessText = {
    val __obj = js.Dynamic.literal(attribShowLessText = attribShowLessText.asInstanceOf[js.Any], attribShowMoreText = attribShowMoreText.asInstanceOf[js.Any], classExpandBtn = classExpandBtn.asInstanceOf[js.Any], classExpandText = classExpandText.asInstanceOf[js.Any], classExpanded = classExpanded.asInstanceOf[js.Any], classHideExpand = classHideExpand.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribShowLessText]
  }
  
  @scala.inline
  implicit class AttribShowLessTextOps[Self <: AttribShowLessText] (val x: Self) extends AnyVal {
    
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
    def setAttribShowLessText(value: String): Self = this.set("attribShowLessText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribShowMoreText(value: String): Self = this.set("attribShowMoreText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpandBtn(value: String): Self = this.set("classExpandBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpandText(value: String): Self = this.set("classExpandText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpanded(value: String): Self = this.set("classExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassHideExpand(value: String): Self = this.set("classHideExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
  }
}
