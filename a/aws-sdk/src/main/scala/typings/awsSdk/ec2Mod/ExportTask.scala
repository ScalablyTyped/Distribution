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
  def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  @scala.inline
  implicit class ExportTaskOps[Self <: ExportTask] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setExportTaskId(value: String): Self = this.set("ExportTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportTaskId: Self = this.set("ExportTaskId", js.undefined)
    @scala.inline
    def setExportToS3Task(value: ExportToS3Task): Self = this.set("ExportToS3Task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportToS3Task: Self = this.set("ExportToS3Task", js.undefined)
    @scala.inline
    def setInstanceExportDetails(value: InstanceExportDetails): Self = this.set("InstanceExportDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceExportDetails: Self = this.set("InstanceExportDetails", js.undefined)
    @scala.inline
    def setState(value: ExportTaskState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

