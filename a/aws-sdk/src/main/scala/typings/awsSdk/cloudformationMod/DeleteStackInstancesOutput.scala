package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStackInstancesOutput extends StObject {
  
  /**
    * The unique identifier for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}
object DeleteStackInstancesOutput {
  
  @scala.inline
  def apply(): DeleteStackInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteStackInstancesOutput]
  }
  
  @scala.inline
  implicit class DeleteStackInstancesOutputMutableBuilder[Self <: DeleteStackInstancesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
