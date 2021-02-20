package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteStateMachineInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the state machine to delete.
    */
  var stateMachineArn: Arn = js.native
}
object DeleteStateMachineInput {
  
  @scala.inline
  def apply(stateMachineArn: Arn): DeleteStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStateMachineInput]
  }
  
  @scala.inline
  implicit class DeleteStateMachineInputMutableBuilder[Self <: DeleteStateMachineInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
  }
}
