package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebACLRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway REST API: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name     For an AppSync GraphQL API: arn:aws:appsync:region:account-id:apis/GraphQLApiId     For an Amazon Cognito user pool: arn:aws:cognito-idp:region:account-id:userpool/user-pool-id    
    */
  var ResourceArn: typings.awsSdk.clientsWafv2Mod.ResourceArn
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource.
    */
  var WebACLArn: ResourceArn
}
object AssociateWebACLRequest {
  
  inline def apply(ResourceArn: ResourceArn, WebACLArn: ResourceArn): AssociateWebACLRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], WebACLArn = WebACLArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebACLRequest]
  }
  
  extension [Self <: AssociateWebACLRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setWebACLArn(value: ResourceArn): Self = StObject.set(x, "WebACLArn", value.asInstanceOf[js.Any])
  }
}
