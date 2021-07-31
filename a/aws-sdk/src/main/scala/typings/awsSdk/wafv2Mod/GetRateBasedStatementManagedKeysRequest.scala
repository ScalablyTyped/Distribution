package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedStatementManagedKeysRequest extends StObject {
  
  /**
    * The name of the rate-based rule to get the keys for.
    */
  var RuleName: EntityName
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an API Gateway REST API, or an AppSync GraphQL API.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope
  
  /**
    * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var WebACLId: EntityId
  
  /**
    * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
    */
  var WebACLName: EntityName
}
object GetRateBasedStatementManagedKeysRequest {
  
  @scala.inline
  def apply(RuleName: EntityName, Scope: Scope, WebACLId: EntityId, WebACLName: EntityName): GetRateBasedStatementManagedKeysRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any], WebACLName = WebACLName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedStatementManagedKeysRequest]
  }
  
  @scala.inline
  implicit class GetRateBasedStatementManagedKeysRequestMutableBuilder[Self <: GetRateBasedStatementManagedKeysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleName(value: EntityName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLId(value: EntityId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLName(value: EntityName): Self = StObject.set(x, "WebACLName", value.asInstanceOf[js.Any])
  }
}
