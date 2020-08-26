package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/typechecker/IsEnum", JSImport.Namespace)
@js.native
object isEnumMod extends js.Object {
  val IS_ENUM: /* "isEnum" */ String = js.native
  @JSName("IsEnum")
  def IsEnum_(entity: js.Object): PropertyDecorator = js.native
  @JSName("IsEnum")
  def IsEnum_(entity: js.Object, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isEnum(value: js.Any, entity: js.Any): Boolean = js.native
}

