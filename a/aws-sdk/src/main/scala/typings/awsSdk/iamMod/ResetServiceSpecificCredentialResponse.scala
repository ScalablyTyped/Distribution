package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetServiceSpecificCredentialResponse extends js.Object {
  
  /**
    * A structure with details about the updated service-specific credential, including the new password.  This is the only time that you can access the password. You cannot recover the password later, but you can reset it again. 
    */
  var ServiceSpecificCredential: js.UndefOr[typings.awsSdk.iamMod.ServiceSpecificCredential] = js.native
}
object ResetServiceSpecificCredentialResponse {
  
  @scala.inline
  def apply(): ResetServiceSpecificCredentialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetServiceSpecificCredentialResponse]
  }
  
  @scala.inline
  implicit class ResetServiceSpecificCredentialResponseOps[Self <: ResetServiceSpecificCredentialResponse] (val x: Self) extends AnyVal {
    
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
    def setServiceSpecificCredential(value: ServiceSpecificCredential): Self = this.set("ServiceSpecificCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceSpecificCredential: Self = this.set("ServiceSpecificCredential", js.undefined)
  }
}
