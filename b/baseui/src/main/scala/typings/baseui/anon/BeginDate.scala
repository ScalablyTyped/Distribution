package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginDate extends js.Object {
  var beginDate: typings.std.Date = js.native
  var endDate: js.UndefOr[typings.std.Date] = js.native
  var id: String = js.native
}

object BeginDate {
  @scala.inline
  def apply(beginDate: typings.std.Date, id: String): BeginDate = {
    val __obj = js.Dynamic.literal(beginDate = beginDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDate]
  }
  @scala.inline
  implicit class BeginDateOps[Self <: BeginDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeginDate(value: typings.std.Date): Self = this.set("beginDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: typings.std.Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
  }
  
}

