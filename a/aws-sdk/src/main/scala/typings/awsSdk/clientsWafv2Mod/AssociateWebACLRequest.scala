package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateWebACLRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:partition:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway REST API: arn:partition:apigateway:region::/restapis/api-id/stages/stage-name     For an AppSync GraphQL API: arn:partition:appsync:region:account-id:apis/GraphQLApiId     For an Amazon Cognito user pool: arn:partition:cognito-idp:region:account-id:userpool/user-pool-id     For an App Runner service: arn:partition:apprunner:region:account-id:service/apprunner-service-name/apprunner-service-id     For an Amazon Web Services Verified Access instance: arn:partition:ec2:region:account-id:verified-access-instance/instance-id    
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateWebACLRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setWebACLArn(value: ResourceArn): Self = StObject.set(x, "WebACLArn", value.asInstanceOf[js.Any])
  }
}
