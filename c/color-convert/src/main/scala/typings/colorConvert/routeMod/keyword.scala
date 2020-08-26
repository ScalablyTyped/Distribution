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
trait keyword extends js.Object {
  def ansi16(from: KEYWORD_): ANSI16_ = js.native
  def ansi256(from: KEYWORD_): ANSI256_ = js.native
  def apple(from: KEYWORD_): APPLE_ = js.native
  def cmyk(from: KEYWORD_): CMYK_ = js.native
  def gray(from: KEYWORD_): GRAY_ = js.native
  def hcg(from: KEYWORD_): HCG_ = js.native
  def hex(from: KEYWORD_): HEX_ = js.native
  def hsl(from: KEYWORD_): HSL_ = js.native
  def hsv(from: KEYWORD_): HSV_ = js.native
  def hwb(from: KEYWORD_): HWB_ = js.native
  def lab(from: KEYWORD_): LAB_ = js.native
  def lch(from: KEYWORD_): LCH_ = js.native
  def rgb(from: KEYWORD_): RGB_ = js.native
  def xyz(from: KEYWORD_): XYZ_ = js.native
}

object keyword {
  @scala.inline
  implicit class keywordOps[Self <: keyword] (val x: Self) extends AnyVal {
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
    def setAnsi16(value: KEYWORD_ => ANSI16_): Self = this.set("ansi16", js.Any.fromFunction1(value))
    @scala.inline
    def setAnsi256(value: KEYWORD_ => ANSI256_): Self = this.set("ansi256", js.Any.fromFunction1(value))
    @scala.inline
    def setApple(value: KEYWORD_ => APPLE_): Self = this.set("apple", js.Any.fromFunction1(value))
    @scala.inline
    def setCmyk(value: KEYWORD_ => CMYK_): Self = this.set("cmyk", js.Any.fromFunction1(value))
    @scala.inline
    def setGray(value: KEYWORD_ => GRAY_): Self = this.set("gray", js.Any.fromFunction1(value))
    @scala.inline
    def setHcg(value: KEYWORD_ => HCG_): Self = this.set("hcg", js.Any.fromFunction1(value))
    @scala.inline
    def setHex(value: KEYWORD_ => HEX_): Self = this.set("hex", js.Any.fromFunction1(value))
    @scala.inline
    def setHsl(value: KEYWORD_ => HSL_): Self = this.set("hsl", js.Any.fromFunction1(value))
    @scala.inline
    def setHsv(value: KEYWORD_ => HSV_): Self = this.set("hsv", js.Any.fromFunction1(value))
    @scala.inline
    def setHwb(value: KEYWORD_ => HWB_): Self = this.set("hwb", js.Any.fromFunction1(value))
    @scala.inline
    def setLab(value: KEYWORD_ => LAB_): Self = this.set("lab", js.Any.fromFunction1(value))
    @scala.inline
    def setLch(value: KEYWORD_ => LCH_): Self = this.set("lch", js.Any.fromFunction1(value))
    @scala.inline
    def setRgb(value: KEYWORD_ => RGB_): Self = this.set("rgb", js.Any.fromFunction1(value))
    @scala.inline
    def setXyz(value: KEYWORD_ => XYZ_): Self = this.set("xyz", js.Any.fromFunction1(value))
  }
  
}

