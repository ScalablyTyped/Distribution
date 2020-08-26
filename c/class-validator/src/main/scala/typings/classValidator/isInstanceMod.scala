package typings.classValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/object/IsInstance", JSImport.Namespace)
@js.native
object isInstanceMod extends js.Object {
  val IS_INSTANCE: /* "isInstance" */ String = js.native
  @JSName("IsInstance")
  def IsInstance_(targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any]): PropertyDecorator = js.native
  @JSName("IsInstance")
  def IsInstance_(
    targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  def isInstance(`object`: js.Any, targetTypeConstructor: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Boolean = js.native
}

