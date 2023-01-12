package typings.cloudinaryUploadwidgetBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageParameters extends StObject {
  
  var fieldName: js.UndefOr[String] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var thumbnailTransformation: js.UndefOr[String | js.Array[ThumbnailTransformation]] = js.undefined
  
  var thumbnails: js.UndefOr[String | Null] = js.undefined
}
object PageParameters {
  
  inline def apply(): PageParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageParameters] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setThumbnailTransformation(value: String | js.Array[ThumbnailTransformation]): Self = StObject.set(x, "thumbnailTransformation", value.asInstanceOf[js.Any])
    
    inline def setThumbnailTransformationUndefined: Self = StObject.set(x, "thumbnailTransformation", js.undefined)
    
    inline def setThumbnailTransformationVarargs(value: ThumbnailTransformation*): Self = StObject.set(x, "thumbnailTransformation", js.Array(value*))
    
    inline def setThumbnails(value: String): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsNull: Self = StObject.set(x, "thumbnails", null)
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
  }
}
