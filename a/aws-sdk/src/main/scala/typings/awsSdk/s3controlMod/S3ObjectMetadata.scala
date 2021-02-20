package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ObjectMetadata extends StObject {
  
  /**
    * 
    */
  var CacheControl: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var ContentDisposition: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var ContentEncoding: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var ContentLanguage: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var ContentLength: js.UndefOr[S3ContentLength] = js.native
  
  /**
    * 
    */
  var ContentMD5: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var ContentType: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  
  /**
    * 
    */
  var HttpExpiresDate: js.UndefOr[TimeStamp] = js.native
  
  /**
    * 
    */
  var RequesterCharged: js.UndefOr[Boolean] = js.native
  
  /**
    * 
    */
  var SSEAlgorithm: js.UndefOr[S3SSEAlgorithm] = js.native
  
  /**
    * 
    */
  var UserMetadata: js.UndefOr[S3UserMetadata] = js.native
}
object S3ObjectMetadata {
  
  @scala.inline
  def apply(): S3ObjectMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectMetadata]
  }
  
  @scala.inline
  implicit class S3ObjectMetadataMutableBuilder[Self <: S3ObjectMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheControl(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    @scala.inline
    def setContentLength(value: S3ContentLength): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    @scala.inline
    def setContentMD5(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    @scala.inline
    def setContentType(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setHttpExpiresDate(value: TimeStamp): Self = StObject.set(x, "HttpExpiresDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpExpiresDateUndefined: Self = StObject.set(x, "HttpExpiresDate", js.undefined)
    
    @scala.inline
    def setRequesterCharged(value: Boolean): Self = StObject.set(x, "RequesterCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterChargedUndefined: Self = StObject.set(x, "RequesterCharged", js.undefined)
    
    @scala.inline
    def setSSEAlgorithm(value: S3SSEAlgorithm): Self = StObject.set(x, "SSEAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEAlgorithmUndefined: Self = StObject.set(x, "SSEAlgorithm", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: S3UserMetadata): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
  }
}
