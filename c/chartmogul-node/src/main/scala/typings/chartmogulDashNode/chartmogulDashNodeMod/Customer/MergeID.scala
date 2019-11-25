package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeID extends js.Object {
  var customer_uuid: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
}

object MergeID {
  @scala.inline
  def apply(customer_uuid: String = null, external_id: String = null): MergeID = {
    val __obj = js.Dynamic.literal()
    if (customer_uuid != null) __obj.updateDynamic("customer_uuid")(customer_uuid.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeID]
  }
}

