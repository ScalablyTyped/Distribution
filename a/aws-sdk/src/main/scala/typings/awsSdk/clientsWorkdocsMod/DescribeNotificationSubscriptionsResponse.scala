package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotificationSubscriptionsResponse extends StObject {
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  
  /**
    * The subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionList] = js.undefined
}
object DescribeNotificationSubscriptionsResponse {
  
  inline def apply(): DescribeNotificationSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotificationSubscriptionsResponse]
  }
  
  extension [Self <: DescribeNotificationSubscriptionsResponse](x: Self) {
    
    inline def setMarker(value: PageMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setSubscriptions(value: SubscriptionList): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value*))
  }
}
