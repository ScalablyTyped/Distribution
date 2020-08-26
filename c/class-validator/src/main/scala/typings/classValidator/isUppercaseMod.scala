package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsUppercase", JSImport.Namespace)
@js.native
object isUppercaseMod extends js.Object {
  val IS_UPPERCASE: /* "isUppercase" */ String = js.native
  @JSName("IsUppercase")
  def IsUppercase_(): PropertyDecorator = js.native
  @JSName("IsUppercase")
  def IsUppercase_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isUppercase(value: js.Any): Boolean = js.native
}

