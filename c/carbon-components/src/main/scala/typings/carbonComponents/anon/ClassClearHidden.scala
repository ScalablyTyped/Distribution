package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassClearHidden extends js.Object {
  
  var classClearHidden: String = js.native
  
  var classLayoutHidden: String = js.native
  
  var selectorClearIcon: String = js.native
  
  var selectorIconContainer: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorSearchInput: String = js.native
  
  var selectorSearchView: String = js.native
}
object ClassClearHidden {
  
  @scala.inline
  def apply(
    classClearHidden: String,
    classLayoutHidden: String,
    selectorClearIcon: String,
    selectorIconContainer: String,
    selectorInit: String,
    selectorSearchInput: String,
    selectorSearchView: String
  ): ClassClearHidden = {
    val __obj = js.Dynamic.literal(classClearHidden = classClearHidden.asInstanceOf[js.Any], classLayoutHidden = classLayoutHidden.asInstanceOf[js.Any], selectorClearIcon = selectorClearIcon.asInstanceOf[js.Any], selectorIconContainer = selectorIconContainer.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorSearchInput = selectorSearchInput.asInstanceOf[js.Any], selectorSearchView = selectorSearchView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassClearHidden]
  }
  
  @scala.inline
  implicit class ClassClearHiddenOps[Self <: ClassClearHidden] (val x: Self) extends AnyVal {
    
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
    def setClassClearHidden(value: String): Self = this.set("classClearHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLayoutHidden(value: String): Self = this.set("classLayoutHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorClearIcon(value: String): Self = this.set("selectorClearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorIconContainer(value: String): Self = this.set("selectorIconContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSearchInput(value: String): Self = this.set("selectorSearchInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSearchView(value: String): Self = this.set("selectorSearchView", value.asInstanceOf[js.Any])
  }
}
