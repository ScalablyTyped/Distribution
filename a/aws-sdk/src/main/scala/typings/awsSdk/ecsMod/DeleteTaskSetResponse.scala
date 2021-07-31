package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTaskSetResponse extends StObject {
  
  var taskSet: js.UndefOr[TaskSet] = js.undefined
}
object DeleteTaskSetResponse {
  
  @scala.inline
  def apply(): DeleteTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTaskSetResponse]
  }
  
  @scala.inline
  implicit class DeleteTaskSetResponseMutableBuilder[Self <: DeleteTaskSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskSet(value: TaskSet): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetUndefined: Self = StObject.set(x, "taskSet", js.undefined)
  }
}
