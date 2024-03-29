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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageData] (val x: Self) extends AnyVal {
    
    inline def setImageData(value: typings.std.ImageData | StringDictionary[typings.std.ImageData]): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
  }
}
