package typings
package cloneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clone", JSImport.Namespace)
@js.native
object cloneMod extends js.Object {
  def apply[T](`val`: T): T = js.native
  def apply[T](`val`: T, circular: scala.Boolean): T = js.native
  def apply[T](`val`: T, circular: scala.Boolean, depth: scala.Double): T = js.native
  /**
       * @param obj the object that you want to clone
       */
  def clonePrototype[T](obj: T): T = js.native
}

