package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrialsRequest extends StObject {
  
  /**
    * A filter that returns only trials created after the specified time.
    */
  var CreatedAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only trials created before the specified time.
    */
  var CreatedBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only trials that are part of the specified experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * The maximum number of trials to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * If the previous call to ListTrials didn't return the full set of trials, the call returns a token for getting the next set of trials.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortTrialsBy] = js.native
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  
  /**
    * A filter that returns only trials that are associated with the specified trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.native
}
object ListTrialsRequest {
  
  @scala.inline
  def apply(): ListTrialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialsRequest]
  }
  
  @scala.inline
  implicit class ListTrialsRequestMutableBuilder[Self <: ListTrialsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAfter(value: Timestamp): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    @scala.inline
    def setCreatedBefore(value: Timestamp): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: SortTrialsBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentNameUndefined: Self = StObject.set(x, "TrialComponentName", js.undefined)
  }
}
