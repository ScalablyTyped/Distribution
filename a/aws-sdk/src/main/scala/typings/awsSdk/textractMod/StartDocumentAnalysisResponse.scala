package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDocumentAnalysisResponse extends StObject {
  
  /**
    * The identifier for the document text detection job. Use JobId to identify the job in a subsequent call to GetDocumentAnalysis. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typings.awsSdk.textractMod.JobId] = js.native
}
object StartDocumentAnalysisResponse {
  
  @scala.inline
  def apply(): StartDocumentAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDocumentAnalysisResponse]
  }
  
  @scala.inline
  implicit class StartDocumentAnalysisResponseMutableBuilder[Self <: StartDocumentAnalysisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
