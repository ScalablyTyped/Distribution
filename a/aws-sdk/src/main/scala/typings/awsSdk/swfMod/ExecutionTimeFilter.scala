package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionTimeFilter extends js.Object {
  /**
    * Specifies the latest start or close date and time to return.
    */
  var latestDate: js.UndefOr[Timestamp] = js.native
  /**
    * Specifies the oldest start or close date and time to return.
    */
  var oldestDate: Timestamp = js.native
}

object ExecutionTimeFilter {
  @scala.inline
  def apply(oldestDate: Timestamp): ExecutionTimeFilter = {
    val __obj = js.Dynamic.literal(oldestDate = oldestDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTimeFilter]
  }
  @scala.inline
  implicit class ExecutionTimeFilterOps[Self <: ExecutionTimeFilter] (val x: Self) extends AnyVal {
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
    def setOldestDate(value: Timestamp): Self = this.set("oldestDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestDate(value: Timestamp): Self = this.set("latestDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestDate: Self = this.set("latestDate", js.undefined)
  }
  
}

