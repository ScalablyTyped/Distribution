package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelDataRepositoryTaskResponse extends StObject {
  
  /**
    * The lifecycle status of the data repository task, as follows:    PENDING - Amazon FSx has not started the task.    EXECUTING - Amazon FSx is processing the task.    FAILED - Amazon FSx was not able to complete the task. For example, there may be files the task failed to process. The DataRepositoryTaskFailureDetails property provides more information about task failures.    SUCCEEDED - FSx completed the task successfully.    CANCELED - Amazon FSx canceled the task and it did not complete.    CANCELING - FSx is in process of canceling the task.  
    */
  var Lifecycle: js.UndefOr[DataRepositoryTaskLifecycle] = js.native
  
  /**
    * The ID of the task being canceled.
    */
  var TaskId: js.UndefOr[typings.awsSdk.fsxMod.TaskId] = js.native
}
object CancelDataRepositoryTaskResponse {
  
  @scala.inline
  def apply(): CancelDataRepositoryTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelDataRepositoryTaskResponse]
  }
  
  @scala.inline
  implicit class CancelDataRepositoryTaskResponseMutableBuilder[Self <: CancelDataRepositoryTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecycle(value: DataRepositoryTaskLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "TaskId", js.undefined)
  }
}
