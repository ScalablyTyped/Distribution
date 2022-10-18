package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsVariableWidthMod {
  
  @JSImport("class-validator/types/decorator/string/IsVariableWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsVariableWidth", "IS_VARIABLE_WIDTH")
  @js.native
  val IS_VARIABLE_WIDTH: /* "isVariableWidth" */ String = js.native
  
  inline def IsVariableWidth_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVariableWidth")().asInstanceOf[PropertyDecorator]
  inline def IsVariableWidth_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVariableWidth")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isVariableWidth(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
