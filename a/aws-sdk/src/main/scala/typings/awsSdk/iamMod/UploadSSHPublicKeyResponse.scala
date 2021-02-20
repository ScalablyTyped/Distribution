package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadSSHPublicKeyResponse extends StObject {
  
  /**
    * Contains information about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typings.awsSdk.iamMod.SSHPublicKey] = js.native
}
object UploadSSHPublicKeyResponse {
  
  @scala.inline
  def apply(): UploadSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSSHPublicKeyResponse]
  }
  
  @scala.inline
  implicit class UploadSSHPublicKeyResponseMutableBuilder[Self <: UploadSSHPublicKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSSHPublicKey(value: SSHPublicKey): Self = StObject.set(x, "SSHPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSHPublicKeyUndefined: Self = StObject.set(x, "SSHPublicKey", js.undefined)
  }
}
