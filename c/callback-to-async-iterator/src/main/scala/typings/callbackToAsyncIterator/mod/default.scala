package typings.callbackToAsyncIterator.mod

import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("callback-to-async-iterator", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[T, R](listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], js.Promise[R]]): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  def apply[T, R](
    listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], js.Promise[R]],
    options: AsyncifyOptions[T, R]
  ): AsyncIterator[T, _, js.UndefOr[scala.Nothing]] = js.native
}
