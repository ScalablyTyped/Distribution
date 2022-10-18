package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsByteLengthMod {
  
  @JSImport("class-validator/types/decorator/string/IsByteLength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsByteLength", "IS_BYTE_LENGTH")
  @js.native
  val IS_BYTE_LENGTH: /* "isByteLength" */ String = js.native
  
  inline def IsByteLength_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsByteLength_(min: Double, max: Double): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsByteLength_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsByteLength_(min: Double, max: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isByteLength(value: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isByteLength")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isByteLength(value: Any, min: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isByteLength")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
