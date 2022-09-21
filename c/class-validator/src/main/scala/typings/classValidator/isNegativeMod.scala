package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isNegativeMod {
  
  @JSImport("class-validator/types/decorator/number/IsNegative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/number/IsNegative", "IS_NEGATIVE")
  @js.native
  val IS_NEGATIVE: /* "isNegative" */ String = js.native
  
  inline def IsNegative_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNegative")().asInstanceOf[PropertyDecorator]
  inline def IsNegative_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNegative")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isNegative(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
