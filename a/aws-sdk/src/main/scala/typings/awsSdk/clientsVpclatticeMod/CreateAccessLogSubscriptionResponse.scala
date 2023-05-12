package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessLogSubscriptionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the access log subscription.
    */
  var arn: AccessLogSubscriptionArn
  
  /**
    * The Amazon Resource Name (ARN) of the log destination.
    */
  var destinationArn: AccessLogDestinationArn
  
  /**
    * The ID of the access log subscription.
    */
  var id: AccessLogSubscriptionId
  
  /**
    * The Amazon Resource Name (ARN) of the service network or service.
    */
  var resourceArn: ResourceArn
  
  /**
    * The ID of the service network or service.
    */
  var resourceId: ResourceId
}
object CreateAccessLogSubscriptionResponse {
  
  inline def apply(
    arn: AccessLogSubscriptionArn,
    destinationArn: AccessLogDestinationArn,
    id: AccessLogSubscriptionId,
    resourceArn: ResourceArn,
    resourceId: ResourceId
  ): CreateAccessLogSubscriptionResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], destinationArn = destinationArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessLogSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessLogSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AccessLogSubscriptionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: AccessLogDestinationArn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    inline def setId(value: AccessLogSubscriptionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
