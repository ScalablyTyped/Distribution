package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelBatchPredictionJobRequest extends StObject {
  
  /**
    * The ID of the batch prediction job to cancel.
    */
  var jobId: identifier
}
object CancelBatchPredictionJobRequest {
  
  inline def apply(jobId: identifier): CancelBatchPredictionJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBatchPredictionJobRequest]
  }
  
  extension [Self <: CancelBatchPredictionJobRequest](x: Self) {
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
