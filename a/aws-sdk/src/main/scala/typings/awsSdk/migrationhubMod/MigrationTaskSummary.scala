package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationTaskSummary extends js.Object {
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typings.awsSdk.migrationhubMod.MigrationTaskName] = js.native
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressPercent] = js.native
  /**
    * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all updates made by the tool.
    */
  var ProgressUpdateStream: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressUpdateStream] = js.native
  /**
    * Status of the task.
    */
  var Status: js.UndefOr[typings.awsSdk.migrationhubMod.Status] = js.native
  /**
    * Detail information of what is being done within the overall status state.
    */
  var StatusDetail: js.UndefOr[typings.awsSdk.migrationhubMod.StatusDetail] = js.native
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[typings.awsSdk.migrationhubMod.UpdateDateTime] = js.native
}

object MigrationTaskSummary {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName = null,
    ProgressPercent: Int | Double = null,
    ProgressUpdateStream: ProgressUpdateStream = null,
    Status: Status = null,
    StatusDetail: StatusDetail = null,
    UpdateDateTime: UpdateDateTime = null
  ): MigrationTaskSummary = {
    val __obj = js.Dynamic.literal()
    if (MigrationTaskName != null) __obj.updateDynamic("MigrationTaskName")(MigrationTaskName.asInstanceOf[js.Any])
    if (ProgressPercent != null) __obj.updateDynamic("ProgressPercent")(ProgressPercent.asInstanceOf[js.Any])
    if (ProgressUpdateStream != null) __obj.updateDynamic("ProgressUpdateStream")(ProgressUpdateStream.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetail != null) __obj.updateDynamic("StatusDetail")(StatusDetail.asInstanceOf[js.Any])
    if (UpdateDateTime != null) __obj.updateDynamic("UpdateDateTime")(UpdateDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationTaskSummary]
  }
}

