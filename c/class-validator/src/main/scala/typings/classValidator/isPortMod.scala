package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsPort", JSImport.Namespace)
@js.native
object isPortMod extends js.Object {
  val IS_PORT: /* "isPort" */ String = js.native
  @JSName("IsPort")
  def IsPort_(): PropertyDecorator = js.native
  @JSName("IsPort")
  def IsPort_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isPort(value: js.Any): Boolean = js.native
}

