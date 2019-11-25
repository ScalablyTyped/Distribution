package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWaypointOptions extends js.Object {
  /** 
    * The address string of the waypoint. For example, the following strings are valid for this parameter: "Seattle", "1 Microsoft Way, Redmond, WA". Either the address or location property must be specified.
    */
  var address: js.UndefOr[String] = js.undefined
  /** 
    * A boolean indicating whether the waypoint is a via point. A via point is a point along the route that is not a stop point. Set this property to
    * true if you just want the route to pass through this location. Default: false
    */
  var isViaPoint: js.UndefOr[Boolean] = js.undefined
  /** The location of the waypoint. Either the address or location property must be specified. */
  var location: js.UndefOr[Location] = js.undefined
}

object IWaypointOptions {
  @scala.inline
  def apply(address: String = null, isViaPoint: js.UndefOr[Boolean] = js.undefined, location: Location = null): IWaypointOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(isViaPoint)) __obj.updateDynamic("isViaPoint")(isViaPoint.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaypointOptions]
  }
}

