package typings.clone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clone", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](`val`: T): T = js.native
  def apply[T](`val`: T, circular: Boolean): T = js.native
  def apply[T](`val`: T, circular: Boolean, depth: Double): T = js.native
  /**
    * @param obj the object that you want to clone
    */
  def clonePrototype[T](obj: T): T = js.native
}

