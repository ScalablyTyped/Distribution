package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebACLRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an API Gateway REST API: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name     For an AppSync GraphQL API: arn:aws:appsync:region:account-id:apis/GraphQLApiId    
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn
  
  /**
    * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
    */
  var WebACLArn: ResourceArn
}
object AssociateWebACLRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn, WebACLArn: ResourceArn): AssociateWebACLRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], WebACLArn = WebACLArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebACLRequest]
  }
  
  @scala.inline
  implicit class AssociateWebACLRequestMutableBuilder[Self <: AssociateWebACLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLArn(value: ResourceArn): Self = StObject.set(x, "WebACLArn", value.asInstanceOf[js.Any])
  }
}
