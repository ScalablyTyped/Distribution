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
trait hsv extends js.Object {
  def ansi16(from: HSV_): ANSI16_ = js.native
  def ansi256(from: HSV_): ANSI256_ = js.native
  def apple(from: HSV_): APPLE_ = js.native
  def cmyk(from: HSV_): CMYK_ = js.native
  def gray(from: HSV_): GRAY_ = js.native
  def hcg(from: HSV_): HCG_ = js.native
  def hex(from: HSV_): HEX_ = js.native
  def hsl(from: HSV_): HSL_ = js.native
  def hwb(from: HSV_): HWB_ = js.native
  def keyword(from: HSV_): KEYWORD_ = js.native
  def lab(from: HSV_): LAB_ = js.native
  def lch(from: HSV_): LCH_ = js.native
  def rgb(from: HSV_): RGB_ = js.native
  def xyz(from: HSV_): XYZ_ = js.native
}

object hsv {
  @scala.inline
  def apply(
    ansi16: HSV_ => ANSI16_,
    ansi256: HSV_ => ANSI256_,
    apple: HSV_ => APPLE_,
    cmyk: HSV_ => CMYK_,
    gray: HSV_ => GRAY_,
    hcg: HSV_ => HCG_,
    hex: HSV_ => HEX_,
    hsl: HSV_ => HSL_,
    hwb: HSV_ => HWB_,
    keyword: HSV_ => KEYWORD_,
    lab: HSV_ => LAB_,
    lch: HSV_ => LCH_,
    rgb: HSV_ => RGB_,
    xyz: HSV_ => XYZ_
  ): hsv = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hsv]
  }
  @scala.inline
  implicit class hsvOps[Self <: hsv] (val x: Self) extends AnyVal {
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
    def setAnsi16(value: HSV_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    @scala.inline
    def setAnsi256(value: HSV_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    @scala.inline
    def setApple(value: HSV_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    @scala.inline
    def setCmyk(value: HSV_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    @scala.inline
    def setGray(value: HSV_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    @scala.inline
    def setHcg(value: HSV_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    @scala.inline
    def setHex(value: HSV_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    @scala.inline
    def setHsl(value: HSV_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    @scala.inline
    def setHwb(value: HSV_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyword(value: HSV_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    @scala.inline
    def setLab(value: HSV_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    @scala.inline
    def setLch(value: HSV_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    @scala.inline
    def setRgb(value: HSV_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    @scala.inline
    def setXyz(value: HSV_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
  
}

