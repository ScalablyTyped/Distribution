package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRulePolicyRequest extends js.Object {
  /**
    * The ID of the resolver rule policy that you want to get information about.
    */
  var Arn: typings.awsSdk.route53resolverMod.Arn = js.native
}

object GetResolverRulePolicyRequest {
  @scala.inline
  def apply(Arn: Arn): GetResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulePolicyRequest]
  }
}

