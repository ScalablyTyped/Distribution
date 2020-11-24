package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInlinePolicyForPermissionSetResponse extends js.Object {
  
  /**
    * The IAM inline policy that is attached to the permission set.
    */
  var InlinePolicy: js.UndefOr[PermissionSetPolicyDocument] = js.native
}
object GetInlinePolicyForPermissionSetResponse {
  
  @scala.inline
  def apply(): GetInlinePolicyForPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInlinePolicyForPermissionSetResponse]
  }
  
  @scala.inline
  implicit class GetInlinePolicyForPermissionSetResponseOps[Self <: GetInlinePolicyForPermissionSetResponse] (val x: Self) extends AnyVal {
    
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
    def setInlinePolicy(value: PermissionSetPolicyDocument): Self = this.set("InlinePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlinePolicy: Self = this.set("InlinePolicy", js.undefined)
  }
}
