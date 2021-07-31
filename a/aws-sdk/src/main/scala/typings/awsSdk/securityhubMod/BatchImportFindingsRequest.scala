package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchImportFindingsRequest extends StObject {
  
  /**
    * A list of findings to import. To successfully import a finding, it must follow the AWS Security Finding Format. Maximum of 100 findings per request.
    */
  var Findings: AwsSecurityFindingList
}
object BatchImportFindingsRequest {
  
  @scala.inline
  def apply(Findings: AwsSecurityFindingList): BatchImportFindingsRequest = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsRequest]
  }
  
  @scala.inline
  implicit class BatchImportFindingsRequestMutableBuilder[Self <: BatchImportFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: AwsSecurityFindingList): Self = StObject.set(x, "Findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsVarargs(value: AwsSecurityFinding*): Self = StObject.set(x, "Findings", js.Array(value :_*))
  }
}
