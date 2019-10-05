package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Directions.Waypoint")
@js.native
class Waypoint protected () extends js.Object {
  /**
    * @constructor
    * @param options: Options used to define the Waypoint.
    */
  def this(options: IWaypointOptions) = this()
  /** Releases any resources associated with the waypoint. */
  def dispose(): Unit = js.native
  /**
    * Gets the address associated with the waypoint.
    * @returns The address associated with the waypoint.
    */
  def getAddress(): String = js.native
  /**
    * Gets the location of the waypoint.
    * @returns The location of the waypoint.
    */
  def getLocation(): Location = js.native
  /**
    * Gets a boolean value indicating whether the waypoint is a via point.
    * @returns A boolean value indicating whether the waypoint is a via point.
    */
  def isViapoint(): Boolean = js.native
  /**
    * Sets options for the waypoint. For these options to take effect, you must recalculate the route.
    * @param options Options used to define the Waypoint.
    */
  def setOptions(options: IWaypointOptions): Unit = js.native
}

