package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsHexadecimal", JSImport.Namespace)
@js.native
object isHexadecimalMod extends js.Object {
  
  val IS_HEXADECIMAL: /* "isHexadecimal" */ String = js.native
  
  @JSName("IsHexadecimal")
  def IsHexadecimal_(): PropertyDecorator = js.native
  @JSName("IsHexadecimal")
  def IsHexadecimal_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isHexadecimal(value: js.Any): Boolean = js.native
}
