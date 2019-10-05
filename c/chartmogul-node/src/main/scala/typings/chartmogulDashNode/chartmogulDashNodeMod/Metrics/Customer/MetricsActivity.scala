package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsActivity extends js.Object {
  var `activity-arr`: Double
  var `activity-mrr`: Double
  var `activity-mrr-movement`: Double
  var currency: String
  var `currency-sign`: String
  var date: String
  var description: String
  var id: Double
  var `type`: String
}

object MetricsActivity {
  @scala.inline
  def apply(
    `activity-arr`: Double,
    `activity-mrr`: Double,
    `activity-mrr-movement`: Double,
    currency: String,
    `currency-sign`: String,
    date: String,
    description: String,
    id: Double,
    `type`: String
  ): MetricsActivity = {
    val __obj = js.Dynamic.literal(currency = currency, date = date, description = description, id = id)
    __obj.updateDynamic("activity-arr")(`activity-arr`)
    __obj.updateDynamic("activity-mrr")(`activity-mrr`)
    __obj.updateDynamic("activity-mrr-movement")(`activity-mrr-movement`)
    __obj.updateDynamic("currency-sign")(`currency-sign`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MetricsActivity]
  }
}

