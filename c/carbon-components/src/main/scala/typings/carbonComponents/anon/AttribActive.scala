package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttribActive extends js.Object {
  
  var attribActive: String = js.native
  
  var attribPage: String = js.native
  
  var classActive: String = js.native
  
  var classDisabled: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorPageActive: String = js.native
  
  var selectorPageButton: String = js.native
  
  var selectorPageElement: String = js.native
  
  var selectorPageNext: String = js.native
  
  var selectorPagePrevious: String = js.native
  
  var selectorPageSelect: String = js.native
}
object AttribActive {
  
  @scala.inline
  def apply(
    attribActive: String,
    attribPage: String,
    classActive: String,
    classDisabled: String,
    selectorInit: String,
    selectorPageActive: String,
    selectorPageButton: String,
    selectorPageElement: String,
    selectorPageNext: String,
    selectorPagePrevious: String,
    selectorPageSelect: String
  ): AttribActive = {
    val __obj = js.Dynamic.literal(attribActive = attribActive.asInstanceOf[js.Any], attribPage = attribPage.asInstanceOf[js.Any], classActive = classActive.asInstanceOf[js.Any], classDisabled = classDisabled.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorPageActive = selectorPageActive.asInstanceOf[js.Any], selectorPageButton = selectorPageButton.asInstanceOf[js.Any], selectorPageElement = selectorPageElement.asInstanceOf[js.Any], selectorPageNext = selectorPageNext.asInstanceOf[js.Any], selectorPagePrevious = selectorPagePrevious.asInstanceOf[js.Any], selectorPageSelect = selectorPageSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribActive]
  }
  
  @scala.inline
  implicit class AttribActiveOps[Self <: AttribActive] (val x: Self) extends AnyVal {
    
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
    def setAttribActive(value: String): Self = this.set("attribActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribPage(value: String): Self = this.set("attribPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassActive(value: String): Self = this.set("classActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassDisabled(value: String): Self = this.set("classDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageActive(value: String): Self = this.set("selectorPageActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageButton(value: String): Self = this.set("selectorPageButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageElement(value: String): Self = this.set("selectorPageElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageNext(value: String): Self = this.set("selectorPageNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPagePrevious(value: String): Self = this.set("selectorPagePrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageSelect(value: String): Self = this.set("selectorPageSelect", value.asInstanceOf[js.Any])
  }
}
