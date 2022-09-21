package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsEmailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmailMod {
  
  @JSImport("class-validator/types/decorator/string/IsEmail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsEmail", "IS_EMAIL")
  @js.native
  val IS_EMAIL: /* "isEmail" */ String = js.native
  
  inline def IsEmail_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")().asInstanceOf[PropertyDecorator]
  inline def IsEmail_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsEmail_(options: IsEmailOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsEmail_(options: IsEmailOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isEmail(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEmail(value: Any, options: IsEmailOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
