package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3ObjectDetails extends StObject {
  
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The opaque identifier assigned by a web server to a specific version of a resource found at a URL.
    */
  var ETag: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the object was last modified. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastModified: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the KMS symmetric customer managed key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * If the object is stored using server-side encryption, the value of the server-side encryption algorithm used when storing this object in Amazon S3.
    */
  var ServerSideEncryption: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the object.
    */
  var VersionId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3ObjectDetails {
  
  inline def apply(): AwsS3ObjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3ObjectDetails]
  }
  
  extension [Self <: AwsS3ObjectDetails](x: Self) {
    
    inline def setContentType(value: NonEmptyString): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setETag(value: NonEmptyString): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: NonEmptyString): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setSSEKMSKeyId(value: NonEmptyString): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: NonEmptyString): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    inline def setVersionId(value: NonEmptyString): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
