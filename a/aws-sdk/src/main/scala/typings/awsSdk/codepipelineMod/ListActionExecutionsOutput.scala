package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListActionExecutionsOutput extends StObject {
  
  /**
    * The details for a list of recent executions, such as action execution ID.
    */
  var actionExecutionDetails: js.UndefOr[ActionExecutionDetailList] = js.native
  
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListActionExecutions call to return the next set of action executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListActionExecutionsOutput {
  
  @scala.inline
  def apply(): ListActionExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActionExecutionsOutput]
  }
  
  @scala.inline
  implicit class ListActionExecutionsOutputMutableBuilder[Self <: ListActionExecutionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionExecutionDetails(value: ActionExecutionDetailList): Self = StObject.set(x, "actionExecutionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionExecutionDetailsUndefined: Self = StObject.set(x, "actionExecutionDetails", js.undefined)
    
    @scala.inline
    def setActionExecutionDetailsVarargs(value: ActionExecutionDetail*): Self = StObject.set(x, "actionExecutionDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
