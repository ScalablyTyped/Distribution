package typings.bintrees.bintreesMod

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
  def apply[T](data: () => T, next: () => T, prev: () => T): Iterator[T] = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

