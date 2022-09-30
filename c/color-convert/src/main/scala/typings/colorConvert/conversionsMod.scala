package typings.colorConvert

import typings.colorConvert.colorConvertInts.`1`
import typings.colorConvert.colorConvertInts.`3`
import typings.colorConvert.colorConvertInts.`4`
import typings.colorConvert.colorConvertStrings.b16
import typings.colorConvert.colorConvertStrings.c
import typings.colorConvert.colorConvertStrings.g
import typings.colorConvert.colorConvertStrings.g16
import typings.colorConvert.colorConvertStrings.h
import typings.colorConvert.colorConvertStrings.r16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionsMod {
  
  object ansi16 {
    
    @JSImport("color-convert/conversions", "ansi16")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "ansi16.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi16.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi16] = js.native
    
    inline def rgb(ansi16: ANSI16_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(ansi16.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object ansi256 {
    
    @JSImport("color-convert/conversions", "ansi256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "ansi256.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi256.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.ansi256] = js.native
    
    inline def rgb(ansi256: ANSI256_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(ansi256.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object apple {
    
    @JSImport("color-convert/conversions", "apple")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "apple.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "apple.labels")
    @js.native
    val labels: js.Tuple3[r16, g16, b16] = js.native
    
    inline def rgb(apple: APPLE_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(apple.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object cmyk {
    
    @JSImport("color-convert/conversions", "cmyk")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "cmyk.channels")
    @js.native
    val channels: `4` = js.native
    
    @JSImport("color-convert/conversions", "cmyk.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.cmyk = js.native
    
    inline def rgb(cmyk: CMYK_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(cmyk.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object gray {
    
    @JSImport("color-convert/conversions", "gray")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "gray.channels")
    @js.native
    val channels: `1` = js.native
    
    inline def cmyk(gray: GRAY_): CMYK_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cmyk")(gray.asInstanceOf[js.Any]).asInstanceOf[CMYK_]
    
    inline def hex(gray: GRAY_): HEX_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(gray.asInstanceOf[js.Any]).asInstanceOf[HEX_]
    
    inline def hsl(gray: GRAY_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(gray.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    inline def hsv(gray: GRAY_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(gray.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    inline def hwb(gray: GRAY_): HWB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(gray.asInstanceOf[js.Any]).asInstanceOf[HWB_]
    
    inline def lab(gray: GRAY_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(gray.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "gray.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.gray] = js.native
    
    inline def rgb(gray: GRAY_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(gray.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hcg {
    
    @JSImport("color-convert/conversions", "hcg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hcg.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hsl(hcg: HCG_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hcg.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    inline def hsv(hcg: HCG_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(hcg.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    inline def hwb(hcg: HCG_): HWB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(hcg.asInstanceOf[js.Any]).asInstanceOf[HWB_]
    
    @JSImport("color-convert/conversions", "hcg.labels")
    @js.native
    val labels: js.Tuple3[h, c, g] = js.native
    
    inline def rgb(hcg: HCG_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hcg.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hex {
    
    @JSImport("color-convert/conversions", "hex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hex.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "hex.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.hex] = js.native
    
    inline def rgb(hex: HEX_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hex.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hsl {
    
    @JSImport("color-convert/conversions", "hsl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hsl.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hcg(hsl: HSL_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(hsl.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    inline def hsv(hsl: HSL_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(hsl.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    @JSImport("color-convert/conversions", "hsl.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.hsl = js.native
    
    inline def rgb(hsl: HSL_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hsl.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hsv {
    
    @JSImport("color-convert/conversions", "hsv")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ansi16(hsv: HSV_): ANSI16_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi16")(hsv.asInstanceOf[js.Any]).asInstanceOf[ANSI16_]
    
    @JSImport("color-convert/conversions", "hsv.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hcg(hsv: HSV_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(hsv.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    inline def hsl(hsv: HSV_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hsv.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    @JSImport("color-convert/conversions", "hsv.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.hsv = js.native
    
    inline def rgb(hsv: HSV_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hsv.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object hwb {
    
    @JSImport("color-convert/conversions", "hwb")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "hwb.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def hcg(hwb: HWB_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(hwb.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    @JSImport("color-convert/conversions", "hwb.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.hwb = js.native
    
    inline def rgb(hwb: HWB_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(hwb.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object keyword {
    
    @JSImport("color-convert/conversions", "keyword")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "keyword.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "keyword.labels")
    @js.native
    val labels: js.Array[typings.colorConvert.colorConvertStrings.keyword] = js.native
    
    inline def rgb(keyword: KEYWORD_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(keyword.asInstanceOf[js.Any]).asInstanceOf[RGB_]
  }
  
  object lab {
    
    @JSImport("color-convert/conversions", "lab")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "lab.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "lab.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.lab = js.native
    
    inline def lch(lab: LAB_): LCH_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lch")(lab.asInstanceOf[js.Any]).asInstanceOf[LCH_]
    
    inline def xyz(lab: LAB_): XYZ_ = ^.asInstanceOf[js.Dynamic].applyDynamic("xyz")(lab.asInstanceOf[js.Any]).asInstanceOf[XYZ_]
  }
  
  object lch {
    
    @JSImport("color-convert/conversions", "lch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "lch.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def lab(lch: LCH_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(lch.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "lch.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.lch = js.native
  }
  
  object rgb {
    
    @JSImport("color-convert/conversions", "rgb")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ansi16(rgb: RGB_): ANSI16_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi16")(rgb.asInstanceOf[js.Any]).asInstanceOf[ANSI16_]
    
    inline def ansi256(rgb: RGB_): ANSI256_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi256")(rgb.asInstanceOf[js.Any]).asInstanceOf[ANSI256_]
    
    inline def apple(rgb: RGB_): APPLE_ = ^.asInstanceOf[js.Dynamic].applyDynamic("apple")(rgb.asInstanceOf[js.Any]).asInstanceOf[APPLE_]
    
    @JSImport("color-convert/conversions", "rgb.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def cmyk(rgb: RGB_): CMYK_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cmyk")(rgb.asInstanceOf[js.Any]).asInstanceOf[CMYK_]
    
    inline def gray(rgb: RGB_): GRAY_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gray")(rgb.asInstanceOf[js.Any]).asInstanceOf[GRAY_]
    
    inline def hcg(rgb: RGB_): HCG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hcg")(rgb.asInstanceOf[js.Any]).asInstanceOf[HCG_]
    
    inline def hex(rgb: RGB_): HEX_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[HEX_]
    
    inline def hsl(rgb: RGB_): HSL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(rgb.asInstanceOf[js.Any]).asInstanceOf[HSL_]
    
    inline def hsv(rgb: RGB_): HSV_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv")(rgb.asInstanceOf[js.Any]).asInstanceOf[HSV_]
    
    inline def hwb(rgb: RGB_): HWB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb")(rgb.asInstanceOf[js.Any]).asInstanceOf[HWB_]
    
    inline def keyword(rgb: RGB_): KEYWORD_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(rgb.asInstanceOf[js.Any]).asInstanceOf[KEYWORD_]
    
    inline def lab(rgb: RGB_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(rgb.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "rgb.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.rgb = js.native
    
    inline def xyz(rgb: RGB_): XYZ_ = ^.asInstanceOf[js.Dynamic].applyDynamic("xyz")(rgb.asInstanceOf[js.Any]).asInstanceOf[XYZ_]
  }
  
  object xyz {
    
    @JSImport("color-convert/conversions", "xyz")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("color-convert/conversions", "xyz.channels")
    @js.native
    val channels: `3` = js.native
    
    inline def lab(xyz: XYZ_): LAB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("lab")(xyz.asInstanceOf[js.Any]).asInstanceOf[LAB_]
    
    @JSImport("color-convert/conversions", "xyz.labels")
    @js.native
    val labels: typings.colorConvert.colorConvertStrings.xyz = js.native
    
    inline def rgb(xyz: XYZ_): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(xyz.asInstanceOf[js.Any]).asInstanceOf[RGB_]
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
  
  /* keyof color-convert.anon.Typeofcolors */ /* Rewritten from type alias, can be one of: 
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
