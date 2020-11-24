package typings.ctrlTinycolor.mod

import typings.ctrlTinycolor.distMod.ColorInput
import typings.ctrlTinycolor.readabilityMod.WCAG2Parms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ctrl/tinycolor", "isReadable")
@js.native
object isReadable extends js.Object {
  
  def apply(color1: ColorInput, color2: ColorInput): Boolean = js.native
  def apply(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Parms): Boolean = js.native
}
