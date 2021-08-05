package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitiesRequest extends StObject {
  
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog
  
  /**
    * The type of entities to retrieve.
    */
  var EntityType: typings.awsSdk.marketplacecatalogMod.EntityType
  
  /**
    * An array of filter objects. Each filter object contains two attributes, filterName and filterValues.
    */
  var FilterList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.FilterList] = js.undefined
  
  /**
    * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.undefined
  
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.undefined
  
  /**
    * An object that contains two attributes, SortBy and SortOrder.
    */
  var Sort: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Sort] = js.undefined
}
object ListEntitiesRequest {
  
  inline def apply(Catalog: Catalog, EntityType: EntityType): ListEntitiesRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], EntityType = EntityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitiesRequest]
  }
  
  extension [Self <: ListEntitiesRequest](x: Self) {
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
    
    inline def setFilterList(value: FilterList): Self = StObject.set(x, "FilterList", value.asInstanceOf[js.Any])
    
    inline def setFilterListUndefined: Self = StObject.set(x, "FilterList", js.undefined)
    
    inline def setFilterListVarargs(value: Filter*): Self = StObject.set(x, "FilterList", js.Array(value :_*))
    
    inline def setMaxResults(value: MaxResultInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
  }
}
