package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCandidatesForAutoMLJobRequest extends StObject {
  
  /**
    * List the candidates created for the job by providing the job's name.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName
  
  /**
    * List the candidates for the job and filter by candidate name.
    */
  var CandidateNameEquals: js.UndefOr[CandidateName] = js.undefined
  
  /**
    * List the job's candidates up to a specified limit.
    */
  var MaxResults: js.UndefOr[AutoMLMaxResults] = js.undefined
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The parameter by which to sort the results. The default is Descending.
    */
  var SortBy: js.UndefOr[CandidateSortBy] = js.undefined
  
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[AutoMLSortOrder] = js.undefined
  
  /**
    * List the candidates for the job and filter by status.
    */
  var StatusEquals: js.UndefOr[CandidateStatus] = js.undefined
}
object ListCandidatesForAutoMLJobRequest {
  
  inline def apply(AutoMLJobName: AutoMLJobName): ListCandidatesForAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCandidatesForAutoMLJobRequest]
  }
  
  extension [Self <: ListCandidatesForAutoMLJobRequest](x: Self) {
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    inline def setCandidateNameEquals(value: CandidateName): Self = StObject.set(x, "CandidateNameEquals", value.asInstanceOf[js.Any])
    
    inline def setCandidateNameEqualsUndefined: Self = StObject.set(x, "CandidateNameEquals", js.undefined)
    
    inline def setMaxResults(value: AutoMLMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: CandidateSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: AutoMLSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setStatusEquals(value: CandidateStatus): Self = StObject.set(x, "StatusEquals", value.asInstanceOf[js.Any])
    
    inline def setStatusEqualsUndefined: Self = StObject.set(x, "StatusEquals", js.undefined)
  }
}
