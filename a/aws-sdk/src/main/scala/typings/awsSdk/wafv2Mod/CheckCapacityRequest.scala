package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckCapacityRequest extends js.Object {
  /**
    * An array of Rule that you're configuring to use in a rule group or web ACL. 
    */
  var Rules: typings.awsSdk.wafv2Mod.Rules = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
}

object CheckCapacityRequest {
  @scala.inline
  def apply(Rules: Rules, Scope: Scope): CheckCapacityRequest = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckCapacityRequest]
  }
  @scala.inline
  implicit class CheckCapacityRequestOps[Self <: CheckCapacityRequest] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: Rule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Rules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Scope): Self = this.set("Scope", value.asInstanceOf[js.Any])
  }
  
}

