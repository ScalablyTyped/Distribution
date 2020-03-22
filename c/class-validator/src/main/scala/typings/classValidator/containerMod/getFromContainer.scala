package typings.classValidator.containerMod

import typings.classValidator.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/container", "getFromContainer")
@js.native
object getFromContainer extends js.Object {
  def apply[T](someClass: js.Function): T = js.native
  def apply[T](someClass: AnonInstantiable[T]): T = js.native
}

