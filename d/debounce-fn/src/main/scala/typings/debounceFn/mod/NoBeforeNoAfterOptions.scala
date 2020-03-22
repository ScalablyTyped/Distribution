package typings.debounceFn.mod

import typings.debounceFn.debounceFnBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoBeforeNoAfterOptions extends Options {
  @JSName("after")
  val after_NoBeforeNoAfterOptions: `false`
  @JSName("before")
  val before_NoBeforeNoAfterOptions: js.UndefOr[`false`] = js.undefined
}

object NoBeforeNoAfterOptions {
  @scala.inline
  def apply(after: `false`, before: `false` = null, wait: Int | Double = null): NoBeforeNoAfterOptions = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoBeforeNoAfterOptions]
  }
}

