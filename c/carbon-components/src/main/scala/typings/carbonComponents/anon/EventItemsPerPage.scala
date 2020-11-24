package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventItemsPerPage extends js.Object {
  
  var eventItemsPerPage: String = js.native
  
  var eventPageChange: String = js.native
  
  var eventPageNumber: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorItemsPerPageInput: String = js.native
  
  var selectorPageBackward: String = js.native
  
  var selectorPageForward: String = js.native
  
  var selectorPageNumberInput: String = js.native
}
object EventItemsPerPage {
  
  @scala.inline
  def apply(
    eventItemsPerPage: String,
    eventPageChange: String,
    eventPageNumber: String,
    selectorInit: String,
    selectorItemsPerPageInput: String,
    selectorPageBackward: String,
    selectorPageForward: String,
    selectorPageNumberInput: String
  ): EventItemsPerPage = {
    val __obj = js.Dynamic.literal(eventItemsPerPage = eventItemsPerPage.asInstanceOf[js.Any], eventPageChange = eventPageChange.asInstanceOf[js.Any], eventPageNumber = eventPageNumber.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItemsPerPageInput = selectorItemsPerPageInput.asInstanceOf[js.Any], selectorPageBackward = selectorPageBackward.asInstanceOf[js.Any], selectorPageForward = selectorPageForward.asInstanceOf[js.Any], selectorPageNumberInput = selectorPageNumberInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItemsPerPage]
  }
  
  @scala.inline
  implicit class EventItemsPerPageOps[Self <: EventItemsPerPage] (val x: Self) extends AnyVal {
    
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
    def setEventItemsPerPage(value: String): Self = this.set("eventItemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPageChange(value: String): Self = this.set("eventPageChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPageNumber(value: String): Self = this.set("eventPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorItemsPerPageInput(value: String): Self = this.set("selectorItemsPerPageInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageBackward(value: String): Self = this.set("selectorPageBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageForward(value: String): Self = this.set("selectorPageForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPageNumberInput(value: String): Self = this.set("selectorPageNumberInput", value.asInstanceOf[js.Any])
  }
}
