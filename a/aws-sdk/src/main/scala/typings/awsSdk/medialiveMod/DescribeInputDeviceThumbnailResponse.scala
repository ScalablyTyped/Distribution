package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInputDeviceThumbnailResponse extends js.Object {
  
  /**
    * The binary data for the thumbnail that the Link device has most recently sent to MediaLive.
    */
  var Body: js.UndefOr[InputDeviceThumbnail] = js.native
  
  /**
    * The length of the content.
    */
  var ContentLength: js.UndefOr[long] = js.native
  
  /**
    * Specifies the media type of the thumbnail.
    */
  var ContentType: js.UndefOr[typings.awsSdk.medialiveMod.ContentType] = js.native
  
  /**
    * The unique, cacheable version of this thumbnail.
    */
  var ETag: js.UndefOr[string] = js.native
  
  /**
    * The date and time the thumbnail was last updated at the device.
    */
  var LastModified: js.UndefOr[timestamp] = js.native
}
object DescribeInputDeviceThumbnailResponse {
  
  @scala.inline
  def apply(): DescribeInputDeviceThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInputDeviceThumbnailResponse]
  }
  
  @scala.inline
  implicit class DescribeInputDeviceThumbnailResponseOps[Self <: DescribeInputDeviceThumbnailResponse] (val x: Self) extends AnyVal {
    
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
    def setBody(value: InputDeviceThumbnail): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setContentLength(value: long): Self = this.set("ContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLength: Self = this.set("ContentLength", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setETag(value: string): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setLastModified(value: timestamp): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
  }
}
