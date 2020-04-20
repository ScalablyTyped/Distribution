package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutThirdPartyJobFailureResultInput extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken = js.native
  /**
    * Represents information about failure details.
    */
  var failureDetails: FailureDetails = js.native
  /**
    * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
    */
  var jobId: ThirdPartyJobId = js.native
}

object PutThirdPartyJobFailureResultInput {
  @scala.inline
  def apply(clientToken: ClientToken, failureDetails: FailureDetails, jobId: ThirdPartyJobId): PutThirdPartyJobFailureResultInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], failureDetails = failureDetails.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutThirdPartyJobFailureResultInput]
  }
}

