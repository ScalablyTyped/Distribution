package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsMultibyte", JSImport.Namespace)
@js.native
object isMultibyteMod extends js.Object {
  val IS_MULTIBYTE: /* "isMultibyte" */ String = js.native
  @JSName("IsMultibyte")
  def IsMultibyte_(): PropertyDecorator = js.native
  @JSName("IsMultibyte")
  def IsMultibyte_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isMultibyte(value: js.Any): Boolean = js.native
}

