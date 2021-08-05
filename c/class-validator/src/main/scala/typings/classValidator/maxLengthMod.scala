package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxLengthMod {
  
  @JSImport("class-validator/types/decorator/string/MaxLength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/MaxLength", "MAX_LENGTH")
  @js.native
  val MAX_LENGTH: /* "maxLength" */ String = js.native
  
  inline def MaxLength_(max: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(max.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MaxLength_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def maxLength(value: js.Any, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
