package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.PostalCodeLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/decorator/string/IsPostalCode", JSImport.Namespace)
@js.native
object isPostalCodeMod extends js.Object {
  
  val IS_POSTAL_CODE: /* "isPostalCode" */ String = js.native
  
  @JSName("IsPostalCode")
  def IsPostalCode_(): PropertyDecorator = js.native
  @JSName("IsPostalCode")
  def IsPostalCode_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPostalCode")
  def IsPostalCode_(locale: PostalCodeLocale): PropertyDecorator = js.native
  @JSName("IsPostalCode")
  def IsPostalCode_(locale: PostalCodeLocale, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  def isPostalCode(value: js.Any, locale: PostalCodeLocale): Boolean = js.native
}
