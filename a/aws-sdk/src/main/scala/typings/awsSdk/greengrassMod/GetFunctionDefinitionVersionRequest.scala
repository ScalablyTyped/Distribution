package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionDefinitionVersionRequest extends StObject {
  
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string = js.native
  
  /**
    * The ID of the function definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListFunctionDefinitionVersions'' requests. If the version is the last one that was associated with a function definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var FunctionDefinitionVersionId: string = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object GetFunctionDefinitionVersionRequest {
  
  @scala.inline
  def apply(FunctionDefinitionId: string, FunctionDefinitionVersionId: string): GetFunctionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any], FunctionDefinitionVersionId = FunctionDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class GetFunctionDefinitionVersionRequestMutableBuilder[Self <: GetFunctionDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionDefinitionId(value: string): Self = StObject.set(x, "FunctionDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionDefinitionVersionId(value: string): Self = StObject.set(x, "FunctionDefinitionVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
