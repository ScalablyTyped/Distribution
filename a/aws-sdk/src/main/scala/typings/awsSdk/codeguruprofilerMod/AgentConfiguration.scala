package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentConfiguration extends js.Object {
  /**
    * Specifies the period to follow the configuration (to profile or not) and call back to get a new configuration.
    */
  var periodInSeconds: Integer = js.native
  /**
    * Specifies if the profiling should be enabled by the agent.
    */
  var shouldProfile: Boolean = js.native
}

object AgentConfiguration {
  @scala.inline
  def apply(periodInSeconds: Integer, shouldProfile: Boolean): AgentConfiguration = {
    val __obj = js.Dynamic.literal(periodInSeconds = periodInSeconds.asInstanceOf[js.Any], shouldProfile = shouldProfile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentConfiguration]
  }
}

