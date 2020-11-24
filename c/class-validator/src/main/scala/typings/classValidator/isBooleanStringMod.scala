package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsBooleanString", JSImport.Namespace)
@js.native
object isBooleanStringMod extends js.Object {
  
  val IS_BOOLEAN_STRING: /* "isBooleanString" */ String = js.native
  
  @JSName("IsBooleanString")
  def IsBooleanString_(): PropertyDecorator = js.native
  @JSName("IsBooleanString")
  def IsBooleanString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isBooleanString(value: js.Any): Boolean = js.native
}
