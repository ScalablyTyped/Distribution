package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSSHPublicKeyRequest extends StObject {
  
  /**
    * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var SSHPublicKeyId: publicKeyIdType
  
  /**
    * The status to assign to the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType
  
  /**
    * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}
object UpdateSSHPublicKeyRequest {
  
  @scala.inline
  def apply(SSHPublicKeyId: publicKeyIdType, Status: statusType, UserName: userNameType): UpdateSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSSHPublicKeyRequest]
  }
  
  @scala.inline
  implicit class UpdateSSHPublicKeyRequestMutableBuilder[Self <: UpdateSSHPublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSSHPublicKeyId(value: publicKeyIdType): Self = StObject.set(x, "SSHPublicKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
