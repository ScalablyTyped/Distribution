package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteSubLeg extends js.Object {
  /** The location of the last waypoint of the sub leg. */
  var actualEnd: bingmapsLib.MicrosoftNs.MapsNs.Location
  /** The location of the first waypoint of the sub leg. */
  var actualStart: bingmapsLib.MicrosoftNs.MapsNs.Location
  /** The description of the last waypoint of the sub leg. */
  var endDescription: java.lang.String
  /** The description of the first waypoint of the sub leg. */
  var startDescription: java.lang.String
}

object IRouteSubLeg {
  @scala.inline
  def apply(
    actualEnd: bingmapsLib.MicrosoftNs.MapsNs.Location,
    actualStart: bingmapsLib.MicrosoftNs.MapsNs.Location,
    endDescription: java.lang.String,
    startDescription: java.lang.String
  ): IRouteSubLeg = {
    val __obj = js.Dynamic.literal(actualEnd = actualEnd, actualStart = actualStart, endDescription = endDescription, startDescription = startDescription)
  
    __obj.asInstanceOf[IRouteSubLeg]
  }
}

