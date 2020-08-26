package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/number/Min", JSImport.Namespace)
@js.native
object minMod extends js.Object {
  val MIN: /* "min" */ String = js.native
  @JSName("Min")
  def Min_(minValue: Double): PropertyDecorator = js.native
  @JSName("Min")
  def Min_(minValue: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def min(num: js.Any, min: Double): Boolean = js.native
}

