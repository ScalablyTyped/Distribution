package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an easy method for geocoding address and searching for points of interest from JavaScript.
  * @requires The Microsoft.Maps.Search module.
  */
object Search {
  
  @js.native
  sealed trait MatchCode extends StObject
  @JSGlobal("Microsoft.Maps.Search.MatchCode")
  @js.native
  object MatchCode extends StObject {
    
    /** The match was ambiguous. Multiple results were returned. */
    @js.native
    sealed trait ambiguous extends MatchCode
    
    /** The match was good. */
    @js.native
    sealed trait good extends MatchCode
    
    /** The match was found, but possibly using a modified query. */
    @js.native
    sealed trait modified extends MatchCode
    
    /** No match was found. */
    @js.native
    sealed trait none extends MatchCode
    
    /** The match was found by a broader search. */
    @js.native
    sealed trait upHierarchy extends MatchCode
  }
  
  @js.native
  sealed trait MatchConfidence extends StObject
  @JSGlobal("Microsoft.Maps.Search.MatchConfidence")
  @js.native
  object MatchConfidence extends StObject {
    
    /** The confidence of the match is high. */
    @js.native
    sealed trait high extends MatchConfidence
    
    /** The confidence of the match is low. */
    @js.native
    sealed trait low extends MatchConfidence
    
    /** The confidence of the match is medium. */
    @js.native
    sealed trait medium extends MatchConfidence
    
    /** The confidence of the match is unknown. */
    @js.native
    sealed trait unknown extends MatchConfidence
  }
  
  @js.native
  trait IGeocodeLocation extends StObject {
    
    /** The latitude of the location. */
    var latitude: Double = js.native
    
    /** The longitude of the location. */
    var longitude: Double = js.native
    
    /** The name of this geocode location match. */
    var name: String = js.native
    
    /** 
    		 * The precision of this geocode location match. 
    		 * Possible Values: Interpolated, InterpolatedOffset, Rooftop, Parcel
    		 */
    var precision: String = js.native
  }
  object IGeocodeLocation {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double, name: String, precision: String): IGeocodeLocation = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeocodeLocation]
    }
    
    @scala.inline
    implicit class IGeocodeLocationMutableBuilder[Self <: IGeocodeLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGeocodeRequestOptions extends StObject {
    
    /** 
      * A location rectangle that defines the boundaries of the area in which to search for 
      * location results. The default is the bounds of the map view associated with this 
      * instance of the SearchManager, which is usually the current map view.
      */
    var bounds: js.UndefOr[LocationRect] = js.native
    
    /**
      * The name of the function to call when a successful result is returned from the 
      * geocode request. The callback function must accept two parameters: result, which is 
      * a GeocodeResult type, and a userData object.
      */
    def callback(geocodeResult: IGeocodeResult, userData: js.Any): Unit = js.native
    
    /** The maximum number of results to return. Required. The maximum number than can be returned is 20. */
    var count: js.UndefOr[Double] = js.native
    
    /**
      * The name of the function to call when the request is returned with an error. The 
      * error callback function must accept an IGeocodeRequestOptions object.
      */
    var errorCallback: js.UndefOr[js.Function1[/* geocodeRequestOptions */ this.type, Unit]] = js.native
    
    /** Specifies to include the two-letter ISO country code. */
    var includeCountryIso2: js.UndefOr[Boolean] = js.native
    
    /** Specifies to include the neighborhood in the response when it is available. */
    var includeNeighborhood: js.UndefOr[Boolean] = js.native
    
    /** A number indicating how long to wait, in seconds, for the geocode request to return. The default value is 5 seconds. */
    var timeout: js.UndefOr[Double] = js.native
    
    /** An object containing any data that needs to be passed to the callback when the request is completed. */
    var userData: js.UndefOr[js.Any] = js.native
    
    /** A string containing the address or place to be matched to a location on the map.  */
    var where: String = js.native
  }
  object IGeocodeRequestOptions {
    
    @scala.inline
    def apply(callback: (IGeocodeResult, js.Any) => Unit, where: String): IGeocodeRequestOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), where = where.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeocodeRequestOptions]
    }
    
    @scala.inline
    implicit class IGeocodeRequestOptionsMutableBuilder[Self <: IGeocodeRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCallback(value: (IGeocodeResult, js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setErrorCallback(value: IGeocodeRequestOptions => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
      
      @scala.inline
      def setIncludeCountryIso2(value: Boolean): Self = StObject.set(x, "includeCountryIso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeCountryIso2Undefined: Self = StObject.set(x, "includeCountryIso2", js.undefined)
      
      @scala.inline
      def setIncludeNeighborhood(value: Boolean): Self = StObject.set(x, "includeNeighborhood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNeighborhoodUndefined: Self = StObject.set(x, "includeNeighborhood", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      @scala.inline
      def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGeocodeResult extends StObject {
    
    /** An array of geocode results. */
    var results: js.Array[IPlaceResult] = js.native
  }
  object IGeocodeResult {
    
    @scala.inline
    def apply(results: js.Array[IPlaceResult]): IGeocodeResult = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeocodeResult]
    }
    
    @scala.inline
    implicit class IGeocodeResultMutableBuilder[Self <: IGeocodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResults(value: js.Array[IPlaceResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: IPlaceResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IPlaceResult extends StObject {
    
    /** The geocoded address of the place result. */
    var address: IAddress = js.native
    
    /** The location rectangle that defines the boundaries of the best map view of the place result. */
    var bestView: LocationRect = js.native
    
    /** The classification of the geographic entity returned, such as PopulatedPlace. */
    var entityType: String = js.native
    
    /** The geocoded location of the best result. */
    var location: Location = js.native
    
    /** The geocoded locations. */
    var locations: js.Array[IGeocodeLocation] = js.native
    
    /** The match code of the best result. */
    var matchCode: String | MatchCode = js.native
    
    /** The match confidence of the best result. */
    var matchConfidence: String | MatchConfidence = js.native
    
    /** The name of the place result, if one exists. */
    var name: String = js.native
  }
  object IPlaceResult {
    
    @scala.inline
    def apply(
      address: IAddress,
      bestView: LocationRect,
      entityType: String,
      location: Location,
      locations: js.Array[IGeocodeLocation],
      matchCode: String | MatchCode,
      matchConfidence: String | MatchConfidence,
      name: String
    ): IPlaceResult = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bestView = bestView.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], matchCode = matchCode.asInstanceOf[js.Any], matchConfidence = matchConfidence.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlaceResult]
    }
    
    @scala.inline
    implicit class IPlaceResultMutableBuilder[Self <: IPlaceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBestView(value: LocationRect): Self = StObject.set(x, "bestView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: js.Array[IGeocodeLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: IGeocodeLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setMatchCode(value: String | MatchCode): Self = StObject.set(x, "matchCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchConfidence(value: String | MatchConfidence): Self = StObject.set(x, "matchConfidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReverseGeocodeRequestOptions extends StObject {
    
    /**
      * A reference to a function to call when a successful result is returned from the geocode request. The callback function
      * will receive a PlaceResult object as an argument.
      */
    def callback(placeResult: IPlaceResult, userData: js.Any): Unit = js.native
    
    /**
      * A reference to a function to call when the request is returned with an error. The error callback function will receive
      * an object containing the geocode request options used in the request.
      */
    var errorCallback: js.UndefOr[js.Function1[/* reverseGeocodeRequestOptions */ this.type, Unit]] = js.native
    
    /** Specifies to include the two-letter ISO country code. Default: false */
    var includeCountryIso2: js.UndefOr[Boolean] = js.native
    
    /**
      *  An array of entity types selected from the following options.
      * • Address
      * • Neighborhood
      * • PopulatedPlace
      * • Postcode1
      * • AdminDivision1
      * • AdminDivision2
      * • CountryRegion
      * These entity types are ordered from the most specific entity to the least specific entity. When entities of more than one entity type are found, only the most specific
      * entity is returned. For example, if you specify Address and AdminDistrict1 as entity types and entities were found for both types, only the Address entity information is
      * returned in the response. One exception to this rule is when both PopulatedPlace and Neighborhood entity types are specified and information is found for both. In this case,
      * the information for both entity types is returned. Also, more than one Neighborhood may be returned because the area covered by two different neighborhoods can overlap.
      */
    var includeEntityTypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Specifies to include the neighborhood in the response when it is available. Note: This feature isn’t
      * available in all locations.
      */
    var includeNeighborhood: js.UndefOr[Boolean] = js.native
    
    /** The location to use to match to geographic entities and addresses. */
    var location: Location = js.native
    
    /** A number indicating how long to wait, in seconds, for the reverse geocode request to  return. The default value is 5 seconds. */
    var timeout: js.UndefOr[Double] = js.native
    
    /** An object containing any data that needs to be passed to the callback when the request is completed. */
    var userData: js.UndefOr[js.Any] = js.native
  }
  object ReverseGeocodeRequestOptions {
    
    @scala.inline
    def apply(callback: (IPlaceResult, js.Any) => Unit, location: Location): ReverseGeocodeRequestOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReverseGeocodeRequestOptions]
    }
    
    @scala.inline
    implicit class ReverseGeocodeRequestOptionsMutableBuilder[Self <: ReverseGeocodeRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (IPlaceResult, js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorCallback(value: ReverseGeocodeRequestOptions => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
      
      @scala.inline
      def setIncludeCountryIso2(value: Boolean): Self = StObject.set(x, "includeCountryIso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeCountryIso2Undefined: Self = StObject.set(x, "includeCountryIso2", js.undefined)
      
      @scala.inline
      def setIncludeEntityTypes(value: js.Array[String]): Self = StObject.set(x, "includeEntityTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEntityTypesUndefined: Self = StObject.set(x, "includeEntityTypes", js.undefined)
      
      @scala.inline
      def setIncludeEntityTypesVarargs(value: String*): Self = StObject.set(x, "includeEntityTypes", js.Array(value :_*))
      
      @scala.inline
      def setIncludeNeighborhood(value: Boolean): Self = StObject.set(x, "includeNeighborhood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNeighborhoodUndefined: Self = StObject.set(x, "includeNeighborhood", js.undefined)
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    }
  }
  
  @js.native
  trait SearchManager extends StObject {
    
    /**
      * Matches the address or place query in the specified request 
      * options to a location and returns the results to the request 
      * options callback function.
      * @param request Options for sending geocode request
      */
    def geocode(request: IGeocodeRequestOptions): Unit = js.native
    
    /**
      * Matches the specified location to an address and returns the 
      * address results to the specified request options callback function.
      * @param request Options for sending reverse geocode request
      */
    def reverseGeocode(request: ReverseGeocodeRequestOptions): Unit = js.native
  }
  object SearchManager {
    
    @scala.inline
    def apply(geocode: IGeocodeRequestOptions => Unit, reverseGeocode: ReverseGeocodeRequestOptions => Unit): SearchManager = {
      val __obj = js.Dynamic.literal(geocode = js.Any.fromFunction1(geocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
      __obj.asInstanceOf[SearchManager]
    }
    
    @scala.inline
    implicit class SearchManagerMutableBuilder[Self <: SearchManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeocode(value: IGeocodeRequestOptions => Unit): Self = StObject.set(x, "geocode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReverseGeocode(value: ReverseGeocodeRequestOptions => Unit): Self = StObject.set(x, "reverseGeocode", js.Any.fromFunction1(value))
    }
  }
}
