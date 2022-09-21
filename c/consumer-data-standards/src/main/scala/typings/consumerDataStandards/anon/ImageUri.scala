package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageUri
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * URI reference to a PNG, JPG or GIF image with proportions defined by ISO 7810 ID-1 and width no greater than 512 pixels. The URI reference may be a link or url-encoded data URI according to **[[RFC2397]](#nref-RFC2397)**
    */
  var imageUri: String
  
  /**
    * Display label for the specific image
    */
  var title: js.UndefOr[String] = js.undefined
}
object ImageUri {
  
  inline def apply(imageUri: String): ImageUri = {
    val __obj = js.Dynamic.literal(imageUri = imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUri]
  }
  
  extension [Self <: ImageUri](x: Self) {
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
