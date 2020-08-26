package typings.classValidator.containerMod

import typings.classValidator.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/container", "getFromContainer")
@js.native
object getFromContainer extends js.Object {
  def apply[T](someClass: js.Function): T = js.native
  def apply[T](someClass: Instantiable[T]): T = js.native
}

