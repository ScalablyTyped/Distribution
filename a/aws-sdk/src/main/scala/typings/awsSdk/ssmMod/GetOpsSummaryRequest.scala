package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpsSummaryRequest extends StObject {
  
  /**
    * Optional aggregators that return counts of OpsItems based on one or more expressions.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.native
  
  /**
    * Optional filters used to scope down the returned OpsItems. 
    */
  var Filters: js.UndefOr[OpsFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The OpsItem data type to return.
    */
  var ResultAttributes: js.UndefOr[OpsResultAttributeList] = js.native
  
  /**
    * Specify the name of a resource data sync to get.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.native
}
object GetOpsSummaryRequest {
  
  @scala.inline
  def apply(): GetOpsSummaryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsSummaryRequest]
  }
  
  @scala.inline
  implicit class GetOpsSummaryRequestMutableBuilder[Self <: GetOpsSummaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregators(value: OpsAggregatorList): Self = StObject.set(x, "Aggregators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorsUndefined: Self = StObject.set(x, "Aggregators", js.undefined)
    
    @scala.inline
    def setAggregatorsVarargs(value: OpsAggregator*): Self = StObject.set(x, "Aggregators", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: OpsFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: OpsFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResultAttributes(value: OpsResultAttributeList): Self = StObject.set(x, "ResultAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultAttributesUndefined: Self = StObject.set(x, "ResultAttributes", js.undefined)
    
    @scala.inline
    def setResultAttributesVarargs(value: OpsResultAttribute*): Self = StObject.set(x, "ResultAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSyncName(value: ResourceDataSyncName): Self = StObject.set(x, "SyncName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncNameUndefined: Self = StObject.set(x, "SyncName", js.undefined)
  }
}
