package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSpaceEnumValues extends StObject {
  
  val ADOBE_RGB: ColorSpace
  
  val DISPLAY_P3: ColorSpace
  
  /**
    * Returns true if the two color spaces are equal.
    * @param a
    * @param b
    */
  def Equals(a: ColorSpace, b: ColorSpace): Boolean
  
  // not a typical enum, but effectively like one.
  // These are all singleton values - don't call delete on them.
  val SRGB: ColorSpace
}
object ColorSpaceEnumValues {
  
  inline def apply(
    ADOBE_RGB: ColorSpace,
    DISPLAY_P3: ColorSpace,
    Equals: (ColorSpace, ColorSpace) => Boolean,
    SRGB: ColorSpace
  ): ColorSpaceEnumValues = {
    val __obj = js.Dynamic.literal(ADOBE_RGB = ADOBE_RGB.asInstanceOf[js.Any], DISPLAY_P3 = DISPLAY_P3.asInstanceOf[js.Any], Equals = js.Any.fromFunction2(Equals), SRGB = SRGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSpaceEnumValues]
  }
  
  extension [Self <: ColorSpaceEnumValues](x: Self) {
    
    inline def setADOBE_RGB(value: ColorSpace): Self = StObject.set(x, "ADOBE_RGB", value.asInstanceOf[js.Any])
    
    inline def setDISPLAY_P3(value: ColorSpace): Self = StObject.set(x, "DISPLAY_P3", value.asInstanceOf[js.Any])
    
    inline def setEquals(value: (ColorSpace, ColorSpace) => Boolean): Self = StObject.set(x, "Equals", js.Any.fromFunction2(value))
    
    inline def setSRGB(value: ColorSpace): Self = StObject.set(x, "SRGB", value.asInstanceOf[js.Any])
  }
}
