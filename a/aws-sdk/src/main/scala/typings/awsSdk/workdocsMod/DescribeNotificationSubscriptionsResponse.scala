package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotificationSubscriptionsResponse extends js.Object {
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  
  /**
    * The subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionList] = js.native
}
object DescribeNotificationSubscriptionsResponse {
  
  @scala.inline
  def apply(): DescribeNotificationSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotificationSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeNotificationSubscriptionsResponseOps[Self <: DescribeNotificationSubscriptionsResponse] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = this.set("Subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: SubscriptionList): Self = this.set("Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("Subscriptions", js.undefined)
  }
}
