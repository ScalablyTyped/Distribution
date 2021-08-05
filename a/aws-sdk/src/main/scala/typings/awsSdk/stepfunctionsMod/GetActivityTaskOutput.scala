package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActivityTaskOutput extends StObject {
  
  /**
    * The string that contains the JSON input data for the task. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveDataJobInput] = js.undefined
  
  /**
    * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to SendTaskHeartbeat, SendTaskSuccess or SendTaskFailure in order to report the progress or completion of the task.
    */
  var taskToken: js.UndefOr[TaskToken] = js.undefined
}
object GetActivityTaskOutput {
  
  inline def apply(): GetActivityTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActivityTaskOutput]
  }
  
  extension [Self <: GetActivityTaskOutput](x: Self) {
    
    inline def setInput(value: SensitiveDataJobInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setTaskToken(value: TaskToken): Self = StObject.set(x, "taskToken", value.asInstanceOf[js.Any])
    
    inline def setTaskTokenUndefined: Self = StObject.set(x, "taskToken", js.undefined)
  }
}
