package typings
package bunyanLib.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotatingFileStreamOptions extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var path: java.lang.String
  var period: js.UndefOr[java.lang.String] = js.undefined
}

object RotatingFileStreamOptions {
  @scala.inline
  def apply(path: java.lang.String, count: scala.Int | scala.Double = null, period: java.lang.String = null): RotatingFileStreamOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period)
    __obj.asInstanceOf[RotatingFileStreamOptions]
  }
}

