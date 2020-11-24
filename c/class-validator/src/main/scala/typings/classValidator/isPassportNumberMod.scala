package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsPassportNumber", JSImport.Namespace)
@js.native
object isPassportNumberMod extends js.Object {
  
  val IS_PASSPORT_NUMBER: /* "isPassportNumber" */ String = js.native
  
  @JSName("IsPassportNumber")
  def IsPassportNumber_(countryCode: String): PropertyDecorator = js.native
  @JSName("IsPassportNumber")
  def IsPassportNumber_(countryCode: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isPassportNumber(value: js.Any, countryCode: String): Boolean = js.native
}
