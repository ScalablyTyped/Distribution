package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeSetSummaryListItem extends js.Object {
  /**
    * The ARN associated with the unique identifier for the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for a change set.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
  /**
    * The non-unique name for the change set.
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetName] = js.native
  /**
    * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
    */
  var EndTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.
    */
  var EntityIdList: js.UndefOr[ResourceIdList] = js.native
  /**
    * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
    */
  var StartTime: js.UndefOr[DateTimeISO8601] = js.native
  /**
    * The current status of the change set.
    */
  var Status: js.UndefOr[ChangeStatus] = js.native
}

object ChangeSetSummaryListItem {
  @scala.inline
  def apply(): ChangeSetSummaryListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetSummaryListItem]
  }
  @scala.inline
  implicit class ChangeSetSummaryListItemOps[Self <: ChangeSetSummaryListItem] (val x: Self) extends AnyVal {
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
    def setChangeSetArn(value: ARN): Self = this.set("ChangeSetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetArn: Self = this.set("ChangeSetArn", js.undefined)
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeSetName: Self = this.set("ChangeSetName", js.undefined)
    @scala.inline
    def setEndTime(value: DateTimeISO8601): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setEntityIdListVarargs(value: ResourceId*): Self = this.set("EntityIdList", js.Array(value :_*))
    @scala.inline
    def setEntityIdList(value: ResourceIdList): Self = this.set("EntityIdList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityIdList: Self = this.set("EntityIdList", js.undefined)
    @scala.inline
    def setStartTime(value: DateTimeISO8601): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: ChangeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

