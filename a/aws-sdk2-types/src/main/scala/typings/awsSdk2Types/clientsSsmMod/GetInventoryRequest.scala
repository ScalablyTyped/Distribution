package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInventoryRequest extends StObject {
  
  /**
    * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the AWS:InstanceInformation.PlatformType type, you can see a count of how many Windows and Linux managed nodes exist in your inventoried fleet.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined
  
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * The list of inventory item types to return.
    */
  var ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined
}
object GetInventoryRequest {
  
  inline def apply(): GetInventoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInventoryRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregators(value: InventoryAggregatorList): Self = StObject.set(x, "Aggregators", value.asInstanceOf[js.Any])
    
    inline def setAggregatorsUndefined: Self = StObject.set(x, "Aggregators", js.undefined)
    
    inline def setAggregatorsVarargs(value: InventoryAggregator*): Self = StObject.set(x, "Aggregators", js.Array(value*))
    
    inline def setFilters(value: InventoryFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: InventoryFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResultAttributes(value: ResultAttributeList): Self = StObject.set(x, "ResultAttributes", value.asInstanceOf[js.Any])
    
    inline def setResultAttributesUndefined: Self = StObject.set(x, "ResultAttributes", js.undefined)
    
    inline def setResultAttributesVarargs(value: ResultAttribute*): Self = StObject.set(x, "ResultAttributes", js.Array(value*))
  }
}
