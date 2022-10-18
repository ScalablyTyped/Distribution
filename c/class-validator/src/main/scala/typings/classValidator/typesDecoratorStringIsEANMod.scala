package typings.classValidator

import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsEANMod {
  
  @JSImport("class-validator/types/decorator/string/IsEAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsEAN", "IS_EAN")
  @js.native
  val IS_EAN: /* "isEAN" */ String = js.native
  
  inline def IsEAN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEAN")().asInstanceOf[PropertyDecorator]
  inline def IsEAN_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEAN")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isEAN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEAN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
