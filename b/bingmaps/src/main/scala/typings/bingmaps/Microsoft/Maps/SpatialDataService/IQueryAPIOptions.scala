package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQueryAPIOptions extends StObject {
  
  /** Specifies a conditional expression for a list of properties and values. */
  var filter: js.UndefOr[String | IFilter] = js.undefined
  
  /** Specifies whether or not to return a count of the results in the response. Default: false */
  var inlineCount: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies to query the staged version of the data source instead of the published version. Default: false */
  var isStaging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies one or more properties to use to sort the results of a query. 
    * You can specify up to three (3) properties. Results are sorted in ascending order.
    * Note: You cannot use the latitude and longitude properties to sort results. You can use the elevation property.
    */
  var orderBy: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A queryurl containing the access id, data source name and the entity type name. */
  var queryUrl: String
  
  /**
    * Specifies the data source properties to return in the response. If the $select query option is not specified or
    * if it is set to "" ($select=), all data source properties are returned. Default: "*,_distance"
    */
  var select: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Specifies to not return a specified number of query results. */
  var skip: js.UndefOr[Double] = js.undefined
  
  /** Spatial filter options to apply. */
  var spatialFilter: js.UndefOr[ISpatialFilterOptions | IFindNearRouteOptions] = js.undefined
  
  /** Specifies the maximum number of results to return in the query response. Default: 25 */
  var top: js.UndefOr[Double] = js.undefined
}
object IQueryAPIOptions {
  
  inline def apply(queryUrl: String): IQueryAPIOptions = {
    val __obj = js.Dynamic.literal(queryUrl = queryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryAPIOptions]
  }
  
  extension [Self <: IQueryAPIOptions](x: Self) {
    
    inline def setFilter(value: String | IFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setInlineCount(value: Boolean): Self = StObject.set(x, "inlineCount", value.asInstanceOf[js.Any])
    
    inline def setInlineCountUndefined: Self = StObject.set(x, "inlineCount", js.undefined)
    
    inline def setIsStaging(value: Boolean): Self = StObject.set(x, "isStaging", value.asInstanceOf[js.Any])
    
    inline def setIsStagingUndefined: Self = StObject.set(x, "isStaging", js.undefined)
    
    inline def setOrderBy(value: js.Array[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderByVarargs(value: String*): Self = StObject.set(x, "orderBy", js.Array(value*))
    
    inline def setQueryUrl(value: String): Self = StObject.set(x, "queryUrl", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: js.Array[String]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value*))
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSpatialFilter(value: ISpatialFilterOptions | IFindNearRouteOptions): Self = StObject.set(x, "spatialFilter", value.asInstanceOf[js.Any])
    
    inline def setSpatialFilterUndefined: Self = StObject.set(x, "spatialFilter", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
