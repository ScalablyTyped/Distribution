package typings.chartmogulNode.mod.Metrics.Customer

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
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("activity-arr")(`activity-arr`.asInstanceOf[js.Any])
    __obj.updateDynamic("activity-mrr")(`activity-mrr`.asInstanceOf[js.Any])
    __obj.updateDynamic("activity-mrr-movement")(`activity-mrr-movement`.asInstanceOf[js.Any])
    __obj.updateDynamic("currency-sign")(`currency-sign`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsActivity]
  }
}

