package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentHyperParameterTuningJob extends js.Object {
  /**
    * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
    */
  var HyperParameterTuningJobName: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameterTuningJobName] = js.native
}

object ParentHyperParameterTuningJob {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName = null): ParentHyperParameterTuningJob = {
    val __obj = js.Dynamic.literal()
    if (HyperParameterTuningJobName != null) __obj.updateDynamic("HyperParameterTuningJobName")(HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentHyperParameterTuningJob]
  }
}

