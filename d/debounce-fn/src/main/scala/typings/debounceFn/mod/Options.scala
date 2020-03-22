package typings.debounceFn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Trigger the function on the trailing edge of the `wait` interval.
  		@default true
  		*/
  val after: js.UndefOr[Boolean] = js.undefined
  /**
  		Trigger the function on the leading edge of the `wait` interval.
  		For example, this can be useful for preventing accidental double-clicks on a "submit" button from firing a second time.
  		@default false
  		*/
  val before: js.UndefOr[Boolean] = js.undefined
  /**
  		Time to wait until the `input` function is called.
  		@default 0
  		*/
  @JSName("wait")
  val wait_FOptions: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    after: js.UndefOr[Boolean] = js.undefined,
    before: js.UndefOr[Boolean] = js.undefined,
    wait: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(after)) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

