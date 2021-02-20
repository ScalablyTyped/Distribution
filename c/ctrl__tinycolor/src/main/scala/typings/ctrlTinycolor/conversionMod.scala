package typings.ctrlTinycolor

import typings.ctrlTinycolor.anon.NumberifyHSL
import typings.ctrlTinycolor.anon.NumberifyHSV
import typings.ctrlTinycolor.anon.NumberifyRGB
import typings.ctrlTinycolor.interfacesMod.RGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionMod {
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "convertDecimalToHex")
  @js.native
  def convertDecimalToHex(d: String): String = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "convertDecimalToHex")
  @js.native
  def convertDecimalToHex(d: Double): String = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "convertHexToDecimal")
  @js.native
  def convertHexToDecimal(h: String): Double = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: String, s: String, l: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: String, s: String, l: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: String, s: Double, l: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: String, s: Double, l: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: Double, s: String, l: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: Double, s: String, l: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: Double, s: Double, l: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hslToRgb")
  @js.native
  def hslToRgb(h: Double, s: Double, l: Double): NumberifyRGB = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: String, s: String, v: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: String, s: String, v: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: String, s: Double, v: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: String, s: Double, v: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: Double, s: String, v: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: Double, s: String, v: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: Double, s: Double, v: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "hsvToRgb")
  @js.native
  def hsvToRgb(h: Double, s: Double, v: Double): NumberifyRGB = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "numberInputToObject")
  @js.native
  def numberInputToObject(color: Double): RGB = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "parseIntFromHex")
  @js.native
  def parseIntFromHex(`val`: String): Double = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToHex")
  @js.native
  def rgbToHex(r: Double, g: Double, b: Double, allow3Char: Boolean): String = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToHsl")
  @js.native
  def rgbToHsl(r: Double, g: Double, b: Double): NumberifyHSL = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToHsv")
  @js.native
  def rgbToHsv(r: Double, g: Double, b: Double): NumberifyHSV = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: String, g: String, b: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: String, g: String, b: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: String, g: Double, b: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: String, g: Double, b: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: Double, g: String, b: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: Double, g: String, b: Double): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: Double, g: Double, b: String): NumberifyRGB = js.native
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbToRgb")
  @js.native
  def rgbToRgb(r: Double, g: Double, b: Double): NumberifyRGB = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbaToArgbHex")
  @js.native
  def rgbaToArgbHex(r: Double, g: Double, b: Double, a: Double): String = js.native
  
  @JSImport("@ctrl/tinycolor/dist/conversion", "rgbaToHex")
  @js.native
  def rgbaToHex(r: Double, g: Double, b: Double, a: Double, allow4Char: Boolean): String = js.native
}
