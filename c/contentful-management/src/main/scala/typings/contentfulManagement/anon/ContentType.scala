package typings.contentfulManagement.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentType extends StObject {
  
  var contentType: String
  
  /** Details for the file, depending on file type (example: image size in bytes, etc) */
  var details: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var fileName: String
  
  /** Url where the file is available to be downloaded from, into the Contentful asset system. After the asset is processed this field is gone. */
  var upload: js.UndefOr[String] = js.undefined
  
  var uploadFrom: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  /** Url where the file is available at the Contentful media asset system. This field won't be available until the asset is processed. */
  var url: js.UndefOr[String] = js.undefined
}
object ContentType {
  
  inline def apply(contentType: String, fileName: String): ContentType = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
  
  extension [Self <: ContentType](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Record[String, js.Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadFrom(value: Record[String, js.Any]): Self = StObject.set(x, "uploadFrom", value.asInstanceOf[js.Any])
    
    inline def setUploadFromUndefined: Self = StObject.set(x, "uploadFrom", js.undefined)
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
