package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsStep extends js.Object {
  /** The child direction items for this directions step. */
  var childItineraryItems: js.Array[IDirectionsStep]
  /** The location of the start of the direction. */
  var coordinate: Location
  /** The total distance of the step in the unit specified in the distanceUnit property of the DirectionsRequestOptions. */
  var distance: String
  /** The total time, in seconds, of the direction step. */
  var durationInSeconds: Double
  /** The HTML formatted route instruction associated with the step. */
  var formattedText: String
  /** A boolean indicating whether the maneuver image is a road shield image. */
  var isImageRoadShield: Boolean
  /** The type of maneuver being performed. */
  var maneuver: String
  /** An array of strings, where each string is a hint to help determine when to move to the next direction step. Not all direction steps have hints. */
  var postIntersectionHints: js.Array[String]
  /** An array of strings, where each string is a hint to help determine when you have arrived at this direction step. Not all direction steps have hints. */
  var preIntersectionHints: js.Array[String]
  /** The name of the transit stop where this step originates. */
  var startStopName: String
  /** The transit line associated with this step. */
  var transitLine: ITransitLine
  /** The URL of the image to use for transit direction steps. */
  var transitStepIcon: String
  /** The ID of the transit stop. */
  var transitStopId: String
  /** The name of the transit line end. */
  var transitTerminus: String
  /** An array of route warnings associated with this step. */
  var warnings: js.Array[IDirectionsStepWarning]
}

object IDirectionsStep {
  @scala.inline
  def apply(
    childItineraryItems: js.Array[IDirectionsStep],
    coordinate: Location,
    distance: String,
    durationInSeconds: Double,
    formattedText: String,
    isImageRoadShield: Boolean,
    maneuver: String,
    postIntersectionHints: js.Array[String],
    preIntersectionHints: js.Array[String],
    startStopName: String,
    transitLine: ITransitLine,
    transitStepIcon: String,
    transitStopId: String,
    transitTerminus: String,
    warnings: js.Array[IDirectionsStepWarning]
  ): IDirectionsStep = {
    val __obj = js.Dynamic.literal(childItineraryItems = childItineraryItems.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], formattedText = formattedText.asInstanceOf[js.Any], isImageRoadShield = isImageRoadShield.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], postIntersectionHints = postIntersectionHints.asInstanceOf[js.Any], preIntersectionHints = preIntersectionHints.asInstanceOf[js.Any], startStopName = startStopName.asInstanceOf[js.Any], transitLine = transitLine.asInstanceOf[js.Any], transitStepIcon = transitStepIcon.asInstanceOf[js.Any], transitStopId = transitStopId.asInstanceOf[js.Any], transitTerminus = transitTerminus.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsStep]
  }
}

