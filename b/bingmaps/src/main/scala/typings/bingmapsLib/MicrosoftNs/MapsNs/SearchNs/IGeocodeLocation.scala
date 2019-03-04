package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeocodeLocation extends js.Object {
  /** The latitude of the location. */
  var latitude: scala.Double
  /** The longitude of the location. */
  var longitude: scala.Double
  /** The name of this geocode location match. */
  var name: java.lang.String
  /** 
  		 * The precision of this geocode location match. 
  		 * Possible Values: Interpolated, InterpolatedOffset, Rooftop, Parcel
  		 */
  var precision: java.lang.String
}

object IGeocodeLocation {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    name: java.lang.String,
    precision: java.lang.String
  ): IGeocodeLocation = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude, name = name, precision = precision)
  
    __obj.asInstanceOf[IGeocodeLocation]
  }
}

