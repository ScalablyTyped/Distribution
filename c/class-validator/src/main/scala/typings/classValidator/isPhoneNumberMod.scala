package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.libphonenumberJs.typesMod.CountryCode
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPhoneNumberMod {
  
  @JSImport("class-validator/types/decorator/string/IsPhoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsPhoneNumber", "IS_PHONE_NUMBER")
  @js.native
  val IS_PHONE_NUMBER: /* "isPhoneNumber" */ String = js.native
  
  inline def IsPhoneNumber_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")().asInstanceOf[PropertyDecorator]
  inline def IsPhoneNumber_(region: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")(region.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsPhoneNumber_(region: CountryCode): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")(region.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPhoneNumber_(region: CountryCode, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")(region.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isPhoneNumber(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPhoneNumber(value: String, region: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneNumber")(value.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
