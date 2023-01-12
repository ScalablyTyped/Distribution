package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadCloudImageResult extends StObject {
  
  var base: String
  
  var imageLocations: js.Array[String]
  
  var key: String
  
  var meta: UploadCloudImageResultMeta
  
  var url: String
}
object UploadCloudImageResult {
  
  inline def apply(
    base: String,
    imageLocations: js.Array[String],
    key: String,
    meta: UploadCloudImageResultMeta,
    url: String
  ): UploadCloudImageResult = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], imageLocations = imageLocations.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadCloudImageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadCloudImageResult] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setImageLocations(value: js.Array[String]): Self = StObject.set(x, "imageLocations", value.asInstanceOf[js.Any])
    
    inline def setImageLocationsVarargs(value: String*): Self = StObject.set(x, "imageLocations", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: UploadCloudImageResultMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
