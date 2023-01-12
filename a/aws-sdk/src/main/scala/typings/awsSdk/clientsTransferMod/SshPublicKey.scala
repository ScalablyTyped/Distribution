package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SshPublicKey extends StObject {
  
  /**
    * Specifies the date that the public key was added to the user account.
    */
  var DateImported: js.Date
  
  /**
    * Specifies the content of the SSH public key as specified by the PublicKeyId. Transfer Family accepts RSA, ECDSA, and ED25519 keys.
    */
  var SshPublicKeyBody: typings.awsSdk.clientsTransferMod.SshPublicKeyBody
  
  /**
    * Specifies the SshPublicKeyId parameter contains the identifier of the public key.
    */
  var SshPublicKeyId: typings.awsSdk.clientsTransferMod.SshPublicKeyId
}
object SshPublicKey {
  
  inline def apply(DateImported: js.Date, SshPublicKeyBody: SshPublicKeyBody, SshPublicKeyId: SshPublicKeyId): SshPublicKey = {
    val __obj = js.Dynamic.literal(DateImported = DateImported.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshPublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SshPublicKey] (val x: Self) extends AnyVal {
    
    inline def setDateImported(value: js.Date): Self = StObject.set(x, "DateImported", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyBody(value: SshPublicKeyBody): Self = StObject.set(x, "SshPublicKeyBody", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyId(value: SshPublicKeyId): Self = StObject.set(x, "SshPublicKeyId", value.asInstanceOf[js.Any])
  }
}
