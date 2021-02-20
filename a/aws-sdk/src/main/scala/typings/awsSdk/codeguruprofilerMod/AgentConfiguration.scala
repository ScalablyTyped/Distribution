package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentConfiguration extends StObject {
  
  /**
    *  Parameters used by the profiler. The valid parameters are:     MaxStackDepth - The maximum depth of the stacks in the code that is represented in the profile. For example, if CodeGuru Profiler finds a method A, which calls method B, which calls method C, which calls method D, then the depth is 4. If the maxDepth is set to 2, then the profiler evaluates A and B.     MemoryUsageLimitPercent - The percentage of memory that is used by the profiler.    MinimumTimeForReportingInMilliseconds - The minimum time in milliseconds between sending reports.     ReportingIntervalInMilliseconds - The reporting interval in milliseconds used to report profiles.     SamplingIntervalInMilliseconds - The sampling interval in milliseconds that is used to profile samples.   
    */
  var agentParameters: js.UndefOr[AgentParameters] = js.native
  
  /**
    *  How long a profiling agent should send profiling data using  ConfigureAgent . For example, if this is set to 300, the profiling agent calls  ConfigureAgent  every 5 minutes to submit the profiled data collected during that period. 
    */
  var periodInSeconds: Integer = js.native
  
  /**
    *  A Boolean that specifies whether the profiling agent collects profiling data or not. Set to true to enable profiling. 
    */
  var shouldProfile: Boolean = js.native
}
object AgentConfiguration {
  
  @scala.inline
  def apply(periodInSeconds: Integer, shouldProfile: Boolean): AgentConfiguration = {
    val __obj = js.Dynamic.literal(periodInSeconds = periodInSeconds.asInstanceOf[js.Any], shouldProfile = shouldProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentConfiguration]
  }
  
  @scala.inline
  implicit class AgentConfigurationMutableBuilder[Self <: AgentConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentParameters(value: AgentParameters): Self = StObject.set(x, "agentParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentParametersUndefined: Self = StObject.set(x, "agentParameters", js.undefined)
    
    @scala.inline
    def setPeriodInSeconds(value: Integer): Self = StObject.set(x, "periodInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldProfile(value: Boolean): Self = StObject.set(x, "shouldProfile", value.asInstanceOf[js.Any])
  }
}
