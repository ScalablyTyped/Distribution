package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.typesCopyPartResultMod.UnmarshalledCopyPartResult
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUploadPartCopyOutputMod {
  
  trait UploadPartCopyOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CopyPartResult shape
      */
    var CopyPartResult: js.UndefOr[UnmarshalledCopyPartResult] = js.undefined
    
    /**
      * <p>The version of the source object that was copied, if you have enabled versioning on the source bucket.</p>
      */
    var CopySourceVersionId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
    
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.</p>
      */
    var SSECustomerKeyMD5: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
      */
    var SSEKMSKeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
      */
    var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.undefined
  }
  object UploadPartCopyOutput {
    
    inline def apply($metadata: ResponseMetadata): UploadPartCopyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadPartCopyOutput]
    }
    
    extension [Self <: UploadPartCopyOutput](x: Self) {
      
      inline def setCopyPartResult(value: UnmarshalledCopyPartResult): Self = StObject.set(x, "CopyPartResult", value.asInstanceOf[js.Any])
      
      inline def setCopyPartResultUndefined: Self = StObject.set(x, "CopyPartResult", js.undefined)
      
      inline def setCopySourceVersionId(value: String): Self = StObject.set(x, "CopySourceVersionId", value.asInstanceOf[js.Any])
      
      inline def setCopySourceVersionIdUndefined: Self = StObject.set(x, "CopySourceVersionId", js.undefined)
      
      inline def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      inline def setSSECustomerAlgorithm(value: String): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
      
      inline def setSSECustomerKeyMD5(value: String): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
      
      inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
      
      inline def setSSEKMSKeyId(value: String): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
      
      inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
      
      inline def setServerSideEncryption(value: AES256 | awsColonkms | String): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    }
  }
}
