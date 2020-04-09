package typings.callbackToAsyncIterator.mod

import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("callback-to-async-iterator", "callbackToAsyncIterator")
@js.native
object callbackToAsyncIterator extends js.Object {
  def apply[T](listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], Unit]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  def apply[T](
    listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], Unit],
    options: AsyncifyOptions[T]
  ): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
}

