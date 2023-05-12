package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessLogSubscriptionRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination. The supported destination types are CloudWatch Log groups, Kinesis Data Firehose delivery streams, and Amazon S3 buckets.
    */
  var destinationArn: AccessLogDestinationArn
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network or service.
    */
  var resourceIdentifier: ResourceIdentifier
  
  /**
    * The tags for the access log subscription.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAccessLogSubscriptionRequest {
  
  inline def apply(destinationArn: AccessLogDestinationArn, resourceIdentifier: ResourceIdentifier): CreateAccessLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessLogSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAccessLogSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDestinationArn(value: AccessLogDestinationArn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
