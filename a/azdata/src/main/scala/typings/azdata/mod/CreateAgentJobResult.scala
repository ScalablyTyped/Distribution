package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentJobResult
  extends StObject
     with ResultStatus {
  
  var job: AgentJobInfo
}
object CreateAgentJobResult {
  
  inline def apply(errorMessage: String, job: AgentJobInfo, success: Boolean): CreateAgentJobResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentJobResult]
  }
  
  extension [Self <: CreateAgentJobResult](x: Self) {
    
    inline def setJob(value: AgentJobInfo): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
