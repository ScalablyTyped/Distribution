package typings.backo2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  min  :number,   max  :number,   jitter  :number,   factor  :number}> */
trait BackoffOptions extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var jitter: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object BackoffOptions {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    jitter: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (jitter != null) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
}

