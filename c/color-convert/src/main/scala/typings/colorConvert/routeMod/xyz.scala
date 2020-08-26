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
trait xyz extends js.Object {
  def ansi16(from: XYZ_): ANSI16_ = js.native
  def ansi256(from: XYZ_): ANSI256_ = js.native
  def apple(from: XYZ_): APPLE_ = js.native
  def cmyk(from: XYZ_): CMYK_ = js.native
  def gray(from: XYZ_): GRAY_ = js.native
  def hcg(from: XYZ_): HCG_ = js.native
  def hex(from: XYZ_): HEX_ = js.native
  def hsl(from: XYZ_): HSL_ = js.native
  def hsv(from: XYZ_): HSV_ = js.native
  def hwb(from: XYZ_): HWB_ = js.native
  def keyword(from: XYZ_): KEYWORD_ = js.native
  def lab(from: XYZ_): LAB_ = js.native
  def lch(from: XYZ_): LCH_ = js.native
  def rgb(from: XYZ_): RGB_ = js.native
}

object xyz {
  @scala.inline
  def apply(
    ansi16: XYZ_ => ANSI16_,
    ansi256: XYZ_ => ANSI256_,
    apple: XYZ_ => APPLE_,
    cmyk: XYZ_ => CMYK_,
    gray: XYZ_ => GRAY_,
    hcg: XYZ_ => HCG_,
    hex: XYZ_ => HEX_,
    hsl: XYZ_ => HSL_,
    hsv: XYZ_ => HSV_,
    hwb: XYZ_ => HWB_,
    keyword: XYZ_ => KEYWORD_,
    lab: XYZ_ => LAB_,
    lch: XYZ_ => LCH_,
    rgb: XYZ_ => RGB_
  ): xyz = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[xyz]
  }
  @scala.inline
  implicit class xyzOps[Self <: xyz] (val x: Self) extends AnyVal {
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
    def setAnsi16(value: XYZ_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    @scala.inline
    def setAnsi256(value: XYZ_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    @scala.inline
    def setApple(value: XYZ_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    @scala.inline
    def setCmyk(value: XYZ_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    @scala.inline
    def setGray(value: XYZ_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    @scala.inline
    def setHcg(value: XYZ_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    @scala.inline
    def setHex(value: XYZ_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    @scala.inline
    def setHsl(value: XYZ_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    @scala.inline
    def setHsv(value: XYZ_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    @scala.inline
    def setHwb(value: XYZ_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyword(value: XYZ_ => KEYWORD_): Self = this.set("keyword", js.Any.fromFunction1(value))
    @scala.inline
    def setLab(value: XYZ_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    @scala.inline
    def setLch(value: XYZ_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    @scala.inline
    def setRgb(value: XYZ_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
  }
  
}

