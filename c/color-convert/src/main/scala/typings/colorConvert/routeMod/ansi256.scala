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
trait ansi256 extends js.Object {
  
  def ansi16(from: ANSI256_): ANSI16_ = js.native
  
  def apple(from: ANSI256_): APPLE_ = js.native
  
  def cmyk(from: ANSI256_): CMYK_ = js.native
  
  def gray(from: ANSI256_): GRAY_ = js.native
  
  def hcg(from: ANSI256_): HCG_ = js.native
  
  def hex(from: ANSI256_): HEX_ = js.native
  
  def hsl(from: ANSI256_): HSL_ = js.native
  
  def hsv(from: ANSI256_): HSV_ = js.native
  
  def hwb(from: ANSI256_): HWB_ = js.native
  
  def keyword(from: ANSI256_): KEYWORD_ = js.native
  
  def lab(from: ANSI256_): LAB_ = js.native
  
  def lch(from: ANSI256_): LCH_ = js.native
  
  def rgb(from: ANSI256_): RGB_ = js.native
  
  def xyz(from: ANSI256_): XYZ_ = js.native
}
object ansi256 {
  
  @scala.inline
  def apply(
    ansi16: ANSI256_ => ANSI16_,
    apple: ANSI256_ => APPLE_,
    cmyk: ANSI256_ => CMYK_,
    gray: ANSI256_ => GRAY_,
    hcg: ANSI256_ => HCG_,
    hex: ANSI256_ => HEX_,
    hsl: ANSI256_ => HSL_,
    hsv: ANSI256_ => HSV_,
    hwb: ANSI256_ => HWB_,
    keyword: ANSI256_ => KEYWORD_,
    lab: ANSI256_ => LAB_,
    lch: ANSI256_ => LCH_,
    rgb: ANSI256_ => RGB_,
    xyz: ANSI256_ => XYZ_
  ): ansi256 = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[ansi256]
  }
  
  @scala.inline
  implicit class ansi256Ops[Self <: ansi256] (val x: Self) extends AnyVal {
    
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
    def setAnsi16(value: ANSI256_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: ANSI256_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: ANSI256_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: ANSI256_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: ANSI256_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: ANSI256_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: ANSI256_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: ANSI256_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: ANSI256_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: ANSI256_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: ANSI256_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: ANSI256_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: ANSI256_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: ANSI256_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
}
