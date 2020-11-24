package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateFindingsResponse extends js.Object {
  
  /**
    * The list of findings that were updated successfully.
    */
  var ProcessedFindings: AwsSecurityFindingIdentifierList = js.native
  
  /**
    * The list of findings that were not updated.
    */
  var UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList = js.native
}
object BatchUpdateFindingsResponse {
  
  @scala.inline
  def apply(
    ProcessedFindings: AwsSecurityFindingIdentifierList,
    UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList
  ): BatchUpdateFindingsResponse = {
    val __obj = js.Dynamic.literal(ProcessedFindings = ProcessedFindings.asInstanceOf[js.Any], UnprocessedFindings = UnprocessedFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateFindingsResponseOps[Self <: BatchUpdateFindingsResponse] (val x: Self) extends AnyVal {
    
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
    def setProcessedFindingsVarargs(value: AwsSecurityFindingIdentifier*): Self = this.set("ProcessedFindings", js.Array(value :_*))
    
    @scala.inline
    def setProcessedFindings(value: AwsSecurityFindingIdentifierList): Self = this.set("ProcessedFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedFindingsVarargs(value: BatchUpdateFindingsUnprocessedFinding*): Self = this.set("UnprocessedFindings", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedFindings(value: BatchUpdateFindingsUnprocessedFindingsList): Self = this.set("UnprocessedFindings", value.asInstanceOf[js.Any])
  }
}
