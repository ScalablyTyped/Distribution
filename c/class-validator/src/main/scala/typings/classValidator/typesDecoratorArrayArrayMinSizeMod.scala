package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorArrayArrayMinSizeMod {
  
  @JSImport("class-validator/types/decorator/array/ArrayMinSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/array/ArrayMinSize", "ARRAY_MIN_SIZE")
  @js.native
  val ARRAY_MIN_SIZE: /* "arrayMinSize" */ String = js.native
  
  inline def ArrayMinSize_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMinSize")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayMinSize_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMinSize")(min.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def arrayMinSize(array: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMinSize")(array.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
