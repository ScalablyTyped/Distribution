package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserDefinedFunctionsResponse extends js.Object {
  
  /**
    * A continuation token, if the list of functions returned does not include the last requested function.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of requested function definitions.
    */
  var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList] = js.native
}
object GetUserDefinedFunctionsResponse {
  
  @scala.inline
  def apply(): GetUserDefinedFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDefinedFunctionsResponse]
  }
  
  @scala.inline
  implicit class GetUserDefinedFunctionsResponseOps[Self <: GetUserDefinedFunctionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionsVarargs(value: UserDefinedFunction*): Self = this.set("UserDefinedFunctions", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedFunctions(value: UserDefinedFunctionList): Self = this.set("UserDefinedFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedFunctions: Self = this.set("UserDefinedFunctions", js.undefined)
  }
}
