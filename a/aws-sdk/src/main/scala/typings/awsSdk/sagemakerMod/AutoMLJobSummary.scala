package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobSummary extends js.Object {
  /**
    * The ARN of the job.
    */
  var AutoMLJobArn: typings.awsSdk.sagemakerMod.AutoMLJobArn = js.native
  /**
    * The name of the object you are requesting.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * The job's secondary status.
    */
  var AutoMLJobSecondaryStatus: typings.awsSdk.sagemakerMod.AutoMLJobSecondaryStatus = js.native
  /**
    * The job's status.
    */
  var AutoMLJobStatus: typings.awsSdk.sagemakerMod.AutoMLJobStatus = js.native
  /**
    * When the job was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.native
  /**
    * When the job was last modified.
    */
  var LastModifiedTime: Timestamp = js.native
}

object AutoMLJobSummary {
  @scala.inline
  def apply(
    AutoMLJobArn: AutoMLJobArn,
    AutoMLJobName: AutoMLJobName,
    AutoMLJobSecondaryStatus: AutoMLJobSecondaryStatus,
    AutoMLJobStatus: AutoMLJobStatus,
    CreationTime: Timestamp,
    LastModifiedTime: Timestamp
  ): AutoMLJobSummary = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any], AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], AutoMLJobSecondaryStatus = AutoMLJobSecondaryStatus.asInstanceOf[js.Any], AutoMLJobStatus = AutoMLJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobSummary]
  }
  @scala.inline
  implicit class AutoMLJobSummaryOps[Self <: AutoMLJobSummary] (val x: Self) extends AnyVal {
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
    def setAutoMLJobArn(value: AutoMLJobArn): Self = this.set("AutoMLJobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = this.set("AutoMLJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobSecondaryStatus(value: AutoMLJobSecondaryStatus): Self = this.set("AutoMLJobSecondaryStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobStatus(value: AutoMLJobStatus): Self = this.set("AutoMLJobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setFailureReason(value: AutoMLFailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
  }
  
}

