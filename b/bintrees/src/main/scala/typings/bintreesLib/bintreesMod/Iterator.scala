package typings
package bintreesLib.bintreesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def data(): T
  def next(): T
  def prev(): T
}

object Iterator {
  @scala.inline
  def apply[T](data: js.Function0[T], next: js.Function0[T], prev: js.Function0[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Iterator[T]]
  }
}

