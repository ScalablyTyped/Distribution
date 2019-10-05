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
    val __obj = js.Dynamic.literal(arr = arr, currency = currency, external_id = external_id, id = id, mrr = mrr, plan = plan, quantity = quantity, status = status)
    __obj.updateDynamic("billing-cycle")(`billing-cycle`)
    __obj.updateDynamic("billing-cycle-count")(`billing-cycle-count`)
    __obj.updateDynamic("currency-sign")(`currency-sign`)
    __obj.updateDynamic("end-date")(`end-date`)
    __obj.updateDynamic("start-date")(`start-date`)
    __obj.asInstanceOf[MetricsSubscription]
  }
}

