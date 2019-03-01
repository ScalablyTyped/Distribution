package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute extends js.Object {
  /** The legs of the route. Each route leg represents the route between two waypoints. */
  var routeLegs: js.Array[IRouteLeg]
  /** An array of locations that makes up the path of the route. */
  var routePath: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location]
}

object IRoute {
  @scala.inline
  def apply(routeLegs: js.Array[IRouteLeg], routePath: js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location]): IRoute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("routeLegs")(routeLegs)
    __obj.updateDynamic("routePath")(routePath)
    __obj.asInstanceOf[IRoute]
  }
}

