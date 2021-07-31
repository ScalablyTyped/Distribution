package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionDefinitionRequest extends StObject {
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string
}
object GetFunctionDefinitionRequest {
  
  @scala.inline
  def apply(FunctionDefinitionId: string): GetFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionDefinitionRequest]
  }
  
  @scala.inline
  implicit class GetFunctionDefinitionRequestMutableBuilder[Self <: GetFunctionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
  }
}
