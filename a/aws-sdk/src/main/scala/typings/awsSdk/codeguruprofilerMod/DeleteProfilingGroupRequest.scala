package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProfilingGroupRequest extends StObject {
  
  /**
    * The name of the profiling group to delete.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}
object DeleteProfilingGroupRequest {
  
  @scala.inline
  def apply(profilingGroupName: ProfilingGroupName): DeleteProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfilingGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteProfilingGroupRequestMutableBuilder[Self <: DeleteProfilingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
