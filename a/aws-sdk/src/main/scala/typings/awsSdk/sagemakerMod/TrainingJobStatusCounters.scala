package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJobStatusCounters extends js.Object {
  /**
    * The number of completed training jobs launched by the hyperparameter tuning job.
    */
  var Completed: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of in-progress training jobs launched by a hyperparameter tuning job.
    */
  var InProgress: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed because a client error occurred.
    */
  var NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it failed because an internal service error occurred.
    */
  var RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
    */
  var Stopped: js.UndefOr[TrainingJobStatusCounter] = js.native
}

object TrainingJobStatusCounters {
  @scala.inline
  def apply(
    Completed: Int | Double = null,
    InProgress: Int | Double = null,
    NonRetryableError: Int | Double = null,
    RetryableError: Int | Double = null,
    Stopped: Int | Double = null
  ): TrainingJobStatusCounters = {
    val __obj = js.Dynamic.literal()
    if (Completed != null) __obj.updateDynamic("Completed")(Completed.asInstanceOf[js.Any])
    if (InProgress != null) __obj.updateDynamic("InProgress")(InProgress.asInstanceOf[js.Any])
    if (NonRetryableError != null) __obj.updateDynamic("NonRetryableError")(NonRetryableError.asInstanceOf[js.Any])
    if (RetryableError != null) __obj.updateDynamic("RetryableError")(RetryableError.asInstanceOf[js.Any])
    if (Stopped != null) __obj.updateDynamic("Stopped")(Stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobStatusCounters]
  }
}

