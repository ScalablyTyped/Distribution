package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsStep extends js.Object {
  /** The child direction items for this directions step. */
  var childItineraryItems: js.Array[IDirectionsStep]
  /** The location of the start of the direction. */
  var coordinate: bingmapsLib.MicrosoftNs.MapsNs.Location
  /** The total distance of the step in the unit specified in the distanceUnit property of the DirectionsRequestOptions. */
  var distance: java.lang.String
  /** The total time, in seconds, of the direction step. */
  var durationInSeconds: scala.Double
  /** The HTML formatted route instruction associated with the step. */
  var formattedText: java.lang.String
  /** A boolean indicating whether the maneuver image is a road shield image. */
  var isImageRoadShield: scala.Boolean
  /** The type of maneuver being performed. */
  var maneuver: java.lang.String
  /** An array of strings, where each string is a hint to help determine when to move to the next direction step. Not all direction steps have hints. */
  var postIntersectionHints: js.Array[java.lang.String]
  /** An array of strings, where each string is a hint to help determine when you have arrived at this direction step. Not all direction steps have hints. */
  var preIntersectionHints: js.Array[java.lang.String]
  /** The name of the transit stop where this step originates. */
  var startStopName: java.lang.String
  /** The transit line associated with this step. */
  var transitLine: ITransitLine
  /** The URL of the image to use for transit direction steps. */
  var transitStepIcon: java.lang.String
  /** The ID of the transit stop. */
  var transitStopId: java.lang.String
  /** The name of the transit line end. */
  var transitTerminus: java.lang.String
  /** An array of route warnings associated with this step. */
  var warnings: js.Array[IDirectionsStepWarning]
}

object IDirectionsStep {
  @scala.inline
  def apply(
    childItineraryItems: js.Array[IDirectionsStep],
    coordinate: bingmapsLib.MicrosoftNs.MapsNs.Location,
    distance: java.lang.String,
    durationInSeconds: scala.Double,
    formattedText: java.lang.String,
    isImageRoadShield: scala.Boolean,
    maneuver: java.lang.String,
    postIntersectionHints: js.Array[java.lang.String],
    preIntersectionHints: js.Array[java.lang.String],
    startStopName: java.lang.String,
    transitLine: ITransitLine,
    transitStepIcon: java.lang.String,
    transitStopId: java.lang.String,
    transitTerminus: java.lang.String,
    warnings: js.Array[IDirectionsStepWarning]
  ): IDirectionsStep = {
    val __obj = js.Dynamic.literal(childItineraryItems = childItineraryItems, coordinate = coordinate, distance = distance, durationInSeconds = durationInSeconds, formattedText = formattedText, isImageRoadShield = isImageRoadShield, maneuver = maneuver, postIntersectionHints = postIntersectionHints, preIntersectionHints = preIntersectionHints, startStopName = startStopName, transitLine = transitLine, transitStepIcon = transitStepIcon, transitStopId = transitStopId, transitTerminus = transitTerminus, warnings = warnings)
  
    __obj.asInstanceOf[IDirectionsStep]
  }
}

