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
    __obj.updateDynamic("end-date")(`end-date`)
    __obj.updateDynamic("start-date")(`start-date`)
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (plans != null) __obj.updateDynamic("plans")(plans)
    __obj.asInstanceOf[Params]
  }
}

