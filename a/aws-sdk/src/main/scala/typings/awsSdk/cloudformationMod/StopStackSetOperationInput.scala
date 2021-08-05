package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopStackSetOperationInput extends StObject {
  
  /**
    * The ID of the stack operation. 
    */
  var OperationId: ClientRequestToken
  
  /**
    * The name or unique ID of the stack set that you want to stop the operation for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName
}
object StopStackSetOperationInput {
  
  inline def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): StopStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStackSetOperationInput]
  }
  
  extension [Self <: StopStackSetOperationInput](x: Self) {
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
