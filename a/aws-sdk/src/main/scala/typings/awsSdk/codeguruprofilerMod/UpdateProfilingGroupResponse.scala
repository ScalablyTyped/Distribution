package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProfilingGroupResponse extends js.Object {
  
  /**
    *  A  ProfilingGroupDescription  that contains information about the returned updated profiling group. 
    */
  var profilingGroup: ProfilingGroupDescription = js.native
}
object UpdateProfilingGroupResponse {
  
  @scala.inline
  def apply(profilingGroup: ProfilingGroupDescription): UpdateProfilingGroupResponse = {
    val __obj = js.Dynamic.literal(profilingGroup = profilingGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfilingGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateProfilingGroupResponseOps[Self <: UpdateProfilingGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setProfilingGroup(value: ProfilingGroupDescription): Self = this.set("profilingGroup", value.asInstanceOf[js.Any])
  }
}
