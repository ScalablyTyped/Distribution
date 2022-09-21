package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBatchImportJobRequest extends StObject {
  
  /**
    * The ID of the batch import job to delete. 
    */
  var jobId: identifier
}
object DeleteBatchImportJobRequest {
  
  inline def apply(jobId: identifier): DeleteBatchImportJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBatchImportJobRequest]
  }
  
  extension [Self <: DeleteBatchImportJobRequest](x: Self) {
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
