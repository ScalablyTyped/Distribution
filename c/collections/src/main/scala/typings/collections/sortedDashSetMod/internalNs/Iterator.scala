package typings.collections.sortedDashSetMod.internalNs

import typings.collections.Anon_Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def next(): Anon_Done[T]
}

object Iterator {
  @scala.inline
  def apply[T](next: () => Anon_Done[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

