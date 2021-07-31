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

trait xyz extends StObject {
  
  def ansi16(from: XYZ_): ANSI16_
  
  def ansi256(from: XYZ_): ANSI256_
  
  def apple(from: XYZ_): APPLE_
  
  def cmyk(from: XYZ_): CMYK_
  
  def gray(from: XYZ_): GRAY_
  
  def hcg(from: XYZ_): HCG_
  
  def hex(from: XYZ_): HEX_
  
  def hsl(from: XYZ_): HSL_
  
  def hsv(from: XYZ_): HSV_
  
  def hwb(from: XYZ_): HWB_
  
  def keyword(from: XYZ_): KEYWORD_
  
  def lab(from: XYZ_): LAB_
  
  def lch(from: XYZ_): LCH_
  
  def rgb(from: XYZ_): RGB_
}
object xyz {
  
  @scala.inline
  def apply(
    ansi16: XYZ_ => ANSI16_,
    ansi256: XYZ_ => ANSI256_,
    apple: XYZ_ => APPLE_,
    cmyk: XYZ_ => CMYK_,
    gray: XYZ_ => GRAY_,
    hcg: XYZ_ => HCG_,
    hex: XYZ_ => HEX_,
    hsl: XYZ_ => HSL_,
    hsv: XYZ_ => HSV_,
    hwb: XYZ_ => HWB_,
    keyword: XYZ_ => KEYWORD_,
    lab: XYZ_ => LAB_,
    lch: XYZ_ => LCH_,
    rgb: XYZ_ => RGB_
  ): xyz = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[xyz]
  }
  
  @scala.inline
  implicit class xyzMutableBuilder[Self <: xyz] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: XYZ_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: XYZ_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: XYZ_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: XYZ_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: XYZ_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: XYZ_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: XYZ_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: XYZ_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: XYZ_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: XYZ_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: XYZ_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: XYZ_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: XYZ_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: XYZ_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
