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
trait ansi16 extends StObject {
  
  def ansi256(from: ANSI16_): ANSI256_ = js.native
  
  def apple(from: ANSI16_): APPLE_ = js.native
  
  def cmyk(from: ANSI16_): CMYK_ = js.native
  
  def gray(from: ANSI16_): GRAY_ = js.native
  
  def hcg(from: ANSI16_): HCG_ = js.native
  
  def hex(from: ANSI16_): HEX_ = js.native
  
  def hsl(from: ANSI16_): HSL_ = js.native
  
  def hsv(from: ANSI16_): HSV_ = js.native
  
  def hwb(from: ANSI16_): HWB_ = js.native
  
  def keyword(from: ANSI16_): KEYWORD_ = js.native
  
  def lab(from: ANSI16_): LAB_ = js.native
  
  def lch(from: ANSI16_): LCH_ = js.native
  
  def rgb(from: ANSI16_): RGB_ = js.native
  
  def xyz(from: ANSI16_): XYZ_ = js.native
}
object ansi16 {
  
  @scala.inline
  def apply(
    ansi256: ANSI16_ => ANSI256_,
    apple: ANSI16_ => APPLE_,
    cmyk: ANSI16_ => CMYK_,
    gray: ANSI16_ => GRAY_,
    hcg: ANSI16_ => HCG_,
    hex: ANSI16_ => HEX_,
    hsl: ANSI16_ => HSL_,
    hsv: ANSI16_ => HSV_,
    hwb: ANSI16_ => HWB_,
    keyword: ANSI16_ => KEYWORD_,
    lab: ANSI16_ => LAB_,
    lch: ANSI16_ => LCH_,
    rgb: ANSI16_ => RGB_,
    xyz: ANSI16_ => XYZ_
  ): ansi16 = {
    val __obj = js.Dynamic.literal(ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[ansi16]
  }
  
  @scala.inline
  implicit class ansi16MutableBuilder[Self <: ansi16] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi256(value: ANSI16_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: ANSI16_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: ANSI16_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: ANSI16_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: ANSI16_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: ANSI16_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: ANSI16_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: ANSI16_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: ANSI16_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: ANSI16_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: ANSI16_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: ANSI16_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: ANSI16_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: ANSI16_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
