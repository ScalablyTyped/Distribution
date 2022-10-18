package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsAsciiMod {
  
  @JSImport("class-validator/types/decorator/string/IsAscii", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsAscii", "IS_ASCII")
  @js.native
  val IS_ASCII: /* "isAscii" */ String = js.native
  
  inline def IsAscii_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAscii")().asInstanceOf[PropertyDecorator]
  inline def IsAscii_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAscii")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isAscii(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
