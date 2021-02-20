package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.PostalCodeLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPostalCodeMod {
  
  @JSImport("class-validator/types/decorator/string/IsPostalCode", "IS_POSTAL_CODE")
  @js.native
  val IS_POSTAL_CODE: /* "isPostalCode" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsPostalCode", "IsPostalCode")
  @js.native
  def IsPostalCode_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsPostalCode", "IsPostalCode")
  @js.native
  def IsPostalCode_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsPostalCode", "IsPostalCode")
  @js.native
  def IsPostalCode_(locale: PostalCodeLocale): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsPostalCode", "IsPostalCode")
  @js.native
  def IsPostalCode_(locale: PostalCodeLocale, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsPostalCode", "isPostalCode")
  @js.native
  def isPostalCode(value: js.Any, locale: PostalCodeLocale): Boolean = js.native
}
