package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeManagedRuleGroupRequest extends js.Object {
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: EntityName = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.wafv2Mod.Scope = js.native
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: typings.awsSdk.wafv2Mod.VendorName = js.native
}

object DescribeManagedRuleGroupRequest {
  @scala.inline
  def apply(Name: EntityName, Scope: Scope, VendorName: VendorName): DescribeManagedRuleGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], VendorName = VendorName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeManagedRuleGroupRequest]
  }
}

