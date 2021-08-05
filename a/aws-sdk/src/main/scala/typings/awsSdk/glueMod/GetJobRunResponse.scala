package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRunResponse extends StObject {
  
  /**
    * The requested job-run metadata.
    */
  var JobRun: js.UndefOr[typings.awsSdk.glueMod.JobRun] = js.undefined
}
object GetJobRunResponse {
  
  inline def apply(): GetJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunResponse]
  }
  
  extension [Self <: GetJobRunResponse](x: Self) {
    
    inline def setJobRun(value: JobRun): Self = StObject.set(x, "JobRun", value.asInstanceOf[js.Any])
    
    inline def setJobRunUndefined: Self = StObject.set(x, "JobRun", js.undefined)
  }
}
