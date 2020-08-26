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
  def apply(createSimulationJobRequests: CreateSimulationJobRequests): StartSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(createSimulationJobRequests = createSimulationJobRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSimulationJobBatchRequest]
  }
  @scala.inline
  implicit class StartSimulationJobBatchRequestOps[Self <: StartSimulationJobBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateSimulationJobRequestsVarargs(value: SimulationJobRequest*): Self = this.set("createSimulationJobRequests", js.Array(value :_*))
    @scala.inline
    def setCreateSimulationJobRequests(value: CreateSimulationJobRequests): Self = this.set("createSimulationJobRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchPolicy(value: BatchPolicy): Self = this.set("batchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchPolicy: Self = this.set("batchPolicy", js.undefined)
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

