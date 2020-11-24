package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInfoMap extends js.Object {
  
  /**
    * The category of an Amazon Redshift event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  
  /**
    * The description of an Amazon Redshift event.
    */
  var EventDescription: js.UndefOr[String] = js.native
  
  /**
    * The identifier of an Amazon Redshift event.
    */
  var EventId: js.UndefOr[String] = js.native
  
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.native
}
object EventInfoMap {
  
  @scala.inline
  def apply(): EventInfoMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInfoMap]
  }
  
  @scala.inline
  implicit class EventInfoMapOps[Self <: EventInfoMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = this.set("EventCategories", js.Array(value :_*))
    
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = this.set("EventCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCategories: Self = this.set("EventCategories", js.undefined)
    
    @scala.inline
    def setEventDescription(value: String): Self = this.set("EventDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDescription: Self = this.set("EventDescription", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("EventId", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
  }
}
