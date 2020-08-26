package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/Contains", JSImport.Namespace)
@js.native
object containsMod extends js.Object {
  val CONTAINS: /* "contains" */ String = js.native
  @JSName("Contains")
  def Contains_(seed: String): PropertyDecorator = js.native
  @JSName("Contains")
  def Contains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def contains(value: js.Any, seed: String): Boolean = js.native
}

