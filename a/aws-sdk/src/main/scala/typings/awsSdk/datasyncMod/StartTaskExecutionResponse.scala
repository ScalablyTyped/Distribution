package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTaskExecutionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the specific task execution that was started.
    */
  var TaskExecutionArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskExecutionArn] = js.undefined
}
object StartTaskExecutionResponse {
  
  inline def apply(): StartTaskExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTaskExecutionResponse]
  }
  
  extension [Self <: StartTaskExecutionResponse](x: Self) {
    
    inline def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionArnUndefined: Self = StObject.set(x, "TaskExecutionArn", js.undefined)
  }
}
