package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadPartCopyOutput extends StObject {
  
  /**
    * Container for all response elements.
    */
  var CopyPartResult: js.UndefOr[typings.awsSdk.s3Mod.CopyPartResult] = js.native
  
  /**
    * The version of the source object that was copied, if you have enabled versioning on the source bucket.
    */
  var CopySourceVersionId: js.UndefOr[typings.awsSdk.s3Mod.CopySourceVersionId] = js.native
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  
  /**
    * If present, specifies the ID of the AWS Key Management Service (AWS KMS) symmetric customer managed customer master key (CMK) that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.native
}
object UploadPartCopyOutput {
  
  @scala.inline
  def apply(): UploadPartCopyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadPartCopyOutput]
  }
  
  @scala.inline
  implicit class UploadPartCopyOutputMutableBuilder[Self <: UploadPartCopyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyPartResult(value: CopyPartResult): Self = StObject.set(x, "CopyPartResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyPartResultUndefined: Self = StObject.set(x, "CopyPartResult", js.undefined)
    
    @scala.inline
    def setCopySourceVersionId(value: CopySourceVersionId): Self = StObject.set(x, "CopySourceVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceVersionIdUndefined: Self = StObject.set(x, "CopySourceVersionId", js.undefined)
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
  }
}
