package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsISO8601Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsDateStringMod {
  
  @JSImport("class-validator/types/decorator/string/IsDateString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsDateString", "IS_DATE_STRING")
  @js.native
  val IS_DATE_STRING: /* "isDateString" */ String = js.native
  
  inline def IsDateString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")().asInstanceOf[PropertyDecorator]
  inline def IsDateString_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsDateString_(options: IsISO8601Options): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsDateString_(options: IsISO8601Options, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isDateString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDateString(value: Any, options: IsISO8601Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDateString")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
