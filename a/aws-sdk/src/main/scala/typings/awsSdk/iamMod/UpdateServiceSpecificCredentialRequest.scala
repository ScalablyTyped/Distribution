package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceSpecificCredentialRequest extends StObject {
  
  /**
    * The unique identifier of the service-specific credential. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId
  
  /**
    * The status to be assigned to the service-specific credential.
    */
  var Status: statusType
  
  /**
    * The name of the IAM user associated with the service-specific credential. If you do not specify this value, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
}
object UpdateServiceSpecificCredentialRequest {
  
  inline def apply(ServiceSpecificCredentialId: serviceSpecificCredentialId, Status: statusType): UpdateServiceSpecificCredentialRequest = {
    val __obj = js.Dynamic.literal(ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSpecificCredentialRequest]
  }
  
  extension [Self <: UpdateServiceSpecificCredentialRequest](x: Self) {
    
    inline def setServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = StObject.set(x, "ServiceSpecificCredentialId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
