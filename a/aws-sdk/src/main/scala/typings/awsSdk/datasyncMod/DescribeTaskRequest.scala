package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTaskRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task to describe.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn = js.native
}
object DescribeTaskRequest {
  
  @scala.inline
  def apply(TaskArn: TaskArn): DescribeTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskRequest]
  }
  
  @scala.inline
  implicit class DescribeTaskRequestMutableBuilder[Self <: DescribeTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
  }
}
