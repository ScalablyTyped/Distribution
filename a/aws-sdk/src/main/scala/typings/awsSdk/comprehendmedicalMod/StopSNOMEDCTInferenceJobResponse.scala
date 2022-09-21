package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSNOMEDCTInferenceJobResponse extends StObject {
  
  /**
    *  The identifier generated for the job. To get the status of job, use this identifier with the DescribeSNOMEDCTInferenceJob operation. 
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.undefined
}
object StopSNOMEDCTInferenceJobResponse {
  
  inline def apply(): StopSNOMEDCTInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopSNOMEDCTInferenceJobResponse]
  }
  
  extension [Self <: StopSNOMEDCTInferenceJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
