package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWaypointOptions extends js.Object {
  /** 
    * The address string of the waypoint. For example, the following strings are valid for this parameter: "Seattle", "1 Microsoft Way, Redmond, WA". Either the address or location property must be specified.
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * A boolean indicating whether the waypoint is a via point. A via point is a point along the route that is not a stop point. Set this property to
    * true if you just want the route to pass through this location. Default: false
    */
  var isViaPoint: js.UndefOr[scala.Boolean] = js.undefined
  /** The location of the waypoint. Either the address or location property must be specified. */
  var location: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.undefined
}

object IWaypointOptions {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    isViaPoint: js.UndefOr[scala.Boolean] = js.undefined,
    location: bingmapsLib.MicrosoftNs.MapsNs.Location = null
  ): IWaypointOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(isViaPoint)) __obj.updateDynamic("isViaPoint")(isViaPoint)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[IWaypointOptions]
  }
}

