package typings.bunyan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotatingFileStreamOptions extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var path: String
  var period: js.UndefOr[String] = js.undefined
}

object RotatingFileStreamOptions {
  @scala.inline
  def apply(path: String, count: js.UndefOr[Double] = js.undefined, period: String = null): RotatingFileStreamOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotatingFileStreamOptions]
  }
}

