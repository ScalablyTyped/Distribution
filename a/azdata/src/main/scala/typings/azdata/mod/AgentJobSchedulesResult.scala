package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentJobSchedulesResult
  extends StObject
     with ResultStatus {
  
  var schedules: js.Array[AgentJobScheduleInfo]
}
object AgentJobSchedulesResult {
  
  inline def apply(errorMessage: String, schedules: js.Array[AgentJobScheduleInfo], success: Boolean): AgentJobSchedulesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobSchedulesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentJobSchedulesResult] (val x: Self) extends AnyVal {
    
    inline def setSchedules(value: js.Array[AgentJobScheduleInfo]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesVarargs(value: AgentJobScheduleInfo*): Self = StObject.set(x, "schedules", js.Array(value*))
  }
}
