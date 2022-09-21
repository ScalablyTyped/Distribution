package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaData
  extends StObject
     with ImageHead {
  
  var exif: js.UndefOr[Exif] = js.undefined
  
  var iptc: js.UndefOr[Iptc] = js.undefined
  
  var originalHeight: js.UndefOr[Double] = js.undefined
  
  var originalWidth: js.UndefOr[Double] = js.undefined
}
object MetaData {
  
  inline def apply(): MetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaData]
  }
  
  extension [Self <: MetaData](x: Self) {
    
    inline def setExif(value: Exif): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
    
    inline def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
    
    inline def setIptc(value: Iptc): Self = StObject.set(x, "iptc", value.asInstanceOf[js.Any])
    
    inline def setIptcUndefined: Self = StObject.set(x, "iptc", js.undefined)
    
    inline def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
    
    inline def setOriginalHeightUndefined: Self = StObject.set(x, "originalHeight", js.undefined)
    
    inline def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
    
    inline def setOriginalWidthUndefined: Self = StObject.set(x, "originalWidth", js.undefined)
  }
}
