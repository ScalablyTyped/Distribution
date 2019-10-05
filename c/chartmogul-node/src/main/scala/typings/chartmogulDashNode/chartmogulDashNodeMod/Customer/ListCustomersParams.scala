package typings.chartmogulDashNode.chartmogulDashNodeMod.Customer

import typings.chartmogulDashNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCustomersParams extends CursorParams {
  var data_source_uuid: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[String] = js.undefined
}

object ListCustomersParams {
  @scala.inline
  def apply(
    data_source_uuid: String = null,
    external_id: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    status: String = null,
    system: String = null
  ): ListCustomersParams = {
    val __obj = js.Dynamic.literal()
    if (data_source_uuid != null) __obj.updateDynamic("data_source_uuid")(data_source_uuid)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (system != null) __obj.updateDynamic("system")(system)
    __obj.asInstanceOf[ListCustomersParams]
  }
}

