package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsNoInterval extends js.Object {
  var `end-date`: String
  var geo: js.UndefOr[String] = js.undefined
  var plans: js.UndefOr[String] = js.undefined
  var `start-date`: String
}

object ParamsNoInterval {
  @scala.inline
  def apply(`end-date`: String, `start-date`: String, geo: String = null, plans: String = null): ParamsNoInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end-date")(`end-date`)
    __obj.updateDynamic("start-date")(`start-date`)
    if (geo != null) __obj.updateDynamic("geo")(geo)
    if (plans != null) __obj.updateDynamic("plans")(plans)
    __obj.asInstanceOf[ParamsNoInterval]
  }
}

