package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateWebACLRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to disassociate from the web ACL.  The ARN must be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway REST API: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name     For an AppSync GraphQL API: arn:aws:appsync:region:account-id:apis/GraphQLApiId     For an Amazon Cognito user pool: arn:aws:cognito-idp:region:account-id:userpool/user-pool-id    
    */
  var ResourceArn: typings.awsSdk.clientsWafv2Mod.ResourceArn
}
object DisassociateWebACLRequest {
  
  inline def apply(ResourceArn: ResourceArn): DisassociateWebACLRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebACLRequest]
  }
  
  extension [Self <: DisassociateWebACLRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
