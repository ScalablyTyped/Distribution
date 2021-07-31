package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPolicyRequest extends StObject {
  
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName
}
object GetPolicyRequest {
  
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
  
  @scala.inline
  implicit class GetPolicyRequestMutableBuilder[Self <: GetPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
