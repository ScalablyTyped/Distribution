package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconOptions extends StObject {
  
  var anchor: js.UndefOr[Size] = js.undefined
  
  var imageOffset: js.UndefOr[Size] = js.undefined
  
  var imageSize: js.UndefOr[Size] = js.undefined
  
  var infoWindowAnchor: js.UndefOr[Size] = js.undefined
  
  var printImageUrl: js.UndefOr[String] = js.undefined
  
  var srcset: js.UndefOr[js.Object] = js.undefined
}
object IconOptions {
  
  inline def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Size): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setImageOffset(value: Size): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
    
    inline def setImageOffsetUndefined: Self = StObject.set(x, "imageOffset", js.undefined)
    
    inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    inline def setInfoWindowAnchor(value: Size): Self = StObject.set(x, "infoWindowAnchor", value.asInstanceOf[js.Any])
    
    inline def setInfoWindowAnchorUndefined: Self = StObject.set(x, "infoWindowAnchor", js.undefined)
    
    inline def setPrintImageUrl(value: String): Self = StObject.set(x, "printImageUrl", value.asInstanceOf[js.Any])
    
    inline def setPrintImageUrlUndefined: Self = StObject.set(x, "printImageUrl", js.undefined)
    
    inline def setSrcset(value: js.Object): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
    
    inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
  }
}
