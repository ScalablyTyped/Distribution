package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesForWebACLRequest extends StObject {
  
  /**
    * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.   If you don't provide a resource type, the call uses the resource type APPLICATION_LOAD_BALANCER.   Default: APPLICATION_LOAD_BALANCER 
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ResourceType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL.
    */
  var WebACLArn: ResourceArn
}
object ListResourcesForWebACLRequest {
  
  inline def apply(WebACLArn: ResourceArn): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLArn = WebACLArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourcesForWebACLRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setWebACLArn(value: ResourceArn): Self = StObject.set(x, "WebACLArn", value.asInstanceOf[js.Any])
  }
}
