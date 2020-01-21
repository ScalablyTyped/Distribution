package typings.chartmogulNode.mod.Plan

import typings.chartmogulNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPlansParams extends CursorParams {
  var data_source_uuid: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[String] = js.undefined
}

object ListPlansParams {
  @scala.inline
  def apply(
    data_source_uuid: String = null,
    external_id: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    system: String = null
  ): ListPlansParams = {
    val __obj = js.Dynamic.literal()
    if (data_source_uuid != null) __obj.updateDynamic("data_source_uuid")(data_source_uuid.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlansParams]
  }
}

