package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceSpecificCredentialsResponse extends js.Object {
  
  /**
    * A list of structures that each contain details about a service-specific credential.
    */
  var ServiceSpecificCredentials: js.UndefOr[ServiceSpecificCredentialsListType] = js.native
}
object ListServiceSpecificCredentialsResponse {
  
  @scala.inline
  def apply(): ListServiceSpecificCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceSpecificCredentialsResponse]
  }
  
  @scala.inline
  implicit class ListServiceSpecificCredentialsResponseOps[Self <: ListServiceSpecificCredentialsResponse] (val x: Self) extends AnyVal {
    
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
    def setServiceSpecificCredentialsVarargs(value: ServiceSpecificCredentialMetadata*): Self = this.set("ServiceSpecificCredentials", js.Array(value :_*))
    
    @scala.inline
    def setServiceSpecificCredentials(value: ServiceSpecificCredentialsListType): Self = this.set("ServiceSpecificCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceSpecificCredentials: Self = this.set("ServiceSpecificCredentials", js.undefined)
  }
}
