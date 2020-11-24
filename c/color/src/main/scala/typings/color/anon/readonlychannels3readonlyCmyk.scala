package typings.color.anon

import typings.color.colorNumbers.`3`
import typings.color.colorStrings.hsv
import typings.colorConvert.anon.`27`
import typings.colorConvert.anon.`28`
import typings.colorConvert.anon.`29`
import typings.colorConvert.anon.`30`
import typings.colorConvert.anon.`31`
import typings.colorConvert.anon.`32`
import typings.colorConvert.anon.`33`
import typings.colorConvert.anon.`34`
import typings.colorConvert.anon.`35`
import typings.colorConvert.anon.`36`
import typings.colorConvert.anon.`37`
import typings.colorConvert.anon.`38`
import typings.colorConvert.anon.`39`
import typings.colorConvert.anon.`40`
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

/* Inlined { readonly channels :3,  readonly labels :'hsv', readonly rgb (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.RGB, readonly hsl (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.HSL, readonly ansi16 (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.ANSI16, readonly hcg (hsv : color-convert.color-convert/conversions.HSV): color-convert.color-convert/conversions.HCG} & color-convert.color-convert/route.hsv & {[ F in keyof color-convert.color-convert/route.hsv ]: {  raw :color-convert.color-convert/route.hsv[F]}} */
@js.native
trait readonlychannels3readonlyCmyk extends js.Object {
  
  var ansi16: `39` = js.native
  def ansi16(hsv: HSV_): ANSI16_ = js.native
  
  var ansi256: `31` = js.native
  def ansi256(from: HSV_): ANSI256_ = js.native
  
  var apple: `28` = js.native
  def apple(from: HSV_): APPLE_ = js.native
  
  val channels: `3` = js.native
  
  var cmyk: `33` = js.native
  def cmyk(from: HSV_): CMYK_ = js.native
  
  var gray: `30` = js.native
  def gray(from: HSV_): GRAY_ = js.native
  
  var hcg: `34` = js.native
  def hcg(hsv: HSV_): HCG_ = js.native
  
  var hex: `37` = js.native
  def hex(from: HSV_): HEX_ = js.native
  
  var hsl: `38` = js.native
  def hsl(hsv: HSV_): HSL_ = js.native
  
  var hwb: `32` = js.native
  def hwb(from: HSV_): HWB_ = js.native
  
  var keyword: `29` = js.native
  def keyword(from: HSV_): KEYWORD_ = js.native
  
  var lab: `40` = js.native
  def lab(from: HSV_): LAB_ = js.native
  
  val labels: hsv = js.native
  
  var lch: `36` = js.native
  def lch(from: HSV_): LCH_ = js.native
  
  var rgb: `27` = js.native
  def rgb(hsv: HSV_): RGB_ = js.native
  
  var xyz: `35` = js.native
  def xyz(from: HSV_): XYZ_ = js.native
}
