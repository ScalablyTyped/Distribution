package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListActionExecutionsOutput extends js.Object {
  
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
  implicit class ListActionExecutionsOutputOps[Self <: ListActionExecutionsOutput] (val x: Self) extends AnyVal {
    
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
    def setActionExecutionDetailsVarargs(value: ActionExecutionDetail*): Self = this.set("actionExecutionDetails", js.Array(value :_*))
    
    @scala.inline
    def setActionExecutionDetails(value: ActionExecutionDetailList): Self = this.set("actionExecutionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionExecutionDetails: Self = this.set("actionExecutionDetails", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
