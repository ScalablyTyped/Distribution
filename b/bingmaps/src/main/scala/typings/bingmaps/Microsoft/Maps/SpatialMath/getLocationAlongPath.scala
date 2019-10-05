package typings.bingmaps.Microsoft.Maps.SpatialMath

import typings.bingmaps.Microsoft.Maps.Location
import typings.bingmaps.Microsoft.Maps.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialMath.getLocationAlongPath")
@js.native
object getLocationAlongPath extends js.Object {
  def apply(path: js.Array[Location], distance: Double): Location = js.native
  def apply(path: js.Array[Location], distance: Double, units: DistanceUnits): Location = js.native
  def apply(path: Polyline, distance: Double): Location = js.native
  def apply(path: Polyline, distance: Double, units: DistanceUnits): Location = js.native
}

