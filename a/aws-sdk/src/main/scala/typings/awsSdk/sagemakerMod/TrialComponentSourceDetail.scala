package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSourceDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.native
  var TrainingJob: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJob] = js.native
}

object TrialComponentSourceDetail {
  @scala.inline
  def apply(SourceArn: TrialComponentSourceArn = null, TrainingJob: TrainingJob = null): TrialComponentSourceDetail = {
    val __obj = js.Dynamic.literal()
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (TrainingJob != null) __obj.updateDynamic("TrainingJob")(TrainingJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentSourceDetail]
  }
}

