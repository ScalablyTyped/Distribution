package typings.color

import typings.color.colorNumbers.`3`
import typings.color.colorStrings.c
import typings.color.colorStrings.g
import typings.color.colorStrings.h
import typings.colorConvert.Anon167
import typings.colorConvert.Anon168
import typings.colorConvert.Anon169
import typings.colorConvert.Anon170
import typings.colorConvert.Anon171
import typings.colorConvert.Anon172
import typings.colorConvert.Anon173
import typings.colorConvert.Anon174
import typings.colorConvert.Anon175
import typings.colorConvert.Anon176
import typings.colorConvert.Anon177
import typings.colorConvert.Anon178
import typings.colorConvert.Anon179
import typings.colorConvert.Anon180
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

/* Inlined { readonly channels  :3,  readonly labels  :['h', 'c', 'g'], readonly rgb (hcg : color-convert.color-convert/conversions.HCG): color-convert.color-convert/conversions.RGB, readonly hsv (hcg : color-convert.color-convert/conversions.HCG): color-convert.color-convert/conversions.HSV, readonly hsl (hcg : color-convert.color-convert/conversions.HCG): color-convert.color-convert/conversions.HSL, readonly hwb (hcg : color-convert.color-convert/conversions.HCG): color-convert.color-convert/conversions.HWB} & color-convert.color-convert/route.hcg & {[ F in keyof color-convert.color-convert/route.hcg ]: {  raw  :color-convert.color-convert/route.hcg[F]}} */
@js.native
trait readonlychannels3readonlyAnsi256 extends js.Object {
  var ansi16: Anon170 = js.native
  var ansi256: Anon169 = js.native
  var apple: Anon178 = js.native
  val channels: `3` = js.native
  var cmyk: Anon173 = js.native
  var gray: Anon176 = js.native
  var hex: Anon171 = js.native
  var hsl: Anon174 = js.native
  var hsv: Anon177 = js.native
  var hwb: Anon179 = js.native
  var keyword: Anon175 = js.native
  var lab: Anon180 = js.native
  val labels: js.Tuple3[h, c, g] = js.native
  var lch: Anon172 = js.native
  var rgb: Anon167 = js.native
  var xyz: Anon168 = js.native
  def ansi16(from: HCG_): ANSI16_ = js.native
  def ansi256(from: HCG_): ANSI256_ = js.native
  def apple(from: HCG_): APPLE_ = js.native
  def cmyk(from: HCG_): CMYK_ = js.native
  def gray(from: HCG_): GRAY_ = js.native
  def hex(from: HCG_): HEX_ = js.native
  def hsl(hcg: HCG_): HSL_ = js.native
  def hsv(hcg: HCG_): HSV_ = js.native
  def hwb(hcg: HCG_): HWB_ = js.native
  def keyword(from: HCG_): KEYWORD_ = js.native
  def lab(from: HCG_): LAB_ = js.native
  def lch(from: HCG_): LCH_ = js.native
  def rgb(hcg: HCG_): RGB_ = js.native
  def xyz(from: HCG_): XYZ_ = js.native
}

