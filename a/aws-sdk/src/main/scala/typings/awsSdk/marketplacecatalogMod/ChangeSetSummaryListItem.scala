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
  def apply(
    ChangeSetArn: ARN = null,
    ChangeSetId: ResourceId = null,
    ChangeSetName: ChangeSetName = null,
    EndTime: DateTimeISO8601 = null,
    EntityIdList: ResourceIdList = null,
    StartTime: DateTimeISO8601 = null,
    Status: ChangeStatus = null
  ): ChangeSetSummaryListItem = {
    val __obj = js.Dynamic.literal()
    if (ChangeSetArn != null) __obj.updateDynamic("ChangeSetArn")(ChangeSetArn.asInstanceOf[js.Any])
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId.asInstanceOf[js.Any])
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (EntityIdList != null) __obj.updateDynamic("EntityIdList")(EntityIdList.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeSetSummaryListItem]
  }
}

