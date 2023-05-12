package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccessLogSubscriptionRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the access log subscription.
    */
  var accessLogSubscriptionIdentifier: AccessLogSubscriptionIdentifier
  
  /**
    * The Amazon Resource Name (ARN) of the access log destination.
    */
  var destinationArn: AccessLogDestinationArn
}
object UpdateAccessLogSubscriptionRequest {
  
  inline def apply(
    accessLogSubscriptionIdentifier: AccessLogSubscriptionIdentifier,
    destinationArn: AccessLogDestinationArn
  ): UpdateAccessLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(accessLogSubscriptionIdentifier = accessLogSubscriptionIdentifier.asInstanceOf[js.Any], destinationArn = destinationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccessLogSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAccessLogSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessLogSubscriptionIdentifier(value: AccessLogSubscriptionIdentifier): Self = StObject.set(x, "accessLogSubscriptionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: AccessLogDestinationArn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
  }
}
