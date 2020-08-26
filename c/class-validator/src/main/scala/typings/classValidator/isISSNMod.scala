package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsISSNOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsISSN", JSImport.Namespace)
@js.native
object isISSNMod extends js.Object {
  val IS_ISSN: /* "isISSN" */ String = js.native
  @JSName("IsISSN")
  def IsISSN_(): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: IsISSNOptions): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: IsISSNOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isISSN(value: js.Any): Boolean = js.native
  def isISSN(value: js.Any, options: IsISSNOptions): Boolean = js.native
}

