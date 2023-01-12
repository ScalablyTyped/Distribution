package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * The endpoint of the subscription.
    */
  var EndPoint: js.UndefOr[SubscriptionEndPointType] = js.undefined
  
  /**
    * The protocol of the subscription.
    */
  var Protocol: js.UndefOr[SubscriptionProtocolType] = js.undefined
  
  /**
    * The ID of the subscription.
    */
  var SubscriptionId: js.UndefOr[IdType] = js.undefined
}
object Subscription {
  
  inline def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setEndPoint(value: SubscriptionEndPointType): Self = StObject.set(x, "EndPoint", value.asInstanceOf[js.Any])
    
    inline def setEndPointUndefined: Self = StObject.set(x, "EndPoint", js.undefined)
    
    inline def setProtocol(value: SubscriptionProtocolType): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSubscriptionId(value: IdType): Self = StObject.set(x, "SubscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "SubscriptionId", js.undefined)
  }
}
