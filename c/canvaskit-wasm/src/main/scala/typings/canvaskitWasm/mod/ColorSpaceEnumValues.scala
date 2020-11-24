package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSpaceEnumValues extends js.Object {
  
  val ADOBE_RGB: ColorSpace = js.native
  
  val DISPLAY_P3: ColorSpace = js.native
  
  // not a typical enum, but effectively like one.
  val SRGB: ColorSpace = js.native
}
object ColorSpaceEnumValues {
  
  @scala.inline
  def apply(ADOBE_RGB: ColorSpace, DISPLAY_P3: ColorSpace, SRGB: ColorSpace): ColorSpaceEnumValues = {
    val __obj = js.Dynamic.literal(ADOBE_RGB = ADOBE_RGB.asInstanceOf[js.Any], DISPLAY_P3 = DISPLAY_P3.asInstanceOf[js.Any], SRGB = SRGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSpaceEnumValues]
  }
  
  @scala.inline
  implicit class ColorSpaceEnumValuesOps[Self <: ColorSpaceEnumValues] (val x: Self) extends AnyVal {
    
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
    def setADOBE_RGB(value: ColorSpace): Self = this.set("ADOBE_RGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISPLAY_P3(value: ColorSpace): Self = this.set("DISPLAY_P3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSRGB(value: ColorSpace): Self = this.set("SRGB", value.asInstanceOf[js.Any])
  }
}
