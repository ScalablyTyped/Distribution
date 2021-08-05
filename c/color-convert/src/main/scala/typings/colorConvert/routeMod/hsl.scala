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

trait hsl extends StObject {
  
  def ansi16(from: HSL_): ANSI16_
  
  def ansi256(from: HSL_): ANSI256_
  
  def apple(from: HSL_): APPLE_
  
  def cmyk(from: HSL_): CMYK_
  
  def gray(from: HSL_): GRAY_
  
  def hcg(from: HSL_): HCG_
  
  def hex(from: HSL_): HEX_
  
  def hsv(from: HSL_): HSV_
  
  def hwb(from: HSL_): HWB_
  
  def keyword(from: HSL_): KEYWORD_
  
  def lab(from: HSL_): LAB_
  
  def lch(from: HSL_): LCH_
  
  def rgb(from: HSL_): RGB_
  
  def xyz(from: HSL_): XYZ_
}
object hsl {
  
  inline def apply(
    ansi16: HSL_ => ANSI16_,
    ansi256: HSL_ => ANSI256_,
    apple: HSL_ => APPLE_,
    cmyk: HSL_ => CMYK_,
    gray: HSL_ => GRAY_,
    hcg: HSL_ => HCG_,
    hex: HSL_ => HEX_,
    hsv: HSL_ => HSV_,
    hwb: HSL_ => HWB_,
    keyword: HSL_ => KEYWORD_,
    lab: HSL_ => LAB_,
    lch: HSL_ => LCH_,
    rgb: HSL_ => RGB_,
    xyz: HSL_ => XYZ_
  ): hsl = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hsl]
  }
  
  extension [Self <: hsl](x: Self) {
    
    inline def setAnsi16(value: HSL_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    inline def setAnsi256(value: HSL_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    inline def setApple(value: HSL_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    inline def setCmyk(value: HSL_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    inline def setGray(value: HSL_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    inline def setHcg(value: HSL_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    inline def setHex(value: HSL_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    inline def setHsv(value: HSL_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    inline def setHwb(value: HSL_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    inline def setKeyword(value: HSL_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    inline def setLab(value: HSL_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    inline def setLch(value: HSL_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    inline def setRgb(value: HSL_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz(value: HSL_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
