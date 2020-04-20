package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRuleAssociationRequest extends js.Object {
  /**
    * The ID of the resolver rule association that you want to get information about.
    */
  var ResolverRuleAssociationId: ResourceId = js.native
}

object GetResolverRuleAssociationRequest {
  @scala.inline
  def apply(ResolverRuleAssociationId: ResourceId): GetResolverRuleAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleAssociationId = ResolverRuleAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleAssociationRequest]
  }
}

