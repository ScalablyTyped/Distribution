package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsOctal", JSImport.Namespace)
@js.native
object isOctalMod extends js.Object {
  val IS_OCTAL: /* "isOctal" */ String = js.native
  @JSName("IsOctal")
  def IsOctal_(): PropertyDecorator = js.native
  @JSName("IsOctal")
  def IsOctal_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isOctal(value: js.Any): Boolean = js.native
}

