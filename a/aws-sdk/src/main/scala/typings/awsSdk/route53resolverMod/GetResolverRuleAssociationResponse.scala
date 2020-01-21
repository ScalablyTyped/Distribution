package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleAssociationResponse extends js.Object {
  /**
    * Information about the resolver rule association that you specified in a GetResolverRuleAssociation request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.native
}

object GetResolverRuleAssociationResponse {
  @scala.inline
  def apply(ResolverRuleAssociation: ResolverRuleAssociation = null): GetResolverRuleAssociationResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverRuleAssociation != null) __obj.updateDynamic("ResolverRuleAssociation")(ResolverRuleAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleAssociationResponse]
  }
}

