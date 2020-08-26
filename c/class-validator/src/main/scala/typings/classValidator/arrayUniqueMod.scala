package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/array/ArrayUnique", JSImport.Namespace)
@js.native
object arrayUniqueMod extends js.Object {
  val ARRAY_UNIQUE: /* "arrayUnique" */ String = js.native
  @JSName("ArrayUnique")
  def ArrayUnique_(): PropertyDecorator = js.native
  @JSName("ArrayUnique")
  def ArrayUnique_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def arrayUnique(array: js.Any): Boolean = js.native
}

