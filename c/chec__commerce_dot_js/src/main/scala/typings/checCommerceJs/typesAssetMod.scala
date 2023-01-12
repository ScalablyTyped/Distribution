package typings.checCommerceJs

import typings.checCommerceJs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAssetMod {
  
  trait Asset extends StObject {
    
    var created_at: Double
    
    var description: String | Null
    
    var file_extension: String
    
    var file_size: js.UndefOr[Double] = js.undefined
    
    var filename: String
    
    var id: String
    
    var image_dimensions: Height
    
    var is_image: Boolean
    
    var meta: Any
    
    var updated_at: Double
    
    var url: String
  }
  object Asset {
    
    inline def apply(
      created_at: Double,
      file_extension: String,
      filename: String,
      id: String,
      image_dimensions: Height,
      is_image: Boolean,
      meta: Any,
      updated_at: Double,
      url: String
    ): Asset = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], file_extension = file_extension.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_dimensions = image_dimensions.asInstanceOf[js.Any], is_image = is_image.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
      __obj.asInstanceOf[Asset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setFile_extension(value: String): Self = StObject.set(x, "file_extension", value.asInstanceOf[js.Any])
      
      inline def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
      
      inline def setFile_sizeUndefined: Self = StObject.set(x, "file_size", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage_dimensions(value: Height): Self = StObject.set(x, "image_dimensions", value.asInstanceOf[js.Any])
      
      inline def setIs_image(value: Boolean): Self = StObject.set(x, "is_image", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
