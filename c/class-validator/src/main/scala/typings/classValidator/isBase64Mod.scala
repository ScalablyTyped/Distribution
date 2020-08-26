package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsBase64", JSImport.Namespace)
@js.native
object isBase64Mod extends js.Object {
  val IS_BASE64: /* "isBase64" */ String = js.native
  @JSName("IsBase64")
  def IsBase64_(): PropertyDecorator = js.native
  @JSName("IsBase64")
  def IsBase64_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isBase64(value: js.Any): Boolean = js.native
}

