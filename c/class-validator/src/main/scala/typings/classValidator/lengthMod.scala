package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/Length", JSImport.Namespace)
@js.native
object lengthMod extends js.Object {
  val LENGTH: /* "length" */ String = js.native
  @JSName("Length")
  def Length_(min: Double): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: Double): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def length(value: js.Any, min: Double): Boolean = js.native
  def length(value: js.Any, min: Double, max: Double): Boolean = js.native
}

