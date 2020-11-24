package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventAfterSelected extends js.Object {
  
  var classActive: String = js.native
  
  var eventAfterSelected: String = js.native
  
  var eventBeforeSelected: String = js.native
  
  var selectorButton: String = js.native
  
  var selectorInit: String = js.native
}
object EventAfterSelected {
  
  @scala.inline
  def apply(
    classActive: String,
    eventAfterSelected: String,
    eventBeforeSelected: String,
    selectorButton: String,
    selectorInit: String
  ): EventAfterSelected = {
    val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], eventAfterSelected = eventAfterSelected.asInstanceOf[js.Any], eventBeforeSelected = eventBeforeSelected.asInstanceOf[js.Any], selectorButton = selectorButton.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAfterSelected]
  }
  
  @scala.inline
  implicit class EventAfterSelectedOps[Self <: EventAfterSelected] (val x: Self) extends AnyVal {
    
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
    def setClassActive(value: String): Self = this.set("classActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterSelected(value: String): Self = this.set("eventAfterSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeSelected(value: String): Self = this.set("eventBeforeSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorButton(value: String): Self = this.set("selectorButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
  }
}
