package typings.cesium.anon

import typings.cesium.mod.PixelDatatype
import typings.cesium.mod.PixelFormat
import typings.cesium.mod.Resource
import typings.cesium.mod.TextureMagnificationFilter
import typings.cesium.mod.TextureMinificationFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MagnificationFilter extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var magnificationFilter: js.UndefOr[TextureMagnificationFilter] = js.undefined
  
  var maximumAnisotropy: js.UndefOr[Double] = js.undefined
  
  var minificationFilter: js.UndefOr[TextureMinificationFilter] = js.undefined
  
  var pixelDatatype: js.UndefOr[PixelDatatype] = js.undefined
  
  var pixelFormat: js.UndefOr[PixelFormat] = js.undefined
  
  var repeat: js.UndefOr[Boolean] = js.undefined
  
  var typedArray: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var url: js.UndefOr[String | Resource] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object MagnificationFilter {
  
  inline def apply(): MagnificationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagnificationFilter]
  }
  
  extension [Self <: MagnificationFilter](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMagnificationFilter(value: TextureMagnificationFilter): Self = StObject.set(x, "magnificationFilter", value.asInstanceOf[js.Any])
    
    inline def setMagnificationFilterUndefined: Self = StObject.set(x, "magnificationFilter", js.undefined)
    
    inline def setMaximumAnisotropy(value: Double): Self = StObject.set(x, "maximumAnisotropy", value.asInstanceOf[js.Any])
    
    inline def setMaximumAnisotropyUndefined: Self = StObject.set(x, "maximumAnisotropy", js.undefined)
    
    inline def setMinificationFilter(value: TextureMinificationFilter): Self = StObject.set(x, "minificationFilter", value.asInstanceOf[js.Any])
    
    inline def setMinificationFilterUndefined: Self = StObject.set(x, "minificationFilter", js.undefined)
    
    inline def setPixelDatatype(value: PixelDatatype): Self = StObject.set(x, "pixelDatatype", value.asInstanceOf[js.Any])
    
    inline def setPixelDatatypeUndefined: Self = StObject.set(x, "pixelDatatype", js.undefined)
    
    inline def setPixelFormat(value: PixelFormat): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    inline def setPixelFormatUndefined: Self = StObject.set(x, "pixelFormat", js.undefined)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setTypedArray(value: js.typedarray.Uint8Array): Self = StObject.set(x, "typedArray", value.asInstanceOf[js.Any])
    
    inline def setTypedArrayUndefined: Self = StObject.set(x, "typedArray", js.undefined)
    
    inline def setUrl(value: String | Resource): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
