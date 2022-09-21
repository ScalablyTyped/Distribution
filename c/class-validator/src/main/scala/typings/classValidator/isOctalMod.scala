package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isOctalMod {
  
  @JSImport("class-validator/types/decorator/string/IsOctal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsOctal", "IS_OCTAL")
  @js.native
  val IS_OCTAL: /* "isOctal" */ String = js.native
  
  inline def IsOctal_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOctal")().asInstanceOf[PropertyDecorator]
  inline def IsOctal_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOctal")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isOctal(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOctal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
