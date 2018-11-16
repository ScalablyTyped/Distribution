package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMercatorProjection")
@js.native
class WebMercatorProjection ()
  extends cesiumLib.cesiumMod.CesiumNs.WebMercatorProjection {
  def this(ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid) = this()
}

@JSImport("cesium", "WebMercatorProjection")
@js.native
object WebMercatorProjection extends js.Object {
  var MaximumLatitude: scala.Double = js.native
  def geodeticLatitudeToMercatorAngle(latitude: scala.Double): scala.Double = js.native
  def mercatorAngleToGeodeticLatitude(mercatorAngle: scala.Double): scala.Double = js.native
}

