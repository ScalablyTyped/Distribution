package typings
package debounceDashFnLib.debounceDashFnMod.debounceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Trigger the function on the leading edge instead of the trailing edge of the `wait` interval.
    * For example, can be useful for preventing accidental double-clicks on a "submit" button
    * from firing a second time.
    */
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Time to wait until the `input` function is called.
    * @default 0
    */
  @JSName("wait")
  var wait_FOptions: js.UndefOr[scala.Double] = js.undefined
}

