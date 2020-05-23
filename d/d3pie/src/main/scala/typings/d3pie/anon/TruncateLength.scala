package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateLength extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var truncateLength: js.UndefOr[Double] = js.undefined
}

object TruncateLength {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, truncateLength: js.UndefOr[Double] = js.undefined): TruncateLength = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(truncateLength)) __obj.updateDynamic("truncateLength")(truncateLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateLength]
  }
}

