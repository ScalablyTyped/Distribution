package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorArrayArrayNotEmptyMod {
  
  @JSImport("class-validator/types/decorator/array/ArrayNotEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/array/ArrayNotEmpty", "ARRAY_NOT_EMPTY")
  @js.native
  val ARRAY_NOT_EMPTY: /* "arrayNotEmpty" */ String = js.native
  
  inline def ArrayNotEmpty_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotEmpty")().asInstanceOf[PropertyDecorator]
  inline def ArrayNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotEmpty")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def arrayNotEmpty(array: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayNotEmpty")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
