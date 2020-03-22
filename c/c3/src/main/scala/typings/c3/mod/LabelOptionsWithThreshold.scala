package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptionsWithThreshold extends LabelOptions {
  var ratio: js.UndefOr[js.Any] = js.undefined
  /**
    * Set threshold to show/hide labels.
    * Defaults to `0.05`.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}

object LabelOptionsWithThreshold {
  @scala.inline
  def apply(
    format: (/* value */ Double, /* ratio */ Double, /* id */ String) => String | Double = null,
    ratio: js.Any = null,
    show: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null
  ): LabelOptionsWithThreshold = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptionsWithThreshold]
  }
}

