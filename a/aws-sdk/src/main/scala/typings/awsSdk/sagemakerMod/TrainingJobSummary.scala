package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJobSummary extends js.Object {
  /**
    * A timestamp that shows when the training job was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    *  Timestamp when the training job was last modified. 
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * A timestamp that shows when the training job ended. This field is set only if the training job has one of the terminal statuses (Completed, Failed, or Stopped). 
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typings.awsSdk.sagemakerMod.TrainingJobArn = js.native
  /**
    * The name of the training job that you want a summary for.
    */
  var TrainingJobName: typings.awsSdk.sagemakerMod.TrainingJobName = js.native
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: typings.awsSdk.sagemakerMod.TrainingJobStatus = js.native
}

object TrainingJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus
  ): TrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TrainingJobArn = TrainingJobArn.asInstanceOf[js.Any], TrainingJobName = TrainingJobName.asInstanceOf[js.Any], TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobSummary]
  }
  @scala.inline
  implicit class TrainingJobSummaryOps[Self <: TrainingJobSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingJobArn(value: TrainingJobArn): Self = this.set("TrainingJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = this.set("TrainingJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrainingJobStatus(value: TrainingJobStatus): Self = this.set("TrainingJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setTrainingEndTime(value: Timestamp): Self = this.set("TrainingEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingEndTime: Self = this.set("TrainingEndTime", js.undefined)
  }
  
}

