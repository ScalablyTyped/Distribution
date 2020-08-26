package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSubscriptionsMessage extends js.Object {
  /**
    * A list of EventSubscriptions data types.
    */
  var EventSubscriptionsList: js.UndefOr[typings.awsSdk.rdsMod.EventSubscriptionsList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object EventSubscriptionsMessage {
  @scala.inline
  def apply(): EventSubscriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscriptionsMessage]
  }
  @scala.inline
  implicit class EventSubscriptionsMessageOps[Self <: EventSubscriptionsMessage] (val x: Self) extends AnyVal {
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
    def setEventSubscriptionsListVarargs(value: EventSubscription*): Self = this.set("EventSubscriptionsList", js.Array(value :_*))
    @scala.inline
    def setEventSubscriptionsList(value: EventSubscriptionsList): Self = this.set("EventSubscriptionsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSubscriptionsList: Self = this.set("EventSubscriptionsList", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

