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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionsMod {
  
  object ansi16 {
    
    @JSImport("color-convert/conversions", "ansi16.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi16.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi16] = js.native
    
    @JSImport("color-convert/conversions", "ansi16.rgb")
    @js.native
    def rgb(ansi16: ANSI16_): RGB_ = js.native
  }
  
  object ansi256 {
    
    @JSImport("color-convert/conversions", "ansi256.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi256.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi256] = js.native
    
    @JSImport("color-convert/conversions", "ansi256.rgb")
    @js.native
    def rgb(ansi256: ANSI256_): RGB_ = js.native
  }
  
  object apple {
    
    @JSImport("color-convert/conversions", "apple.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "apple.labels")
    @js.native
    val labels: js.Tuple3[r16, g16, b16] = js.native
    
    @JSImport("color-convert/conversions", "apple.rgb")
    @js.native
    def rgb(apple: APPLE_): RGB_ = js.native
  }
  
  object cmyk {
    
    @JSImport("color-convert/conversions", "cmyk.channels")
    @js.native
    val channels: `4` = js.native
    
    @JSImport("color-convert/conversions", "cmyk.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.cmyk = js.native
    
    @JSImport("color-convert/conversions", "cmyk.rgb")
    @js.native
    def rgb(cmyk: CMYK_): RGB_ = js.native
  }
  
  object gray {
    
    @JSImport("color-convert/conversions", "gray.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "gray.cmyk")
    @js.native
    def cmyk(gray: GRAY_): CMYK_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hex")
    @js.native
    def hex(gray: GRAY_): HEX_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hsl")
    @js.native
    def hsl(gray: GRAY_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hsv")
    @js.native
    def hsv(gray: GRAY_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hwb")
    @js.native
    def hwb(gray: GRAY_): HWB_ = js.native
    
    @JSImport("color-convert/conversions", "gray.lab")
    @js.native
    def lab(gray: GRAY_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "gray.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.gray] = js.native
    
    @JSImport("color-convert/conversions", "gray.rgb")
    @js.native
    def rgb(gray: GRAY_): RGB_ = js.native
  }
  
  object hcg {
    
    @JSImport("color-convert/conversions", "hcg.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hcg.hsl")
    @js.native
    def hsl(hcg: HCG_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "hcg.hsv")
    @js.native
    def hsv(hcg: HCG_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "hcg.hwb")
    @js.native
    def hwb(hcg: HCG_): HWB_ = js.native
    
    @JSImport("color-convert/conversions", "hcg.labels")
    @js.native
    val labels: js.Tuple3[h, c, g] = js.native
    
    @JSImport("color-convert/conversions", "hcg.rgb")
    @js.native
    def rgb(hcg: HCG_): RGB_ = js.native
  }
  
  object hex {
    
    @JSImport("color-convert/conversions", "hex.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "hex.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.hex] = js.native
    
    @JSImport("color-convert/conversions", "hex.rgb")
    @js.native
    def rgb(hex: HEX_): RGB_ = js.native
  }
  
  object hsl {
    
    @JSImport("color-convert/conversions", "hsl.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hsl.hcg")
    @js.native
    def hcg(hsl: HSL_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "hsl.hsv")
    @js.native
    def hsv(hsl: HSL_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "hsl.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.hsl = js.native
    
    @JSImport("color-convert/conversions", "hsl.rgb")
    @js.native
    def rgb(hsl: HSL_): RGB_ = js.native
  }
  
  object hsv {
    
    @JSImport("color-convert/conversions", "hsv.ansi16")
    @js.native
    def ansi16(hsv: HSV_): ANSI16_ = js.native
    
    @JSImport("color-convert/conversions", "hsv.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hsv.hcg")
    @js.native
    def hcg(hsv: HSV_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "hsv.hsl")
    @js.native
    def hsl(hsv: HSV_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "hsv.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.hsv = js.native
    
    @JSImport("color-convert/conversions", "hsv.rgb")
    @js.native
    def rgb(hsv: HSV_): RGB_ = js.native
  }
  
  object hwb {
    
    @JSImport("color-convert/conversions", "hwb.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hwb.hcg")
    @js.native
    def hcg(hwb: HWB_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "hwb.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.hwb = js.native
    
    @JSImport("color-convert/conversions", "hwb.rgb")
    @js.native
    def rgb(hwb: HWB_): RGB_ = js.native
  }
  
  object keyword {
    
    @JSImport("color-convert/conversions", "keyword.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "keyword.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.keyword] = js.native
    
    @JSImport("color-convert/conversions", "keyword.rgb")
    @js.native
    def rgb(keyword: KEYWORD_): RGB_ = js.native
  }
  
  object lab {
    
    @JSImport("color-convert/conversions", "lab.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "lab.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.lab = js.native
    
    @JSImport("color-convert/conversions", "lab.lch")
    @js.native
    def lch(lab: LAB_): LCH_ = js.native
    
    @JSImport("color-convert/conversions", "lab.xyz")
    @js.native
    def xyz(lab: LAB_): XYZ_ = js.native
  }
  
  object lch {
    
    @JSImport("color-convert/conversions", "lch.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "lch.lab")
    @js.native
    def lab(lch: LCH_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "lch.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.lch = js.native
  }
  
  object rgb {
    
    @JSImport("color-convert/conversions", "rgb.ansi16")
    @js.native
    def ansi16(rgb: RGB_): ANSI16_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.ansi256")
    @js.native
    def ansi256(rgb: RGB_): ANSI256_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.apple")
    @js.native
    def apple(rgb: RGB_): APPLE_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "rgb.cmyk")
    @js.native
    def cmyk(rgb: RGB_): CMYK_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.gray")
    @js.native
    def gray(rgb: RGB_): GRAY_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hcg")
    @js.native
    def hcg(rgb: RGB_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hex")
    @js.native
    def hex(rgb: RGB_): HEX_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hsl")
    @js.native
    def hsl(rgb: RGB_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hsv")
    @js.native
    def hsv(rgb: RGB_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hwb")
    @js.native
    def hwb(rgb: RGB_): HWB_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.keyword")
    @js.native
    def keyword(rgb: RGB_): KEYWORD_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.lab")
    @js.native
    def lab(rgb: RGB_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.rgb = js.native
    
    @JSImport("color-convert/conversions", "rgb.xyz")
    @js.native
    def xyz(rgb: RGB_): XYZ_ = js.native
  }
  
  object xyz {
    
    @JSImport("color-convert/conversions", "xyz.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "xyz.lab")
    @js.native
    def lab(xyz: XYZ_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "xyz.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.xyz = js.native
    
    @JSImport("color-convert/conversions", "xyz.rgb")
    @js.native
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
  
  /* keyof color-convert.anon.TypeofcssKeywords */ /* Rewritten from type alias, can be one of: 
    - typings.colorConvert.colorConvertStrings.black
    - typings.colorConvert.colorConvertStrings.magenta
    - typings.colorConvert.colorConvertStrings.skyblue
    - typings.colorConvert.colorConvertStrings.darkseagreen
    - typings.colorConvert.colorConvertStrings.midnightblue
    - typings.colorConvert.colorConvertStrings.rosybrown
    - typings.colorConvert.colorConvertStrings.honeydew
    - typings.colorConvert.colorConvertStrings.cadetblue
    - typings.colorConvert.colorConvertStrings.darkgrey
    - typings.colorConvert.colorConvertStrings.lavenderblush
    - typings.colorConvert.colorConvertStrings.lightblue
    - typings.colorConvert.colorConvertStrings.moccasin
    - typings.colorConvert.colorConvertStrings.salmon
    - typings.colorConvert.colorConvertStrings.indianred
    - typings.colorConvert.colorConvertStrings.red
    - typings.colorConvert.colorConvertStrings.purple
    - typings.colorConvert.colorConvertStrings.chocolate
    - typings.colorConvert.colorConvertStrings.darkslategray
    - typings.colorConvert.colorConvertStrings.lightcyan
    - typings.colorConvert.colorConvertStrings.limegreen
    - typings.colorConvert.colorConvertStrings.lightslategray
    - typings.colorConvert.colorConvertStrings.sandybrown
    - typings.colorConvert.colorConvertStrings.mediumblue
    - typings.colorConvert.colorConvertStrings.darkorange
    - typings.colorConvert.colorConvertStrings.darkgray
    - typings.colorConvert.colorConvertStrings.darkslategrey
    - typings.colorConvert.colorConvertStrings.lightgrey
    - typings.colorConvert.colorConvertStrings.ivory
    - typings.colorConvert.colorConvertStrings.green
    - typings.colorConvert.colorConvertStrings.lavender
    - typings.colorConvert.colorConvertStrings.lightpink
    - typings.colorConvert.colorConvertStrings.darkmagenta
    - typings.colorConvert.colorConvertStrings.mediumspringgreen
    - typings.colorConvert.colorConvertStrings.darkorchid
    - typings.colorConvert.colorConvertStrings.aqua
    - typings.colorConvert.colorConvertStrings.lightyellow
    - typings.colorConvert.colorConvertStrings.hotpink
    - typings.colorConvert.colorConvertStrings.khaki
    - typings.colorConvert.colorConvertStrings.beige
    - typings.colorConvert.colorConvertStrings.darkred
    - typings.colorConvert.colorConvertStrings.darkslateblue
    - typings.colorConvert.colorConvertStrings.sienna
    - typings.colorConvert.colorConvertStrings.lightsalmon
    - typings.colorConvert.colorConvertStrings.mediumseagreen
    - typings.colorConvert.colorConvertStrings.blue
    - typings.colorConvert.colorConvertStrings.lightsteelblue
    - typings.colorConvert.colorConvertStrings.lightgoldenrodyellow
    - typings.colorConvert.colorConvertStrings.mediumpurple
    - typings.colorConvert.colorConvertStrings.maroon
    - typings.colorConvert.colorConvertStrings.slategrey
    - typings.colorConvert.colorConvertStrings.darkgoldenrod
    - typings.colorConvert.colorConvertStrings.violet
    - typings.colorConvert.colorConvertStrings.darkolivegreen
    - typings.colorConvert.colorConvertStrings.springgreen
    - typings.colorConvert.colorConvertStrings.oldlace
    - typings.colorConvert.colorConvertStrings.forestgreen
    - typings.colorConvert.colorConvertStrings.goldenrod
    - typings.colorConvert.colorConvertStrings.coral
    - typings.colorConvert.colorConvertStrings.aquamarine
    - typings.colorConvert.colorConvertStrings.mintcream
    - typings.colorConvert.colorConvertStrings.snow
    - typings.colorConvert.colorConvertStrings.lightseagreen
    - typings.colorConvert.colorConvertStrings.seashell
    - typings.colorConvert.colorConvertStrings.palevioletred
    - typings.colorConvert.colorConvertStrings.darkcyan
    - typings.colorConvert.colorConvertStrings.aliceblue
    - typings.colorConvert.colorConvertStrings.linen
    - typings.colorConvert.colorConvertStrings.wheat
    - typings.colorConvert.colorConvertStrings.mediumturquoise
    - typings.colorConvert.colorConvertStrings.crimson
    - typings.colorConvert.colorConvertStrings.dodgerblue
    - typings.colorConvert.colorConvertStrings.yellowgreen
    - typings.colorConvert.colorConvertStrings.firebrick
    - typings.colorConvert.colorConvertStrings.burlywood
    - typings.colorConvert.colorConvertStrings.darkviolet
    - typings.colorConvert.colorConvertStrings.gray
    - typings.colorConvert.colorConvertStrings.mediumorchid
    - typings.colorConvert.colorConvertStrings.navy
    - typings.colorConvert.colorConvertStrings.azure
    - typings.colorConvert.colorConvertStrings.mediumslateblue
    - typings.colorConvert.colorConvertStrings.fuchsia
    - typings.colorConvert.colorConvertStrings.papayawhip
    - typings.colorConvert.colorConvertStrings.lemonchiffon
    - typings.colorConvert.colorConvertStrings.orangered
    - typings.colorConvert.colorConvertStrings.lightskyblue
    - typings.colorConvert.colorConvertStrings.mistyrose
    - typings.colorConvert.colorConvertStrings.lightgreen
    - typings.colorConvert.colorConvertStrings.royalblue
    - typings.colorConvert.colorConvertStrings.antiquewhite
    - typings.colorConvert.colorConvertStrings.grey
    - typings.colorConvert.colorConvertStrings.tan
    - typings.colorConvert.colorConvertStrings.brown
    - typings.colorConvert.colorConvertStrings.chartreuse
    - typings.colorConvert.colorConvertStrings.gainsboro
    - typings.colorConvert.colorConvertStrings.pink
    - typings.colorConvert.colorConvertStrings.lightcoral
    - typings.colorConvert.colorConvertStrings.lightgray
    - typings.colorConvert.colorConvertStrings.darkgreen
    - typings.colorConvert.colorConvertStrings.lawngreen
    - typings.colorConvert.colorConvertStrings.blueviolet
    - typings.colorConvert.colorConvertStrings.steelblue
    - typings.colorConvert.colorConvertStrings.slategray
    - typings.colorConvert.colorConvertStrings.ghostwhite
    - typings.colorConvert.colorConvertStrings.greenyellow
    - typings.colorConvert.colorConvertStrings.palegoldenrod
    - typings.colorConvert.colorConvertStrings.darkturquoise
    - typings.colorConvert.colorConvertStrings.deeppink
    - typings.colorConvert.colorConvertStrings.whitesmoke
    - typings.colorConvert.colorConvertStrings.thistle
    - typings.colorConvert.colorConvertStrings.paleturquoise
    - typings.colorConvert.colorConvertStrings.white
    - typings.colorConvert.colorConvertStrings.plum
    - typings.colorConvert.colorConvertStrings.blanchedalmond
    - typings.colorConvert.colorConvertStrings.orange
    - typings.colorConvert.colorConvertStrings.deepskyblue
    - typings.colorConvert.colorConvertStrings.darkkhaki
    - typings.colorConvert.colorConvertStrings.mediumvioletred
    - typings.colorConvert.colorConvertStrings.silver
    - typings.colorConvert.colorConvertStrings.peru
    - typings.colorConvert.colorConvertStrings.slateblue
    - typings.colorConvert.colorConvertStrings.cornflowerblue
    - typings.colorConvert.colorConvertStrings.floralwhite
    - typings.colorConvert.colorConvertStrings.darksalmon
    - typings.colorConvert.colorConvertStrings.mediumaquamarine
    - typings.colorConvert.colorConvertStrings.turquoise
    - typings.colorConvert.colorConvertStrings.seagreen
    - typings.colorConvert.colorConvertStrings.palegreen
    - typings.colorConvert.colorConvertStrings.saddlebrown
    - typings.colorConvert.colorConvertStrings.cyan
    - typings.colorConvert.colorConvertStrings.peachpuff
    - typings.colorConvert.colorConvertStrings.darkblue
    - typings.colorConvert.colorConvertStrings.olivedrab
    - typings.colorConvert.colorConvertStrings.powderblue
    - typings.colorConvert.colorConvertStrings.orchid
    - typings.colorConvert.colorConvertStrings.bisque
    - typings.colorConvert.colorConvertStrings.dimgray
    - typings.colorConvert.colorConvertStrings.navajowhite
    - typings.colorConvert.colorConvertStrings.teal
    - typings.colorConvert.colorConvertStrings.rebeccapurple
    - typings.colorConvert.colorConvertStrings.indigo
    - typings.colorConvert.colorConvertStrings.lime
    - typings.colorConvert.colorConvertStrings.gold
    - typings.colorConvert.colorConvertStrings.dimgrey
    - typings.colorConvert.colorConvertStrings.cornsilk
    - typings.colorConvert.colorConvertStrings.tomato
    - typings.colorConvert.colorConvertStrings.olive
    - typings.colorConvert.colorConvertStrings.lightslategrey
    - typings.colorConvert.colorConvertStrings.yellow
  */
  trait KEYWORD_ extends StObject
  
  type LAB_ = js.Tuple3[Double, Double, Double]
  
  type LCH_ = js.Tuple3[Double, Double, Double]
  
  type RGB_ = js.Tuple3[Double, Double, Double]
  
  type XYZ_ = js.Tuple3[Double, Double, Double]
}
