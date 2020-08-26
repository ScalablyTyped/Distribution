package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/common/IsEmpty", JSImport.Namespace)
@js.native
object isEmptyMod extends js.Object {
  val IS_EMPTY: /* "isEmpty" */ String = js.native
  @JSName("IsEmpty")
  def IsEmpty_(): PropertyDecorator = js.native
  @JSName("IsEmpty")
  def IsEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isEmpty(value: js.Any): Boolean = js.native
}

