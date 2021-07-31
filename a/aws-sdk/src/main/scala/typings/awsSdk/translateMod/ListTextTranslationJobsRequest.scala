package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTextTranslationJobsRequest extends StObject {
  
  /**
    * The parameters that specify which batch translation jobs to retrieve. Filters include job name, job status, and submission time. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[TextTranslationJobFilter] = js.undefined
  
  /**
    * The maximum number of results to return in each page. The default value is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.undefined
}
object ListTextTranslationJobsRequest {
  
  @scala.inline
  def apply(): ListTextTranslationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTextTranslationJobsRequest]
  }
  
  @scala.inline
  implicit class ListTextTranslationJobsRequestMutableBuilder[Self <: ListTextTranslationJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: TextTranslationJobFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
