package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLambdaFunctionsResponse extends StObject {
  
  /**
    * The Lambdafunction ARNs associated with the specified instance.
    */
  var LambdaFunctions: js.UndefOr[FunctionArnsList] = js.native
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}
object ListLambdaFunctionsResponse {
  
  @scala.inline
  def apply(): ListLambdaFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLambdaFunctionsResponse]
  }
  
  @scala.inline
  implicit class ListLambdaFunctionsResponseMutableBuilder[Self <: ListLambdaFunctionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLambdaFunctions(value: FunctionArnsList): Self = StObject.set(x, "LambdaFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionsUndefined: Self = StObject.set(x, "LambdaFunctions", js.undefined)
    
    @scala.inline
    def setLambdaFunctionsVarargs(value: FunctionArn*): Self = StObject.set(x, "LambdaFunctions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
