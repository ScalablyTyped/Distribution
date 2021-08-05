package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSSHPublicKeyRequest extends StObject {
  
  /**
    * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use SSH. To retrieve the public key in PEM format, use PEM.
    */
  var Encoding: encodingType
  
  /**
    * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var SSHPublicKeyId: publicKeyIdType
  
  /**
    * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}
object GetSSHPublicKeyRequest {
  
  inline def apply(Encoding: encodingType, SSHPublicKeyId: publicKeyIdType, UserName: userNameType): GetSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSSHPublicKeyRequest]
  }
  
  extension [Self <: GetSSHPublicKeyRequest](x: Self) {
    
    inline def setEncoding(value: encodingType): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setSSHPublicKeyId(value: publicKeyIdType): Self = StObject.set(x, "SSHPublicKeyId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
