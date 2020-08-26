package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPolygonOptions
import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.IStylesOptions
import typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator
import typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.equals
import typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator
import typings.bingmaps.Microsoft.Maps.SpatialDataService.IFilter
import typings.bingmaps.Microsoft.Maps.SpatialDataService.IGeoDataResultSet
import typings.bingmaps.Microsoft.Maps.SpatialDataService.IGetBoundaryRequestOptions
import typings.bingmaps.Microsoft.Maps.SpatialDataService.IQueryAPIOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This module wraps the Query and GeoData REST API’s in the Bing Spatial Dara Services and expose them as an easy to use JavaScript library.
  * @requires The Microsoft.Maps.SpatialDataService module.
  */
@JSGlobal("Microsoft.Maps.SpatialDataService")
@js.native
object SpatialDataService extends js.Object {
  @js.native
  class Filter protected ()
    extends typings.bingmaps.Microsoft.Maps.SpatialDataService.Filter {
    /**
      * @constructor
      * @requires The Microsoft.Maps.SpatialDataService module.
      * @param propertyName The name of the property in the object to test against. Can also provide child properties i.e. 'root.child'.
      * @param operator The operator to use when comparing the specified property to value to the provided value.
      * @param value A value to compare against.
      */
    def this(propertyName: String, operator: String, value: js.Any) = this()
    def this(propertyName: String, operator: FilterCompareOperator, value: js.Any) = this()
  }
  
  @js.native
  class FilterGroup protected ()
    extends typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterGroup {
    /**
      * @constructor
      * @requires The Microsoft.Maps.SpatialDataService module.
      * @param filters An array consisting of Filter or FilterGroup objects to combine.
      * @param operator The logical operator for combining the filters together.
      * @param not A boolean is the logical inverse should of the filter should be used.
      */
    def this(filters: js.Array[IFilter], operator: FilterLogicalOperator) = this()
    def this(filters: js.Array[IFilter], operator: FilterLogicalOperator, not: Boolean) = this()
  }
  
  @js.native
  object FilterCompareOperator extends js.Object {
    /* 0 */ val endsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.endsWith with Double = js.native
    /* 1 */ @JSName("equals")
    val equals_ : equals with Double = js.native
    /* 2 */ val greaterThan: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThan with Double = js.native
    /* 3 */ val greaterThanOrEqual: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThanOrEqual with Double = js.native
    /* 4 */ val isIn: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.isIn with Double = js.native
    /* 5 */ val lessThan: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThan with Double = js.native
    /* 6 */ val lessThanOrEqual: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThanOrEqual with Double = js.native
    /* 7 */ val notEndsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEndsWith with Double = js.native
    /* 8 */ val notEquals: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEquals with Double = js.native
    /* 9 */ val notStartsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notStartsWith with Double = js.native
    /* 10 */ val startsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.startsWith with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator with Double
      ] = js.native
  }
  
  @js.native
  object FilterLogicalOperator extends js.Object {
    /* 0 */ val and: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator.and with Double = js.native
    /* 1 */ val or: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator.or with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator with Double
      ] = js.native
  }
  
  @js.native
  object GeoDataAPIManager extends js.Object {
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = js.native
    def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  object QueryAPIManager extends js.Object {
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions
    ): Unit = js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: js.UndefOr[scala.Nothing],
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions
    ): Unit = js.native
    def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
}

