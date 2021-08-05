package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostAgentProfileRequest extends StObject {
  
  /**
    *  The submitted profiling data. 
    */
  var agentProfile: AgentProfile
  
  /**
    *  The format of the submitted profiling data. The format maps to the Accept and Content-Type headers of the HTTP request. You can specify one of the following: or the default .   &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; 
    */
  var contentType: String
  
  /**
    *  Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental submission of duplicate profiling data if there are failures and retries. 
    */
  var profileToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    *  The name of the profiling group with the aggregated profile that receives the submitted profiling data. 
    */
  var profilingGroupName: ProfilingGroupName
}
object PostAgentProfileRequest {
  
  inline def apply(agentProfile: AgentProfile, contentType: String, profilingGroupName: ProfilingGroupName): PostAgentProfileRequest = {
    val __obj = js.Dynamic.literal(agentProfile = agentProfile.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostAgentProfileRequest]
  }
  
  extension [Self <: PostAgentProfileRequest](x: Self) {
    
    inline def setAgentProfile(value: AgentProfile): Self = StObject.set(x, "agentProfile", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setProfileToken(value: ClientToken): Self = StObject.set(x, "profileToken", value.asInstanceOf[js.Any])
    
    inline def setProfileTokenUndefined: Self = StObject.set(x, "profileToken", js.undefined)
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
