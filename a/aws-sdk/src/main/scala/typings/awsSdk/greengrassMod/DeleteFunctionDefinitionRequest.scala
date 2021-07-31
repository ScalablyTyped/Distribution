package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFunctionDefinitionRequest extends StObject {
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string
}
object DeleteFunctionDefinitionRequest {
  
  @scala.inline
  def apply(FunctionDefinitionId: string): DeleteFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFunctionDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteFunctionDefinitionRequestMutableBuilder[Self <: DeleteFunctionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
  }
}
