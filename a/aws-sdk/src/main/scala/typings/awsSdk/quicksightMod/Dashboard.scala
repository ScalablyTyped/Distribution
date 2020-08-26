package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dashboard extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * Dashboard ID.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The last time that this dataset was published.
    */
  var LastPublishedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * A display name for the dashboard.
    */
  var Name: js.UndefOr[DashboardName] = js.native
  /**
    * Version.
    */
  var Version: js.UndefOr[DashboardVersion] = js.native
}

object Dashboard {
  @scala.inline
  def apply(): Dashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dashboard]
  }
  @scala.inline
  implicit class DashboardOps[Self <: Dashboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = this.set("DashboardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardId: Self = this.set("DashboardId", js.undefined)
    @scala.inline
    def setLastPublishedTime(value: Timestamp_): Self = this.set("LastPublishedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPublishedTime: Self = this.set("LastPublishedTime", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setName(value: DashboardName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setVersion(value: DashboardVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

