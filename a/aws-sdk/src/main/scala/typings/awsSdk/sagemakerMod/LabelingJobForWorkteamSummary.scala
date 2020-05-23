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
  def apply(
    CreationTime: Timestamp,
    JobReferenceCode: JobReferenceCode,
    WorkRequesterAccountId: AccountId,
    LabelCounters: LabelCountersForWorkteam = null,
    LabelingJobName: LabelingJobName = null,
    NumberOfHumanWorkersPerDataObject: js.UndefOr[NumberOfHumanWorkersPerDataObject] = js.undefined
  ): LabelingJobForWorkteamSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobReferenceCode = JobReferenceCode.asInstanceOf[js.Any], WorkRequesterAccountId = WorkRequesterAccountId.asInstanceOf[js.Any])
    if (LabelCounters != null) __obj.updateDynamic("LabelCounters")(LabelCounters.asInstanceOf[js.Any])
    if (LabelingJobName != null) __obj.updateDynamic("LabelingJobName")(LabelingJobName.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfHumanWorkersPerDataObject)) __obj.updateDynamic("NumberOfHumanWorkersPerDataObject")(NumberOfHumanWorkersPerDataObject.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobForWorkteamSummary]
  }
}

