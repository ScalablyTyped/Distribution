package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebACLForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource whose web ACL you want to retrieve.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway REST API: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name     For an AppSync GraphQL API: arn:aws:appsync:region:account-id:apis/GraphQLApiId     For an Amazon Cognito user pool: arn:aws:cognito-idp:region:account-id:userpool/user-pool-id    
    */
  var ResourceArn: typings.awsSdk.clientsWafv2Mod.ResourceArn
}
object GetWebACLForResourceRequest {
  
  inline def apply(ResourceArn: ResourceArn): GetWebACLForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebACLForResourceRequest]
  }
  
  extension [Self <: GetWebACLForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
