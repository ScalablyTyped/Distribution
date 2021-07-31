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
  
  @scala.inline
  def ArrayNotContains_(values: js.Array[js.Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotContains")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def ArrayNotContains_(values: js.Array[js.Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotContains")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def arrayNotContains(array: js.Any, values: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayNotContains")(array.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
