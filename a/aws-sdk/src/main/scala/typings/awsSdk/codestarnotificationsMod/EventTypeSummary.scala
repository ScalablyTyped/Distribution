package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTypeSummary extends js.Object {
  /**
    * The system-generated ID of the event.
    */
  var EventTypeId: js.UndefOr[typings.awsSdk.codestarnotificationsMod.EventTypeId] = js.native
  /**
    * The name of the event.
    */
  var EventTypeName: js.UndefOr[typings.awsSdk.codestarnotificationsMod.EventTypeName] = js.native
  /**
    * The resource type of the event.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ResourceType] = js.native
  /**
    * The name of the service for which the event applies.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.codestarnotificationsMod.ServiceName] = js.native
}

object EventTypeSummary {
  @scala.inline
  def apply(): EventTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeSummary]
  }
  @scala.inline
  implicit class EventTypeSummaryOps[Self <: EventTypeSummary] (val x: Self) extends AnyVal {
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
    def setEventTypeId(value: EventTypeId): Self = this.set("EventTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeId: Self = this.set("EventTypeId", js.undefined)
    @scala.inline
    def setEventTypeName(value: EventTypeName): Self = this.set("EventTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeName: Self = this.set("EventTypeName", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
  }
  
}

