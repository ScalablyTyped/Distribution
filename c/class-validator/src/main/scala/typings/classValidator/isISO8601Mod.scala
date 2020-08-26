package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import typings.validator.mod.validator.IsISO8601Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsISO8601", JSImport.Namespace)
@js.native
object isISO8601Mod extends js.Object {
  val IS_ISO8601: /* "isIso8601" */ String = js.native
  @JSName("IsISO8601")
  def IsISO8601_(): PropertyDecorator = js.native
  @JSName("IsISO8601")
  def IsISO8601_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISO8601")
  def IsISO8601_(options: IsISO8601Options): PropertyDecorator = js.native
  @JSName("IsISO8601")
  def IsISO8601_(options: IsISO8601Options, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isISO8601(value: js.Any): Boolean = js.native
  def isISO8601(value: js.Any, options: IsISO8601Options): Boolean = js.native
}

