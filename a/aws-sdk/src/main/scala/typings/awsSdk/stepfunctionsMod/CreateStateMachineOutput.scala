package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStateMachineOutput extends StObject {
  
  /**
    * The date the state machine is created.
    */
  var creationDate: Timestamp = js.native
  
  /**
    * The Amazon Resource Name (ARN) that identifies the created state machine.
    */
  var stateMachineArn: Arn = js.native
}
object CreateStateMachineOutput {
  
  @scala.inline
  def apply(creationDate: Timestamp, stateMachineArn: Arn): CreateStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStateMachineOutput]
  }
  
  @scala.inline
  implicit class CreateStateMachineOutputMutableBuilder[Self <: CreateStateMachineOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
  }
}
