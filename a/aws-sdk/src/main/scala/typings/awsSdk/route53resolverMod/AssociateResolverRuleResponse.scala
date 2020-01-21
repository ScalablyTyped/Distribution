package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResolverRuleResponse extends js.Object {
  /**
    * Information about the AssociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.native
}

object AssociateResolverRuleResponse {
  @scala.inline
  def apply(ResolverRuleAssociation: ResolverRuleAssociation = null): AssociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRuleAssociation != null) __obj.updateDynamic("ResolverRuleAssociation")(ResolverRuleAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverRuleResponse]
  }
}

