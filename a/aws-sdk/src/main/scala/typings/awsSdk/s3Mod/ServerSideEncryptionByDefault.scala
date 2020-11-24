package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSideEncryptionByDefault extends js.Object {
  
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
  implicit class ServerSideEncryptionByDefaultOps[Self <: ServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSSEAlgorithm(value: ServerSideEncryption): Self = this.set("SSEAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSMasterKeyID(value: SSEKMSKeyId): Self = this.set("KMSMasterKeyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSMasterKeyID: Self = this.set("KMSMasterKeyID", js.undefined)
  }
}
