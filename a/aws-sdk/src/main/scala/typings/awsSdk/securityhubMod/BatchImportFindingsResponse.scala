package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchImportFindingsResponse extends StObject {
  
  /**
    * The number of findings that failed to import.
    */
  var FailedCount: Integer = js.native
  
  /**
    * The list of findings that failed to import.
    */
  var FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.native
  
  /**
    * The number of findings that were successfully imported.
    */
  var SuccessCount: Integer = js.native
}
object BatchImportFindingsResponse {
  
  @scala.inline
  def apply(FailedCount: Integer, SuccessCount: Integer): BatchImportFindingsResponse = {
    val __obj = js.Dynamic.literal(FailedCount = FailedCount.asInstanceOf[js.Any], SuccessCount = SuccessCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsResponse]
  }
  
  @scala.inline
  implicit class BatchImportFindingsResponseMutableBuilder[Self <: BatchImportFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedCount(value: Integer): Self = StObject.set(x, "FailedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedFindings(value: ImportFindingsErrorList): Self = StObject.set(x, "FailedFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedFindingsUndefined: Self = StObject.set(x, "FailedFindings", js.undefined)
    
    @scala.inline
    def setFailedFindingsVarargs(value: ImportFindingsError*): Self = StObject.set(x, "FailedFindings", js.Array(value :_*))
    
    @scala.inline
    def setSuccessCount(value: Integer): Self = StObject.set(x, "SuccessCount", value.asInstanceOf[js.Any])
  }
}
