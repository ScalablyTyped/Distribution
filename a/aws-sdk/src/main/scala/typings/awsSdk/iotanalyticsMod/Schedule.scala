package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    * The expression that defines when to trigger an update. For more information, see  Schedule Expressions for Rules in the Amazon CloudWatch Events User Guide.
    */
  var expression: js.UndefOr[ScheduleExpression] = js.native
}

object Schedule {
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
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
    def setExpression(value: ScheduleExpression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
  }
  
}

