package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventSubscriptionsResponse extends js.Object {
  
  /**
    * A list of event subscriptions.
    */
  var EventSubscriptionsList: js.UndefOr[typings.awsSdk.dmsMod.EventSubscriptionsList] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeEventSubscriptionsResponse {
  
  @scala.inline
  def apply(): DescribeEventSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeEventSubscriptionsResponseOps[Self <: DescribeEventSubscriptionsResponse] (val x: Self) extends AnyVal {
    
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
