package typings.chrome.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageData extends StObject {
  
  var imageData: js.UndefOr[typings.std.ImageData | StringDictionary[typings.std.ImageData]] = js.undefined
}
object ImageData {
  
  inline def apply(): ImageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageData]
  }
  
  extension [Self <: ImageData](x: Self) {
    
    inline def setImageData(value: typings.std.ImageData | StringDictionary[typings.std.ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
