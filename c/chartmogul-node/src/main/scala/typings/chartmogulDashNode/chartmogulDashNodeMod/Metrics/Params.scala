package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends ParamsNoInterval {
  var interval: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    `end-date`: String,
    `start-date`: String,
    geo: String = null,
    interval: String = null,
    plans: String = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (plans != null) __obj.updateDynamic("plans")(plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

