package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorArrayArrayContainsMod {
  
  @JSImport("class-validator/types/decorator/array/ArrayContains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/array/ArrayContains", "ARRAY_CONTAINS")
  @js.native
  val ARRAY_CONTAINS: /* "arrayContains" */ String = js.native
  
  inline def ArrayContains_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayContains")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayContains_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayContains")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def arrayContains(array: Any, values: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContains")(array.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
