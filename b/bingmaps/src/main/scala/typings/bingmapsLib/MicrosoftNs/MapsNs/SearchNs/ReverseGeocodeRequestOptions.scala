package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReverseGeocodeRequestOptions extends js.Object {
  /**
    * A reference to a function to call when the request is returned with an error. The error callback function will receive
    * an object containing the geocode request options used in the request.
    */
  var errorCallback: js.UndefOr[
    js.Function1[/* reverseGeocodeRequestOptions */ ReverseGeocodeRequestOptions, scala.Unit]
  ] = js.undefined
  /** Specifies to include the two-letter ISO country code. Default: false */
  var includeCountryIso2: js.UndefOr[scala.Boolean] = js.undefined
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
  var includeEntityTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies to include the neighborhood in the response when it is available. Note: This feature isn’t
    * available in all locations.
    */
  var includeNeighborhood: js.UndefOr[scala.Boolean] = js.undefined
  /** The location to use to match to geographic entities and addresses. */
  var location: bingmapsLib.MicrosoftNs.MapsNs.Location
  /** A number indicating how long to wait, in seconds, for the reverse geocode request to  return. The default value is 5 seconds. */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** An object containing any data that needs to be passed to the callback when the request is completed. */
  var userData: js.UndefOr[js.Any] = js.undefined
  /**
    * A reference to a function to call when a successful result is returned from the geocode request. The callback function
    * will receive a PlaceResult object as an argument.
    */
  def callback(placeResult: IPlaceResult, userData: js.Any): scala.Unit
}

