package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsPassportNumberMod {
  
  @JSImport("class-validator/types/decorator/string/IsPassportNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsPassportNumber", "IS_PASSPORT_NUMBER")
  @js.native
  val IS_PASSPORT_NUMBER: /* "isPassportNumber" */ String = js.native
  
  inline def IsPassportNumber_(countryCode: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPassportNumber")(countryCode.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPassportNumber_(countryCode: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPassportNumber")(countryCode.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isPassportNumber(value: Any, countryCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPassportNumber")(value.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
