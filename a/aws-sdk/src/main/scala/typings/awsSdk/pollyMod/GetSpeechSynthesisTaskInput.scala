package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpeechSynthesisTaskInput extends StObject {
  
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: typings.awsSdk.pollyMod.TaskId
}
object GetSpeechSynthesisTaskInput {
  
  @scala.inline
  def apply(TaskId: TaskId): GetSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpeechSynthesisTaskInput]
  }
  
  @scala.inline
  implicit class GetSpeechSynthesisTaskInputMutableBuilder[Self <: GetSpeechSynthesisTaskInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
  }
}
