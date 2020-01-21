package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobCompletionCriteria extends js.Object {
  /**
    * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or greater than MaxRuntimePerTrainingJobInSeconds.
    */
  var MaxAutoMLJobRuntimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxAutoMLJobRuntimeInSeconds] = js.native
  /**
    * The maximum number of times a training job is allowed to run.
    */
  var MaxCandidates: js.UndefOr[typings.awsSdk.sagemakerMod.MaxCandidates] = js.native
  /**
    * The maximum time, in seconds, a job is allowed to run.
    */
  var MaxRuntimePerTrainingJobInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxRuntimePerTrainingJobInSeconds] = js.native
}

object AutoMLJobCompletionCriteria {
  @scala.inline
  def apply(
    MaxAutoMLJobRuntimeInSeconds: Int | Double = null,
    MaxCandidates: Int | Double = null,
    MaxRuntimePerTrainingJobInSeconds: Int | Double = null
  ): AutoMLJobCompletionCriteria = {
    val __obj = js.Dynamic.literal()
    if (MaxAutoMLJobRuntimeInSeconds != null) __obj.updateDynamic("MaxAutoMLJobRuntimeInSeconds")(MaxAutoMLJobRuntimeInSeconds.asInstanceOf[js.Any])
    if (MaxCandidates != null) __obj.updateDynamic("MaxCandidates")(MaxCandidates.asInstanceOf[js.Any])
    if (MaxRuntimePerTrainingJobInSeconds != null) __obj.updateDynamic("MaxRuntimePerTrainingJobInSeconds")(MaxRuntimePerTrainingJobInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobCompletionCriteria]
  }
}

