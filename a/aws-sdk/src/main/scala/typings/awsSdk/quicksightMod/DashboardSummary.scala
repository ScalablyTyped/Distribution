package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The time that this dashboard was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * Dashboard ID.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The last time that this dashboard was published.
    */
  var LastPublishedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The last time that this dashboard was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * A display name for the dashboard.
    */
  var Name: js.UndefOr[DashboardName] = js.native
  /**
    * Published version number.
    */
  var PublishedVersionNumber: js.UndefOr[VersionNumber] = js.native
}

object DashboardSummary {
  @scala.inline
  def apply(): DashboardSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardSummary]
  }
  @scala.inline
  implicit class DashboardSummaryOps[Self <: DashboardSummary] (val x: Self) extends AnyVal {
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
    def setPublishedVersionNumber(value: VersionNumber): Self = this.set("PublishedVersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedVersionNumber: Self = this.set("PublishedVersionNumber", js.undefined)
  }
  
}

