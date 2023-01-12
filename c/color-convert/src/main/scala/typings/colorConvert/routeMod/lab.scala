package typings.colorConvert.routeMod

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait lab extends StObject {
  
  def ansi16(from: LAB_): ANSI16_
  
  def ansi256(from: LAB_): ANSI256_
  
  def apple(from: LAB_): APPLE_
  
  def cmyk(from: LAB_): CMYK_
  
  def gray(from: LAB_): GRAY_
  
  def hcg(from: LAB_): HCG_
  
  def hex(from: LAB_): HEX_
  
  def hsl(from: LAB_): HSL_
  
  def hsv(from: LAB_): HSV_
  
  def hwb(from: LAB_): HWB_
  
  def keyword(from: LAB_): KEYWORD_
  
  def lch(from: LAB_): LCH_
  
  def rgb(from: LAB_): RGB_
  
  def xyz(from: LAB_): XYZ_
}
object lab {
  
  inline def apply(
    ansi16: LAB_ => ANSI16_,
    ansi256: LAB_ => ANSI256_,
    apple: LAB_ => APPLE_,
    cmyk: LAB_ => CMYK_,
    gray: LAB_ => GRAY_,
    hcg: LAB_ => HCG_,
    hex: LAB_ => HEX_,
    hsl: LAB_ => HSL_,
    hsv: LAB_ => HSV_,
    hwb: LAB_ => HWB_,
    keyword: LAB_ => KEYWORD_,
    lch: LAB_ => LCH_,
    rgb: LAB_ => RGB_,
    xyz: LAB_ => XYZ_
  ): lab = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[lab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: lab] (val x: Self) extends AnyVal {
    
    inline def setAnsi16(value: LAB_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    inline def setAnsi256(value: LAB_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    inline def setApple(value: LAB_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    inline def setCmyk(value: LAB_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    inline def setGray(value: LAB_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    inline def setHcg(value: LAB_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    inline def setHex(value: LAB_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    inline def setHsl(value: LAB_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    inline def setHsv(value: LAB_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    inline def setHwb(value: LAB_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    inline def setKeyword(value: LAB_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    inline def setLch(value: LAB_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    inline def setRgb(value: LAB_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz(value: LAB_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
