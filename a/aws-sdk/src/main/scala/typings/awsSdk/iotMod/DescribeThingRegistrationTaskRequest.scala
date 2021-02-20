package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThingRegistrationTaskRequest extends StObject {
  
  /**
    * The task ID.
    */
  var taskId: TaskId = js.native
}
object DescribeThingRegistrationTaskRequest {
  
  @scala.inline
  def apply(taskId: TaskId): DescribeThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingRegistrationTaskRequest]
  }
  
  @scala.inline
  implicit class DescribeThingRegistrationTaskRequestMutableBuilder[Self <: DescribeThingRegistrationTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
