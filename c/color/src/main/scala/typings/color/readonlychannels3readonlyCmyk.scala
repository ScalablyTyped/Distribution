package typings.color

import typings.color.colorNumbers.`3`
import typings.color.colorStrings.hsv
import typings.colorConvert.Anon27
import typings.colorConvert.Anon28
import typings.colorConvert.Anon29
import typings.colorConvert.Anon30
import typings.colorConvert.Anon31
import typings.colorConvert.Anon32
import typings.colorConvert.Anon33
import typings.colorConvert.Anon34
import typings.colorConvert.Anon35
import typings.colorConvert.Anon36
import typings.colorConvert.Anon37
import typings.colorConvert.Anon38
import typings.colorConvert.Anon39
import typings.colorConvert.Anon40
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

/* Inlined { readonly channels  :3,  readonly labels  :'hsv', readonly rgb (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.RGB, readonly hsl (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.HSL, readonly ansi16 (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.ANSI16, readonly hcg (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.HCG} & color-convert.color-convert/route.hsv & {[ F in keyof color-convert.color-convert/route.hsv ]: {  raw  :color-convert.color-convert/route.hsv[F]}} */
@js.native
trait readonlychannels3readonlyCmyk extends js.Object {
  var ansi16: Anon31 = js.native
  var ansi256: Anon30 = js.native
  var apple: Anon38 = js.native
  val channels: `3` = js.native
  var cmyk: Anon34 = js.native
  var gray: Anon37 = js.native
  var hcg: Anon29 = js.native
  var hex: Anon32 = js.native
  var hsl: Anon35 = js.native
  var hwb: Anon39 = js.native
  var keyword: Anon36 = js.native
  var lab: Anon40 = js.native
  val labels: hsv = js.native
  var lch: Anon33 = js.native
  var rgb: Anon27 = js.native
  var xyz: Anon28 = js.native
  def ansi16(hsv: HSV_): ANSI16_ = js.native
  def ansi256(from: HSV_): ANSI256_ = js.native
  def apple(from: HSV_): APPLE_ = js.native
  def cmyk(from: HSV_): CMYK_ = js.native
  def gray(from: HSV_): GRAY_ = js.native
  def hcg(hsv: HSV_): HCG_ = js.native
  def hex(from: HSV_): HEX_ = js.native
  def hsl(hsv: HSV_): HSL_ = js.native
  def hwb(from: HSV_): HWB_ = js.native
  def keyword(from: HSV_): KEYWORD_ = js.native
  def lab(from: HSV_): LAB_ = js.native
  def lch(from: HSV_): LCH_ = js.native
  def rgb(hsv: HSV_): RGB_ = js.native
  def xyz(from: HSV_): XYZ_ = js.native
}

