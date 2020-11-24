package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDetail extends js.Object {
  
  /**
    * The policy document.
    */
  var PolicyDocument: js.UndefOr[policyDocumentType] = js.native
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.native
}
object PolicyDetail {
  
  @scala.inline
  def apply(): PolicyDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetail]
  }
  
  @scala.inline
  implicit class PolicyDetailOps[Self <: PolicyDetail] (val x: Self) extends AnyVal {
    
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
    def setPolicyDocument(value: policyDocumentType): Self = this.set("PolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyDocument: Self = this.set("PolicyDocument", js.undefined)
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
  }
}
