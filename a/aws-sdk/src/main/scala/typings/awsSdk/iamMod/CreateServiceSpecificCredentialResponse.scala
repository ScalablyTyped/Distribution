package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateServiceSpecificCredentialResponse extends js.Object {
  
  /**
    * A structure that contains information about the newly created service-specific credential.  This is the only time that the password for this credential set is available. It cannot be recovered later. Instead, you must reset the password with ResetServiceSpecificCredential. 
    */
  var ServiceSpecificCredential: js.UndefOr[typings.awsSdk.iamMod.ServiceSpecificCredential] = js.native
}
object CreateServiceSpecificCredentialResponse {
  
  @scala.inline
  def apply(): CreateServiceSpecificCredentialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceSpecificCredentialResponse]
  }
  
  @scala.inline
  implicit class CreateServiceSpecificCredentialResponseOps[Self <: CreateServiceSpecificCredentialResponse] (val x: Self) extends AnyVal {
    
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
