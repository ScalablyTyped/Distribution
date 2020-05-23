package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryAPIOptions extends js.Object {
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
  @scala.inline
  def apply(
    queryUrl: String,
    filter: String | IFilter = null,
    inlineCount: js.UndefOr[Boolean] = js.undefined,
    isStaging: js.UndefOr[Boolean] = js.undefined,
    orderBy: js.Array[String] = null,
    select: js.Array[String] = null,
    skip: js.UndefOr[Double] = js.undefined,
    spatialFilter: ISpatialFilterOptions | IFindNearRouteOptions = null,
    top: js.UndefOr[Double] = js.undefined
  ): IQueryAPIOptions = {
    val __obj = js.Dynamic.literal(queryUrl = queryUrl.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineCount)) __obj.updateDynamic("inlineCount")(inlineCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isStaging)) __obj.updateDynamic("isStaging")(isStaging.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (spatialFilter != null) __obj.updateDynamic("spatialFilter")(spatialFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryAPIOptions]
  }
}

