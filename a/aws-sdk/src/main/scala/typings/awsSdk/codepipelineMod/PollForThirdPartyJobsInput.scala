package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollForThirdPartyJobsInput extends js.Object {
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId = js.native
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.native
}

object PollForThirdPartyJobsInput {
  @scala.inline
  def apply(actionTypeId: ActionTypeId, maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined): PollForThirdPartyJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBatchSize)) __obj.updateDynamic("maxBatchSize")(maxBatchSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForThirdPartyJobsInput]
  }
}

