package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryAPIOptions extends StObject {
  
  /** Specifies a conditional expression for a list of properties and values. */
  var filter: js.UndefOr[String | IFilter] = js.native
  
  /** Specifies whether or not to return a count of the results in the response. Default: false */
  var inlineCount: js.UndefOr[Boolean] = js.native
  
  /** Specifies to query the staged version of the data source instead of the published version. Default: false */
  var isStaging: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies one or more properties to use to sort the results of a query. 
    * You can specify up to three (3) properties. Results are sorted in ascending order.
    * Note: You cannot use the latitude and longitude properties to sort results. You can use the elevation property.
    */
  var orderBy: js.UndefOr[js.Array[String]] = js.native
  
  /** A queryurl containing the access id, data source name and the entity type name. */
  var queryUrl: String = js.native
  
  /**
    * Specifies the data source properties to return in the response. If the $select query option is not specified or
    * if it is set to "" ($select=), all data source properties are returned. Default: "*,_distance"
    */
  var select: js.UndefOr[js.Array[String]] = js.native
  
  /** Specifies to not return a specified number of query results. */
  var skip: js.UndefOr[Double] = js.native
  
  /** Spatial filter options to apply. */
  var spatialFilter: js.UndefOr[ISpatialFilterOptions | IFindNearRouteOptions] = js.native
  
  /** Specifies the maximum number of results to return in the query response. Default: 25 */
  var top: js.UndefOr[Double] = js.native
}
object IQueryAPIOptions {
  
  @scala.inline
  def apply(queryUrl: String): IQueryAPIOptions = {
    val __obj = js.Dynamic.literal(queryUrl = queryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryAPIOptions]
  }
  
  @scala.inline
  implicit class IQueryAPIOptionsMutableBuilder[Self <: IQueryAPIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String | IFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setInlineCount(value: Boolean): Self = StObject.set(x, "inlineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineCountUndefined: Self = StObject.set(x, "inlineCount", js.undefined)
    
    @scala.inline
    def setIsStaging(value: Boolean): Self = StObject.set(x, "isStaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStagingUndefined: Self = StObject.set(x, "isStaging", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Array[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setOrderByVarargs(value: String*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
    
    @scala.inline
    def setQueryUrl(value: String): Self = StObject.set(x, "queryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: js.Array[String]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value :_*))
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSpatialFilter(value: ISpatialFilterOptions | IFindNearRouteOptions): Self = StObject.set(x, "spatialFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialFilterUndefined: Self = StObject.set(x, "spatialFilter", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
