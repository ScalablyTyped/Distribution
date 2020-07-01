package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOrchestrationConfig extends js.Object {
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
}

