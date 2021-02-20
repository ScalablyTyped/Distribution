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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait cmyk extends StObject {
  
  def ansi16(from: CMYK_): ANSI16_ = js.native
  
  def ansi256(from: CMYK_): ANSI256_ = js.native
  
  def apple(from: CMYK_): APPLE_ = js.native
  
  def gray(from: CMYK_): GRAY_ = js.native
  
  def hcg(from: CMYK_): HCG_ = js.native
  
  def hex(from: CMYK_): HEX_ = js.native
  
  def hsl(from: CMYK_): HSL_ = js.native
  
  def hsv(from: CMYK_): HSV_ = js.native
  
  def hwb(from: CMYK_): HWB_ = js.native
  
  def keyword(from: CMYK_): KEYWORD_ = js.native
  
  def lab(from: CMYK_): LAB_ = js.native
  
  def lch(from: CMYK_): LCH_ = js.native
  
  def rgb(from: CMYK_): RGB_ = js.native
  
  def xyz(from: CMYK_): XYZ_ = js.native
}
object cmyk {
  
  @scala.inline
  def apply(
    ansi16: CMYK_ => ANSI16_,
    ansi256: CMYK_ => ANSI256_,
    apple: CMYK_ => APPLE_,
    gray: CMYK_ => GRAY_,
    hcg: CMYK_ => HCG_,
    hex: CMYK_ => HEX_,
    hsl: CMYK_ => HSL_,
    hsv: CMYK_ => HSV_,
    hwb: CMYK_ => HWB_,
    keyword: CMYK_ => KEYWORD_,
    lab: CMYK_ => LAB_,
    lch: CMYK_ => LCH_,
    rgb: CMYK_ => RGB_,
    xyz: CMYK_ => XYZ_
  ): cmyk = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[cmyk]
  }
  
  @scala.inline
  implicit class cmykMutableBuilder[Self <: cmyk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: CMYK_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: CMYK_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: CMYK_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: CMYK_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: CMYK_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: CMYK_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: CMYK_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: CMYK_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: CMYK_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: CMYK_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: CMYK_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: CMYK_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: CMYK_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: CMYK_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
