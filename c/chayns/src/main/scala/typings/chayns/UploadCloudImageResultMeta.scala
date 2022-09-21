package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadCloudImageResultMeta extends StObject {
  
  var height: Double
  
  var preview: String
  
  var width: Double
}
object UploadCloudImageResultMeta {
  
  inline def apply(height: Double, preview: String, width: Double): UploadCloudImageResultMeta = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadCloudImageResultMeta]
  }
  
  extension [Self <: UploadCloudImageResultMeta](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
