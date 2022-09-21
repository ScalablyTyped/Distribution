package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadPartCopyOutput extends StObject {
  
  /**
    * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
    */
  var BucketKeyEnabled: js.UndefOr[typings.awsSdk.s3Mod.BucketKeyEnabled] = js.undefined
  
  /**
    * Container for all response elements.
    */
  var CopyPartResult: js.UndefOr[typings.awsSdk.s3Mod.CopyPartResult] = js.undefined
  
  /**
    * The version of the source object that was copied, if you have enabled versioning on the source bucket.
    */
  var CopySourceVersionId: js.UndefOr[typings.awsSdk.s3Mod.CopySourceVersionId] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.undefined
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.undefined
  
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.undefined
}
object UploadPartCopyOutput {
  
  inline def apply(): UploadPartCopyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadPartCopyOutput]
  }
  
  extension [Self <: UploadPartCopyOutput](x: Self) {
    
    inline def setBucketKeyEnabled(value: BucketKeyEnabled): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setCopyPartResult(value: CopyPartResult): Self = StObject.set(x, "CopyPartResult", value.asInstanceOf[js.Any])
    
    inline def setCopyPartResultUndefined: Self = StObject.set(x, "CopyPartResult", js.undefined)
    
    inline def setCopySourceVersionId(value: CopySourceVersionId): Self = StObject.set(x, "CopySourceVersionId", value.asInstanceOf[js.Any])
    
    inline def setCopySourceVersionIdUndefined: Self = StObject.set(x, "CopySourceVersionId", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
  }
}
