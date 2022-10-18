package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsRgbColorMod {
  
  @JSImport("class-validator/types/decorator/string/IsRgbColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsRgbColor", "IS_RGB_COLOR")
  @js.native
  val IS_RGB_COLOR: /* "isRgbColor" */ String = js.native
  
  inline def IsRgbColor_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")().asInstanceOf[PropertyDecorator]
  inline def IsRgbColor_(includePercentValues: Boolean): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")(includePercentValues.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsRgbColor_(includePercentValues: Boolean, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")(includePercentValues.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsRgbColor_(includePercentValues: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")(includePercentValues.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isRgbColor(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRgbColor")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isRgbColor(value: Any, includePercentValues: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRgbColor")(value.asInstanceOf[js.Any], includePercentValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
