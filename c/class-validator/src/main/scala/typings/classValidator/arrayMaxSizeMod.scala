package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/array/ArrayMaxSize", JSImport.Namespace)
@js.native
object arrayMaxSizeMod extends js.Object {
  val ARRAY_MAX_SIZE: /* "arrayMaxSize" */ String = js.native
  @JSName("ArrayMaxSize")
  def ArrayMaxSize_(max: Double): PropertyDecorator = js.native
  @JSName("ArrayMaxSize")
  def ArrayMaxSize_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def arrayMaxSize(array: js.Any, max: Double): Boolean = js.native
}

