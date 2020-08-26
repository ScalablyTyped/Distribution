package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/typechecker/IsBoolean", JSImport.Namespace)
@js.native
object isBooleanMod extends js.Object {
  val IS_BOOLEAN: /* "isBoolean" */ String = js.native
  @JSName("IsBoolean")
  def IsBoolean_(): PropertyDecorator = js.native
  @JSName("IsBoolean")
  def IsBoolean_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isBoolean(value: js.Any): Boolean = js.native
}

