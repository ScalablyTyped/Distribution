package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MRRChurnRate_ extends js.Object {
  var date: String
  var `mrr-churn-rate`: Double
}

object MRRChurnRate_ {
  @scala.inline
  def apply(date: String, `mrr-churn-rate`: Double): MRRChurnRate_ = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRRChurnRate_]
  }
}

