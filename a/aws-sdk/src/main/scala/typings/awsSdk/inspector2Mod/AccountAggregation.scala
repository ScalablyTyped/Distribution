package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAggregation extends StObject {
  
  /**
    * The type of finding.
    */
  var findingType: js.UndefOr[AggregationFindingType] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[AggregationResourceType] = js.undefined
  
  /**
    * The value to sort by.
    */
  var sortBy: js.UndefOr[AccountSortBy] = js.undefined
  
  /**
    * The sort order (ascending or descending).
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object AccountAggregation {
  
  inline def apply(): AccountAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAggregation]
  }
  
  extension [Self <: AccountAggregation](x: Self) {
    
    inline def setFindingType(value: AggregationFindingType): Self = StObject.set(x, "findingType", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeUndefined: Self = StObject.set(x, "findingType", js.undefined)
    
    inline def setResourceType(value: AggregationResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSortBy(value: AccountSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
