package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompleteMultipartUploadOutputMod {
  
  trait CompleteMultipartUploadOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _BucketName shape
      */
    var Bucket: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Entity tag of the object.</p>
      */
    var ETag: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.</p>
      */
    var Expiration: js.UndefOr[String] = js.undefined
    
    /**
      * _ObjectKey shape
      */
    var Key: js.UndefOr[String] = js.undefined
    
    /**
      * _Location shape
      */
    var Location: js.UndefOr[String] = js.undefined
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
    
    /**
      * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
      */
    var SSEKMSKeyId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
      */
    var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.undefined
    
    /**
      * <p>Version of the object.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object CompleteMultipartUploadOutput {
    
    inline def apply($metadata: ResponseMetadata): CompleteMultipartUploadOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteMultipartUploadOutput]
    }
    
    extension [Self <: CompleteMultipartUploadOutput](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
      
      inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      inline def setExpiration(value: String): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      inline def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
      
      inline def setSSEKMSKeyId(value: String): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
      
      inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
      
      inline def setServerSideEncryption(value: AES256 | awsColonkms | String): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
