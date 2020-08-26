package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/decorator/string/IsSemVer", JSImport.Namespace)
@js.native
object isSemVerMod extends js.Object {
  val IS_SEM_VER: /* "isSemVer" */ String = js.native
  @JSName("IsSemVer")
  def IsSemVer_(): PropertyDecorator = js.native
  @JSName("IsSemVer")
  def IsSemVer_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def isSemVer(value: js.Any): Boolean = js.native
}

