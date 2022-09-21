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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module wraps the Query and GeoData REST API’s in the Bing Spatial Dara Services and expose them as an easy to use JavaScript library.
  * @requires The Microsoft.Maps.SpatialDataService module.
  */
object SpatialDataService {
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.Filter")
  @js.native
  open class Filter protected ()
    extends StObject
       with typings.bingmaps.Microsoft.Maps.SpatialDataService.Filter {
    /**
      * @constructor
      * @requires The Microsoft.Maps.SpatialDataService module.
      * @param propertyName The name of the property in the object to test against. Can also provide child properties i.e. 'root.child'.
      * @param operator The operator to use when comparing the specified property to value to the provided value.
      * @param value A value to compare against.
      */
    def this(propertyName: String, operator: String, value: Any) = this()
    def this(propertyName: String, operator: FilterCompareOperator, value: Any) = this()
    
    /**
      * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
      * @returns A boolean indicating if the specified object meets the requirements of the Filter.
      */
    /* CompleteClass */
    override def execute(`object`: Any): Boolean = js.native
  }
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.FilterCompareOperator")
  @js.native
  object FilterCompareOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator & Double
      ] = js.native
    
    /* 0 */ val endsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.endsWith & Double = js.native
    
    /* 1 */ @JSName("equals")
    val equals_ : equals & Double = js.native
    
    /* 2 */ val greaterThan: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThan & Double = js.native
    
    /* 3 */ val greaterThanOrEqual: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThanOrEqual & Double = js.native
    
    /* 4 */ val isIn: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.isIn & Double = js.native
    
    /* 5 */ val lessThan: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThan & Double = js.native
    
    /* 6 */ val lessThanOrEqual: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThanOrEqual & Double = js.native
    
    /* 7 */ val notEndsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEndsWith & Double = js.native
    
    /* 8 */ val notEquals: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEquals & Double = js.native
    
    /* 9 */ val notStartsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notStartsWith & Double = js.native
    
    /* 10 */ val startsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.startsWith & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.FilterGroup")
  @js.native
  open class FilterGroup protected ()
    extends StObject
       with typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterGroup {
    /**
      * @constructor
      * @requires The Microsoft.Maps.SpatialDataService module.
      * @param filters An array consisting of Filter or FilterGroup objects to combine.
      * @param operator The logical operator for combining the filters together.
      * @param not A boolean is the logical inverse should of the filter should be used.
      */
    def this(filters: js.Array[IFilter], operator: FilterLogicalOperator) = this()
    def this(filters: js.Array[IFilter], operator: FilterLogicalOperator, not: Boolean) = this()
    
    /**
      * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
      * @returns A boolean indicating if the specified object meets the requirements of the Filter.
      */
    /* CompleteClass */
    override def execute(`object`: Any): Boolean = js.native
  }
  
  @JSGlobal("Microsoft.Maps.SpatialDataService.FilterLogicalOperator")
  @js.native
  object FilterLogicalOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator & Double
      ] = js.native
    
    /* 0 */ val and: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator.and & Double = js.native
    
    /* 1 */ val or: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterLogicalOperator.or & Double = js.native
  }
  
  object GeoDataAPIManager {
    
    @JSGlobal("Microsoft.Maps.SpatialDataService.GeoDataAPIManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: Unit,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
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
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: Unit,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: String,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
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
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: Unit,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
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
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: Unit,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: js.Array[String | typings.bingmaps.Microsoft.Maps.Location],
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
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
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: Unit,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: String,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
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
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: Unit,
      errorCallback: js.Function2[
          /* callbackState */ js.UndefOr[String | typings.bingmaps.Microsoft.Maps.Location], 
          /* networkStatus */ js.UndefOr[String], 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
      locations: typings.bingmaps.Microsoft.Maps.Location,
      request: IGetBoundaryRequestOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function1[/* results */ IGeoDataResultSet, Unit],
      styles: IPolygonOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getBoundary(
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
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundary")(locations.asInstanceOf[js.Any], request.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object QueryAPIManager {
    
    @JSGlobal("Microsoft.Maps.SpatialDataService.QueryAPIManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: Unit,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: String,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: Unit,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def search(
      queryOptions: IQueryAPIOptions,
      credentials: typings.bingmaps.Microsoft.Maps.Map,
      callback: js.Function2[/* data */ js.Array[IPrimitive], /* inlineCount */ js.UndefOr[Double], Unit],
      styles: IStylesOptions,
      errorCallback: js.Function2[/* networkStatus */ js.UndefOr[String], /* statusMessage */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(queryOptions.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
