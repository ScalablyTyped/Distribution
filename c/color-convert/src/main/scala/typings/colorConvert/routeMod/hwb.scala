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
trait hwb extends StObject {
  
  def ansi16(from: HWB_): ANSI16_ = js.native
  
  def ansi256(from: HWB_): ANSI256_ = js.native
  
  def apple(from: HWB_): APPLE_ = js.native
  
  def cmyk(from: HWB_): CMYK_ = js.native
  
  def gray(from: HWB_): GRAY_ = js.native
  
  def hcg(from: HWB_): HCG_ = js.native
  
  def hex(from: HWB_): HEX_ = js.native
  
  def hsl(from: HWB_): HSL_ = js.native
  
  def hsv(from: HWB_): HSV_ = js.native
  
  def keyword(from: HWB_): KEYWORD_ = js.native
  
  def lab(from: HWB_): LAB_ = js.native
  
  def lch(from: HWB_): LCH_ = js.native
  
  def rgb(from: HWB_): RGB_ = js.native
  
  def xyz(from: HWB_): XYZ_ = js.native
}
object hwb {
  
  @scala.inline
  def apply(
    ansi16: HWB_ => ANSI16_,
    ansi256: HWB_ => ANSI256_,
    apple: HWB_ => APPLE_,
    cmyk: HWB_ => CMYK_,
    gray: HWB_ => GRAY_,
    hcg: HWB_ => HCG_,
    hex: HWB_ => HEX_,
    hsl: HWB_ => HSL_,
    hsv: HWB_ => HSV_,
    keyword: HWB_ => KEYWORD_,
    lab: HWB_ => LAB_,
    lch: HWB_ => LCH_,
    rgb: HWB_ => RGB_,
    xyz: HWB_ => XYZ_
  ): hwb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hwb]
  }
  
  @scala.inline
  implicit class hwbMutableBuilder[Self <: hwb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: HWB_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: HWB_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: HWB_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: HWB_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: HWB_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: HWB_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: HWB_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: HWB_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: HWB_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: HWB_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: HWB_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: HWB_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: HWB_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: HWB_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
