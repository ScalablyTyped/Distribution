package typings.chartmogulNode.mod.Customer

import typings.chartmogulNode.commonMod.CursorParams
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
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    status: String = null,
    system: String = null
  ): ListCustomersParams = {
    val __obj = js.Dynamic.literal()
    if (data_source_uuid != null) __obj.updateDynamic("data_source_uuid")(data_source_uuid.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomersParams]
  }
}

