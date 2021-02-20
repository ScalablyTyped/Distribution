package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopStackSetOperationInput extends StObject {
  
  /**
    * The ID of the stack operation. 
    */
  var OperationId: ClientRequestToken = js.native
  
  /**
    * The name or unique ID of the stack set that you want to stop the operation for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}
object StopStackSetOperationInput {
  
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): StopStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStackSetOperationInput]
  }
  
  @scala.inline
  implicit class StopStackSetOperationInputMutableBuilder[Self <: StopStackSetOperationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
