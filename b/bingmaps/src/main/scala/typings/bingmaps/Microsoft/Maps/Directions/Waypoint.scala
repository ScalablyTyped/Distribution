package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waypoint extends js.Object {
  /** Releases any resources associated with the waypoint. */
  def dispose(): Unit
  /**
    * Gets the address associated with the waypoint.
    * @returns The address associated with the waypoint.
    */
  def getAddress(): String
  /**
    * Gets the location of the waypoint.
    * @returns The location of the waypoint.
    */
  def getLocation(): Location
  /**
    * Gets a boolean value indicating whether the waypoint is a via point.
    * @returns A boolean value indicating whether the waypoint is a via point.
    */
  def isViapoint(): Boolean
  /**
    * Sets options for the waypoint. For these options to take effect, you must recalculate the route.
    * @param options Options used to define the Waypoint.
    */
  def setOptions(options: IWaypointOptions): Unit
}

object Waypoint {
  @scala.inline
  def apply(
    dispose: () => Unit,
    getAddress: () => String,
    getLocation: () => Location,
    isViapoint: () => Boolean,
    setOptions: IWaypointOptions => Unit
  ): Waypoint = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getAddress = js.Any.fromFunction0(getAddress), getLocation = js.Any.fromFunction0(getLocation), isViapoint = js.Any.fromFunction0(isViapoint), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Waypoint]
  }
}

