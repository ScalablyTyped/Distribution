package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedHostKey extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) of the host key.
    */
  var Arn: typings.awsSdk.clientsTransferMod.Arn
  
  /**
    * The date on which the host key was added to the server.
    */
  var DateImported: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current description for the host key. You can change it by calling the UpdateHostKey operation and providing a new description.
    */
  var Description: js.UndefOr[HostKeyDescription] = js.undefined
  
  /**
    * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
    */
  var Fingerprint: js.UndefOr[HostKeyFingerprint] = js.undefined
  
  /**
    * A unique identifier for the host key.
    */
  var HostKeyId: js.UndefOr[typings.awsSdk.clientsTransferMod.HostKeyId] = js.undefined
  
  /**
    * The encryption algorithm that is used for the host key. The Type parameter is specified by using one of the following values:    ssh-rsa     ssh-ed25519     ecdsa-sha2-nistp256     ecdsa-sha2-nistp384     ecdsa-sha2-nistp521   
    */
  var Type: js.UndefOr[HostKeyType] = js.undefined
}
object ListedHostKey {
  
  inline def apply(Arn: Arn): ListedHostKey = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedHostKey]
  }
  
  extension [Self <: ListedHostKey](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDateImported(value: js.Date): Self = StObject.set(x, "DateImported", value.asInstanceOf[js.Any])
    
    inline def setDateImportedUndefined: Self = StObject.set(x, "DateImported", js.undefined)
    
    inline def setDescription(value: HostKeyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFingerprint(value: HostKeyFingerprint): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "Fingerprint", js.undefined)
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setHostKeyIdUndefined: Self = StObject.set(x, "HostKeyId", js.undefined)
    
    inline def setType(value: HostKeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
