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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hcg extends js.Object {
  
  def ansi16(from: HCG_): ANSI16_ = js.native
  
  def ansi256(from: HCG_): ANSI256_ = js.native
  
  def apple(from: HCG_): APPLE_ = js.native
  
  def cmyk(from: HCG_): CMYK_ = js.native
  
  def gray(from: HCG_): GRAY_ = js.native
  
  def hex(from: HCG_): HEX_ = js.native
  
  def hsl(from: HCG_): HSL_ = js.native
  
  def hsv(from: HCG_): HSV_ = js.native
  
  def hwb(from: HCG_): HWB_ = js.native
  
  def keyword(from: HCG_): KEYWORD_ = js.native
  
  def lab(from: HCG_): LAB_ = js.native
  
  def lch(from: HCG_): LCH_ = js.native
  
  def rgb(from: HCG_): RGB_ = js.native
  
  def xyz(from: HCG_): XYZ_ = js.native
}
object hcg {
  
  @scala.inline
  def apply(
    ansi16: HCG_ => ANSI16_,
    ansi256: HCG_ => ANSI256_,
    apple: HCG_ => APPLE_,
    cmyk: HCG_ => CMYK_,
    gray: HCG_ => GRAY_,
    hex: HCG_ => HEX_,
    hsl: HCG_ => HSL_,
    hsv: HCG_ => HSV_,
    hwb: HCG_ => HWB_,
    keyword: HCG_ => KEYWORD_,
    lab: HCG_ => LAB_,
    lch: HCG_ => LCH_,
    rgb: HCG_ => RGB_,
    xyz: HCG_ => XYZ_
  ): hcg = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hcg]
  }
  
  @scala.inline
  implicit class hcgOps[Self <: hcg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnsi16(value: HCG_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: HCG_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: HCG_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: HCG_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: HCG_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: HCG_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: HCG_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: HCG_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: HCG_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: HCG_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: HCG_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: HCG_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: HCG_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: HCG_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
}
