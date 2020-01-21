package typings.bootstrapValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorOptions extends js.Object {
  var custom: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var feedback: js.UndefOr[js.Any] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    custom: js.Any = null,
    delay: Int | Double = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    feedback: js.Any = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (feedback != null) __obj.updateDynamic("feedback")(feedback.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorOptions]
  }
}

