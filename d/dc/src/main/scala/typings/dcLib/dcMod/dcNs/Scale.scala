package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale[T] extends js.Object {
  def apply(x: js.Any): T = js.native
  def domain(): js.Array[_] = js.native
  def domain(values: js.Array[_]): Scale[T] = js.native
  def range(): js.Array[T] = js.native
  def range(values: js.Array[T]): Scale[T] = js.native
}

