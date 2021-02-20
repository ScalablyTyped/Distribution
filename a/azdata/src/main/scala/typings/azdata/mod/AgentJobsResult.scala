package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobsResult extends ResultStatus {
  
  var jobs: js.Array[AgentJobInfo] = js.native
}
object AgentJobsResult {
  
  @scala.inline
  def apply(errorMessage: String, jobs: js.Array[AgentJobInfo], success: Boolean): AgentJobsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobsResult]
  }
  
  @scala.inline
  implicit class AgentJobsResultMutableBuilder[Self <: AgentJobsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[AgentJobInfo]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsVarargs(value: AgentJobInfo*): Self = StObject.set(x, "jobs", js.Array(value :_*))
  }
}
