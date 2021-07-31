package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSpaceEnumValues extends StObject {
  
  val ADOBE_RGB: ColorSpace
  
  val DISPLAY_P3: ColorSpace
  
  // not a typical enum, but effectively like one.
  val SRGB: ColorSpace
}
object ColorSpaceEnumValues {
  
  @scala.inline
  def apply(ADOBE_RGB: ColorSpace, DISPLAY_P3: ColorSpace, SRGB: ColorSpace): ColorSpaceEnumValues = {
    val __obj = js.Dynamic.literal(ADOBE_RGB = ADOBE_RGB.asInstanceOf[js.Any], DISPLAY_P3 = DISPLAY_P3.asInstanceOf[js.Any], SRGB = SRGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSpaceEnumValues]
  }
  
  @scala.inline
  implicit class ColorSpaceEnumValuesMutableBuilder[Self <: ColorSpaceEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADOBE_RGB(value: ColorSpace): Self = StObject.set(x, "ADOBE_RGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISPLAY_P3(value: ColorSpace): Self = StObject.set(x, "DISPLAY_P3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSRGB(value: ColorSpace): Self = StObject.set(x, "SRGB", value.asInstanceOf[js.Any])
  }
}
