package typings.bunyan.bunyanMod

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
  def apply(path: String, count: Int | Double = null, period: String = null): RotatingFileStreamOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotatingFileStreamOptions]
  }
}

