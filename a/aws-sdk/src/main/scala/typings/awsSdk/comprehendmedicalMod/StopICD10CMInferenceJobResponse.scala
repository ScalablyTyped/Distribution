package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopICD10CMInferenceJobResponse extends StObject {
  
  /**
    * The identifier generated for the job. To get the status of job, use this identifier with the DescribeICD10CMInferenceJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.undefined
}
object StopICD10CMInferenceJobResponse {
  
  inline def apply(): StopICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopICD10CMInferenceJobResponse]
  }
  
  extension [Self <: StopICD10CMInferenceJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
