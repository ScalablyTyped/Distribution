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

@JSImport("color-convert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object ansi16 extends js.Object {
    var ansi256: Anon142 = js.native
    var apple: Anon150 = js.native
    val channels: `1` = js.native
    var cmyk: Anon145 = js.native
    var gray: Anon148 = js.native
    var hcg: Anon141 = js.native
    var hex: Anon143 = js.native
    var hsl: Anon146 = js.native
    var hsv: Anon149 = js.native
    var hwb: Anon151 = js.native
    var keyword: Anon147 = js.native
    var lab: Anon152 = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi16] = js.native
    var lch: Anon144 = js.native
    var rgb: Anon139 = js.native
    var xyz: Anon140 = js.native
    def ansi256(from: ANSI16_): ANSI256_ = js.native
    def apple(from: ANSI16_): APPLE_ = js.native
    def cmyk(from: ANSI16_): CMYK_ = js.native
    def gray(from: ANSI16_): GRAY_ = js.native
    def hcg(from: ANSI16_): HCG_ = js.native
    def hex(from: ANSI16_): HEX_ = js.native
    def hsl(from: ANSI16_): HSL_ = js.native
    def hsv(from: ANSI16_): HSV_ = js.native
    def hwb(from: ANSI16_): HWB_ = js.native
    def keyword(from: ANSI16_): KEYWORD_ = js.native
    def lab(from: ANSI16_): LAB_ = js.native
    def lch(from: ANSI16_): LCH_ = js.native
    def rgb(ansi16: ANSI16_): RGB_ = js.native
    def xyz(from: ANSI16_): XYZ_ = js.native
  }
  
  @js.native
  object ansi256 extends js.Object {
    var ansi16: Anon156 = js.native
    var apple: Anon164 = js.native
    val channels: `1` = js.native
    var cmyk: Anon159 = js.native
    var gray: Anon162 = js.native
    var hcg: Anon155 = js.native
    var hex: Anon157 = js.native
    var hsl: Anon160 = js.native
    var hsv: Anon163 = js.native
    var hwb: Anon165 = js.native
    var keyword: Anon161 = js.native
    var lab: Anon166 = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi256] = js.native
    var lch: Anon158 = js.native
    var rgb: Anon153 = js.native
    var xyz: Anon154 = js.native
    def ansi16(from: ANSI256_): ANSI16_ = js.native
    def apple(from: ANSI256_): APPLE_ = js.native
    def cmyk(from: ANSI256_): CMYK_ = js.native
    def gray(from: ANSI256_): GRAY_ = js.native
    def hcg(from: ANSI256_): HCG_ = js.native
    def hex(from: ANSI256_): HEX_ = js.native
    def hsl(from: ANSI256_): HSL_ = js.native
    def hsv(from: ANSI256_): HSV_ = js.native
    def hwb(from: ANSI256_): HWB_ = js.native
    def keyword(from: ANSI256_): KEYWORD_ = js.native
    def lab(from: ANSI256_): LAB_ = js.native
    def lch(from: ANSI256_): LCH_ = js.native
    def rgb(ansi256: ANSI256_): RGB_ = js.native
    def xyz(from: ANSI256_): XYZ_ = js.native
  }
  
  @js.native
  object apple extends js.Object {
    var ansi16: Anon185 = js.native
    var ansi256: Anon184 = js.native
    val channels: `3` = js.native
    var cmyk: Anon188 = js.native
    var gray: Anon191 = js.native
    var hcg: Anon183 = js.native
    var hex: Anon186 = js.native
    var hsl: Anon189 = js.native
    var hsv: Anon192 = js.native
    var hwb: Anon193 = js.native
    var keyword: Anon190 = js.native
    var lab: Anon194 = js.native
    val labels: js.Tuple3[r16, g16, b16] = js.native
    var lch: Anon187 = js.native
    var rgb: Anon181 = js.native
    var xyz: Anon182 = js.native
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
    def rgb(apple: APPLE_): RGB_ = js.native
    def xyz(from: APPLE_): XYZ_ = js.native
  }
  
  @js.native
  object cmyk extends js.Object {
    var ansi16: Anon59 = js.native
    var ansi256: Anon58 = js.native
    var apple: Anon66 = js.native
    val channels: `4` = js.native
    var gray: Anon64 = js.native
    var hcg: Anon57 = js.native
    var hex: Anon60 = js.native
    var hsl: Anon62 = js.native
    var hsv: Anon65 = js.native
    var hwb: Anon67 = js.native
    var keyword: Anon63 = js.native
    var lab: Anon68 = js.native
    val labels: typings.colorConvert.colorConvertStrings.cmyk = js.native
    var lch: Anon61 = js.native
    var rgb: Anon55 = js.native
    var xyz: Anon56 = js.native
    def ansi16(from: CMYK_): ANSI16_ = js.native
    def ansi256(from: CMYK_): ANSI256_ = js.native
    def apple(from: CMYK_): APPLE_ = js.native
    def gray(from: CMYK_): GRAY_ = js.native
    def hcg(from: CMYK_): HCG_ = js.native
    def hex(from: CMYK_): HEX_ = js.native
    def hsl(from: CMYK_): HSL_ = js.native
    def hsv(from: CMYK_): HSV_ = js.native
    def hwb(from: CMYK_): HWB_ = js.native
    def keyword(from: CMYK_): KEYWORD_ = js.native
    def lab(from: CMYK_): LAB_ = js.native
    def lch(from: CMYK_): LCH_ = js.native
    def rgb(cmyk: CMYK_): RGB_ = js.native
    def xyz(from: CMYK_): XYZ_ = js.native
  }
  
  @js.native
  object gray extends js.Object {
    var ansi16: Anon199 = js.native
    var ansi256: Anon198 = js.native
    var apple: Anon206 = js.native
    val channels: `1` = js.native
    var cmyk: Anon202 = js.native
    var hcg: Anon197 = js.native
    var hex: Anon200 = js.native
    var hsl: Anon203 = js.native
    var hsv: Anon205 = js.native
    var hwb: Anon207 = js.native
    var keyword: Anon204 = js.native
    var lab: Anon208 = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.gray] = js.native
    var lch: Anon201 = js.native
    var rgb: Anon195 = js.native
    var xyz: Anon196 = js.native
    def ansi16(from: GRAY_): ANSI16_ = js.native
    def ansi256(from: GRAY_): ANSI256_ = js.native
    def apple(from: GRAY_): APPLE_ = js.native
    def cmyk(gray: GRAY_): CMYK_ = js.native
    def hcg(from: GRAY_): HCG_ = js.native
    def hex(gray: GRAY_): HEX_ = js.native
    def hsl(gray: GRAY_): HSL_ = js.native
    def hsv(gray: GRAY_): HSV_ = js.native
    def hwb(gray: GRAY_): HWB_ = js.native
    def keyword(from: GRAY_): KEYWORD_ = js.native
    def lab(gray: GRAY_): LAB_ = js.native
    def lch(from: GRAY_): LCH_ = js.native
    def rgb(gray: GRAY_): RGB_ = js.native
    def xyz(from: GRAY_): XYZ_ = js.native
  }
  
  @js.native
  object hcg extends js.Object {
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
  
  @js.native
  object hex extends js.Object {
    var ansi16: Anon115 = js.native
    var ansi256: Anon114 = js.native
    var apple: Anon122 = js.native
    val channels: `1` = js.native
    var cmyk: Anon117 = js.native
    var gray: Anon120 = js.native
    var hcg: Anon113 = js.native
    var hsl: Anon118 = js.native
    var hsv: Anon121 = js.native
    var hwb: Anon123 = js.native
    var keyword: Anon119 = js.native
    var lab: Anon124 = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.hex] = js.native
    var lch: Anon116 = js.native
    var rgb: Anon111 = js.native
    var xyz: Anon112 = js.native
    def ansi16(from: HEX_): ANSI16_ = js.native
    def ansi256(from: HEX_): ANSI256_ = js.native
    def apple(from: HEX_): APPLE_ = js.native
    def cmyk(from: HEX_): CMYK_ = js.native
    def gray(from: HEX_): GRAY_ = js.native
    def hcg(from: HEX_): HCG_ = js.native
    def hsl(from: HEX_): HSL_ = js.native
    def hsv(from: HEX_): HSV_ = js.native
    def hwb(from: HEX_): HWB_ = js.native
    def keyword(from: HEX_): KEYWORD_ = js.native
    def lab(from: HEX_): LAB_ = js.native
    def lch(from: HEX_): LCH_ = js.native
    def rgb(hex: HEX_): RGB_ = js.native
    def xyz(from: HEX_): XYZ_ = js.native
  }
  
  @js.native
  object hsl extends js.Object {
    var ansi16: Anon17 = js.native
    var ansi256: Anon16 = js.native
    var apple: Anon24 = js.native
    val channels: `3` = js.native
    var cmyk: Anon20 = js.native
    var gray: Anon22 = js.native
    var hcg: Anon15 = js.native
    var hex: Anon18 = js.native
    var hsv: Anon23 = js.native
    var hwb: Anon25 = js.native
    var keyword: Anon21 = js.native
    var lab: Anon26 = js.native
    val labels: typings.colorConvert.colorConvertStrings.hsl = js.native
    var lch: Anon19 = js.native
    var rgb: Anon13 = js.native
    var xyz: Anon14 = js.native
    def ansi16(from: HSL_): ANSI16_ = js.native
    def ansi256(from: HSL_): ANSI256_ = js.native
    def apple(from: HSL_): APPLE_ = js.native
    def cmyk(from: HSL_): CMYK_ = js.native
    def gray(from: HSL_): GRAY_ = js.native
    def hcg(hsl: HSL_): HCG_ = js.native
    def hex(from: HSL_): HEX_ = js.native
    def hsv(hsl: HSL_): HSV_ = js.native
    def hwb(from: HSL_): HWB_ = js.native
    def keyword(from: HSL_): KEYWORD_ = js.native
    def lab(from: HSL_): LAB_ = js.native
    def lch(from: HSL_): LCH_ = js.native
    def rgb(hsl: HSL_): RGB_ = js.native
    def xyz(from: HSL_): XYZ_ = js.native
  }
  
  @js.native
  object hsv extends js.Object {
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
    val labels: typings.colorConvert.colorConvertStrings.hsv = js.native
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
  
  @js.native
  object hwb extends js.Object {
    var ansi16: Anon45 = js.native
    var ansi256: Anon44 = js.native
    var apple: Anon53 = js.native
    val channels: `3` = js.native
    var cmyk: Anon48 = js.native
    var gray: Anon51 = js.native
    var hcg: Anon43 = js.native
    var hex: Anon46 = js.native
    var hsl: Anon49 = js.native
    var hsv: Anon52 = js.native
    var keyword: Anon50 = js.native
    var lab: Anon54 = js.native
    val labels: typings.colorConvert.colorConvertStrings.hwb = js.native
    var lch: Anon47 = js.native
    var rgb: Anon41 = js.native
    var xyz: Anon42 = js.native
    def ansi16(from: HWB_): ANSI16_ = js.native
    def ansi256(from: HWB_): ANSI256_ = js.native
    def apple(from: HWB_): APPLE_ = js.native
    def cmyk(from: HWB_): CMYK_ = js.native
    def gray(from: HWB_): GRAY_ = js.native
    def hcg(hwb: HWB_): HCG_ = js.native
    def hex(from: HWB_): HEX_ = js.native
    def hsl(from: HWB_): HSL_ = js.native
    def hsv(from: HWB_): HSV_ = js.native
    def keyword(from: HWB_): KEYWORD_ = js.native
    def lab(from: HWB_): LAB_ = js.native
    def lch(from: HWB_): LCH_ = js.native
    def rgb(hwb: HWB_): RGB_ = js.native
    def xyz(from: HWB_): XYZ_ = js.native
  }
  
  @js.native
  object keyword extends js.Object {
    var ansi16: Anon129 = js.native
    var ansi256: Anon128 = js.native
    var apple: Anon136 = js.native
    val channels: `1` = js.native
    var cmyk: Anon132 = js.native
    var gray: Anon134 = js.native
    var hcg: Anon127 = js.native
    var hex: Anon130 = js.native
    var hsl: Anon133 = js.native
    var hsv: Anon135 = js.native
    var hwb: Anon137 = js.native
    var lab: Anon138 = js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.keyword] = js.native
    var lch: Anon131 = js.native
    var rgb: Anon125 = js.native
    var xyz: Anon126 = js.native
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
    def rgb(keyword: KEYWORD_): RGB_ = js.native
    def xyz(from: KEYWORD_): XYZ_ = js.native
  }
  
  @js.native
  object lab extends js.Object {
    var ansi16: Anon87 = js.native
    var ansi256: Anon86 = js.native
    var apple: Anon95 = js.native
    val channels: `3` = js.native
    var cmyk: Anon90 = js.native
    var gray: Anon93 = js.native
    var hcg: Anon85 = js.native
    var hex: Anon88 = js.native
    var hsl: Anon91 = js.native
    var hsv: Anon94 = js.native
    var hwb: Anon96 = js.native
    var keyword: Anon92 = js.native
    val labels: typings.colorConvert.colorConvertStrings.lab = js.native
    var lch: Anon89 = js.native
    var rgb: Anon83 = js.native
    var xyz: Anon84 = js.native
    def ansi16(from: LAB_): ANSI16_ = js.native
    def ansi256(from: LAB_): ANSI256_ = js.native
    def apple(from: LAB_): APPLE_ = js.native
    def cmyk(from: LAB_): CMYK_ = js.native
    def gray(from: LAB_): GRAY_ = js.native
    def hcg(from: LAB_): HCG_ = js.native
    def hex(from: LAB_): HEX_ = js.native
    def hsl(from: LAB_): HSL_ = js.native
    def hsv(from: LAB_): HSV_ = js.native
    def hwb(from: LAB_): HWB_ = js.native
    def keyword(from: LAB_): KEYWORD_ = js.native
    def lch(lab: LAB_): LCH_ = js.native
    def rgb(from: LAB_): RGB_ = js.native
    def xyz(lab: LAB_): XYZ_ = js.native
  }
  
  @js.native
  object lch extends js.Object {
    var ansi16: Anon101 = js.native
    var ansi256: Anon100 = js.native
    var apple: Anon108 = js.native
    val channels: `3` = js.native
    var cmyk: Anon103 = js.native
    var gray: Anon106 = js.native
    var hcg: Anon99 = js.native
    var hex: Anon102 = js.native
    var hsl: Anon104 = js.native
    var hsv: Anon107 = js.native
    var hwb: Anon109 = js.native
    var keyword: Anon105 = js.native
    var lab: Anon110 = js.native
    val labels: typings.colorConvert.colorConvertStrings.lch = js.native
    var rgb: Anon97 = js.native
    var xyz: Anon98 = js.native
    def ansi16(from: LCH_): ANSI16_ = js.native
    def ansi256(from: LCH_): ANSI256_ = js.native
    def apple(from: LCH_): APPLE_ = js.native
    def cmyk(from: LCH_): CMYK_ = js.native
    def gray(from: LCH_): GRAY_ = js.native
    def hcg(from: LCH_): HCG_ = js.native
    def hex(from: LCH_): HEX_ = js.native
    def hsl(from: LCH_): HSL_ = js.native
    def hsv(from: LCH_): HSV_ = js.native
    def hwb(from: LCH_): HWB_ = js.native
    def keyword(from: LCH_): KEYWORD_ = js.native
    def lab(lch: LCH_): LAB_ = js.native
    def rgb(from: LCH_): RGB_ = js.native
    def xyz(from: LCH_): XYZ_ = js.native
  }
  
  @js.native
  object rgb extends js.Object {
    var ansi16: Anon2 = js.native
    var ansi256: Anon1 = js.native
    var apple: Anon10 = js.native
    val channels: `3` = js.native
    var cmyk: Anon5 = js.native
    var gray: Anon8 = js.native
    var hcg: Anon0 = js.native
    var hex: Anon3 = js.native
    var hsl: Anon6 = js.native
    var hsv: Anon9 = js.native
    var hwb: Anon11 = js.native
    var keyword: Anon7 = js.native
    var lab: Anon12 = js.native
    val labels: typings.colorConvert.colorConvertStrings.rgb = js.native
    var lch: Anon4 = js.native
    var xyz: AnonRaw = js.native
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
    def lch(from: RGB_): LCH_ = js.native
    def xyz(rgb: RGB_): XYZ_ = js.native
  }
  
  @js.native
  object xyz extends js.Object {
    var ansi16: Anon72 = js.native
    var ansi256: Anon71 = js.native
    var apple: Anon80 = js.native
    val channels: `3` = js.native
    var cmyk: Anon75 = js.native
    var gray: Anon78 = js.native
    var hcg: Anon70 = js.native
    var hex: Anon73 = js.native
    var hsl: Anon76 = js.native
    var hsv: Anon79 = js.native
    var hwb: Anon81 = js.native
    var keyword: Anon77 = js.native
    var lab: Anon82 = js.native
    val labels: typings.colorConvert.colorConvertStrings.xyz = js.native
    var lch: Anon74 = js.native
    var rgb: Anon69 = js.native
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
    def lab(xyz: XYZ_): LAB_ = js.native
    def lch(from: XYZ_): LCH_ = js.native
    def rgb(xyz: XYZ_): RGB_ = js.native
  }
  
}

