package typings.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("code", "expect")
@js.native
object expect extends js.Object {
  def apply[T](value: T): AssertionChain[T] = js.native
  def apply[T](value: T, prefix: String): AssertionChain[T] = js.native
  def apply[T](value: js.Array[T]): AssertionChain[T] = js.native
  def apply[T](value: js.Array[T], prefix: String): AssertionChain[T] = js.native
}

