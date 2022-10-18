package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorNumberMinMod {
  
  @JSImport("class-validator/types/decorator/number/Min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/number/Min", "MIN")
  @js.native
  val MIN__ : /* "min" */ String = js.native
  
  inline def Min_(minValue: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Min")(minValue.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Min_(minValue: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Min")(minValue.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def min(num: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(num.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
