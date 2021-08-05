package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesForWebACLRequest extends StObject {
  
  /**
    * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API. 
    */
  var ResourceType: js.UndefOr[typings.awsSdk.wafv2Mod.ResourceType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Web ACL.
    */
  var WebACLArn: ResourceArn
}
object ListResourcesForWebACLRequest {
  
  inline def apply(WebACLArn: ResourceArn): ListResourcesForWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLArn = WebACLArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForWebACLRequest]
  }
  
  extension [Self <: ListResourcesForWebACLRequest](x: Self) {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setWebACLArn(value: ResourceArn): Self = StObject.set(x, "WebACLArn", value.asInstanceOf[js.Any])
  }
}
