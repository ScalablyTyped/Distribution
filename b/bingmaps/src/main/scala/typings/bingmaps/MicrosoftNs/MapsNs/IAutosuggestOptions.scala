package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutosuggestOptions extends js.Object {
  /** Specifies if street address suggestions should be returned. Default: true */
  var addressSuggestions: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if the user’s location should be auto detected using their IP address, if no location information is provided
    * in the userLocation property. Default: true
    */
  var autoDetectLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * A bounding box that is used to help influence the results such that locations that are in or near this bounding box
    * are given more weight than they would normally.
    */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /**
    * A string specifying the ISO 3166-1 alpha-2 country region code which is used to limit suggests to a single country.
    * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */
  var countryCode: js.UndefOr[String] = js.undefined
  /**
    * A reference to a map instance. If the useMapView property is set to true, the bounding box of the map view will be used
    * to influence the weight of suggestions.
    */
  var map: js.UndefOr[Map] = js.undefined
  /** The maximum number of results to return. Can be any value between 1 and 10. Default: 5 */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** Specifies if place suggestions (city, landmark, etc.) should be returned. Default: true */
  var placeSuggestions: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the maps bounding box should be used to influence the suggested results. Ignored if the bounds property is
    * set. Default: true
    */
  var useMapView: js.UndefOr[Boolean] = js.undefined
  /** A coordinate indicating where the user is located. This will influence the results to be more relevant to the user. */
  var userLocation: js.UndefOr[Location] = js.undefined
}

object IAutosuggestOptions {
  @scala.inline
  def apply(
    addressSuggestions: js.UndefOr[Boolean] = js.undefined,
    autoDetectLocation: js.UndefOr[Boolean] = js.undefined,
    bounds: LocationRect = null,
    countryCode: String = null,
    map: Map = null,
    maxResults: Int | Double = null,
    placeSuggestions: js.UndefOr[Boolean] = js.undefined,
    useMapView: js.UndefOr[Boolean] = js.undefined,
    userLocation: Location = null
  ): IAutosuggestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addressSuggestions)) __obj.updateDynamic("addressSuggestions")(addressSuggestions)
    if (!js.isUndefined(autoDetectLocation)) __obj.updateDynamic("autoDetectLocation")(autoDetectLocation)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(placeSuggestions)) __obj.updateDynamic("placeSuggestions")(placeSuggestions)
    if (!js.isUndefined(useMapView)) __obj.updateDynamic("useMapView")(useMapView)
    if (userLocation != null) __obj.updateDynamic("userLocation")(userLocation)
    __obj.asInstanceOf[IAutosuggestOptions]
  }
}

