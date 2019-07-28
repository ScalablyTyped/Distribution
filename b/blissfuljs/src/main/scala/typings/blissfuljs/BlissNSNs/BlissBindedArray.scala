package typings.blissfuljs.BlissNSNs

import typings.blissfuljs.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissBindedArray[T] extends js.Object {
  def all(method: String, args: js.Any*): Array[_] = js.native
  @JSName("all")
  def all_T[T](method: String, args: js.Any*): Array[T] = js.native
}

