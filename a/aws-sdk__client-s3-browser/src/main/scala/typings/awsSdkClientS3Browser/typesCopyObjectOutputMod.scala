package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesCopyObjectResultMod.UnmarshalledCopyObjectResult
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCopyObjectOutputMod {
  
  trait CopyObjectOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CopyObjectResult shape
      */
    var CopyObjectResult: js.UndefOr[UnmarshalledCopyObjectResult] = js.undefined
    
    /**
      * _CopySourceVersionId shape
      */
    var CopySourceVersionId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If the object expiration is configured, the response includes this header.</p>
      */
    var Expiration: js.UndefOr[String] = js.undefined
    
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
    
    /**
      * <p>Version ID of the newly created copy.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object CopyObjectOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CopyObjectOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyObjectOutput]
    }
    
    @scala.inline
    implicit class CopyObjectOutputMutableBuilder[Self <: CopyObjectOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyObjectResult(value: UnmarshalledCopyObjectResult): Self = StObject.set(x, "CopyObjectResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyObjectResultUndefined: Self = StObject.set(x, "CopyObjectResult", js.undefined)
      
      @scala.inline
      def setCopySourceVersionId(value: String): Self = StObject.set(x, "CopySourceVersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopySourceVersionIdUndefined: Self = StObject.set(x, "CopySourceVersionId", js.undefined)
      
      @scala.inline
      def setExpiration(value: String): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      @scala.inline
      def setSSECustomerAlgorithm(value: String): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
      
      @scala.inline
      def setSSECustomerKeyMD5(value: String): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
      
      @scala.inline
      def setSSEKMSKeyId(value: String): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
      
      @scala.inline
      def setServerSideEncryption(value: AES256 | awsColonkms | String): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
