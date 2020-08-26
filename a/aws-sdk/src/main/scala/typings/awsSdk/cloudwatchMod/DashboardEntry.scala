package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardArn] = js.native
  /**
    * The name of the dashboard.
    */
  var DashboardName: js.UndefOr[typings.awsSdk.cloudwatchMod.DashboardName] = js.native
  /**
    * The time stamp of when the dashboard was last modified, either by an API call or through the console. This number is expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var LastModified: js.UndefOr[typings.awsSdk.cloudwatchMod.LastModified] = js.native
  /**
    * The size of the dashboard, in bytes.
    */
  var Size: js.UndefOr[typings.awsSdk.cloudwatchMod.Size] = js.native
}

object DashboardEntry {
  @scala.inline
  def apply(): DashboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardEntry]
  }
  @scala.inline
  implicit class DashboardEntryOps[Self <: DashboardEntry] (val x: Self) extends AnyVal {
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
    def setDashboardArn(value: DashboardArn): Self = this.set("DashboardArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardArn: Self = this.set("DashboardArn", js.undefined)
    @scala.inline
    def setDashboardName(value: DashboardName): Self = this.set("DashboardName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardName: Self = this.set("DashboardName", js.undefined)
    @scala.inline
    def setLastModified(value: LastModified): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
  
}

