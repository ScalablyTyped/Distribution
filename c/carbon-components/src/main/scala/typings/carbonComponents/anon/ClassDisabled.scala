package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassDisabled extends js.Object {
  
  var classDisabled: String = js.native
  
  var classFocused: String = js.native
  
  var classOpen: String = js.native
  
  var classSelected: String = js.native
  
  var classShowSelected: String = js.native
  
  var eventAfterSelected: String = js.native
  
  var eventBeforeSelected: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorItem: String = js.native
  
  var selectorItemFocused: String = js.native
  
  var selectorItemHidden: String = js.native
  
  var selectorItemSelected: String = js.native
  
  var selectorLinkSelected: String = js.native
  
  var selectorMenu: String = js.native
  
  var selectorText: String = js.native
  
  var selectorTextInner: String = js.native
  
  var selectorTrigger: String = js.native
}
object ClassDisabled {
  
  @scala.inline
  def apply(
    classDisabled: String,
    classFocused: String,
    classOpen: String,
    classSelected: String,
    classShowSelected: String,
    eventAfterSelected: String,
    eventBeforeSelected: String,
    selectorInit: String,
    selectorItem: String,
    selectorItemFocused: String,
    selectorItemHidden: String,
    selectorItemSelected: String,
    selectorLinkSelected: String,
    selectorMenu: String,
    selectorText: String,
    selectorTextInner: String,
    selectorTrigger: String
  ): ClassDisabled = {
    val __obj = js.Dynamic.literal(classDisabled = classDisabled.asInstanceOf[js.Any], classFocused = classFocused.asInstanceOf[js.Any], classOpen = classOpen.asInstanceOf[js.Any], classSelected = classSelected.asInstanceOf[js.Any], classShowSelected = classShowSelected.asInstanceOf[js.Any], eventAfterSelected = eventAfterSelected.asInstanceOf[js.Any], eventBeforeSelected = eventBeforeSelected.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItem = selectorItem.asInstanceOf[js.Any], selectorItemFocused = selectorItemFocused.asInstanceOf[js.Any], selectorItemHidden = selectorItemHidden.asInstanceOf[js.Any], selectorItemSelected = selectorItemSelected.asInstanceOf[js.Any], selectorLinkSelected = selectorLinkSelected.asInstanceOf[js.Any], selectorMenu = selectorMenu.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], selectorTextInner = selectorTextInner.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassDisabled]
  }
  
  @scala.inline
  implicit class ClassDisabledOps[Self <: ClassDisabled] (val x: Self) extends AnyVal {
    
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
    def setClassDisabled(value: String): Self = this.set("classDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassFocused(value: String): Self = this.set("classFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassOpen(value: String): Self = this.set("classOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassSelected(value: String): Self = this.set("classSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassShowSelected(value: String): Self = this.set("classShowSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterSelected(value: String): Self = this.set("eventAfterSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeSelected(value: String): Self = this.set("eventBeforeSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorItem(value: String): Self = this.set("selectorItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorItemFocused(value: String): Self = this.set("selectorItemFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorItemHidden(value: String): Self = this.set("selectorItemHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorItemSelected(value: String): Self = this.set("selectorItemSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorLinkSelected(value: String): Self = this.set("selectorLinkSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorMenu(value: String): Self = this.set("selectorMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorText(value: String): Self = this.set("selectorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTextInner(value: String): Self = this.set("selectorTextInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTrigger(value: String): Self = this.set("selectorTrigger", value.asInstanceOf[js.Any])
  }
}
