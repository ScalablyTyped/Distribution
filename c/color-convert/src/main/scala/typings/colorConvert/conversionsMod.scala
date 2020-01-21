package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`1`
import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertNumbers.`4`
import typings.colorConvert.colorConvertStrings.b16
import typings.colorConvert.colorConvertStrings.c
import typings.colorConvert.colorConvertStrings.g
import typings.colorConvert.colorConvertStrings.g16
import typings.colorConvert.colorConvertStrings.h
import typings.colorConvert.colorConvertStrings.r16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", JSImport.Namespace)
@js.native
object conversionsMod extends js.Object {
  @js.native
  object ansi16 extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi16] = js.native
    def rgb(ansi16: ANSI16_): RGB_ = js.native
  }
  
  @js.native
  object ansi256 extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi256] = js.native
    def rgb(ansi256: ANSI256_): RGB_ = js.native
  }
  
  @js.native
  object apple extends js.Object {
    val channels: `3` = js.native
    val labels: js.Tuple3[r16, g16, b16] = js.native
    def rgb(apple: APPLE_): RGB_ = js.native
  }
  
  @js.native
  object cmyk extends js.Object {
    val channels: `4` = js.native
    val labels: typings.colorConvert.colorConvertStrings.cmyk = js.native
    def rgb(cmyk: CMYK_): RGB_ = js.native
  }
  
  @js.native
  object gray extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.gray] = js.native
    def cmyk(gray: GRAY_): CMYK_ = js.native
    def hex(gray: GRAY_): HEX_ = js.native
    def hsl(gray: GRAY_): HSL_ = js.native
    def hsv(gray: GRAY_): HSV_ = js.native
    def hwb(gray: GRAY_): HWB_ = js.native
    def lab(gray: GRAY_): LAB_ = js.native
    def rgb(gray: GRAY_): RGB_ = js.native
  }
  
  @js.native
  object hcg extends js.Object {
    val channels: `3` = js.native
    val labels: js.Tuple3[h, c, g] = js.native
    def hsl(hcg: HCG_): HSL_ = js.native
    def hsv(hcg: HCG_): HSV_ = js.native
    def hwb(hcg: HCG_): HWB_ = js.native
    def rgb(hcg: HCG_): RGB_ = js.native
  }
  
  @js.native
  object hex extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.hex] = js.native
    def rgb(hex: HEX_): RGB_ = js.native
  }
  
  @js.native
  object hsl extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorConvert.colorConvertStrings.hsl = js.native
    def hcg(hsl: HSL_): HCG_ = js.native
    def hsv(hsl: HSL_): HSV_ = js.native
    def rgb(hsl: HSL_): RGB_ = js.native
  }
  
  @js.native
  object hsv extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorConvert.colorConvertStrings.hsv = js.native
    def ansi16(hsv: HSV_): ANSI16_ = js.native
    def hcg(hsv: HSV_): HCG_ = js.native
    def hsl(hsv: HSV_): HSL_ = js.native
    def rgb(hsv: HSV_): RGB_ = js.native
  }
  
  @js.native
  object hwb extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorConvert.colorConvertStrings.hwb = js.native
    def hcg(hwb: HWB_): HCG_ = js.native
    def rgb(hwb: HWB_): RGB_ = js.native
  }
  
  @js.native
  object keyword extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.keyword] = js.native
    def rgb(keyword: KEYWORD_): RGB_ = js.native
  }
  
  @js.native
  object lab extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorConvert.colorConvertStrings.lab = js.native
    def lch(lab: LAB_): LCH_ = js.native
    def xyz(lab: LAB_): XYZ_ = js.native
  }
  
  @js.native
  object lch extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorConvert.colorConvertStrings.lch = js.native
    def lab(lch: LCH_): LAB_ = js.native
  }
  
  @js.native
  object rgb extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorConvert.colorConvertStrings.rgb = js.native
    def ansi16(rgb: RGB_): ANSI16_ = js.native
    def ansi256(rgb: RGB_): ANSI256_ = js.native
    def apple(rgb: RGB_): APPLE_ = js.native
    def cmyk(rgb: RGB_): CMYK_ = js.native
    def gray(rgb: RGB_): GRAY_ = js.native
    def hcg(rgb: RGB_): HCG_ = js.native
    def hex(rgb: RGB_): HEX_ = js.native
    def hsl(rgb: RGB_): HSL_ = js.native
    def hsv(rgb: RGB_): HSV_ = js.native
    def hwb(rgb: RGB_): HWB_ = js.native
    def keyword(rgb: RGB_): KEYWORD_ = js.native
    def lab(rgb: RGB_): LAB_ = js.native
    def xyz(rgb: RGB_): XYZ_ = js.native
  }
  
  @js.native
  object xyz extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorConvert.colorConvertStrings.xyz = js.native
    def lab(xyz: XYZ_): LAB_ = js.native
    def rgb(xyz: XYZ_): RGB_ = js.native
  }
  
  type ANSI16_ = Double
  type ANSI256_ = Double
  type APPLE_ = js.Tuple3[Double, Double, Double]
  type CMYK_ = js.Tuple4[Double, Double, Double, Double]
  type GRAY_ = js.Array[Double]
  type HCG_ = js.Tuple3[Double, Double, Double]
  type HEX_ = String
  type HSL_ = js.Tuple3[Double, Double, Double]
  type HSV_ = js.Tuple3[Double, Double, Double]
  type HWB_ = js.Tuple3[Double, Double, Double]
  type KEYWORD_ = String
  type LAB_ = js.Tuple3[Double, Double, Double]
  type LCH_ = js.Tuple3[Double, Double, Double]
  type RGB_ = js.Tuple3[Double, Double, Double]
  type XYZ_ = js.Tuple3[Double, Double, Double]
}

