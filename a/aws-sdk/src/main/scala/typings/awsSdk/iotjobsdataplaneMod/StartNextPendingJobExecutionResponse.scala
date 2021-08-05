package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNextPendingJobExecutionResponse extends StObject {
  
  /**
    * A JobExecution object.
    */
  var execution: js.UndefOr[JobExecution] = js.undefined
}
object StartNextPendingJobExecutionResponse {
  
  inline def apply(): StartNextPendingJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartNextPendingJobExecutionResponse]
  }
  
  extension [Self <: StartNextPendingJobExecutionResponse](x: Self) {
    
    inline def setExecution(value: JobExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
  }
}
