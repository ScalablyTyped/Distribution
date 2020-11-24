package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExecutionsOutput extends js.Object {
  
  /**
    * The list of matching executions.
    */
  var executions: ExecutionList = js.native
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[ListExecutionsPageToken] = js.native
}
object ListExecutionsOutput {
  
  @scala.inline
  def apply(executions: ExecutionList): ListExecutionsOutput = {
    val __obj = js.Dynamic.literal(executions = executions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExecutionsOutput]
  }
  
  @scala.inline
  implicit class ListExecutionsOutputOps[Self <: ListExecutionsOutput] (val x: Self) extends AnyVal {
    
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
    def setExecutionsVarargs(value: ExecutionListItem*): Self = this.set("executions", js.Array(value :_*))
    
    @scala.inline
    def setExecutions(value: ExecutionList): Self = this.set("executions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: ListExecutionsPageToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
