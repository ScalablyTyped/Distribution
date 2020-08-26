package typings.chartmogulNode.mod.Metrics.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsActivity extends js.Object {
  var `activity-arr`: Double = js.native
  var `activity-mrr`: Double = js.native
  var `activity-mrr-movement`: Double = js.native
  var currency: String = js.native
  var `currency-sign`: String = js.native
  var date: String = js.native
  var description: String = js.native
  var id: Double = js.native
  var `type`: String = js.native
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
  @scala.inline
  implicit class MetricsActivityOps[Self <: MetricsActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setActivity-arr`(value: Double): Self = this.set("activity-arr", value.asInstanceOf[js.Any])
    @scala.inline
    def `setActivity-mrr`(value: Double): Self = this.set("activity-mrr", value.asInstanceOf[js.Any])
    @scala.inline
    def `setActivity-mrr-movement`(value: Double): Self = this.set("activity-mrr-movement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCurrency-sign`(value: String): Self = this.set("currency-sign", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

