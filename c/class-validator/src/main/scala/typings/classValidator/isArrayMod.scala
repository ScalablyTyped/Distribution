package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/typechecker/IsArray", JSImport.Namespace)
@js.native
object isArrayMod extends js.Object {
  
  val IS_ARRAY: /* "isArray" */ String = js.native
  
  @JSName("IsArray")
  def IsArray_(): PropertyDecorator = js.native
  @JSName("IsArray")
  def IsArray_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isArray(value: js.Any): Boolean = js.native
}
