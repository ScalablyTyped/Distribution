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

