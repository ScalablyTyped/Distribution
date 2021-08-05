package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobExecutionResponse extends StObject {
  
  /**
    * A JobExecutionState object.
    */
  var executionState: js.UndefOr[JobExecutionState] = js.undefined
  
  /**
    * The contents of the Job Documents.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.undefined
}
object UpdateJobExecutionResponse {
  
  inline def apply(): UpdateJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobExecutionResponse]
  }
  
  extension [Self <: UpdateJobExecutionResponse](x: Self) {
    
    inline def setExecutionState(value: JobExecutionState): Self = StObject.set(x, "executionState", value.asInstanceOf[js.Any])
    
    inline def setExecutionStateUndefined: Self = StObject.set(x, "executionState", js.undefined)
    
    inline def setJobDocument(value: JobDocument): Self = StObject.set(x, "jobDocument", value.asInstanceOf[js.Any])
    
    inline def setJobDocumentUndefined: Self = StObject.set(x, "jobDocument", js.undefined)
  }
}
