package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebACLRequest extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected, either an application load balancer or Amazon API Gateway stage.  The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
    */
  var ResourceArn: typings.awsSdk.clientsWafregionalMod.ResourceArn
  
  /**
    * A unique identifier (ID) for the web ACL. 
    */
  var WebACLId: ResourceId
}
object AssociateWebACLRequest {
  
  inline def apply(ResourceArn: ResourceArn, WebACLId: ResourceId): AssociateWebACLRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebACLRequest]
  }
  
  extension [Self <: AssociateWebACLRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
