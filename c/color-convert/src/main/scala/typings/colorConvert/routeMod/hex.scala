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
trait hex extends StObject {
  
  def ansi16(from: HEX_): ANSI16_ = js.native
  
  def ansi256(from: HEX_): ANSI256_ = js.native
  
  def apple(from: HEX_): APPLE_ = js.native
  
  def cmyk(from: HEX_): CMYK_ = js.native
  
  def gray(from: HEX_): GRAY_ = js.native
  
  def hcg(from: HEX_): HCG_ = js.native
  
  def hsl(from: HEX_): HSL_ = js.native
  
  def hsv(from: HEX_): HSV_ = js.native
  
  def hwb(from: HEX_): HWB_ = js.native
  
  def keyword(from: HEX_): KEYWORD_ = js.native
  
  def lab(from: HEX_): LAB_ = js.native
  
  def lch(from: HEX_): LCH_ = js.native
  
  def rgb(from: HEX_): RGB_ = js.native
  
  def xyz(from: HEX_): XYZ_ = js.native
}
object hex {
  
  @scala.inline
  def apply(
    ansi16: HEX_ => ANSI16_,
    ansi256: HEX_ => ANSI256_,
    apple: HEX_ => APPLE_,
    cmyk: HEX_ => CMYK_,
    gray: HEX_ => GRAY_,
    hcg: HEX_ => HCG_,
    hsl: HEX_ => HSL_,
    hsv: HEX_ => HSV_,
    hwb: HEX_ => HWB_,
    keyword: HEX_ => KEYWORD_,
    lab: HEX_ => LAB_,
    lch: HEX_ => LCH_,
    rgb: HEX_ => RGB_,
    xyz: HEX_ => XYZ_
  ): hex = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hex]
  }
  
  @scala.inline
  implicit class hexMutableBuilder[Self <: hex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: HEX_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: HEX_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: HEX_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: HEX_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: HEX_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: HEX_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: HEX_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: HEX_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: HEX_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: HEX_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: HEX_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: HEX_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: HEX_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: HEX_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
