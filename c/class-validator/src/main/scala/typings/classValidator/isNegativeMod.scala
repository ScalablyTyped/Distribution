package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/number/IsNegative", JSImport.Namespace)
@js.native
object isNegativeMod extends js.Object {
  val IS_NEGATIVE: /* "isNegative" */ String = js.native
  @JSName("IsNegative")
  def IsNegative_(): PropertyDecorator = js.native
  @JSName("IsNegative")
  def IsNegative_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isNegative(value: js.Any): Boolean = js.native
}

