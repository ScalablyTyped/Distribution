package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExecutionOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that id entifies the execution.
    */
  var executionArn: Arn
  
  /**
    * The date the execution is started.
    */
  var startDate: Timestamp
}
object StartExecutionOutput {
  
  @scala.inline
  def apply(executionArn: Arn, startDate: Timestamp): StartExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExecutionOutput]
  }
  
  @scala.inline
  implicit class StartExecutionOutputMutableBuilder[Self <: StartExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Timestamp): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
