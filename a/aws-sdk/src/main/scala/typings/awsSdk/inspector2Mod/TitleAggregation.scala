package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleAggregation extends StObject {
  
  /**
    * The resource type to aggregate on.
    */
  var resourceType: js.UndefOr[AggregationResourceType] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var sortBy: js.UndefOr[TitleSortBy] = js.undefined
  
  /**
    * The order to sort results by.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  
  /**
    * The finding titles to aggregate on.
    */
  var titles: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The vulnerability IDs of the findings.
    */
  var vulnerabilityIds: js.UndefOr[StringFilterList] = js.undefined
}
object TitleAggregation {
  
  inline def apply(): TitleAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleAggregation]
  }
  
  extension [Self <: TitleAggregation](x: Self) {
    
    inline def setResourceType(value: AggregationResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSortBy(value: TitleSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setTitles(value: StringFilterList): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
    
    inline def setTitlesVarargs(value: StringFilter*): Self = StObject.set(x, "titles", js.Array(value*))
    
    inline def setVulnerabilityIds(value: StringFilterList): Self = StObject.set(x, "vulnerabilityIds", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityIdsUndefined: Self = StObject.set(x, "vulnerabilityIds", js.undefined)
    
    inline def setVulnerabilityIdsVarargs(value: StringFilter*): Self = StObject.set(x, "vulnerabilityIds", js.Array(value*))
  }
}
