package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStateMachineInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the state machine to describe.
    */
  var stateMachineArn: Arn
}
object DescribeStateMachineInput {
  
  @scala.inline
  def apply(stateMachineArn: Arn): DescribeStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineInput]
  }
  
  @scala.inline
  implicit class DescribeStateMachineInputMutableBuilder[Self <: DescribeStateMachineInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
  }
}
