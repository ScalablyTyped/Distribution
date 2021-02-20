package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends StObject {
  
  /**
    * The endpoint of the subscription.
    */
  var EndPoint: js.UndefOr[SubscriptionEndPointType] = js.native
  
  /**
    * The protocol of the subscription.
    */
  var Protocol: js.UndefOr[SubscriptionProtocolType] = js.native
  
  /**
    * The ID of the subscription.
    */
  var SubscriptionId: js.UndefOr[IdType] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPoint(value: SubscriptionEndPointType): Self = StObject.set(x, "EndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPointUndefined: Self = StObject.set(x, "EndPoint", js.undefined)
    
    @scala.inline
    def setProtocol(value: SubscriptionProtocolType): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: IdType): Self = StObject.set(x, "SubscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionIdUndefined: Self = StObject.set(x, "SubscriptionId", js.undefined)
  }
}
