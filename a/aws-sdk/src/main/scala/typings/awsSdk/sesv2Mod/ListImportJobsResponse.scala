package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportJobsResponse extends StObject {
  
  /**
    * A list of the import job summaries.
    */
  var ImportJobs: js.UndefOr[ImportJobSummaryList] = js.undefined
  
  /**
    * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a subsequent call to ListImportJobs with the same parameters to retrieve the next page of import jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.undefined
}
object ListImportJobsResponse {
  
  @scala.inline
  def apply(): ListImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportJobsResponse]
  }
  
  @scala.inline
  implicit class ListImportJobsResponseMutableBuilder[Self <: ListImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportJobs(value: ImportJobSummaryList): Self = StObject.set(x, "ImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportJobsUndefined: Self = StObject.set(x, "ImportJobs", js.undefined)
    
    @scala.inline
    def setImportJobsVarargs(value: ImportJobSummary*): Self = StObject.set(x, "ImportJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
