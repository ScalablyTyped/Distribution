package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProfilingGroupResponse extends StObject {
  
  /**
    *  The returned  ProfilingGroupDescription  object that contains information about the requested profiling group. 
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}
object DescribeProfilingGroupResponse {
  
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): DescribeProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProfilingGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeProfilingGroupResponseMutableBuilder[Self <: DescribeProfilingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfilingGroup(value: ProfilingGroupDescription): Self = StObject.set(x, "profilingGroup", value.asInstanceOf[js.Any])
  }
}
