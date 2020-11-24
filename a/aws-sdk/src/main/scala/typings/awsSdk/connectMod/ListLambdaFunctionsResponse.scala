package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLambdaFunctionsResponse extends js.Object {
  
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
  implicit class ListLambdaFunctionsResponseOps[Self <: ListLambdaFunctionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLambdaFunctionsVarargs(value: FunctionArn*): Self = this.set("LambdaFunctions", js.Array(value :_*))
    
    @scala.inline
    def setLambdaFunctions(value: FunctionArnsList): Self = this.set("LambdaFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaFunctions: Self = this.set("LambdaFunctions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
