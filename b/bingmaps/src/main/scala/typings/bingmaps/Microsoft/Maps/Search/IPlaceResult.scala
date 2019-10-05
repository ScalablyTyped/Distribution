package typings.bingmaps.Microsoft.Maps.Search

import typings.bingmaps.Microsoft.Maps.IAddress
import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaceResult extends js.Object {
  /** The geocoded address of the place result. */
  var address: IAddress
  /** The location rectangle that defines the boundaries of the best map view of the place result. */
  var bestView: LocationRect
  /** The classification of the geographic entity returned, such as PopulatedPlace. */
  var entityType: String
  /** The geocoded location of the best result. */
  var location: Location
  /** The geocoded locations. */
  var locations: js.Array[IGeocodeLocation]
  /** The match code of the best result. */
  var matchCode: String | MatchCode
  /** The match confidence of the best result. */
  var matchConfidence: String | MatchConfidence
  /** The name of the place result, if one exists. */
  var name: String
}

object IPlaceResult {
  @scala.inline
  def apply(
    address: IAddress,
    bestView: LocationRect,
    entityType: String,
    location: Location,
    locations: js.Array[IGeocodeLocation],
    matchCode: String | MatchCode,
    matchConfidence: String | MatchConfidence,
    name: String
  ): IPlaceResult = {
    val __obj = js.Dynamic.literal(address = address, bestView = bestView, entityType = entityType, location = location, locations = locations, matchCode = matchCode.asInstanceOf[js.Any], matchConfidence = matchConfidence.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[IPlaceResult]
  }
}

