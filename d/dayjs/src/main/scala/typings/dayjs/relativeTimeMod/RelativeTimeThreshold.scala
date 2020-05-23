package typings.dayjs.relativeTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeThreshold extends js.Object {
  var d: js.UndefOr[String] = js.undefined
  var l: String
  var r: js.UndefOr[Double] = js.undefined
}

object RelativeTimeThreshold {
  @scala.inline
  def apply(l: String, d: String = null, r: js.UndefOr[Double] = js.undefined): RelativeTimeThreshold = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeThreshold]
  }
}

