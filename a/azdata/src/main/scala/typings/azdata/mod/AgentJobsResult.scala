package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobsResult
  extends StObject
     with ResultStatus {
  
  var jobs: js.Array[AgentJobInfo]
}
object AgentJobsResult {
  
  inline def apply(errorMessage: String, jobs: js.Array[AgentJobInfo], success: Boolean): AgentJobsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobsResult]
  }
  
  extension [Self <: AgentJobsResult](x: Self) {
    
    inline def setJobs(value: js.Array[AgentJobInfo]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: AgentJobInfo*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
