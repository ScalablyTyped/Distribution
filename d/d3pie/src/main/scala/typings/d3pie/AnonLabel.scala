package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AnonLabel {
  @scala.inline
  def apply(label: String = null, percentage: Int | Double = null, value: Int | Double = null): AnonLabel = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

