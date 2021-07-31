package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSSHPublicKeyResponse extends StObject {
  
  /**
    * A structure containing details about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typings.awsSdk.iamMod.SSHPublicKey] = js.undefined
}
object GetSSHPublicKeyResponse {
  
  @scala.inline
  def apply(): GetSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSSHPublicKeyResponse]
  }
  
  @scala.inline
  implicit class GetSSHPublicKeyResponseMutableBuilder[Self <: GetSSHPublicKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSSHPublicKey(value: SSHPublicKey): Self = StObject.set(x, "SSHPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSHPublicKeyUndefined: Self = StObject.set(x, "SSHPublicKey", js.undefined)
  }
}
