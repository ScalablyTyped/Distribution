package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionDefinitionVersionResponse extends StObject {
  
  /**
    * The ARN of the function definition version.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the function definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  
  /**
    * Information on the definition.
    */
  var Definition: js.UndefOr[FunctionDefinitionVersion] = js.native
  
  /**
    * The ID of the function definition version.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The version of the function definition version.
    */
  var Version: js.UndefOr[string] = js.native
}
object GetFunctionDefinitionVersionResponse {
  
  @scala.inline
  def apply(): GetFunctionDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionDefinitionVersionResponse]
  }
  
  @scala.inline
  implicit class GetFunctionDefinitionVersionResponseMutableBuilder[Self <: GetFunctionDefinitionVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: string): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setDefinition(value: FunctionDefinitionVersion): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
