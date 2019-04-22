package typings
package debounceDashFnLib.debounceDashFnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Trigger the function on the leading edge instead of the trailing edge of the `wait` interval. For example, can be useful for preventing accidental double-clicks on a "submit" button from firing a second time.
  		@default false
  		*/
  val immediate: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Time to wait until the `input` function is called.
  		@default 0
  		*/
  @JSName("wait")
  val wait_FOptions: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(immediate: js.UndefOr[scala.Boolean] = js.undefined, wait: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

