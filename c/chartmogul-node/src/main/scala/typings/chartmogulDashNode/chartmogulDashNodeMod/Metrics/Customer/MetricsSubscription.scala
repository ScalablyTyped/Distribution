package typings.chartmogulDashNode.chartmogulDashNodeMod.Metrics.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsSubscription extends js.Object {
  var arr: Double
  var `billing-cycle`: String
  var `billing-cycle-count`: Double
  var currency: String
  var `currency-sign`: String
  var `end-date`: String
  var external_id: String
  var id: Double
  var mrr: Double
  var plan: String
  var quantity: Double
  var `start-date`: String
  var status: String
}

object MetricsSubscription {
  @scala.inline
  def apply(
    arr: Double,
    `billing-cycle`: String,
    `billing-cycle-count`: Double,
    currency: String,
    `currency-sign`: String,
    `end-date`: String,
    external_id: String,
    id: Double,
    mrr: Double,
    plan: String,
    quantity: Double,
    `start-date`: String,
    status: String
  ): MetricsSubscription = {
    val __obj = js.Dynamic.literal(arr = arr.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("billing-cycle")(`billing-cycle`.asInstanceOf[js.Any])
    __obj.updateDynamic("billing-cycle-count")(`billing-cycle-count`.asInstanceOf[js.Any])
    __obj.updateDynamic("currency-sign")(`currency-sign`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsSubscription]
  }
}

