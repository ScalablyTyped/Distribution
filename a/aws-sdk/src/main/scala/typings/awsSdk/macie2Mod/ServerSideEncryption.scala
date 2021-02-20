package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSideEncryption extends StObject {
  
  /**
    * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is disabled for the bucket or object, this value is NONE.
    */
  var encryptionType: js.UndefOr[EncryptionType] = js.native
  
  /**
    * The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
    */
  var kmsMasterKeyId: js.UndefOr[string] = js.native
}
object ServerSideEncryption {
  
  @scala.inline
  def apply(): ServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryption]
  }
  
  @scala.inline
  implicit class ServerSideEncryptionMutableBuilder[Self <: ServerSideEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyId(value: string): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
  }
}
