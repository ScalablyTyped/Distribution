package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsIBANMod {
  
  @JSImport("class-validator/types/decorator/string/IsIBAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsIBAN", "IS_IBAN")
  @js.native
  val IS_IBAN: /* "isIBAN" */ String = js.native
  
  inline def IsIBAN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIBAN")().asInstanceOf[PropertyDecorator]
  inline def IsIBAN_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIBAN")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isIBAN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIBAN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
