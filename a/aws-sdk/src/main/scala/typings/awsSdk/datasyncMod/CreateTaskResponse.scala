package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTaskResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskArn] = js.native
}
object CreateTaskResponse {
  
  @scala.inline
  def apply(): CreateTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTaskResponse]
  }
  
  @scala.inline
  implicit class CreateTaskResponseMutableBuilder[Self <: CreateTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
