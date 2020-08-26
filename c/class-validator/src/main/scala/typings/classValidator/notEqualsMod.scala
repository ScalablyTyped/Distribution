package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/common/NotEquals", JSImport.Namespace)
@js.native
object notEqualsMod extends js.Object {
  val NOT_EQUALS: /* "notEquals" */ String = js.native
  @JSName("NotEquals")
  def NotEquals_(comparison: js.Any): PropertyDecorator = js.native
  @JSName("NotEquals")
  def NotEquals_(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def notEquals(value: js.Any, comparison: js.Any): Boolean = js.native
}

