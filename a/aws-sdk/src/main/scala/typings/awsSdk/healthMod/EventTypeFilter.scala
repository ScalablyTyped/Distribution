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
  def apply(
    eventTypeCategories: EventTypeCategoryList_ = null,
    eventTypeCodes: EventTypeCodeList = null,
    services: serviceList = null
  ): EventTypeFilter = {
    val __obj = js.Dynamic.literal()
    if (eventTypeCategories != null) __obj.updateDynamic("eventTypeCategories")(eventTypeCategories.asInstanceOf[js.Any])
    if (eventTypeCodes != null) __obj.updateDynamic("eventTypeCodes")(eventTypeCodes.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTypeFilter]
  }
}

