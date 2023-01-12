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

trait lch extends StObject {
  
  def ansi16(from: LCH_): ANSI16_
  
  def ansi256(from: LCH_): ANSI256_
  
  def apple(from: LCH_): APPLE_
  
  def cmyk(from: LCH_): CMYK_
  
  def gray(from: LCH_): GRAY_
  
  def hcg(from: LCH_): HCG_
  
  def hex(from: LCH_): HEX_
  
  def hsl(from: LCH_): HSL_
  
  def hsv(from: LCH_): HSV_
  
  def hwb(from: LCH_): HWB_
  
  def keyword(from: LCH_): KEYWORD_
  
  def lab(from: LCH_): LAB_
  
  def rgb(from: LCH_): RGB_
  
  def xyz(from: LCH_): XYZ_
}
object lch {
  
  inline def apply(
    ansi16: LCH_ => ANSI16_,
    ansi256: LCH_ => ANSI256_,
    apple: LCH_ => APPLE_,
    cmyk: LCH_ => CMYK_,
    gray: LCH_ => GRAY_,
    hcg: LCH_ => HCG_,
    hex: LCH_ => HEX_,
    hsl: LCH_ => HSL_,
    hsv: LCH_ => HSV_,
    hwb: LCH_ => HWB_,
    keyword: LCH_ => KEYWORD_,
    lab: LCH_ => LAB_,
    rgb: LCH_ => RGB_,
    xyz: LCH_ => XYZ_
  ): lch = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[lch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: lch] (val x: Self) extends AnyVal {
    
    inline def setAnsi16(value: LCH_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    inline def setAnsi256(value: LCH_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    inline def setApple(value: LCH_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    inline def setCmyk(value: LCH_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    inline def setGray(value: LCH_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    inline def setHcg(value: LCH_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    inline def setHex(value: LCH_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    inline def setHsl(value: LCH_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    inline def setHsv(value: LCH_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    inline def setHwb(value: LCH_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    inline def setKeyword(value: LCH_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    inline def setLab(value: LCH_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: LCH_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz(value: LCH_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
