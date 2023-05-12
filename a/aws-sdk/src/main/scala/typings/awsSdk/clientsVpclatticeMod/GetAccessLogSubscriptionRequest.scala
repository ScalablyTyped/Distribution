package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessLogSubscriptionRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the access log subscription.
    */
  var accessLogSubscriptionIdentifier: AccessLogSubscriptionIdentifier
}
object GetAccessLogSubscriptionRequest {
  
  inline def apply(accessLogSubscriptionIdentifier: AccessLogSubscriptionIdentifier): GetAccessLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(accessLogSubscriptionIdentifier = accessLogSubscriptionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessLogSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessLogSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessLogSubscriptionIdentifier(value: AccessLogSubscriptionIdentifier): Self = StObject.set(x, "accessLogSubscriptionIdentifier", value.asInstanceOf[js.Any])
  }
}
