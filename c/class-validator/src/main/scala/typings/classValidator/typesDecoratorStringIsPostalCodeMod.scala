package typings.classValidator

import typings.classValidator.classValidatorStrings.any
import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.PostalCodeLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsPostalCodeMod {
  
  @JSImport("class-validator/types/decorator/string/IsPostalCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsPostalCode", "IS_POSTAL_CODE")
  @js.native
  val IS_POSTAL_CODE: /* "isPostalCode" */ String = js.native
  
  inline def IsPostalCode_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")().asInstanceOf[PropertyDecorator]
  inline def IsPostalCode_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsPostalCode_(locale: PostalCodeLocale): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPostalCode_(locale: PostalCodeLocale, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsPostalCode__any(locale: any): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPostalCode__any(locale: any, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isPostalCode(value: Any, locale: PostalCodeLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPostalCode")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPostalCode_any(value: Any, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPostalCode")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
