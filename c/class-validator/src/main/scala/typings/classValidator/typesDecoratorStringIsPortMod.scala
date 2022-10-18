package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsPortMod {
  
  @JSImport("class-validator/types/decorator/string/IsPort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsPort", "IS_PORT")
  @js.native
  val IS_PORT: /* "isPort" */ String = js.native
  
  inline def IsPort_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPort")().asInstanceOf[PropertyDecorator]
  inline def IsPort_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPort")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isPort(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPort")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
