package typings.contentfulManagement.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentType extends StObject {
  
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
  implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Record[String, _]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadFrom(value: Record[String, _]): Self = StObject.set(x, "uploadFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadFromUndefined: Self = StObject.set(x, "uploadFrom", js.undefined)
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
