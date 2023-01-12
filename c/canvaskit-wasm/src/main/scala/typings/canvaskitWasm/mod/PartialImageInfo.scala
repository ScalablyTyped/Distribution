package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialImageInfo extends StObject {
  
  var alphaType: AlphaType
  
  var colorType: ColorType
  
  var height: Double
  
  var width: Double
}
object PartialImageInfo {
  
  inline def apply(alphaType: AlphaType, colorType: ColorType, height: Double, width: Double): PartialImageInfo = {
    val __obj = js.Dynamic.literal(alphaType = alphaType.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialImageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialImageInfo] (val x: Self) extends AnyVal {
    
    inline def setAlphaType(value: AlphaType): Self = StObject.set(x, "alphaType", value.asInstanceOf[js.Any])
    
    inline def setColorType(value: ColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
