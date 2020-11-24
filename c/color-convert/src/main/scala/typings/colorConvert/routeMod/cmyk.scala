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
trait cmyk extends js.Object {
  
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
  implicit class cmykOps[Self <: cmyk] (val x: Self) extends AnyVal {
    
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
    def setAnsi16(value: CMYK_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: CMYK_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: CMYK_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: CMYK_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: CMYK_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: CMYK_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: CMYK_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: CMYK_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: CMYK_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: CMYK_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: CMYK_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: CMYK_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: CMYK_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: CMYK_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
}
