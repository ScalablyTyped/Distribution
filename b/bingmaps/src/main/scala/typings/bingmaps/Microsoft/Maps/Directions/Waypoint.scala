package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Waypoint extends js.Object {
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
  @scala.inline
  implicit class WaypointOps[Self <: Waypoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAddress(value: () => String): Self = this.set("getAddress", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocation(value: () => Location): Self = this.set("getLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setIsViapoint(value: () => Boolean): Self = this.set("isViapoint", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOptions(value: IWaypointOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
  
}

