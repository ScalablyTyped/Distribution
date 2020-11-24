package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/number/IsDivisibleBy", JSImport.Namespace)
@js.native
object isDivisibleByMod extends js.Object {
  
  val IS_DIVISIBLE_BY: /* "isDivisibleBy" */ String = js.native
  
  @JSName("IsDivisibleBy")
  def IsDivisibleBy_(num: Double): PropertyDecorator = js.native
  @JSName("IsDivisibleBy")
  def IsDivisibleBy_(num: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isDivisibleBy(value: js.Any, num: Double): Boolean = js.native
}
