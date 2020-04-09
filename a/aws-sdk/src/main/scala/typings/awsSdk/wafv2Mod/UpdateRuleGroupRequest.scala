package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleGroupRequest extends js.Object {
  /**
    * A description of the rule group that helps with identification. You cannot change the description of a rule group after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: EntityId = js.native
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: typings.awsSdk.wafv2Mod.LockToken = js.native
  /**
    * The name of the rule group. You cannot change the name of a rule group after you create it.
    */
  var Name: EntityName = js.native
  /**
    * The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that AWS WAF uses to identify matching web requests, and parameters that govern how AWS WAF handles them. 
    */
  var Rules: js.UndefOr[typings.awsSdk.wafv2Mod.Rules] = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typings.awsSdk.wafv2Mod.VisibilityConfig = js.native
}

object UpdateRuleGroupRequest {
  @scala.inline
  def apply(
    Id: EntityId,
    LockToken: LockToken,
    Name: EntityName,
    Scope: Scope,
    VisibilityConfig: VisibilityConfig,
    Description: EntityDescription = null,
    Rules: Rules = null
  ): UpdateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleGroupRequest]
  }
}

