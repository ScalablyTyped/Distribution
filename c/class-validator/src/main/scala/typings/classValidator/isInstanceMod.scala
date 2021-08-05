package typings.classValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isInstanceMod {
  
  @JSImport("class-validator/types/decorator/object/IsInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/object/IsInstance", "IS_INSTANCE")
  @js.native
  val IS_INSTANCE: /* "isInstance" */ String = js.native
  
  inline def IsInstance_(targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsInstance")(targetType.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsInstance_(
    targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any],
    validationOptions: ValidationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInstance")(targetType.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isInstance(`object`: js.Any, targetTypeConstructor: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(`object`.asInstanceOf[js.Any], targetTypeConstructor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
