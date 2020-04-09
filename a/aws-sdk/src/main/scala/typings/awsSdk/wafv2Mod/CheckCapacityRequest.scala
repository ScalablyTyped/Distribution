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
}

