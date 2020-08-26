package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/MinLength", JSImport.Namespace)
@js.native
object minLengthMod extends js.Object {
  val MIN_LENGTH: /* "minLength" */ String = js.native
  @JSName("MinLength")
  def MinLength_(min: Double): PropertyDecorator = js.native
  @JSName("MinLength")
  def MinLength_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def minLength(value: js.Any, min: Double): Boolean = js.native
}

