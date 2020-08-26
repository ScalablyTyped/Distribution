package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostAgentProfileRequest extends js.Object {
  /**
    *  The submitted profiling data. 
    */
  var agentProfile: AgentProfile = js.native
  /**
    *  The format of the submitted profiling data. The format maps to the Accept and Content-Type headers of the HTTP request. You can specify one of the following: or the default .   &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; 
    */
  var contentType: String = js.native
  /**
    *  Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental submission of duplicate profiling data if there are failures and retries. 
    */
  var profileToken: js.UndefOr[ClientToken] = js.native
  /**
    *  The name of the profiling group with the aggregated profile that receives the submitted profiling data. 
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object PostAgentProfileRequest {
  @scala.inline
  def apply(agentProfile: AgentProfile, contentType: String, profilingGroupName: ProfilingGroupName): PostAgentProfileRequest = {
    val __obj = js.Dynamic.literal(agentProfile = agentProfile.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostAgentProfileRequest]
  }
  @scala.inline
  implicit class PostAgentProfileRequestOps[Self <: PostAgentProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgentProfile(value: AgentProfile): Self = this.set("agentProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileToken(value: ClientToken): Self = this.set("profileToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileToken: Self = this.set("profileToken", js.undefined)
  }
  
}

