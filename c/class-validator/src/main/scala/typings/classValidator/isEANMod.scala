package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsEAN", JSImport.Namespace)
@js.native
object isEANMod extends js.Object {
  val IS_EAN: /* "isEAN" */ String = js.native
  @JSName("IsEAN")
  def IsEAN_(): PropertyDecorator = js.native
  @JSName("IsEAN")
  def IsEAN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isEAN(value: js.Any): Boolean = js.native
}

