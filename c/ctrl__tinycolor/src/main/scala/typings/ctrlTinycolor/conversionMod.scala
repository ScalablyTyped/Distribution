package typings.ctrlTinycolor

import typings.ctrlTinycolor.anon.NumberifyHSL
import typings.ctrlTinycolor.anon.NumberifyHSV
import typings.ctrlTinycolor.anon.NumberifyRGB
import typings.ctrlTinycolor.interfacesMod.RGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionMod {
  
  @JSImport("@ctrl/tinycolor/dist/conversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDecimalToHex(d: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertDecimalToHex(d: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDecimalToHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertHexToDecimal(h: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertHexToDecimal")(h.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hslToRgb(h: String, s: String, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: String, s: String, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: String, s: Double, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: String, s: Double, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: String, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: String, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: Double, l: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hslToRgb(h: Double, s: Double, l: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  inline def hsvToRgb(h: String, s: String, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: String, s: String, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: String, s: Double, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: String, s: Double, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: String, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: String, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: Double, v: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def hsvToRgb(h: Double, s: Double, v: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToRgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  inline def numberInputToObject(color: Double): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("numberInputToObject")(color.asInstanceOf[js.Any]).asInstanceOf[RGB]
  
  inline def parseIntFromHex(`val`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIntFromHex")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rgbToHex(r: Double, g: Double, b: Double, allow3Char: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], allow3Char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rgbToHsl(r: Double, g: Double, b: Double): NumberifyHSL = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHsl")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyHSL]
  
  inline def rgbToHsv(r: Double, g: Double, b: Double): NumberifyHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHsv")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyHSV]
  
  inline def rgbToRgb(r: String, g: String, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: String, g: String, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: String, g: Double, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: String, g: Double, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: String, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: String, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: Double, b: String): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  inline def rgbToRgb(r: Double, g: Double, b: Double): NumberifyRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbToRgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[NumberifyRGB]
  
  inline def rgbaToArgbHex(r: Double, g: Double, b: Double, a: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToArgbHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rgbaToHex(r: Double, g: Double, b: Double, a: Double, allow4Char: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any], allow4Char.asInstanceOf[js.Any])).asInstanceOf[String]
}
