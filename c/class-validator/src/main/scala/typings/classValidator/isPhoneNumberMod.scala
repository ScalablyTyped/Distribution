package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsPhoneNumber", JSImport.Namespace)
@js.native
object isPhoneNumberMod extends js.Object {
  val IS_PHONE_NUMBER: /* "isPhoneNumber" */ String = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(): PropertyDecorator = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(region: String): PropertyDecorator = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(region: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(region: Null, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isPhoneNumber(value: String): Boolean = js.native
  def isPhoneNumber(value: String, region: String): Boolean = js.native
}

