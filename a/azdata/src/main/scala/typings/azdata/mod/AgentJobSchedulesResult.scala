package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentJobSchedulesResult extends ResultStatus {
  
  var schedules: js.Array[AgentJobScheduleInfo] = js.native
}
object AgentJobSchedulesResult {
  
  @scala.inline
  def apply(errorMessage: String, schedules: js.Array[AgentJobScheduleInfo], success: Boolean): AgentJobSchedulesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobSchedulesResult]
  }
  
  @scala.inline
  implicit class AgentJobSchedulesResultMutableBuilder[Self <: AgentJobSchedulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchedules(value: js.Array[AgentJobScheduleInfo]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulesVarargs(value: AgentJobScheduleInfo*): Self = StObject.set(x, "schedules", js.Array(value :_*))
  }
}
