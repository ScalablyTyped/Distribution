package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInventoryRequest extends StObject {
  
  /**
    * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the AWS:InstanceInformation.PlatformType type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The list of inventory item types to return.
    */
  var ResultAttributes: js.UndefOr[ResultAttributeList] = js.native
}
object GetInventoryRequest {
  
  @scala.inline
  def apply(): GetInventoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventoryRequest]
  }
  
  @scala.inline
  implicit class GetInventoryRequestMutableBuilder[Self <: GetInventoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregators(value: InventoryAggregatorList): Self = StObject.set(x, "Aggregators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorsUndefined: Self = StObject.set(x, "Aggregators", js.undefined)
    
    @scala.inline
    def setAggregatorsVarargs(value: InventoryAggregator*): Self = StObject.set(x, "Aggregators", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: InventoryFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: InventoryFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResultAttributes(value: ResultAttributeList): Self = StObject.set(x, "ResultAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultAttributesUndefined: Self = StObject.set(x, "ResultAttributes", js.undefined)
    
    @scala.inline
    def setResultAttributesVarargs(value: ResultAttribute*): Self = StObject.set(x, "ResultAttributes", js.Array(value :_*))
  }
}
