package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.Search.IGeocodeRequestOptions
import typings.bingmaps.Microsoft.Maps.Search.ReverseGeocodeRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an easy method for geocoding address and searching for points of interest from JavaScript.
  * @requires The Microsoft.Maps.Search module.
  */
object Search {
  
  @JSGlobal("Microsoft.Maps.Search.MatchCode")
  @js.native
  object MatchCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Search.MatchCode & Double] = js.native
    
    /* 2 */ val ambiguous: typings.bingmaps.Microsoft.Maps.Search.MatchCode.ambiguous & Double = js.native
    
    /* 1 */ val good: typings.bingmaps.Microsoft.Maps.Search.MatchCode.good & Double = js.native
    
    /* 4 */ val modified: typings.bingmaps.Microsoft.Maps.Search.MatchCode.modified & Double = js.native
    
    /* 0 */ val none: typings.bingmaps.Microsoft.Maps.Search.MatchCode.none & Double = js.native
    
    /* 3 */ val upHierarchy: typings.bingmaps.Microsoft.Maps.Search.MatchCode.upHierarchy & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Search.MatchConfidence")
  @js.native
  object MatchConfidence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.Search.MatchConfidence & Double] = js.native
    
    /* 0 */ val high: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.high & Double = js.native
    
    /* 2 */ val low: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.low & Double = js.native
    
    /* 1 */ val medium: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.medium & Double = js.native
    
    /* 3 */ val unknown: typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.unknown & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Search.SearchManager")
  @js.native
  open class SearchManager protected ()
    extends StObject
       with typings.bingmaps.Microsoft.Maps.Search.SearchManager {
    /**
      * @constructor
      * @requires The Microsoft.Maps.Search module.
      * @param map A Map object
      */
    def this(map: typings.bingmaps.Microsoft.Maps.Map) = this()
    
    /**
      * Matches the address or place query in the specified request 
      * options to a location and returns the results to the request 
      * options callback function.
      * @param request Options for sending geocode request
      */
    /* CompleteClass */
    override def geocode(request: IGeocodeRequestOptions): Unit = js.native
    
    /**
      * Matches the specified location to an address and returns the 
      * address results to the specified request options callback function.
      * @param request Options for sending reverse geocode request
      */
    /* CompleteClass */
    override def reverseGeocode(request: ReverseGeocodeRequestOptions): Unit = js.native
  }
}
