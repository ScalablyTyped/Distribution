package typings.ctrlTinycolor

import typings.ctrlTinycolor.anon.A
import typings.ctrlTinycolor.interfacesMod.HSL
import typings.ctrlTinycolor.interfacesMod.HSLA
import typings.ctrlTinycolor.interfacesMod.HSV
import typings.ctrlTinycolor.interfacesMod.HSVA
import typings.ctrlTinycolor.interfacesMod.RGB
import typings.ctrlTinycolor.interfacesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ctrl/tinycolor/dist/format-input", JSImport.Namespace)
@js.native
object formatInputMod extends js.Object {
  
  def inputToRGB(color: String): A = js.native
  def inputToRGB(color: js.Any): A = js.native
  def inputToRGB(color: HSL): A = js.native
  def inputToRGB(color: HSLA): A = js.native
  def inputToRGB(color: HSV): A = js.native
  def inputToRGB(color: HSVA): A = js.native
  def inputToRGB(color: RGB): A = js.native
  def inputToRGB(color: RGBA): A = js.native
  
  def isValidCSSUnit(color: String): Boolean = js.native
  def isValidCSSUnit(color: Double): Boolean = js.native
  
  def stringInputToObject(color: String): js.Any = js.native
}
