package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResolverRuleResponse extends js.Object {
  /**
    * Information about the DeleteResolverRule request, including the status of the request.
    */
  var ResolverRule: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRule] = js.native
}

object DeleteResolverRuleResponse {
  @scala.inline
  def apply(ResolverRule: ResolverRule = null): DeleteResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRule != null) __obj.updateDynamic("ResolverRule")(ResolverRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverRuleResponse]
  }
}

