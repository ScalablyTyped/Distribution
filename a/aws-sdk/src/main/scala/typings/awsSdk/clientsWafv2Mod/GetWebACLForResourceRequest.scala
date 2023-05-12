package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebACLForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource whose web ACL you want to retrieve.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:partition:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway REST API: arn:partition:apigateway:region::/restapis/api-id/stages/stage-name     For an AppSync GraphQL API: arn:partition:appsync:region:account-id:apis/GraphQLApiId     For an Amazon Cognito user pool: arn:partition:cognito-idp:region:account-id:userpool/user-pool-id     For an App Runner service: arn:partition:apprunner:region:account-id:service/apprunner-service-name/apprunner-service-id     For an Amazon Web Services Verified Access instance: arn:partition:ec2:region:account-id:verified-access-instance/instance-id    
    */
  var ResourceArn: typings.awsSdk.clientsWafv2Mod.ResourceArn
}
object GetWebACLForResourceRequest {
  
  inline def apply(ResourceArn: ResourceArn): GetWebACLForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebACLForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWebACLForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
