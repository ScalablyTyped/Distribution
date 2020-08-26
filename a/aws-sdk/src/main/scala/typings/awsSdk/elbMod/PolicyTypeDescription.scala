package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTypeDescription extends js.Object {
  /**
    * A description of the policy type.
    */
  var Description: js.UndefOr[typings.awsSdk.elbMod.Description] = js.native
  /**
    * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
    */
  var PolicyAttributeTypeDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyAttributeTypeDescriptions] = js.native
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeName] = js.native
}

object PolicyTypeDescription {
  @scala.inline
  def apply(): PolicyTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTypeDescription]
  }
  @scala.inline
  implicit class PolicyTypeDescriptionOps[Self <: PolicyTypeDescription] (val x: Self) extends AnyVal {
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
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setPolicyAttributeTypeDescriptionsVarargs(value: PolicyAttributeTypeDescription*): Self = this.set("PolicyAttributeTypeDescriptions", js.Array(value :_*))
    @scala.inline
    def setPolicyAttributeTypeDescriptions(value: PolicyAttributeTypeDescriptions): Self = this.set("PolicyAttributeTypeDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyAttributeTypeDescriptions: Self = this.set("PolicyAttributeTypeDescriptions", js.undefined)
    @scala.inline
    def setPolicyTypeName(value: PolicyTypeName): Self = this.set("PolicyTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyTypeName: Self = this.set("PolicyTypeName", js.undefined)
  }
  
}

