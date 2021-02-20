package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTaskExecutionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the specific task execution that was started.
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskExecutionArn] = js.native
}
object StartTaskExecutionResponse {
  
  @scala.inline
  def apply(): StartTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTaskExecutionResponse]
  }
  
  @scala.inline
  implicit class StartTaskExecutionResponseMutableBuilder[Self <: StartTaskExecutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionArnUndefined: Self = StObject.set(x, "TaskExecutionArn", js.undefined)
  }
}
