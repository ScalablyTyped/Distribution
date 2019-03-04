package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaceResult extends js.Object {
  /** The geocoded address of the place result. */
  var address: bingmapsLib.MicrosoftNs.MapsNs.IAddress
  /** The location rectangle that defines the boundaries of the best map view of the place result. */
  var bestView: bingmapsLib.MicrosoftNs.MapsNs.LocationRect
  /** The classification of the geographic entity returned, such as PopulatedPlace. */
  var entityType: java.lang.String
  /** The geocoded location of the best result. */
  var location: bingmapsLib.MicrosoftNs.MapsNs.Location
  /** The geocoded locations. */
  var locations: js.Array[IGeocodeLocation]
  /** The match code of the best result. */
  var matchCode: java.lang.String | MatchCode
  /** The match confidence of the best result. */
  var matchConfidence: java.lang.String | MatchConfidence
  /** The name of the place result, if one exists. */
  var name: java.lang.String
}

object IPlaceResult {
  @scala.inline
  def apply(
    address: bingmapsLib.MicrosoftNs.MapsNs.IAddress,
    bestView: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    entityType: java.lang.String,
    location: bingmapsLib.MicrosoftNs.MapsNs.Location,
    locations: js.Array[IGeocodeLocation],
    matchCode: java.lang.String | MatchCode,
    matchConfidence: java.lang.String | MatchConfidence,
    name: java.lang.String
  ): IPlaceResult = {
    val __obj = js.Dynamic.literal(address = address, bestView = bestView, entityType = entityType, location = location, locations = locations, matchCode = matchCode.asInstanceOf[js.Any], matchConfidence = matchConfidence.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[IPlaceResult]
  }
}

