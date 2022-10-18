package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringLengthMod {
  
  @JSImport("class-validator/types/decorator/string/Length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/Length", "IS_LENGTH")
  @js.native
  val IS_LENGTH: /* "isLength" */ String = js.native
  
  inline def Length_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Length_(min: Double, max: Double): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Length_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Length_(min: Double, max: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def length(value: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def length(value: Any, min: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
