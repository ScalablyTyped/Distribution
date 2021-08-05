package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskExecutionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the task that is being executed.
    */
  var TaskExecutionArn: typings.awsSdk.datasyncMod.TaskExecutionArn
}
object DescribeTaskExecutionRequest {
  
  inline def apply(TaskExecutionArn: TaskExecutionArn): DescribeTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskExecutionRequest]
  }
  
  extension [Self <: DescribeTaskExecutionRequest](x: Self) {
    
    inline def setTaskExecutionArn(value: TaskExecutionArn): Self = StObject.set(x, "TaskExecutionArn", value.asInstanceOf[js.Any])
  }
}
