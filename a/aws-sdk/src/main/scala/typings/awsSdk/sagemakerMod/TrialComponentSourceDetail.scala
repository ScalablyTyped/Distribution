package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSourceDetail extends js.Object {
  /**
    * Information about a processing job that's the source of a trial component.
    */
  var ProcessingJob: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingJob] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  /**
    * Information about a training job that's the source of a trial component.
    */
  var TrainingJob: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJob] = js.native
}

object TrialComponentSourceDetail {
  @scala.inline
  def apply(
    ProcessingJob: ProcessingJob = null,
    SourceArn: TrialComponentSourceArn = null,
    TrainingJob: TrainingJob = null
  ): TrialComponentSourceDetail = {
    val __obj = js.Dynamic.literal()
    if (ProcessingJob != null) __obj.updateDynamic("ProcessingJob")(ProcessingJob.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (TrainingJob != null) __obj.updateDynamic("TrainingJob")(TrainingJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentSourceDetail]
  }
}

