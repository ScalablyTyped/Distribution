package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/common/IsDefined", JSImport.Namespace)
@js.native
object isDefinedMod extends js.Object {
  val IS_DEFINED: String = js.native
  @JSName("IsDefined")
  def IsDefined_(): PropertyDecorator = js.native
  @JSName("IsDefined")
  def IsDefined_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isDefined(value: js.Any): Boolean = js.native
}

