package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsFullWidthMod {
  
  @JSImport("class-validator/types/decorator/string/IsFullWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsFullWidth", "IS_FULL_WIDTH")
  @js.native
  val IS_FULL_WIDTH: /* "isFullWidth" */ String = js.native
  
  inline def IsFullWidth_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFullWidth")().asInstanceOf[PropertyDecorator]
  inline def IsFullWidth_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFullWidth")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isFullWidth(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
