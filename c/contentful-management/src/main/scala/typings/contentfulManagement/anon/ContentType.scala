package typings.contentfulManagement.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentType extends js.Object {
  
  var contentType: String = js.native
  
  /** Details for the file, depending on file type (example: image size in bytes, etc) */
  var details: js.UndefOr[Record[String, _]] = js.native
  
  var fileName: String = js.native
  
  /** Url where the file is available to be downloaded from, into the Contentful asset system. After the asset is processed this field is gone. */
  var upload: js.UndefOr[String] = js.native
  
  var uploadFrom: js.UndefOr[Record[String, _]] = js.native
  
  /** Url where the file is available at the Contentful media asset system. This field won't be available until the asset is processed. */
  var url: js.UndefOr[String] = js.native
}
object ContentType {
  
  @scala.inline
  def apply(contentType: String, fileName: String): ContentType = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
  
  @scala.inline
  implicit class ContentTypeOps[Self <: ContentType] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Record[String, _]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setUpload(value: String): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    
    @scala.inline
    def setUploadFrom(value: Record[String, _]): Self = this.set("uploadFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadFrom: Self = this.set("uploadFrom", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
