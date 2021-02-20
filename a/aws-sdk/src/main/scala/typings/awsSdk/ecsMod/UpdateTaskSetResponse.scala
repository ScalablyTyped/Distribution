package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTaskSetResponse extends StObject {
  
  var taskSet: js.UndefOr[TaskSet] = js.native
}
object UpdateTaskSetResponse {
  
  @scala.inline
  def apply(): UpdateTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTaskSetResponse]
  }
  
  @scala.inline
  implicit class UpdateTaskSetResponseMutableBuilder[Self <: UpdateTaskSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskSet(value: TaskSet): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetUndefined: Self = StObject.set(x, "taskSet", js.undefined)
  }
}
