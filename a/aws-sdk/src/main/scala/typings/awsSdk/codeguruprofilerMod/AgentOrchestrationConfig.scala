package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOrchestrationConfig extends js.Object {
  /**
    * 
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

