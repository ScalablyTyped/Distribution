package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionDefinitionRequest extends StObject {
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object UpdateFunctionDefinitionRequest {
  
  @scala.inline
  def apply(FunctionDefinitionId: string): UpdateFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateFunctionDefinitionRequestMutableBuilder[Self <: UpdateFunctionDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
