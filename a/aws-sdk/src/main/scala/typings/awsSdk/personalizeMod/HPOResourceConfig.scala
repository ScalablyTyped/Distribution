package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPOResourceConfig extends js.Object {
  /**
    * The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
    */
  var maxNumberOfTrainingJobs: js.UndefOr[HPOResource] = js.native
  /**
    * The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
    */
  var maxParallelTrainingJobs: js.UndefOr[HPOResource] = js.native
}

object HPOResourceConfig {
  @scala.inline
  def apply(maxNumberOfTrainingJobs: HPOResource = null, maxParallelTrainingJobs: HPOResource = null): HPOResourceConfig = {
    val __obj = js.Dynamic.literal()
    if (maxNumberOfTrainingJobs != null) __obj.updateDynamic("maxNumberOfTrainingJobs")(maxNumberOfTrainingJobs.asInstanceOf[js.Any])
    if (maxParallelTrainingJobs != null) __obj.updateDynamic("maxParallelTrainingJobs")(maxParallelTrainingJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPOResourceConfig]
  }
}

