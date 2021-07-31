package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExecutionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the execution to describe.
    */
  var executionArn: Arn
}
object DescribeExecutionInput {
  
  @scala.inline
  def apply(executionArn: Arn): DescribeExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionInput]
  }
  
  @scala.inline
  implicit class DescribeExecutionInputMutableBuilder[Self <: DescribeExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
  }
}
