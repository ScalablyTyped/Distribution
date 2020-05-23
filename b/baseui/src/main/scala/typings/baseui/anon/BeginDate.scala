package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDate extends js.Object {
  var beginDate: typings.std.Date
  var endDate: js.UndefOr[typings.std.Date] = js.undefined
  var id: String
}

object BeginDate {
  @scala.inline
  def apply(beginDate: typings.std.Date, id: String, endDate: typings.std.Date = null): BeginDate = {
    val __obj = js.Dynamic.literal(beginDate = beginDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDate]
  }
}

