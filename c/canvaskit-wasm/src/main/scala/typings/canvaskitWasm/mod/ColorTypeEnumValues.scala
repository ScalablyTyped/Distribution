package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorTypeEnumValues extends EmbindEnum {
  
  var Alpha_8: ColorType = js.native
  
  var BGRA_8888: ColorType = js.native
  
  var Gray_8: ColorType = js.native
  
  var RGBA_1010102: ColorType = js.native
  
  var RGBA_8888: ColorType = js.native
  
  var RGBA_F16: ColorType = js.native
  
  var RGBA_F32: ColorType = js.native
  
  var RGB_101010x: ColorType = js.native
  
  var RGB_565: ColorType = js.native
}
object ColorTypeEnumValues {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ColorTypeEnumValuesOps[Self <: ColorTypeEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlpha_8(value: ColorType): Self = this.set("Alpha_8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBGRA_8888(value: ColorType): Self = this.set("BGRA_8888", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGray_8(value: ColorType): Self = this.set("Gray_8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGBA_1010102(value: ColorType): Self = this.set("RGBA_1010102", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGBA_8888(value: ColorType): Self = this.set("RGBA_8888", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGBA_F16(value: ColorType): Self = this.set("RGBA_F16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGBA_F32(value: ColorType): Self = this.set("RGBA_F32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB_101010x(value: ColorType): Self = this.set("RGB_101010x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB_565(value: ColorType): Self = this.set("RGB_565", value.asInstanceOf[js.Any])
  }
}
