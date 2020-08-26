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
import scala.scalajs.js.annotation._

@js.native
trait hsl extends js.Object {
  def ansi16(from: HSL_): ANSI16_ = js.native
  def ansi256(from: HSL_): ANSI256_ = js.native
  def apple(from: HSL_): APPLE_ = js.native
  def cmyk(from: HSL_): CMYK_ = js.native
  def gray(from: HSL_): GRAY_ = js.native
  def hcg(from: HSL_): HCG_ = js.native
  def hex(from: HSL_): HEX_ = js.native
  def hsv(from: HSL_): HSV_ = js.native
  def hwb(from: HSL_): HWB_ = js.native
  def keyword(from: HSL_): KEYWORD_ = js.native
  def lab(from: HSL_): LAB_ = js.native
  def lch(from: HSL_): LCH_ = js.native
  def rgb(from: HSL_): RGB_ = js.native
  def xyz(from: HSL_): XYZ_ = js.native
}

object hsl {
  @scala.inline
  def apply(
    ansi16: HSL_ => ANSI16_,
    ansi256: HSL_ => ANSI256_,
    apple: HSL_ => APPLE_,
    cmyk: HSL_ => CMYK_,
    gray: HSL_ => GRAY_,
    hcg: HSL_ => HCG_,
    hex: HSL_ => HEX_,
    hsv: HSL_ => HSV_,
    hwb: HSL_ => HWB_,
    keyword: HSL_ => KEYWORD_,
    lab: HSL_ => LAB_,
    lch: HSL_ => LCH_,
    rgb: HSL_ => RGB_,
    xyz: HSL_ => XYZ_
  ): hsl = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hsl]
  }
  @scala.inline
  implicit class hslOps[Self <: hsl] (val x: Self) extends AnyVal {
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
    def setAnsi16(value: HSL_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    @scala.inline
    def setAnsi256(value: HSL_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    @scala.inline
    def setApple(value: HSL_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    @scala.inline
    def setCmyk(value: HSL_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    @scala.inline
    def setGray(value: HSL_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    @scala.inline
    def setHcg(value: HSL_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    @scala.inline
    def setHex(value: HSL_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    @scala.inline
    def setHsv(value: HSL_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    @scala.inline
    def setHwb(value: HSL_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyword(value: HSL_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    @scala.inline
    def setLab(value: HSL_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    @scala.inline
    def setLch(value: HSL_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    @scala.inline
    def setRgb(value: HSL_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    @scala.inline
    def setXyz(value: HSL_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
  
}

