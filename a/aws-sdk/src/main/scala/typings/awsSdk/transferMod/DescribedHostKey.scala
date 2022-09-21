package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedHostKey extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) for the host key.
    */
  var Arn: typings.awsSdk.transferMod.Arn
  
  /**
    * The date on which the host key was added to the server.
    */
  var DateImported: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The text description for this host key.
    */
  var Description: js.UndefOr[HostKeyDescription] = js.undefined
  
  /**
    * The public key fingerprint, which is a short sequence of bytes used to identify the longer public key.
    */
  var HostKeyFingerprint: js.UndefOr[typings.awsSdk.transferMod.HostKeyFingerprint] = js.undefined
  
  /**
    * A unique identifier for the host key.
    */
  var HostKeyId: js.UndefOr[typings.awsSdk.transferMod.HostKeyId] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for host keys.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.undefined
  
  /**
    * The encryption algorithm used for the host key. The Type is one of the following values:   ssh-rsa   ssh-ed25519   ecdsa-sha2-nistp256    ecdsa-sha2-nistp384   ecdsa-sha2-nistp521  
    */
  var Type: js.UndefOr[HostKeyType] = js.undefined
}
object DescribedHostKey {
  
  inline def apply(Arn: Arn): DescribedHostKey = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedHostKey]
  }
  
  extension [Self <: DescribedHostKey](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDateImported(value: js.Date): Self = StObject.set(x, "DateImported", value.asInstanceOf[js.Any])
    
    inline def setDateImportedUndefined: Self = StObject.set(x, "DateImported", js.undefined)
    
    inline def setDescription(value: HostKeyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHostKeyFingerprint(value: HostKeyFingerprint): Self = StObject.set(x, "HostKeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setHostKeyFingerprintUndefined: Self = StObject.set(x, "HostKeyFingerprint", js.undefined)
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setHostKeyIdUndefined: Self = StObject.set(x, "HostKeyId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: HostKeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
