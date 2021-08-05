package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorTypeEnumValues
  extends StObject
     with EmbindEnum {
  
  var Alpha_8: ColorType
  
  var BGRA_8888: ColorType
  
  var Gray_8: ColorType
  
  var RGBA_1010102: ColorType
  
  var RGBA_8888: ColorType
  
  var RGBA_F16: ColorType
  
  var RGBA_F32: ColorType
  
  var RGB_101010x: ColorType
  
  var RGB_565: ColorType
}
object ColorTypeEnumValues {
  
  inline def apply(
    Alpha_8: ColorType,
    BGRA_8888: ColorType,
    Gray_8: ColorType,
    RGBA_1010102: ColorType,
    RGBA_8888: ColorType,
    RGBA_F16: ColorType,
    RGBA_F32: ColorType,
    RGB_101010x: ColorType,
    RGB_565: ColorType,
    values: js.Array[Double]
  ): ColorTypeEnumValues = {
    val __obj = js.Dynamic.literal(Alpha_8 = Alpha_8.asInstanceOf[js.Any], BGRA_8888 = BGRA_8888.asInstanceOf[js.Any], Gray_8 = Gray_8.asInstanceOf[js.Any], RGBA_1010102 = RGBA_1010102.asInstanceOf[js.Any], RGBA_8888 = RGBA_8888.asInstanceOf[js.Any], RGBA_F16 = RGBA_F16.asInstanceOf[js.Any], RGBA_F32 = RGBA_F32.asInstanceOf[js.Any], RGB_101010x = RGB_101010x.asInstanceOf[js.Any], RGB_565 = RGB_565.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTypeEnumValues]
  }
  
  extension [Self <: ColorTypeEnumValues](x: Self) {
    
    inline def setAlpha_8(value: ColorType): Self = StObject.set(x, "Alpha_8", value.asInstanceOf[js.Any])
    
    inline def setBGRA_8888(value: ColorType): Self = StObject.set(x, "BGRA_8888", value.asInstanceOf[js.Any])
    
    inline def setGray_8(value: ColorType): Self = StObject.set(x, "Gray_8", value.asInstanceOf[js.Any])
    
    inline def setRGBA_1010102(value: ColorType): Self = StObject.set(x, "RGBA_1010102", value.asInstanceOf[js.Any])
    
    inline def setRGBA_8888(value: ColorType): Self = StObject.set(x, "RGBA_8888", value.asInstanceOf[js.Any])
    
    inline def setRGBA_F16(value: ColorType): Self = StObject.set(x, "RGBA_F16", value.asInstanceOf[js.Any])
    
    inline def setRGBA_F32(value: ColorType): Self = StObject.set(x, "RGBA_F32", value.asInstanceOf[js.Any])
    
    inline def setRGB_101010x(value: ColorType): Self = StObject.set(x, "RGB_101010x", value.asInstanceOf[js.Any])
    
    inline def setRGB_565(value: ColorType): Self = StObject.set(x, "RGB_565", value.asInstanceOf[js.Any])
  }
}
