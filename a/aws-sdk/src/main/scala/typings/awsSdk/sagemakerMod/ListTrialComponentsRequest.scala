package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrialComponentsRequest extends StObject {
  
  /**
    * A filter that returns only components created after the specified time.
    */
  var CreatedAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only components created before the specified time.
    */
  var CreatedBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only components that are part of the specified experiment. If you specify ExperimentName, you can't filter by SourceArn or TrialName.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The maximum number of components to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the previous call to ListTrialComponents didn't return the full set of components, the call returns a token for getting the next set of components.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortTrialComponentsBy] = js.undefined
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.undefined
  
  /**
    * A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you specify SourceArn, you can't filter by ExperimentName or TrialName.
    */
  var SourceArn: js.UndefOr[String256] = js.undefined
  
  /**
    * A filter that returns only components that are part of the specified trial. If you specify TrialName, you can't filter by ExperimentName or SourceArn.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.undefined
}
object ListTrialComponentsRequest {
  
  @scala.inline
  def apply(): ListTrialComponentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialComponentsRequest]
  }
  
  @scala.inline
  implicit class ListTrialComponentsRequestMutableBuilder[Self <: ListTrialComponentsRequest] (val x: Self) extends AnyVal {
    
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
    def setSortBy(value: SortTrialComponentsBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    @scala.inline
    def setSourceArn(value: String256): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialNameUndefined: Self = StObject.set(x, "TrialName", js.undefined)
  }
}
