package typings.chartmogulNode.mod.Transaction

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
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

