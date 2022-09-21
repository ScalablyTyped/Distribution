package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelBatchImportJobRequest extends StObject {
  
  /**
    *  The ID of an in-progress batch import job to cancel.  Amazon Fraud Detector will throw an error if the batch import job is in FAILED, CANCELED, or COMPLETED state.
    */
  var jobId: identifier
}
object CancelBatchImportJobRequest {
  
  inline def apply(jobId: identifier): CancelBatchImportJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBatchImportJobRequest]
  }
  
  extension [Self <: CancelBatchImportJobRequest](x: Self) {
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
