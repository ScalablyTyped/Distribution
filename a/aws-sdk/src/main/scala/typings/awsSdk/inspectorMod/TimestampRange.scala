package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampRange extends js.Object {
  /**
    * The minimum value of the timestamp range.
    */
  var beginDate: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum value of the timestamp range.
    */
  var endDate: js.UndefOr[Timestamp] = js.native
}

object TimestampRange {
  @scala.inline
  def apply(): TimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampRange]
  }
  @scala.inline
  implicit class TimestampRangeOps[Self <: TimestampRange] (val x: Self) extends AnyVal {
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
    def setBeginDate(value: Timestamp): Self = this.set("beginDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginDate: Self = this.set("beginDate", js.undefined)
    @scala.inline
    def setEndDate(value: Timestamp): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
  }
  
}

