package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateIfMod {
  
  @JSImport("class-validator/types/decorator/common/ValidateIf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ValidateIf(condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateIf")(condition.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ValidateIf(
    condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean],
    validationOptions: ValidationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateIf")(condition.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
}
