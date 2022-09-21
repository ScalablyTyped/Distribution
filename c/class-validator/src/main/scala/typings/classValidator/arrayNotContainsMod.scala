package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayNotContainsMod {
  
  @JSImport("class-validator/types/decorator/array/ArrayNotContains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/array/ArrayNotContains", "ARRAY_NOT_CONTAINS")
  @js.native
  val ARRAY_NOT_CONTAINS: /* "arrayNotContains" */ String = js.native
  
  inline def ArrayNotContains_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotContains")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayNotContains_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotContains")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def arrayNotContains(array: Any, values: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayNotContains")(array.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
