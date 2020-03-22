package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostAgentProfileRequest extends js.Object {
  /**
    * 
    */
  var agentProfile: AgentProfile = js.native
  /**
    * 
    */
  var contentType: String = js.native
  /**
    * 
    */
  var profileToken: js.UndefOr[ClientToken] = js.native
  /**
    * 
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object PostAgentProfileRequest {
  @scala.inline
  def apply(
    agentProfile: AgentProfile,
    contentType: String,
    profilingGroupName: ProfilingGroupName,
    profileToken: ClientToken = null
  ): PostAgentProfileRequest = {
    val __obj = js.Dynamic.literal(agentProfile = agentProfile.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (profileToken != null) __obj.updateDynamic("profileToken")(profileToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostAgentProfileRequest]
  }
}

