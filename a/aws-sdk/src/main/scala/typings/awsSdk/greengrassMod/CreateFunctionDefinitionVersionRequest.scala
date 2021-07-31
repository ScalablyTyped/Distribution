package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFunctionDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string
  
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[listOfFunction] = js.undefined
}
object CreateFunctionDefinitionVersionRequest {
  
  @scala.inline
  def apply(FunctionDefinitionId: string): CreateFunctionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class CreateFunctionDefinitionVersionRequestMutableBuilder[Self <: CreateFunctionDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setDefaultConfig(value: FunctionDefaultConfig): Self = StObject.set(x, "DefaultConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConfigUndefined: Self = StObject.set(x, "DefaultConfig", js.undefined)
    
    @scala.inline
    def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctions(value: listOfFunction): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "Functions", js.undefined)
    
    @scala.inline
    def setFunctionsVarargs(value: Function*): Self = StObject.set(x, "Functions", js.Array(value :_*))
  }
}
