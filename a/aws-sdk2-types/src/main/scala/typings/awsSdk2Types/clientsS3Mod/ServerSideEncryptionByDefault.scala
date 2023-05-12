package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionByDefault extends StObject {
  
  /**
    * Amazon Web Services Key Management Service (KMS) customer Amazon Web Services KMS key ID to use for the default encryption. This parameter is allowed if and only if SSEAlgorithm is set to aws:kms. You can specify the key ID or the Amazon Resource Name (ARN) of the KMS key. However, if you are using encryption with cross-account or Amazon Web Services service operations you must use a fully qualified KMS key ARN. For more information, see Using encryption for cross-account operations.   For example:    Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab     Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information, see Using symmetric and asymmetric keys in the Amazon Web Services Key Management Service Developer Guide. 
    */
  var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.undefined
  
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: ServerSideEncryption
}
object ServerSideEncryptionByDefault {
  
  inline def apply(SSEAlgorithm: ServerSideEncryption): ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionByDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
    
    inline def setKMSMasterKeyID(value: SSEKMSKeyId): Self = StObject.set(x, "KMSMasterKeyID", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIDUndefined: Self = StObject.set(x, "KMSMasterKeyID", js.undefined)
    
    inline def setSSEAlgorithm(value: ServerSideEncryption): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
  }
}
