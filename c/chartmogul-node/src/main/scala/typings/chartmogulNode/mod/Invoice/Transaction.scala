package typings.chartmogulNode.mod.Invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var result: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    date: String = null,
    external_id: String = null,
    result: String = null,
    `type`: String = null,
    uuid: String = null
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

