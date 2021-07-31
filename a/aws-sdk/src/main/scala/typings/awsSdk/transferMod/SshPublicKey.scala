package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SshPublicKey extends StObject {
  
  /**
    * Specifies the date that the public key was added to the user account.
    */
  var DateImported: typings.awsSdk.transferMod.DateImported
  
  /**
    * Specifies the content of the SSH public key as specified by the PublicKeyId.
    */
  var SshPublicKeyBody: typings.awsSdk.transferMod.SshPublicKeyBody
  
  /**
    * Specifies the SshPublicKeyId parameter contains the identifier of the public key.
    */
  var SshPublicKeyId: typings.awsSdk.transferMod.SshPublicKeyId
}
object SshPublicKey {
  
  @scala.inline
  def apply(DateImported: DateImported, SshPublicKeyBody: SshPublicKeyBody, SshPublicKeyId: SshPublicKeyId): SshPublicKey = {
    val __obj = js.Dynamic.literal(DateImported = DateImported.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshPublicKey]
  }
  
  @scala.inline
  implicit class SshPublicKeyMutableBuilder[Self <: SshPublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateImported(value: DateImported): Self = StObject.set(x, "DateImported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyBody(value: SshPublicKeyBody): Self = StObject.set(x, "SshPublicKeyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyId(value: SshPublicKeyId): Self = StObject.set(x, "SshPublicKeyId", value.asInstanceOf[js.Any])
  }
}
