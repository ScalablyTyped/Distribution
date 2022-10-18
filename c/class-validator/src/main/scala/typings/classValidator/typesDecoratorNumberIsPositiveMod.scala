package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorNumberIsPositiveMod {
  
  @JSImport("class-validator/types/decorator/number/IsPositive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/number/IsPositive", "IS_POSITIVE")
  @js.native
  val IS_POSITIVE: /* "isPositive" */ String = js.native
  
  inline def IsPositive_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPositive")().asInstanceOf[PropertyDecorator]
  inline def IsPositive_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPositive")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isPositive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
