package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSideEncryptionByDefault extends StObject {
  
  /**
    * AWS Key Management Service (KMS) customer master key ID to use for the default encryption. This parameter is allowed if and only if SSEAlgorithm is set to aws:kms. You can specify the key ID or the Amazon Resource Name (ARN) of the CMK. However, if you are using encryption with cross-account operations, you must use a fully qualified CMK ARN. For more information, see Using encryption for cross-account operations.   For example:    Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab     Amazon S3 only supports symmetric CMKs and not asymmetric CMKs. For more information, see Using Symmetric and Asymmetric Keys in the AWS Key Management Service Developer Guide. 
    */
  var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.native
  
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: ServerSideEncryption = js.native
}
object ServerSideEncryptionByDefault {
  
  @scala.inline
  def apply(SSEAlgorithm: ServerSideEncryption): ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionByDefault]
  }
  
  @scala.inline
  implicit class ServerSideEncryptionByDefaultMutableBuilder[Self <: ServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKMSMasterKeyID(value: SSEKMSKeyId): Self = StObject.set(x, "KMSMasterKeyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSMasterKeyIDUndefined: Self = StObject.set(x, "KMSMasterKeyID", js.undefined)
    
    @scala.inline
    def setSSEAlgorithm(value: ServerSideEncryption): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
  }
}
