package typings.dashjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dashjs.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionData extends StObject {
  
  var cueID: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var embeddedImages: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var end: Double
  
  var images: js.UndefOr[js.Array[String]] = js.undefined
  
  var isd: js.UndefOr[js.Object] = js.undefined
  
  var start: Double
  
  var styles: js.UndefOr[Align] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object CaptionData {
  
  inline def apply(end: Double, start: Double): CaptionData = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionData]
  }
  
  extension [Self <: CaptionData](x: Self) {
    
    inline def setCueID(value: String): Self = StObject.set(x, "cueID", value.asInstanceOf[js.Any])
    
    inline def setCueIDUndefined: Self = StObject.set(x, "cueID", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEmbeddedImages(value: StringDictionary[String]): Self = StObject.set(x, "embeddedImages", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedImagesUndefined: Self = StObject.set(x, "embeddedImages", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setIsd(value: js.Object): Self = StObject.set(x, "isd", value.asInstanceOf[js.Any])
    
    inline def setIsdUndefined: Self = StObject.set(x, "isd", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: Align): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
