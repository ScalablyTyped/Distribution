package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDashboardsInput extends js.Object {
  /**
    * The dashboards to be deleted. This parameter is required.
    */
  var DashboardNames: typings.awsSdk.cloudwatchMod.DashboardNames = js.native
}

object DeleteDashboardsInput {
  @scala.inline
  def apply(DashboardNames: DashboardNames): DeleteDashboardsInput = {
    val __obj = js.Dynamic.literal(DashboardNames = DashboardNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDashboardsInput]
  }
  @scala.inline
  implicit class DeleteDashboardsInputOps[Self <: DeleteDashboardsInput] (val x: Self) extends AnyVal {
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
    def setDashboardNamesVarargs(value: DashboardName*): Self = this.set("DashboardNames", js.Array(value :_*))
    @scala.inline
    def setDashboardNames(value: DashboardNames): Self = this.set("DashboardNames", value.asInstanceOf[js.Any])
  }
  
}

