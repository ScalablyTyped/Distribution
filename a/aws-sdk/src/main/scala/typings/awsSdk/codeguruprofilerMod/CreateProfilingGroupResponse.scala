package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProfilingGroupResponse extends StObject {
  
  /**
    *  The returned  ProfilingGroupDescription  object that contains information about the created profiling group. 
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}
object CreateProfilingGroupResponse {
  
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): CreateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupResponse]
  }
  
  @scala.inline
  implicit class CreateProfilingGroupResponseMutableBuilder[Self <: CreateProfilingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfilingGroup(value: ProfilingGroupDescription): Self = StObject.set(x, "profilingGroup", value.asInstanceOf[js.Any])
  }
}
