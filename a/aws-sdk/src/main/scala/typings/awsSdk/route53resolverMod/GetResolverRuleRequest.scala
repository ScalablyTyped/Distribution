package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleRequest extends js.Object {
  /**
    * The ID of the resolver rule that you want to get information about.
    */
  var ResolverRuleId: ResourceId = js.native
}

object GetResolverRuleRequest {
  @scala.inline
  def apply(ResolverRuleId: ResourceId): GetResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResolverRuleRequest]
  }
}

