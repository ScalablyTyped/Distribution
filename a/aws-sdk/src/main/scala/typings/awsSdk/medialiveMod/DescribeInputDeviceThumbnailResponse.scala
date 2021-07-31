package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInputDeviceThumbnailResponse extends StObject {
  
  /**
    * The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
    */
  var Body: js.UndefOr[InputDeviceThumbnail] = js.undefined
  
  /**
    * The length of the content.
    */
  var ContentLength: js.UndefOr[long] = js.undefined
  
  /**
    * Specifies the media type of the thumbnail.
    */
  var ContentType: js.UndefOr[typings.awsSdk.medialiveMod.ContentType] = js.undefined
  
  /**
    * The unique, cacheable version of this thumbnail.
    */
  var ETag: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time the thumbnail was last updated at the device.
    */
  var LastModified: js.UndefOr[timestamp] = js.undefined
}
object DescribeInputDeviceThumbnailResponse {
  
  @scala.inline
  def apply(): DescribeInputDeviceThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInputDeviceThumbnailResponse]
  }
  
  @scala.inline
  implicit class DescribeInputDeviceThumbnailResponseMutableBuilder[Self <: DescribeInputDeviceThumbnailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: InputDeviceThumbnail): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setContentLength(value: long): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setETag(value: string): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setLastModified(value: timestamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
  }
}
