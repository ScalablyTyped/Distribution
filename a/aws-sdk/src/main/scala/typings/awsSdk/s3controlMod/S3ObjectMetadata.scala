package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ObjectMetadata extends js.Object {
  
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
  implicit class S3ObjectMetadataOps[Self <: S3ObjectMetadata] (val x: Self) extends AnyVal {
    
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
    def setCacheControl(value: NonEmptyMaxLength1024String): Self = this.set("CacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("CacheControl", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: NonEmptyMaxLength1024String): Self = this.set("ContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDisposition: Self = this.set("ContentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: NonEmptyMaxLength1024String): Self = this.set("ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("ContentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: NonEmptyMaxLength1024String): Self = this.set("ContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("ContentLanguage", js.undefined)
    
    @scala.inline
    def setContentLength(value: S3ContentLength): Self = this.set("ContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLength: Self = this.set("ContentLength", js.undefined)
    
    @scala.inline
    def setContentMD5(value: NonEmptyMaxLength1024String): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    
    @scala.inline
    def setContentType(value: NonEmptyMaxLength1024String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setHttpExpiresDate(value: TimeStamp): Self = this.set("HttpExpiresDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpExpiresDate: Self = this.set("HttpExpiresDate", js.undefined)
    
    @scala.inline
    def setRequesterCharged(value: Boolean): Self = this.set("RequesterCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterCharged: Self = this.set("RequesterCharged", js.undefined)
    
    @scala.inline
    def setSSEAlgorithm(value: S3SSEAlgorithm): Self = this.set("SSEAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEAlgorithm: Self = this.set("SSEAlgorithm", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: S3UserMetadata): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
}
