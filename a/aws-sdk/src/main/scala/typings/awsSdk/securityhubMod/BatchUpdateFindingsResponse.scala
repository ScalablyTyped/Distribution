package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateFindingsResponse extends StObject {
  
  /**
    * The list of findings that were updated successfully.
    */
  var ProcessedFindings: AwsSecurityFindingIdentifierList
  
  /**
    * The list of findings that were not updated.
    */
  var UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList
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
  implicit class BatchUpdateFindingsResponseMutableBuilder[Self <: BatchUpdateFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessedFindings(value: AwsSecurityFindingIdentifierList): Self = StObject.set(x, "ProcessedFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedFindingsVarargs(value: AwsSecurityFindingIdentifier*): Self = StObject.set(x, "ProcessedFindings", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedFindings(value: BatchUpdateFindingsUnprocessedFindingsList): Self = StObject.set(x, "UnprocessedFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedFindingsVarargs(value: BatchUpdateFindingsUnprocessedFinding*): Self = StObject.set(x, "UnprocessedFindings", js.Array(value :_*))
  }
}
