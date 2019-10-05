package typings.chartmogulDashNode.chartmogulDashNodeMod.Transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var date: String
  var external_id: js.UndefOr[String] = js.undefined
  var result: String
  var `type`: String
  var uuid: js.UndefOr[String] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(date: String, result: String, `type`: String, external_id: String = null, uuid: String = null): Transaction = {
    val __obj = js.Dynamic.literal(date = date, result = result)
    __obj.updateDynamic("type")(`type`)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Transaction]
  }
}

