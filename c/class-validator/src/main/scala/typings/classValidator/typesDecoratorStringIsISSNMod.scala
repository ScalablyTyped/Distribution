package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsISSNOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsISSNMod {
  
  @JSImport("class-validator/types/decorator/string/IsISSN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISSN", "IS_ISSN")
  @js.native
  val IS_ISSN: /* "isISSN" */ String = js.native
  
  inline def IsISSN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")().asInstanceOf[PropertyDecorator]
  inline def IsISSN_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsISSN_(options: IsISSNOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsISSN_(options: IsISSNOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isISSN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISSN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isISSN(value: Any, options: IsISSNOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISSN")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
