package typings.chartmogulDashNode.chartmogulDashNodeMod.Plan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plan extends js.Object {
  var data_source_uuid: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var interval_count: js.UndefOr[Double] = js.undefined
  var interval_unit: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object Plan {
  @scala.inline
  def apply(
    data_source_uuid: String = null,
    external_id: String = null,
    interval_count: Int | Double = null,
    interval_unit: String = null,
    name: String = null,
    uuid: String = null
  ): Plan = {
    val __obj = js.Dynamic.literal()
    if (data_source_uuid != null) __obj.updateDynamic("data_source_uuid")(data_source_uuid)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (interval_count != null) __obj.updateDynamic("interval_count")(interval_count.asInstanceOf[js.Any])
    if (interval_unit != null) __obj.updateDynamic("interval_unit")(interval_unit)
    if (name != null) __obj.updateDynamic("name")(name)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Plan]
  }
}

