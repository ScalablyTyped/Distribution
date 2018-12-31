package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeocodeRequestOptions extends js.Object {
  /** 
    * A location rectangle that defines the boundaries of the area in which to search for 
    * location results. The default is the bounds of the map view associated with this 
    * instance of the SearchManager, which is usually the current map view.
    */
  var bounds: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.LocationRect] = js.undefined
  /** The maximum number of results to return. Required. The maximum number than can be returned is 20. */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the function to call when the request is returned with an error. The 
    * error callback function must accept an IGeocodeRequestOptions object.
    */
  var errorCallback: js.UndefOr[js.Function1[/* geocodeRequestOptions */ IGeocodeRequestOptions, scala.Unit]] = js.undefined
  /** Specifies to include the two-letter ISO country code. */
  var includeCountryIso2: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies to include the neighborhood in the response when it is available. */
  var includeNeighborhood: js.UndefOr[scala.Boolean] = js.undefined
  /** A number indicating how long to wait, in seconds, for the geocode request to return. The default value is 5 seconds. */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** An object containing any data that needs to be passed to the callback when the request is completed. */
  var userData: js.UndefOr[js.Any] = js.undefined
  /** A string containing the address or place to be matched to a location on the map.  */
  var where: java.lang.String
  /**
    * The name of the function to call when a successful result is returned from the 
    * geocode request. The callback function must accept two parameters: result, which is 
    * a GeocodeResult type, and a userData object.
    */
  def callback(geocodeResult: IGeocodeResult, userData: js.Any): scala.Unit
}

