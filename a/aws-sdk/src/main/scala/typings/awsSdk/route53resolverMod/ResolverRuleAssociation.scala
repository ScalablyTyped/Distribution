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
  def apply(): ResolverRuleAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleAssociation]
  }
  @scala.inline
  implicit class ResolverRuleAssociationOps[Self <: ResolverRuleAssociation] (val x: Self) extends AnyVal {
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
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = this.set("ResolverRuleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverRuleId: Self = this.set("ResolverRuleId", js.undefined)
    @scala.inline
    def setStatus(value: ResolverRuleAssociationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setVPCId(value: ResourceId): Self = this.set("VPCId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPCId: Self = this.set("VPCId", js.undefined)
  }
  
}

