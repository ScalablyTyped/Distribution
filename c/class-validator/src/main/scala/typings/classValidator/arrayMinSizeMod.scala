package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/array/ArrayMinSize", JSImport.Namespace)
@js.native
object arrayMinSizeMod extends js.Object {
  val ARRAY_MIN_SIZE: /* "arrayMinSize" */ String = js.native
  @JSName("ArrayMinSize")
  def ArrayMinSize_(min: Double): PropertyDecorator = js.native
  @JSName("ArrayMinSize")
  def ArrayMinSize_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def arrayMinSize(array: js.Any, min: Double): Boolean = js.native
}

