package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsMimeType", JSImport.Namespace)
@js.native
object isMimeTypeMod extends js.Object {
  val IS_MIME_TYPE: /* "isMimeType" */ String = js.native
  @JSName("IsMimeType")
  def IsMimeType_(): PropertyDecorator = js.native
  @JSName("IsMimeType")
  def IsMimeType_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isMimeType(value: js.Any): Boolean = js.native
}

