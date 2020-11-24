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
trait apple extends js.Object {
  
  def ansi16(from: APPLE_): ANSI16_ = js.native
  
  def ansi256(from: APPLE_): ANSI256_ = js.native
  
  def cmyk(from: APPLE_): CMYK_ = js.native
  
  def gray(from: APPLE_): GRAY_ = js.native
  
  def hcg(from: APPLE_): HCG_ = js.native
  
  def hex(from: APPLE_): HEX_ = js.native
  
  def hsl(from: APPLE_): HSL_ = js.native
  
  def hsv(from: APPLE_): HSV_ = js.native
  
  def hwb(from: APPLE_): HWB_ = js.native
  
  def keyword(from: APPLE_): KEYWORD_ = js.native
  
  def lab(from: APPLE_): LAB_ = js.native
  
  def lch(from: APPLE_): LCH_ = js.native
  
  def rgb(from: APPLE_): RGB_ = js.native
  
  def xyz(from: APPLE_): XYZ_ = js.native
}
object apple {
  
  @scala.inline
  def apply(
    ansi16: APPLE_ => ANSI16_,
    ansi256: APPLE_ => ANSI256_,
    cmyk: APPLE_ => CMYK_,
    gray: APPLE_ => GRAY_,
    hcg: APPLE_ => HCG_,
    hex: APPLE_ => HEX_,
    hsl: APPLE_ => HSL_,
    hsv: APPLE_ => HSV_,
    hwb: APPLE_ => HWB_,
    keyword: APPLE_ => KEYWORD_,
    lab: APPLE_ => LAB_,
    lch: APPLE_ => LCH_,
    rgb: APPLE_ => RGB_,
    xyz: APPLE_ => XYZ_
  ): apple = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[apple]
  }
  
  @scala.inline
  implicit class appleOps[Self <: apple] (val x: Self) extends AnyVal {
    
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
    def setAnsi16(value: APPLE_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: APPLE_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: APPLE_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: APPLE_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: APPLE_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: APPLE_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: APPLE_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: APPLE_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: APPLE_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: APPLE_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: APPLE_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: APPLE_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: APPLE_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: APPLE_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
}
