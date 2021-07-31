package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentJobResult
  extends StObject
     with ResultStatus {
  
  var job: AgentJobInfo
}
object UpdateAgentJobResult {
  
  @scala.inline
  def apply(errorMessage: String, job: AgentJobInfo, success: Boolean): UpdateAgentJobResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentJobResult]
  }
  
  @scala.inline
  implicit class UpdateAgentJobResultMutableBuilder[Self <: UpdateAgentJobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: AgentJobInfo): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
