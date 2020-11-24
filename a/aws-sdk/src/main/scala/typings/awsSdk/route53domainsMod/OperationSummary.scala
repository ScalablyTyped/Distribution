package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationSummary extends js.Object {
  
  /**
    * Identifier returned to track the requested action.
    */
  var OperationId: typings.awsSdk.route53domainsMod.OperationId = js.native
  
  /**
    * The current status of the requested operation in the system.
    */
  var Status: OperationStatus = js.native
  
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: Timestamp = js.native
  
  /**
    * Type of the action requested.
    */
  var Type: OperationType = js.native
}
object OperationSummary {
  
  @scala.inline
  def apply(OperationId: OperationId, Status: OperationStatus, SubmittedDate: Timestamp, Type: OperationType): OperationSummary = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubmittedDate = SubmittedDate.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationSummary]
  }
  
  @scala.inline
  implicit class OperationSummaryOps[Self <: OperationSummary] (val x: Self) extends AnyVal {
    
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
    def setOperationId(value: OperationId): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OperationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedDate(value: Timestamp): Self = this.set("SubmittedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OperationType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
