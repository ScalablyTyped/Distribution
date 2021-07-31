package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encryption extends StObject {
  
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3 (for example, AES256, aws:kms).
    */
  var EncryptionType: ServerSideEncryption
  
  /**
    * If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.
    */
  var KMSContext: js.UndefOr[typings.awsSdk.s3Mod.KMSContext] = js.undefined
  
  /**
    * If the encryption type is aws:kms, this optional value specifies the ID of the symmetric customer managed AWS KMS CMK to use for encryption of job results. Amazon S3 only supports symmetric CMKs. For more information, see Using Symmetric and Asymmetric Keys in the AWS Key Management Service Developer Guide.
    */
  var KMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
}
object Encryption {
  
  @scala.inline
  def apply(EncryptionType: ServerSideEncryption): Encryption = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
  
  @scala.inline
  implicit class EncryptionMutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionType(value: ServerSideEncryption): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSContext(value: KMSContext): Self = StObject.set(x, "KMSContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSContextUndefined: Self = StObject.set(x, "KMSContext", js.undefined)
    
    @scala.inline
    def setKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
  }
}
