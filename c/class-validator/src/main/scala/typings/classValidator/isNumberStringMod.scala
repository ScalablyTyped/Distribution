package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsNumericOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsNumberString", JSImport.Namespace)
@js.native
object isNumberStringMod extends js.Object {
  val IS_NUMBER_STRING: /* "isNumberString" */ String = js.native
  @JSName("IsNumberString")
  def IsNumberString_(): PropertyDecorator = js.native
  @JSName("IsNumberString")
  def IsNumberString_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNumberString")
  def IsNumberString_(options: IsNumericOptions): PropertyDecorator = js.native
  @JSName("IsNumberString")
  def IsNumberString_(options: IsNumericOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isNumberString(value: js.Any): Boolean = js.native
  def isNumberString(value: js.Any, options: IsNumericOptions): Boolean = js.native
}

