package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotificationSubscriptionsResponse extends StObject {
  
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
  implicit class DescribeNotificationSubscriptionsResponseMutableBuilder[Self <: DescribeNotificationSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: SubscriptionList): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value :_*))
  }
}
