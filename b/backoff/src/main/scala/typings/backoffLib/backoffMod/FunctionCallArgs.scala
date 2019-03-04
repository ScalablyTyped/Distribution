package typings
package backoffLib.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCallArgs[E, R1, R2, R3] extends js.Object {
  /**
    * Emitted each time the wrapped function invokes its callback
    * @param results: wrapped function's return values
    */
  @JSName("addListener")
  def addListener_callback(
    event: backoffLib.backoffLibStrings.callback,
    listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]
  ): this.type
  @JSName("emit")
  def emit_callback(event: backoffLib.backoffLibStrings.callback, results: js.Tuple4[E, R1, R2, R3]): scala.Boolean
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
  def getLastResult(): js.Tuple4[E, R1, R2, R3]
  @JSName("listeners")
  def listeners_callback(event: backoffLib.backoffLibStrings.callback): js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]]
  @JSName("on")
  def on_callback(
    event: backoffLib.backoffLibStrings.callback,
    listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]
  ): this.type
  @JSName("once")
  def once_callback(
    event: backoffLib.backoffLibStrings.callback,
    listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]
  ): this.type
  @JSName("prependListener")
  def prependListener_callback(
    event: backoffLib.backoffLibStrings.callback,
    listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]
  ): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_callback(
    event: backoffLib.backoffLibStrings.callback,
    listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]
  ): this.type
  @JSName("removeListener")
  def removeListener_callback(
    event: backoffLib.backoffLibStrings.callback,
    listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]
  ): this.type
}

object FunctionCallArgs {
  @scala.inline
  def apply[E, R1, R2, R3](
    addListener_callback: js.Function2[
      backoffLib.backoffLibStrings.callback, 
      js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit], 
      FunctionCallArgs[E, R1, R2, R3]
    ],
    emit_callback: js.Function2[backoffLib.backoffLibStrings.callback, js.Tuple4[E, R1, R2, R3], scala.Boolean],
    getLastResult: js.Function0[js.Tuple4[E, R1, R2, R3]],
    listeners_callback: js.Function1[
      backoffLib.backoffLibStrings.callback, 
      js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit]]
    ],
    on_callback: js.Function2[
      backoffLib.backoffLibStrings.callback, 
      js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit], 
      FunctionCallArgs[E, R1, R2, R3]
    ],
    once_callback: js.Function2[
      backoffLib.backoffLibStrings.callback, 
      js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit], 
      FunctionCallArgs[E, R1, R2, R3]
    ],
    prependListener_callback: js.Function2[
      backoffLib.backoffLibStrings.callback, 
      js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit], 
      FunctionCallArgs[E, R1, R2, R3]
    ],
    prependOnceListener_callback: js.Function2[
      backoffLib.backoffLibStrings.callback, 
      js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit], 
      FunctionCallArgs[E, R1, R2, R3]
    ],
    removeListener_callback: js.Function2[
      backoffLib.backoffLibStrings.callback, 
      js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], scala.Unit], 
      FunctionCallArgs[E, R1, R2, R3]
    ]
  ): FunctionCallArgs[E, R1, R2, R3] = {
    val __obj = js.Dynamic.literal(getLastResult = getLastResult)
    __obj.updateDynamic("addListener")(addListener_callback)
    __obj.updateDynamic("emit")(emit_callback)
    __obj.updateDynamic("listeners")(listeners_callback)
    __obj.updateDynamic("on")(on_callback)
    __obj.updateDynamic("once")(once_callback)
    __obj.updateDynamic("prependListener")(prependListener_callback)
    __obj.updateDynamic("prependOnceListener")(prependOnceListener_callback)
    __obj.updateDynamic("removeListener")(removeListener_callback)
    __obj.asInstanceOf[FunctionCallArgs[E, R1, R2, R3]]
  }
}

