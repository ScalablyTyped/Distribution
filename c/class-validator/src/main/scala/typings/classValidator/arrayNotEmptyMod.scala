package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/array/ArrayNotEmpty", JSImport.Namespace)
@js.native
object arrayNotEmptyMod extends js.Object {
  val ARRAY_NOT_EMPTY: /* "arrayNotEmpty" */ String = js.native
  @JSName("ArrayNotEmpty")
  def ArrayNotEmpty_(): PropertyDecorator = js.native
  @JSName("ArrayNotEmpty")
  def ArrayNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def arrayNotEmpty(array: js.Any): Boolean = js.native
}

