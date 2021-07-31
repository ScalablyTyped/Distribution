package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListICD10CMInferenceJobsRequest extends StObject {
  
  /**
    * Filters the jobs that are returned. You can filter jobs based on their names, status, or the date and time that they were submitted. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined
  
  /**
    * The maximum number of results to return in each page. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListICD10CMInferenceJobsRequest {
  
  @scala.inline
  def apply(): ListICD10CMInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListICD10CMInferenceJobsRequest]
  }
  
  @scala.inline
  implicit class ListICD10CMInferenceJobsRequestMutableBuilder[Self <: ListICD10CMInferenceJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: ComprehendMedicalAsyncJobFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
