package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/common/IsLatitude", JSImport.Namespace)
@js.native
object isLatitudeMod extends js.Object {
  val IS_LATITUDE: /* "isLatitude" */ String = js.native
  @JSName("IsLatitude")
  def IsLatitude_(): PropertyDecorator = js.native
  @JSName("IsLatitude")
  def IsLatitude_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isLatitude(value: String): Boolean = js.native
}

