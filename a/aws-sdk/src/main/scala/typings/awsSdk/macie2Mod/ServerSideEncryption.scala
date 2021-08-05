package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryption extends StObject {
  
  /**
    * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is disabled for the bucket or object, this value is NONE.
    */
  var encryptionType: js.UndefOr[EncryptionType] = js.undefined
  
  /**
    * The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
    */
  var kmsMasterKeyId: js.UndefOr[string] = js.undefined
}
object ServerSideEncryption {
  
  inline def apply(): ServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryption]
  }
  
  extension [Self <: ServerSideEncryption](x: Self) {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsMasterKeyId(value: string): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
  }
}
