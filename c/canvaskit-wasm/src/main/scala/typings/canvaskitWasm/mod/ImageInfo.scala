package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInfo extends StObject {
  
  var alphaType: AlphaType
  
  var colorSpace: ColorSpace
  
  var colorType: ColorType
  
  var height: Double
  
  var width: Double
}
object ImageInfo {
  
  inline def apply(alphaType: AlphaType, colorSpace: ColorSpace, colorType: ColorType, height: Double, width: Double): ImageInfo = {
    val __obj = js.Dynamic.literal(alphaType = alphaType.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  
  extension [Self <: ImageInfo](x: Self) {
    
    inline def setAlphaType(value: AlphaType): Self = StObject.set(x, "alphaType", value.asInstanceOf[js.Any])
    
    inline def setColorSpace(value: ColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorType(value: ColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
