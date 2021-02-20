package typings.classValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isInstanceMod {
  
  @JSImport("class-validator/types/decorator/object/IsInstance", "IS_INSTANCE")
  @js.native
  val IS_INSTANCE: /* "isInstance" */ String = js.native
  
  @JSImport("class-validator/types/decorator/object/IsInstance", "IsInstance")
  @js.native
  def IsInstance_(targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any]): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/object/IsInstance", "IsInstance")
  @js.native
  def IsInstance_(
    targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/object/IsInstance", "isInstance")
  @js.native
  def isInstance(`object`: js.Any, targetTypeConstructor: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Boolean = js.native
}
