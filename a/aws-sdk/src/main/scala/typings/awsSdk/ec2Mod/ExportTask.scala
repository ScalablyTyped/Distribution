package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTask extends js.Object {
  /**
    * A description of the resource being exported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the export task.
    */
  var ExportTaskId: js.UndefOr[String] = js.native
  /**
    * Information about the export task.
    */
  var ExportToS3Task: js.UndefOr[typings.awsSdk.ec2Mod.ExportToS3Task] = js.native
  /**
    * Information about the instance to export.
    */
  var InstanceExportDetails: js.UndefOr[typings.awsSdk.ec2Mod.InstanceExportDetails] = js.native
  /**
    * The state of the export task.
    */
  var State: js.UndefOr[ExportTaskState] = js.native
  /**
    * The status message related to the export task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The tags for the export task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ExportTask {
  @scala.inline
  def apply(
    Description: String = null,
    ExportTaskId: String = null,
    ExportToS3Task: ExportToS3Task = null,
    InstanceExportDetails: InstanceExportDetails = null,
    State: ExportTaskState = null,
    StatusMessage: String = null,
    Tags: TagList = null
  ): ExportTask = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExportTaskId != null) __obj.updateDynamic("ExportTaskId")(ExportTaskId.asInstanceOf[js.Any])
    if (ExportToS3Task != null) __obj.updateDynamic("ExportToS3Task")(ExportToS3Task.asInstanceOf[js.Any])
    if (InstanceExportDetails != null) __obj.updateDynamic("InstanceExportDetails")(InstanceExportDetails.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTask]
  }
}

