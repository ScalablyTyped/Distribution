package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTypeFilter extends js.Object {
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[EventTypeCategoryList_] = js.native
  /**
    * A list of event type codes.
    */
  var eventTypeCodes: js.UndefOr[EventTypeCodeList] = js.native
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
}

object EventTypeFilter {
  @scala.inline
  def apply(): EventTypeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeFilter]
  }
  @scala.inline
  implicit class EventTypeFilterOps[Self <: EventTypeFilter] (val x: Self) extends AnyVal {
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
    def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = this.set("eventTypeCategories", js.Array(value :_*))
    @scala.inline
    def setEventTypeCategories(value: EventTypeCategoryList_): Self = this.set("eventTypeCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeCategories: Self = this.set("eventTypeCategories", js.undefined)
    @scala.inline
    def setEventTypeCodesVarargs(value: eventTypeCode*): Self = this.set("eventTypeCodes", js.Array(value :_*))
    @scala.inline
    def setEventTypeCodes(value: EventTypeCodeList): Self = this.set("eventTypeCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeCodes: Self = this.set("eventTypeCodes", js.undefined)
    @scala.inline
    def setServicesVarargs(value: service*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: serviceList): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

