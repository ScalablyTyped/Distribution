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
    val __obj = js.Dynamic.literal(name = name)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (status != null) __obj.updateDynamic("status")(status)
    if (system != null) __obj.updateDynamic("system")(system)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[DataSource]
  }
}

