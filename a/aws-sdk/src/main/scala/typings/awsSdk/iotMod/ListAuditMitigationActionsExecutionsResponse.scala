package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAuditMitigationActionsExecutionsResponse extends js.Object {
  
  /**
    * A set of task execution results based on the input parameters. Details include the mitigation action applied, start time, and task status.
    */
  var actionsExecutions: js.UndefOr[AuditMitigationActionExecutionMetadataList] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAuditMitigationActionsExecutionsResponse {
  
  @scala.inline
  def apply(): ListAuditMitigationActionsExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditMitigationActionsExecutionsResponse]
  }
  
  @scala.inline
  implicit class ListAuditMitigationActionsExecutionsResponseOps[Self <: ListAuditMitigationActionsExecutionsResponse] (val x: Self) extends AnyVal {
    
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
    def setActionsExecutionsVarargs(value: AuditMitigationActionExecutionMetadata*): Self = this.set("actionsExecutions", js.Array(value :_*))
    
    @scala.inline
    def setActionsExecutions(value: AuditMitigationActionExecutionMetadataList): Self = this.set("actionsExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsExecutions: Self = this.set("actionsExecutions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
