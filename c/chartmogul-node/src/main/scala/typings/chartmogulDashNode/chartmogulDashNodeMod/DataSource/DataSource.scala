package typings.chartmogulDashNode.chartmogulDashNodeMod.DataSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var created_at: js.UndefOr[String] = js.undefined
  var name: String
  var status: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    name: String,
    created_at: String = null,
    status: String = null,
    system: String = null,
    uuid: String = null
  ): DataSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

