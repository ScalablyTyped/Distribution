package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedStatementManagedKeysRequest extends js.Object {
  /**
    * The name of the rate-based rule to get the keys for.
    */
  var RuleName: EntityName = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
  /**
    * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var WebACLId: EntityId = js.native
  /**
    * The name of the Web ACL. You cannot change the name of a Web ACL after you create it.
    */
  var WebACLName: EntityName = js.native
}

object GetRateBasedStatementManagedKeysRequest {
  @scala.inline
  def apply(RuleName: EntityName, Scope: Scope, WebACLId: EntityId, WebACLName: EntityName): GetRateBasedStatementManagedKeysRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any], WebACLName = WebACLName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedStatementManagedKeysRequest]
  }
  @scala.inline
  implicit class GetRateBasedStatementManagedKeysRequestOps[Self <: GetRateBasedStatementManagedKeysRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRuleName(value: EntityName): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebACLId(value: EntityId): Self = this.set("WebACLId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebACLName(value: EntityName): Self = this.set("WebACLName", value.asInstanceOf[js.Any])
  }
  
}

