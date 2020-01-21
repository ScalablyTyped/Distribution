package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureAgentResponse extends js.Object {
  /**
    * The configuration for the agent to use.
    */
  var configuration: AgentConfiguration = js.native
}

object ConfigureAgentResponse {
  @scala.inline
  def apply(configuration: AgentConfiguration): ConfigureAgentResponse = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigureAgentResponse]
  }
}

