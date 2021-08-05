package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSimulationJobBatchRequest extends StObject {
  
  /**
    * The batch policy.
    */
  var batchPolicy: js.UndefOr[BatchPolicy] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * A list of simulation job requests to create in the batch.
    */
  var createSimulationJobRequests: CreateSimulationJobRequests
  
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job batch.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartSimulationJobBatchRequest {
  
  inline def apply(createSimulationJobRequests: CreateSimulationJobRequests): StartSimulationJobBatchRequest = {
    val __obj = js.Dynamic.literal(createSimulationJobRequests = createSimulationJobRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSimulationJobBatchRequest]
  }
  
  extension [Self <: StartSimulationJobBatchRequest](x: Self) {
    
    inline def setBatchPolicy(value: BatchPolicy): Self = StObject.set(x, "batchPolicy", value.asInstanceOf[js.Any])
    
    inline def setBatchPolicyUndefined: Self = StObject.set(x, "batchPolicy", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setCreateSimulationJobRequests(value: CreateSimulationJobRequests): Self = StObject.set(x, "createSimulationJobRequests", value.asInstanceOf[js.Any])
    
    inline def setCreateSimulationJobRequestsVarargs(value: SimulationJobRequest*): Self = StObject.set(x, "createSimulationJobRequests", js.Array(value :_*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
