package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouteSubLeg extends js.Object {
  /** The location of the last waypoint of the sub leg. */
  var actualEnd: Location
  /** The location of the first waypoint of the sub leg. */
  var actualStart: Location
  /** The description of the last waypoint of the sub leg. */
  var endDescription: String
  /** The description of the first waypoint of the sub leg. */
  var startDescription: String
}

object IRouteSubLeg {
  @scala.inline
  def apply(actualEnd: Location, actualStart: Location, endDescription: String, startDescription: String): IRouteSubLeg = {
    val __obj = js.Dynamic.literal(actualEnd = actualEnd, actualStart = actualStart, endDescription = endDescription, startDescription = startDescription)
  
    __obj.asInstanceOf[IRouteSubLeg]
  }
}

