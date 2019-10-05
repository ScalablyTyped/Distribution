package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`1`
import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertNumbers.`4`
import typings.colorDashConvert.colorDashConvertStrings.b16
import typings.colorDashConvert.colorDashConvertStrings.c
import typings.colorDashConvert.colorDashConvertStrings.g
import typings.colorDashConvert.colorDashConvertStrings.g16
import typings.colorDashConvert.colorDashConvertStrings.h
import typings.colorDashConvert.colorDashConvertStrings.r16
import typings.colorDashConvert.conversionsMod.ANSI16
import typings.colorDashConvert.conversionsMod.ANSI256
import typings.colorDashConvert.conversionsMod.APPLE
import typings.colorDashConvert.conversionsMod.CMYK
import typings.colorDashConvert.conversionsMod.GRAY
import typings.colorDashConvert.conversionsMod.HCG
import typings.colorDashConvert.conversionsMod.HEX
import typings.colorDashConvert.conversionsMod.HSL
import typings.colorDashConvert.conversionsMod.HSV
import typings.colorDashConvert.conversionsMod.HWB
import typings.colorDashConvert.conversionsMod.KEYWORD
import typings.colorDashConvert.conversionsMod.LAB
import typings.colorDashConvert.conversionsMod.LCH
import typings.colorDashConvert.conversionsMod.RGB
import typings.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", JSImport.Namespace)
@js.native
object conversionsMod extends js.Object {
  @js.native
  object ansi16 extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorDashConvert.colorDashConvertStrings.ansi16] = js.native
    def rgb(ansi16: ANSI16): RGB = js.native
  }
  
  @js.native
  object ansi256 extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorDashConvert.colorDashConvertStrings.ansi256] = js.native
    def rgb(ansi256: ANSI256): RGB = js.native
  }
  
  @js.native
  object apple extends js.Object {
    val channels: `3` = js.native
    val labels: js.Tuple3[r16, g16, b16] = js.native
    def rgb(apple: APPLE): RGB = js.native
  }
  
  @js.native
  object cmyk extends js.Object {
    val channels: `4` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.cmyk = js.native
    def rgb(cmyk: CMYK): RGB = js.native
  }
  
  @js.native
  object gray extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorDashConvert.colorDashConvertStrings.gray] = js.native
    def cmyk(gray: GRAY): CMYK = js.native
    def hex(gray: GRAY): HEX = js.native
    def hsl(gray: GRAY): HSL = js.native
    def hsv(gray: GRAY): HSV = js.native
    def hwb(gray: GRAY): HWB = js.native
    def lab(gray: GRAY): LAB = js.native
    def rgb(gray: GRAY): RGB = js.native
  }
  
  @js.native
  object hcg extends js.Object {
    val channels: `3` = js.native
    val labels: js.Tuple3[h, c, g] = js.native
    def hsl(hcg: HCG): HSL = js.native
    def hsv(hcg: HCG): HSV = js.native
    def hwb(hcg: HCG): HWB = js.native
    def rgb(hcg: HCG): RGB = js.native
  }
  
  @js.native
  object hex extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorDashConvert.colorDashConvertStrings.hex] = js.native
    def rgb(hex: HEX): RGB = js.native
  }
  
  @js.native
  object hsl extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.hsl = js.native
    def hcg(hsl: HSL): HCG = js.native
    def hsv(hsl: HSL): HSV = js.native
    def rgb(hsl: HSL): RGB = js.native
  }
  
  @js.native
  object hsv extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.hsv = js.native
    def ansi16(hsv: HSV): ANSI16 = js.native
    def hcg(hsv: HSV): HCG = js.native
    def hsl(hsv: HSV): HSL = js.native
    def rgb(hsv: HSV): RGB = js.native
  }
  
  @js.native
  object hwb extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.hwb = js.native
    def hcg(hwb: HWB): HCG = js.native
    def rgb(hwb: HWB): RGB = js.native
  }
  
  @js.native
  object keyword extends js.Object {
    val channels: `1` = js.native
    val labels: js.Array[typings.colorDashConvert.colorDashConvertStrings.keyword] = js.native
    def rgb(keyword: KEYWORD): RGB = js.native
  }
  
  @js.native
  object lab extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.lab = js.native
    def lch(lab: LAB): LCH = js.native
    def xyz(lab: LAB): XYZ = js.native
  }
  
  @js.native
  object lch extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.lch = js.native
    def lab(lch: LCH): LAB = js.native
  }
  
  @js.native
  object rgb extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.rgb = js.native
    def ansi16(rgb: RGB): ANSI16 = js.native
    def ansi256(rgb: RGB): ANSI256 = js.native
    def apple(rgb: RGB): APPLE = js.native
    def cmyk(rgb: RGB): CMYK = js.native
    def gray(rgb: RGB): GRAY = js.native
    def hcg(rgb: RGB): HCG = js.native
    def hex(rgb: RGB): HEX = js.native
    def hsl(rgb: RGB): HSL = js.native
    def hsv(rgb: RGB): HSV = js.native
    def hwb(rgb: RGB): HWB = js.native
    def keyword(rgb: RGB): KEYWORD = js.native
    def lab(rgb: RGB): LAB = js.native
    def xyz(rgb: RGB): XYZ = js.native
  }
  
  @js.native
  object xyz extends js.Object {
    val channels: `3` = js.native
    val labels: typings.colorDashConvert.colorDashConvertStrings.xyz = js.native
    def lab(xyz: XYZ): LAB = js.native
    def rgb(xyz: XYZ): RGB = js.native
  }
  
  type ANSI16 = Double
  type ANSI256 = Double
  type APPLE = js.Tuple3[Double, Double, Double]
  type CMYK = js.Tuple4[Double, Double, Double, Double]
  type GRAY = js.Array[Double]
  type HCG = js.Tuple3[Double, Double, Double]
  type HEX = String
  type HSL = js.Tuple3[Double, Double, Double]
  type HSV = js.Tuple3[Double, Double, Double]
  type HWB = js.Tuple3[Double, Double, Double]
  type KEYWORD = String
  type LAB = js.Tuple3[Double, Double, Double]
  type LCH = js.Tuple3[Double, Double, Double]
  type RGB = js.Tuple3[Double, Double, Double]
  type XYZ = js.Tuple3[Double, Double, Double]
}

