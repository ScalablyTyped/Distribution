package typings
package collectionsLib.sortedDashSetMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def next(): collectionsLib.Anon_Done[T]
}

object Iterator {
  @scala.inline
  def apply[T](next: () => collectionsLib.Anon_Done[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

