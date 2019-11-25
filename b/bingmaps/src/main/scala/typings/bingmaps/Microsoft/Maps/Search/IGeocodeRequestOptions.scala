package typings.bingmaps.Microsoft.Maps.Search

import typings.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeocodeRequestOptions extends js.Object {
  /** 
    * A location rectangle that defines the boundaries of the area in which to search for 
    * location results. The default is the bounds of the map view associated with this 
    * instance of the SearchManager, which is usually the current map view.
    */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /** The maximum number of results to return. Required. The maximum number than can be returned is 20. */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * The name of the function to call when the request is returned with an error. The 
    * error callback function must accept an IGeocodeRequestOptions object.
    */
  var errorCallback: js.UndefOr[js.Function1[/* geocodeRequestOptions */ IGeocodeRequestOptions, Unit]] = js.undefined
  /** Specifies to include the two-letter ISO country code. */
  var includeCountryIso2: js.UndefOr[Boolean] = js.undefined
  /** Specifies to include the neighborhood in the response when it is available. */
  var includeNeighborhood: js.UndefOr[Boolean] = js.undefined
  /** A number indicating how long to wait, in seconds, for the geocode request to return. The default value is 5 seconds. */
  var timeout: js.UndefOr[Double] = js.undefined
  /** An object containing any data that needs to be passed to the callback when the request is completed. */
  var userData: js.UndefOr[js.Any] = js.undefined
  /** A string containing the address or place to be matched to a location on the map.  */
  var where: String
  /**
    * The name of the function to call when a successful result is returned from the 
    * geocode request. The callback function must accept two parameters: result, which is 
    * a GeocodeResult type, and a userData object.
    */
  def callback(geocodeResult: IGeocodeResult, userData: js.Any): Unit
}

object IGeocodeRequestOptions {
  @scala.inline
  def apply(
    callback: (IGeocodeResult, js.Any) => Unit,
    where: String,
    bounds: LocationRect = null,
    count: Int | Double = null,
    errorCallback: /* geocodeRequestOptions */ IGeocodeRequestOptions => Unit = null,
    includeCountryIso2: js.UndefOr[Boolean] = js.undefined,
    includeNeighborhood: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    userData: js.Any = null
  ): IGeocodeRequestOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), where = where.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (errorCallback != null) __obj.updateDynamic("errorCallback")(js.Any.fromFunction1(errorCallback))
    if (!js.isUndefined(includeCountryIso2)) __obj.updateDynamic("includeCountryIso2")(includeCountryIso2.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNeighborhood)) __obj.updateDynamic("includeNeighborhood")(includeNeighborhood.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocodeRequestOptions]
  }
}

