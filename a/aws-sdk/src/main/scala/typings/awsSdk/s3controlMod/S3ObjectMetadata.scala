package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectMetadata extends StObject {
  
  /**
    * 
    */
  var CacheControl: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var ContentLength: js.UndefOr[S3ContentLength] = js.undefined
  
  /**
    * 
    */
  var ContentMD5: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var ContentType: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var HttpExpiresDate: js.UndefOr[TimeStamp] = js.undefined
  
  /**
    * 
    */
  var RequesterCharged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var SSEAlgorithm: js.UndefOr[S3SSEAlgorithm] = js.undefined
  
  /**
    * 
    */
  var UserMetadata: js.UndefOr[S3UserMetadata] = js.undefined
}
object S3ObjectMetadata {
  
  inline def apply(): S3ObjectMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectMetadata]
  }
  
  extension [Self <: S3ObjectMetadata](x: Self) {
    
    inline def setCacheControl(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setContentDisposition(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    inline def setContentEncoding(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    inline def setContentLanguage(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    inline def setContentLength(value: S3ContentLength): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentMD5(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    inline def setContentType(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setHttpExpiresDate(value: TimeStamp): Self = StObject.set(x, "HttpExpiresDate", value.asInstanceOf[js.Any])
    
    inline def setHttpExpiresDateUndefined: Self = StObject.set(x, "HttpExpiresDate", js.undefined)
    
    inline def setRequesterCharged(value: Boolean): Self = StObject.set(x, "RequesterCharged", value.asInstanceOf[js.Any])
    
    inline def setRequesterChargedUndefined: Self = StObject.set(x, "RequesterCharged", js.undefined)
    
    inline def setSSEAlgorithm(value: S3SSEAlgorithm): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSEAlgorithmUndefined: Self = StObject.set(x, "SSEAlgorithm", js.undefined)
    
    inline def setUserMetadata(value: S3UserMetadata): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
  }
}
