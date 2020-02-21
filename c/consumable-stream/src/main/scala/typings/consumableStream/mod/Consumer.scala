package typings.consumableStream.mod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer[T] extends js.Object {
  def next(): js.Promise[IteratorResult[T, _]]
  def `return`(): Unit
}

object Consumer {
  @scala.inline
  def apply[T](next: () => js.Promise[IteratorResult[T, _]], `return`: () => Unit): Consumer[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
    __obj.asInstanceOf[Consumer[T]]
  }
}

