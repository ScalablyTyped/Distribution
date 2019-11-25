package typings.bingmaps.Microsoft.Maps.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeocodeLocation extends js.Object {
  /** The latitude of the location. */
  var latitude: Double
  /** The longitude of the location. */
  var longitude: Double
  /** The name of this geocode location match. */
  var name: String
  /** 
  		 * The precision of this geocode location match. 
  		 * Possible Values: Interpolated, InterpolatedOffset, Rooftop, Parcel
  		 */
  var precision: String
}

object IGeocodeLocation {
  @scala.inline
  def apply(latitude: Double, longitude: Double, name: String, precision: String): IGeocodeLocation = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGeocodeLocation]
  }
}

