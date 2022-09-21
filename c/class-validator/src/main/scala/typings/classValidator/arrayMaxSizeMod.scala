package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMaxSizeMod {
  
  @JSImport("class-validator/types/decorator/array/ArrayMaxSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/array/ArrayMaxSize", "ARRAY_MAX_SIZE")
  @js.native
  val ARRAY_MAX_SIZE: /* "arrayMaxSize" */ String = js.native
  
  inline def ArrayMaxSize_(max: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMaxSize")(max.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayMaxSize_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMaxSize")(max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def arrayMaxSize(array: Any, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMaxSize")(array.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
