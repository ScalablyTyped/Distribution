package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsNumericOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNumberStringMod {
  
  @JSImport("class-validator/types/decorator/string/IsNumberString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsNumberString", "IS_NUMBER_STRING")
  @js.native
  val IS_NUMBER_STRING: /* "isNumberString" */ String = js.native
  
  inline def IsNumberString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")().asInstanceOf[PropertyDecorator]
  inline def IsNumberString_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsNumberString_(options: IsNumericOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNumberString_(options: IsNumericOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isNumberString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumberString(value: Any, options: IsNumericOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberString")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
