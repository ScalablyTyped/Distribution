package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/NotContains", JSImport.Namespace)
@js.native
object notContainsMod extends js.Object {
  
  val NOT_CONTAINS: /* "notContains" */ String = js.native
  
  @JSName("NotContains")
  def NotContains_(seed: String): PropertyDecorator = js.native
  @JSName("NotContains")
  def NotContains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def notContains(value: js.Any, seed: String): Boolean = js.native
}
