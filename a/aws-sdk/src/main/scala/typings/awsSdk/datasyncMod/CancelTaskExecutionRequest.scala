package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTaskExecutionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task execution to cancel.
    */
  var TaskExecutionArn: typings.awsSdk.datasyncMod.TaskExecutionArn = js.native
}
object CancelTaskExecutionRequest {
  
  @scala.inline
  def apply(TaskExecutionArn: TaskExecutionArn): CancelTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTaskExecutionRequest]
  }
  
  @scala.inline
  implicit class CancelTaskExecutionRequestMutableBuilder[Self <: CancelTaskExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
  }
}
