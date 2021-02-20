package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServiceSpecificCredentialRequest extends StObject {
  
  /**
    * The unique identifier of the service-specific credential. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId = js.native
  
  /**
    * The status to be assigned to the service-specific credential.
    */
  var Status: statusType = js.native
  
  /**
    * The name of the IAM user associated with the service-specific credential. If you do not specify this value, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.native
}
object UpdateServiceSpecificCredentialRequest {
  
  @scala.inline
  def apply(ServiceSpecificCredentialId: serviceSpecificCredentialId, Status: statusType): UpdateServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSpecificCredentialRequest]
  }
  
  @scala.inline
  implicit class UpdateServiceSpecificCredentialRequestMutableBuilder[Self <: UpdateServiceSpecificCredentialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = StObject.set(x, "ServiceSpecificCredentialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
