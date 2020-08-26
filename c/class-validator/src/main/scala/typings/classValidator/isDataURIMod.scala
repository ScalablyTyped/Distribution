package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsDataURI", JSImport.Namespace)
@js.native
object isDataURIMod extends js.Object {
  val IS_DATA_URI: /* "isDataURI" */ String = js.native
  @JSName("IsDataURI")
  def IsDataURI_(): PropertyDecorator = js.native
  @JSName("IsDataURI")
  def IsDataURI_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isDataURI(value: js.Any): Boolean = js.native
}

