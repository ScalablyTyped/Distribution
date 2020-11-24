package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsHexColor", JSImport.Namespace)
@js.native
object isHexColorMod extends js.Object {
  
  val IS_HEX_COLOR: /* "isHexColor" */ String = js.native
  
  @JSName("IsHexColor")
  def IsHexColor_(): PropertyDecorator = js.native
  @JSName("IsHexColor")
  def IsHexColor_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isHexColor(value: js.Any): Boolean = js.native
}
