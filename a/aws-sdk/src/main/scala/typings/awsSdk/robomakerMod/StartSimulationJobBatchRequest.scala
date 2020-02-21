package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSimulationJobBatchRequest extends js.Object {
  /**
    * The batch policy.
    */
  var batchPolicy: js.UndefOr[BatchPolicy] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * A list of simulation job requests to create in the batch.
    */
  var createSimulationJobRequests: CreateSimulationJobRequests = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job batch.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object StartSimulationJobBatchRequest {
  @scala.inline
  def apply(
    createSimulationJobRequests: CreateSimulationJobRequests,
    batchPolicy: BatchPolicy = null,
    clientRequestToken: ClientRequestToken = null,
    tags: TagMap = null
  ): StartSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(createSimulationJobRequests = createSimulationJobRequests.asInstanceOf[js.Any])
    if (batchPolicy != null) __obj.updateDynamic("batchPolicy")(batchPolicy.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSimulationJobBatchRequest]
  }
}

