package typings.ctrlTinycolor

import typings.ctrlTinycolor.anon.NumberifyHSL
import typings.ctrlTinycolor.anon.NumberifyHSV
import typings.ctrlTinycolor.anon.NumberifyRGB
import typings.ctrlTinycolor.interfacesMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ctrl/tinycolor/dist/conversion", JSImport.Namespace)
@js.native
object conversionMod extends js.Object {
  
  def convertDecimalToHex(d: String): String = js.native
  def convertDecimalToHex(d: Double): String = js.native
  
  def convertHexToDecimal(h: String): Double = js.native
  
  def hslToRgb(h: String, s: String, l: String): NumberifyRGB = js.native
  def hslToRgb(h: String, s: String, l: Double): NumberifyRGB = js.native
  def hslToRgb(h: String, s: Double, l: String): NumberifyRGB = js.native
  def hslToRgb(h: String, s: Double, l: Double): NumberifyRGB = js.native
  def hslToRgb(h: Double, s: String, l: String): NumberifyRGB = js.native
  def hslToRgb(h: Double, s: String, l: Double): NumberifyRGB = js.native
  def hslToRgb(h: Double, s: Double, l: String): NumberifyRGB = js.native
  def hslToRgb(h: Double, s: Double, l: Double): NumberifyRGB = js.native
  
  def hsvToRgb(h: String, s: String, v: String): NumberifyRGB = js.native
  def hsvToRgb(h: String, s: String, v: Double): NumberifyRGB = js.native
  def hsvToRgb(h: String, s: Double, v: String): NumberifyRGB = js.native
  def hsvToRgb(h: String, s: Double, v: Double): NumberifyRGB = js.native
  def hsvToRgb(h: Double, s: String, v: String): NumberifyRGB = js.native
  def hsvToRgb(h: Double, s: String, v: Double): NumberifyRGB = js.native
  def hsvToRgb(h: Double, s: Double, v: String): NumberifyRGB = js.native
  def hsvToRgb(h: Double, s: Double, v: Double): NumberifyRGB = js.native
  
  def numberInputToObject(color: Double): RGB = js.native
  
  def parseIntFromHex(`val`: String): Double = js.native
  
  def rgbToHex(r: Double, g: Double, b: Double, allow3Char: Boolean): String = js.native
  
  def rgbToHsl(r: Double, g: Double, b: Double): NumberifyHSL = js.native
  
  def rgbToHsv(r: Double, g: Double, b: Double): NumberifyHSV = js.native
  
  def rgbToRgb(r: String, g: String, b: String): NumberifyRGB = js.native
  def rgbToRgb(r: String, g: String, b: Double): NumberifyRGB = js.native
  def rgbToRgb(r: String, g: Double, b: String): NumberifyRGB = js.native
  def rgbToRgb(r: String, g: Double, b: Double): NumberifyRGB = js.native
  def rgbToRgb(r: Double, g: String, b: String): NumberifyRGB = js.native
  def rgbToRgb(r: Double, g: String, b: Double): NumberifyRGB = js.native
  def rgbToRgb(r: Double, g: Double, b: String): NumberifyRGB = js.native
  def rgbToRgb(r: Double, g: Double, b: Double): NumberifyRGB = js.native
  
  def rgbaToArgbHex(r: Double, g: Double, b: Double, a: Double): String = js.native
  
  def rgbaToHex(r: Double, g: Double, b: Double, a: Double, allow4Char: Boolean): String = js.native
}
