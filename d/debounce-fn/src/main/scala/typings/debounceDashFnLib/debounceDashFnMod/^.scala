package typings
package debounceDashFnLib.debounceDashFnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debounce-fn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  [Debounce](https://davidwalsh.name/javascript-debounce-function) a function.
  @param input - Function to debounce.
  @returns A debounced function that delays calling the `input` function until after `wait` milliseconds have elapsed since the last time the debounced function was called.
  It comes with a `.cancel()` method to cancel any scheduled `input` function calls.
  @example
  ```
  import debounceFn = require('debounce-fn');
  window.onresize = debounceFn(() => {
  	// Do something on window resize
  }, {wait: 100});
  ```
  */
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType]): (js.Function1[/* arguments */ ArgumentsType, js.UndefOr[ReturnType]]) with debounceDashFnLib.Anon_Cancel = js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](
    input: js.Function1[/* arguments */ ArgumentsType, ReturnType],
    options: debounceDashFnLib.debounceDashFnMod.debounceNs.Options
  ): (js.Function1[/* arguments */ ArgumentsType, js.UndefOr[ReturnType]]) with debounceDashFnLib.Anon_Cancel = js.native
}

