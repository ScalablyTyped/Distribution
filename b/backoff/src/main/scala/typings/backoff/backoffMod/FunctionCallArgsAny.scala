package typings.backoff.backoffMod

import typings.backoff.backoffStrings.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCallArgsAny extends js.Object {
  /**
    * Emitted each time the wrapped function invokes its callback
    * @param results: wrapped function's return values
    */
  @JSName("addListener")
  def addListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("emit")
  def emit_callback(event: callback, results: js.Array[_]): Boolean
  /**
    * Returns an array containing the last arguments passed to the completion callback
    * of the wrapped function. For example, to get the error code returned by the last
    * call, one would do the following.
    *
    * ``` js
    * var results = call.getLastResult();
    * // The error code is the first parameter of the callback.
    * var error = results[0];
    * ```
    *
    * Note that if the call was aborted, it will contain the abort error and not the
    * last error returned by the wrapped function.
    */
  def getLastResult(): js.Array[_]
  @JSName("listeners")
  def listeners_callback(event: callback): js.Array[js.Function1[/* results */ js.Array[_], Unit]]
  @JSName("on")
  def on_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("once")
  def once_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("prependListener")
  def prependListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
  @JSName("removeListener")
  def removeListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[_], Unit]): this.type
}

object FunctionCallArgsAny {
  @scala.inline
  def apply(
    addListener_callback: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
    emit_callback: (callback, js.Array[_]) => Boolean,
    getLastResult: () => js.Array[_],
    listeners_callback: callback => js.Array[js.Function1[/* results */ js.Array[_], Unit]],
    on_callback: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
    once_callback: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
    prependListener_callback: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
    prependOnceListener_callback: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny,
    removeListener_callback: (callback, js.Function1[/* results */ js.Array[_], Unit]) => FunctionCallArgsAny
  ): FunctionCallArgsAny = {
    val __obj = js.Dynamic.literal(getLastResult = js.Any.fromFunction0(getLastResult))
    __obj.updateDynamic("addListener")(js.Any.fromFunction2(addListener_callback))
    __obj.updateDynamic("emit")(js.Any.fromFunction2(emit_callback))
    __obj.updateDynamic("listeners")(js.Any.fromFunction1(listeners_callback))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_callback))
    __obj.updateDynamic("once")(js.Any.fromFunction2(once_callback))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2(prependListener_callback))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2(prependOnceListener_callback))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2(removeListener_callback))
    __obj.asInstanceOf[FunctionCallArgsAny]
  }
}

