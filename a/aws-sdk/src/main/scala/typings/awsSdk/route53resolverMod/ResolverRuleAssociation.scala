package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleAssociation extends js.Object {
  /**
    * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an AssociateResolverRule request.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The name of an association between a resolver rule and a VPC.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of the resolver rule that you associated with the VPC that is specified by VPCId.
    */
  var ResolverRuleId: js.UndefOr[ResourceId] = js.native
  /**
    * A code that specifies the current status of the association between a resolver rule and a VPC.
    */
  var Status: js.UndefOr[ResolverRuleAssociationStatus] = js.native
  /**
    * A detailed description of the status of the association between a resolver rule and a VPC.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.route53resolverMod.StatusMessage] = js.native
  /**
    * The ID of the VPC that you associated the resolver rule with.
    */
  var VPCId: js.UndefOr[ResourceId] = js.native
}

object ResolverRuleAssociation {
  @scala.inline
  def apply(
    Id: ResourceId = null,
    Name: Name = null,
    ResolverRuleId: ResourceId = null,
    Status: ResolverRuleAssociationStatus = null,
    StatusMessage: StatusMessage = null,
    VPCId: ResourceId = null
  ): ResolverRuleAssociation = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ResolverRuleId != null) __obj.updateDynamic("ResolverRuleId")(ResolverRuleId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleAssociation]
  }
}

