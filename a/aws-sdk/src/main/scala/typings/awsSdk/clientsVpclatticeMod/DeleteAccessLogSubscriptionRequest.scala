package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessLogSubscriptionRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the access log subscription.
    */
  var accessLogSubscriptionIdentifier: AccessLogSubscriptionIdentifier
}
object DeleteAccessLogSubscriptionRequest {
  
  inline def apply(accessLogSubscriptionIdentifier: AccessLogSubscriptionIdentifier): DeleteAccessLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(accessLogSubscriptionIdentifier = accessLogSubscriptionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessLogSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAccessLogSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessLogSubscriptionIdentifier(value: AccessLogSubscriptionIdentifier): Self = StObject.set(x, "accessLogSubscriptionIdentifier", value.asInstanceOf[js.Any])
  }
}
