package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackSetOperationInput extends StObject {
  
  /**
    * The unique ID of the stack set operation. 
    */
  var OperationId: ClientRequestToken = js.native
  
  /**
    * The name or the unique stack ID of the stack set for the stack operation.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}
object DescribeStackSetOperationInput {
  
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): DescribeStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackSetOperationInput]
  }
  
  @scala.inline
  implicit class DescribeStackSetOperationInputMutableBuilder[Self <: DescribeStackSetOperationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
