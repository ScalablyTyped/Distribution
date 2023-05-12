package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLogSubscriptionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the access log subscription
    */
  var arn: AccessLogSubscriptionArn
  
  /**
    * The date and time that the access log subscription was created, specified in ISO-8601 format.
    */
  var createdAt: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var destinationArn: AccessLogDestinationArn
  
  /**
    * The ID of the access log subscription.
    */
  var id: AccessLogSubscriptionId
  
  /**
    * The date and time that the access log subscription was last updated, specified in ISO-8601 format.
    */
  var lastUpdatedAt: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the service or service network.
    */
  var resourceArn: ResourceArn
  
  /**
    * The ID of the service or service network.
    */
  var resourceId: ResourceId
}
object AccessLogSubscriptionSummary {
  
  inline def apply(
    arn: AccessLogSubscriptionArn,
    createdAt: js.Date,
    destinationArn: AccessLogDestinationArn,
    id: AccessLogSubscriptionId,
    lastUpdatedAt: js.Date,
    resourceArn: ResourceArn,
    resourceId: ResourceId
  ): AccessLogSubscriptionSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], destinationArn = destinationArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLogSubscriptionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessLogSubscriptionSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AccessLogSubscriptionArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: AccessLogDestinationArn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    inline def setId(value: AccessLogSubscriptionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
