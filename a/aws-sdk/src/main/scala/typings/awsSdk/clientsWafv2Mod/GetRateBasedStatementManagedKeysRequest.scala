package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedStatementManagedKeysRequest extends StObject {
  
  /**
    * The name of the rule group reference statement in your web ACL. This is required only when you have the rate-based rule nested inside a rule group. 
    */
  var RuleGroupRuleName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the rate-based rule to get the keys for. If you have the rule defined inside a rule group that you're using in your web ACL, also provide the name of the rule group reference statement in the request parameter RuleGroupRuleName.
    */
  var RuleName: EntityName
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or an Amazon Cognito user pool.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.clientsWafv2Mod.Scope
  
  /**
    * The unique identifier for the web ACL. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var WebACLId: EntityId
  
  /**
    * The name of the web ACL. You cannot change the name of a web ACL after you create it.
    */
  var WebACLName: EntityName
}
object GetRateBasedStatementManagedKeysRequest {
  
  inline def apply(RuleName: EntityName, Scope: Scope, WebACLId: EntityId, WebACLName: EntityName): GetRateBasedStatementManagedKeysRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any], WebACLName = WebACLName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedStatementManagedKeysRequest]
  }
  
  extension [Self <: GetRateBasedStatementManagedKeysRequest](x: Self) {
    
    inline def setRuleGroupRuleName(value: EntityName): Self = StObject.set(x, "RuleGroupRuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupRuleNameUndefined: Self = StObject.set(x, "RuleGroupRuleName", js.undefined)
    
    inline def setRuleName(value: EntityName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setWebACLId(value: EntityId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
    
    inline def setWebACLName(value: EntityName): Self = StObject.set(x, "WebACLName", value.asInstanceOf[js.Any])
  }
}
