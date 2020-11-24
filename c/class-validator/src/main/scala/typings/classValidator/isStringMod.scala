package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/typechecker/IsString", JSImport.Namespace)
@js.native
object isStringMod extends js.Object {
  
  val IS_STRING: /* "isString" */ String = js.native
  
  @JSName("IsString")
  def IsString_(): PropertyDecorator = js.native
  @JSName("IsString")
  def IsString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isString(value: js.Any): /* is string */ Boolean = js.native
}
