package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/common/IsNotEmpty", JSImport.Namespace)
@js.native
object isNotEmptyMod extends js.Object {
  val IS_NOT_EMPTY: /* "isNotEmpty" */ String = js.native
  @JSName("IsNotEmpty")
  def IsNotEmpty_(): PropertyDecorator = js.native
  @JSName("IsNotEmpty")
  def IsNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isNotEmpty(value: js.Any): Boolean = js.native
}

