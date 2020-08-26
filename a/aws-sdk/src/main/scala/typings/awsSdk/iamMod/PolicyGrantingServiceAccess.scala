package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyGrantingServiceAccess extends js.Object {
  /**
    * The name of the entity (user or role) to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  var EntityName: js.UndefOr[entityNameType] = js.native
  /**
    * The type of entity (user or role) that used the policy to access the service to which the inline policy is attached. This field is null for managed policies. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  var EntityType: js.UndefOr[policyOwnerEntityType] = js.native
  var PolicyArn: js.UndefOr[arnType] = js.native
  /**
    * The policy name.
    */
  var PolicyName: policyNameType = js.native
  /**
    * The policy type. For more information about these policy types, see Managed Policies and Inline Policies in the IAM User Guide.
    */
  var PolicyType: policyType = js.native
}

object PolicyGrantingServiceAccess {
  @scala.inline
  def apply(PolicyName: policyNameType, PolicyType: policyType): PolicyGrantingServiceAccess = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGrantingServiceAccess]
  }
  @scala.inline
  implicit class PolicyGrantingServiceAccessOps[Self <: PolicyGrantingServiceAccess] (val x: Self) extends AnyVal {
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
    def setPolicyName(value: policyNameType): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyType(value: policyType): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityName(value: entityNameType): Self = this.set("EntityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityName: Self = this.set("EntityName", js.undefined)
    @scala.inline
    def setEntityType(value: policyOwnerEntityType): Self = this.set("EntityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityType: Self = this.set("EntityType", js.undefined)
    @scala.inline
    def setPolicyArn(value: arnType): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
  }
  
}

