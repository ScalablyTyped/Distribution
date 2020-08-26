package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobForWorkteamSummary extends js.Object {
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: Timestamp = js.native
  /**
    * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
    */
  var JobReferenceCode: typings.awsSdk.sagemakerMod.JobReferenceCode = js.native
  /**
    * Provides information about the progress of a labeling job.
    */
  var LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.native
  /**
    * The name of the labeling job that the work team is assigned to.
    */
  var LabelingJobName: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobName] = js.native
  /**
    * The configured number of workers per data object.
    */
  var NumberOfHumanWorkersPerDataObject: js.UndefOr[typings.awsSdk.sagemakerMod.NumberOfHumanWorkersPerDataObject] = js.native
  /**
    * 
    */
  var WorkRequesterAccountId: AccountId = js.native
}

object LabelingJobForWorkteamSummary {
  @scala.inline
  def apply(CreationTime: Timestamp, JobReferenceCode: JobReferenceCode, WorkRequesterAccountId: AccountId): LabelingJobForWorkteamSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobReferenceCode = JobReferenceCode.asInstanceOf[js.Any], WorkRequesterAccountId = WorkRequesterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobForWorkteamSummary]
  }
  @scala.inline
  implicit class LabelingJobForWorkteamSummaryOps[Self <: LabelingJobForWorkteamSummary] (val x: Self) extends AnyVal {
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
    def setJobReferenceCode(value: JobReferenceCode): Self = this.set("JobReferenceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkRequesterAccountId(value: AccountId): Self = this.set("WorkRequesterAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelCounters(value: LabelCountersForWorkteam): Self = this.set("LabelCounters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCounters: Self = this.set("LabelCounters", js.undefined)
    @scala.inline
    def setLabelingJobName(value: LabelingJobName): Self = this.set("LabelingJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelingJobName: Self = this.set("LabelingJobName", js.undefined)
    @scala.inline
    def setNumberOfHumanWorkersPerDataObject(value: NumberOfHumanWorkersPerDataObject): Self = this.set("NumberOfHumanWorkersPerDataObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfHumanWorkersPerDataObject: Self = this.set("NumberOfHumanWorkersPerDataObject", js.undefined)
  }
  
}

