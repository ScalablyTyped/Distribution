package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsDecimalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDecimalMod {
  
  @JSImport("class-validator/types/decorator/string/IsDecimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsDecimal", "IS_DECIMAL")
  @js.native
  val IS_DECIMAL: /* "isDecimal" */ String = js.native
  
  inline def IsDecimal_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")().asInstanceOf[PropertyDecorator]
  inline def IsDecimal_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsDecimal_(options: IsDecimalOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsDecimal_(options: IsDecimalOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isDecimal(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDecimal(value: Any, options: IsDecimalOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
