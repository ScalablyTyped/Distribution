package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutosuggestOptions extends js.Object {
  /** Specifies if street address suggestions should be returned. Default: true */
  var addressSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the user’s location should be auto detected using their IP address, if no location information is provided
    * in the userLocation property. Default: true
    */
  var autoDetectLocation: js.UndefOr[Boolean] = js.native
  /**
    * A bounding box that is used to help influence the results such that locations that are in or near this bounding box
    * are given more weight than they would normally.
    */
  var bounds: js.UndefOr[LocationRect] = js.native
  /**
    * A string specifying the ISO 3166-1 alpha-2 country region code which is used to limit suggests to a single country.
    * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * A reference to a map instance. If the useMapView property is set to true, the bounding box of the map view will be used
    * to influence the weight of suggestions.
    */
  var map: js.UndefOr[Map] = js.native
  /** The maximum number of results to return. Can be any value between 1 and 10. Default: 5 */
  var maxResults: js.UndefOr[Double] = js.native
  /** Specifies if place suggestions (city, landmark, etc.) should be returned. Default: true */
  var placeSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the maps bounding box should be used to influence the suggested results. Ignored if the bounds property is
    * set. Default: true
    */
  var useMapView: js.UndefOr[Boolean] = js.native
  /** A coordinate indicating where the user is located. This will influence the results to be more relevant to the user. */
  var userLocation: js.UndefOr[Location] = js.native
}

object IAutosuggestOptions {
  @scala.inline
  def apply(): IAutosuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutosuggestOptions]
  }
  @scala.inline
  implicit class IAutosuggestOptionsOps[Self <: IAutosuggestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressSuggestions(value: Boolean): Self = this.set("addressSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressSuggestions: Self = this.set("addressSuggestions", js.undefined)
    @scala.inline
    def setAutoDetectLocation(value: Boolean): Self = this.set("autoDetectLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDetectLocation: Self = this.set("autoDetectLocation", js.undefined)
    @scala.inline
    def setBounds(value: LocationRect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPlaceSuggestions(value: Boolean): Self = this.set("placeSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceSuggestions: Self = this.set("placeSuggestions", js.undefined)
    @scala.inline
    def setUseMapView(value: Boolean): Self = this.set("useMapView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapView: Self = this.set("useMapView", js.undefined)
    @scala.inline
    def setUserLocation(value: Location): Self = this.set("userLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLocation: Self = this.set("userLocation", js.undefined)
  }
  
}

