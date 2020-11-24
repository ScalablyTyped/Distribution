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
trait lch extends js.Object {
  
  def ansi16(from: LCH_): ANSI16_ = js.native
  
  def ansi256(from: LCH_): ANSI256_ = js.native
  
  def apple(from: LCH_): APPLE_ = js.native
  
  def cmyk(from: LCH_): CMYK_ = js.native
  
  def gray(from: LCH_): GRAY_ = js.native
  
  def hcg(from: LCH_): HCG_ = js.native
  
  def hex(from: LCH_): HEX_ = js.native
  
  def hsl(from: LCH_): HSL_ = js.native
  
  def hsv(from: LCH_): HSV_ = js.native
  
  def hwb(from: LCH_): HWB_ = js.native
  
  def keyword(from: LCH_): KEYWORD_ = js.native
  
  def lab(from: LCH_): LAB_ = js.native
  
  def rgb(from: LCH_): RGB_ = js.native
  
  def xyz(from: LCH_): XYZ_ = js.native
}
object lch {
  
  @scala.inline
  def apply(
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
  implicit class lchOps[Self <: lch] (val x: Self) extends AnyVal {
    
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
    def setAnsi16(value: LCH_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: LCH_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: LCH_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: LCH_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: LCH_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: LCH_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: LCH_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: LCH_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: LCH_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: LCH_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: LCH_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: LCH_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: LCH_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: LCH_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
}
