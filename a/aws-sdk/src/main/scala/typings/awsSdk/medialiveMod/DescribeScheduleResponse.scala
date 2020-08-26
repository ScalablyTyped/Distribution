package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduleResponse extends js.Object {
  /**
    * The next token; for use in pagination.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The list of actions in the schedule.
    */
  var ScheduleActions: js.UndefOr[listOfScheduleAction] = js.native
}

object DescribeScheduleResponse {
  @scala.inline
  def apply(): DescribeScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduleResponse]
  }
  @scala.inline
  implicit class DescribeScheduleResponseOps[Self <: DescribeScheduleResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScheduleActionsVarargs(value: ScheduleAction*): Self = this.set("ScheduleActions", js.Array(value :_*))
    @scala.inline
    def setScheduleActions(value: listOfScheduleAction): Self = this.set("ScheduleActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleActions: Self = this.set("ScheduleActions", js.undefined)
  }
  
}

