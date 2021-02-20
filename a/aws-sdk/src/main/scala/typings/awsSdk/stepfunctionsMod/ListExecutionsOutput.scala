package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExecutionsOutput extends StObject {
  
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
  implicit class ListExecutionsOutputMutableBuilder[Self <: ListExecutionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutions(value: ExecutionList): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionsVarargs(value: ExecutionListItem*): Self = StObject.set(x, "executions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: ListExecutionsPageToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
