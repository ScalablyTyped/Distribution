package typings.chartmogulDashNode.chartmogulDashNodeMod.Subscription

import typings.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var cancellation_dates: Strings
  var customer_uuid: String
  var data_source_uuid: String
  var external_id: String
  var plan_uuid: String
  var uuid: String
}

object Subscription {
  @scala.inline
  def apply(
    cancellation_dates: Strings,
    customer_uuid: String,
    data_source_uuid: String,
    external_id: String,
    plan_uuid: String,
    uuid: String
  ): Subscription = {
    val __obj = js.Dynamic.literal(cancellation_dates = cancellation_dates.asInstanceOf[js.Any], customer_uuid = customer_uuid.asInstanceOf[js.Any], data_source_uuid = data_source_uuid.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], plan_uuid = plan_uuid.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Subscription]
  }
}

