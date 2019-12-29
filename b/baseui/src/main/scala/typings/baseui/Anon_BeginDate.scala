package typings.baseui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeginDate extends js.Object {
  var beginDate: Date
  var endDate: js.UndefOr[Date] = js.undefined
  var id: String
}

object Anon_BeginDate {
  @scala.inline
  def apply(beginDate: Date, id: String, endDate: Date = null): Anon_BeginDate = {
    val __obj = js.Dynamic.literal(beginDate = beginDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BeginDate]
  }
}

