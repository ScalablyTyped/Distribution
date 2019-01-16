package typings
package debounceDashFnLib.debounceDashFnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debounce-fn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a debounced function that delays calling the `input` function until after `wait` milliseconds
    * have elapsed since the last time the debounced function was called.
    *
    * It comes with a `.cancel()` method to cancel any scheduled `input` function calls.
    */
  def apply[TArgs /* <: js.Array[_] */, TResult](input: js.Function1[/* args */ TArgs, TResult]): (js.Function1[/* args */ TArgs, js.UndefOr[TResult]]) with debounceDashFnLib.Anon_Cancel = js.native
  def apply[TArgs /* <: js.Array[_] */, TResult](
    input: js.Function1[/* args */ TArgs, TResult],
    options: debounceDashFnLib.debounceDashFnMod.debounceNs.Options
  ): (js.Function1[/* args */ TArgs, js.UndefOr[TResult]]) with debounceDashFnLib.Anon_Cancel = js.native
}

