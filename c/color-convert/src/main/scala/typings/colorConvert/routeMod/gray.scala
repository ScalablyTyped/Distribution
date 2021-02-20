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
trait gray extends StObject {
  
  def ansi16(from: GRAY_): ANSI16_ = js.native
  
  def ansi256(from: GRAY_): ANSI256_ = js.native
  
  def apple(from: GRAY_): APPLE_ = js.native
  
  def cmyk(from: GRAY_): CMYK_ = js.native
  
  def hcg(from: GRAY_): HCG_ = js.native
  
  def hex(from: GRAY_): HEX_ = js.native
  
  def hsl(from: GRAY_): HSL_ = js.native
  
  def hsv(from: GRAY_): HSV_ = js.native
  
  def hwb(from: GRAY_): HWB_ = js.native
  
  def keyword(from: GRAY_): KEYWORD_ = js.native
  
  def lab(from: GRAY_): LAB_ = js.native
  
  def lch(from: GRAY_): LCH_ = js.native
  
  def rgb(from: GRAY_): RGB_ = js.native
  
  def xyz(from: GRAY_): XYZ_ = js.native
}
object gray {
  
  @scala.inline
  def apply(
    ansi16: GRAY_ => ANSI16_,
    ansi256: GRAY_ => ANSI256_,
    apple: GRAY_ => APPLE_,
    cmyk: GRAY_ => CMYK_,
    hcg: GRAY_ => HCG_,
    hex: GRAY_ => HEX_,
    hsl: GRAY_ => HSL_,
    hsv: GRAY_ => HSV_,
    hwb: GRAY_ => HWB_,
    keyword: GRAY_ => KEYWORD_,
    lab: GRAY_ => LAB_,
    lch: GRAY_ => LCH_,
    rgb: GRAY_ => RGB_,
    xyz: GRAY_ => XYZ_
  ): gray = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[gray]
  }
  
  @scala.inline
  implicit class grayMutableBuilder[Self <: gray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: GRAY_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: GRAY_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: GRAY_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: GRAY_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: GRAY_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: GRAY_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: GRAY_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: GRAY_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: GRAY_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: GRAY_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: GRAY_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: GRAY_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: GRAY_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: GRAY_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
