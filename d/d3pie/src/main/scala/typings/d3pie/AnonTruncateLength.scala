package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTruncateLength extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var truncateLength: js.UndefOr[Double] = js.undefined
}

object AnonTruncateLength {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, truncateLength: Int | Double = null): AnonTruncateLength = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (truncateLength != null) __obj.updateDynamic("truncateLength")(truncateLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTruncateLength]
  }
}

