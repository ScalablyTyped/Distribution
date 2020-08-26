package typings.bingmaps.Microsoft.Maps.Search

import typings.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeRequestOptions extends js.Object {
  /** 
    * A location rectangle that defines the boundaries of the area in which to search for 
    * location results. The default is the bounds of the map view associated with this 
    * instance of the SearchManager, which is usually the current map view.
    */
  var bounds: js.UndefOr[LocationRect] = js.native
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
  /**
    * The name of the function to call when a successful result is returned from the 
    * geocode request. The callback function must accept two parameters: result, which is 
    * a GeocodeResult type, and a userData object.
    */
  def callback(geocodeResult: IGeocodeResult, userData: js.Any): Unit = js.native
}

object IGeocodeRequestOptions {
  @scala.inline
  def apply(callback: (IGeocodeResult, js.Any) => Unit, where: String): IGeocodeRequestOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocodeRequestOptions]
  }
  @scala.inline
  implicit class IGeocodeRequestOptionsOps[Self <: IGeocodeRequestOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: (IGeocodeResult, js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounds(value: LocationRect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setErrorCallback(value: IGeocodeRequestOptions => Unit): Self = this.set("errorCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorCallback: Self = this.set("errorCallback", js.undefined)
    @scala.inline
    def setIncludeCountryIso2(value: Boolean): Self = this.set("includeCountryIso2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCountryIso2: Self = this.set("includeCountryIso2", js.undefined)
    @scala.inline
    def setIncludeNeighborhood(value: Boolean): Self = this.set("includeNeighborhood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeNeighborhood: Self = this.set("includeNeighborhood", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUserData(value: js.Any): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
  
}

