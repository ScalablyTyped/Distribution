package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeocodeResult extends js.Object {
  /** An array of geocode results. */
  var results: js.Array[IPlaceResult]
}

object IGeocodeResult {
  @scala.inline
  def apply(results: js.Array[IPlaceResult]): IGeocodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[IGeocodeResult]
  }
}

