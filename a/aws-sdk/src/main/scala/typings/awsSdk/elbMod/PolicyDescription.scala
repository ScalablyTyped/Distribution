package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDescription extends js.Object {
  
  /**
    * The policy attributes.
    */
  var PolicyAttributeDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyAttributeDescriptions] = js.native
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[typings.awsSdk.elbMod.PolicyName] = js.native
  
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeName] = js.native
}
object PolicyDescription {
  
  @scala.inline
  def apply(): PolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDescription]
  }
  
  @scala.inline
  implicit class PolicyDescriptionOps[Self <: PolicyDescription] (val x: Self) extends AnyVal {
    
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
    def setPolicyAttributeDescriptionsVarargs(value: PolicyAttributeDescription*): Self = this.set("PolicyAttributeDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setPolicyAttributeDescriptions(value: PolicyAttributeDescriptions): Self = this.set("PolicyAttributeDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyAttributeDescriptions: Self = this.set("PolicyAttributeDescriptions", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyTypeName(value: PolicyTypeName): Self = this.set("PolicyTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTypeName: Self = this.set("PolicyTypeName", js.undefined)
  }
}
