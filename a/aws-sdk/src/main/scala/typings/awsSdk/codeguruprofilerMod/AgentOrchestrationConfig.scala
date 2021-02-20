package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentOrchestrationConfig extends StObject {
  
  /**
    *  A Boolean that specifies whether the profiling agent collects profiling data or not. Set to true to enable profiling. 
    */
  var profilingEnabled: Boolean = js.native
}
object AgentOrchestrationConfig {
  
  @scala.inline
  def apply(profilingEnabled: Boolean): AgentOrchestrationConfig = {
    val __obj = js.Dynamic.literal(profilingEnabled = profilingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOrchestrationConfig]
  }
  
  @scala.inline
  implicit class AgentOrchestrationConfigMutableBuilder[Self <: AgentOrchestrationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfilingEnabled(value: Boolean): Self = StObject.set(x, "profilingEnabled", value.asInstanceOf[js.Any])
  }
}
