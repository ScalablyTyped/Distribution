package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTaskParams extends StObject {
  
  var taskId: String
}
object CancelTaskParams {
  
  @scala.inline
  def apply(taskId: String): CancelTaskParams = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTaskParams]
  }
  
  @scala.inline
  implicit class CancelTaskParamsMutableBuilder[Self <: CancelTaskParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
