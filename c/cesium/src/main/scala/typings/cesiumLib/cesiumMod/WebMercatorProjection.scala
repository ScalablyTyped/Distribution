package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WebMercatorProjection")
@js.native
class WebMercatorProjection () extends js.Object {
  def this(ellipsoid: Ellipsoid) = this()
  var ellipsoid: Ellipsoid = js.native
  def project(cartographic: Cartographic): Cartesian3 = js.native
  def project(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  def unproject(cartesian: Cartesian3): Cartographic = js.native
  def unproject(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
}

/* static members */
@JSImport("cesium", "WebMercatorProjection")
@js.native
object WebMercatorProjection extends js.Object {
  var MaximumLatitude: scala.Double = js.native
  def geodeticLatitudeToMercatorAngle(latitude: scala.Double): scala.Double = js.native
  def mercatorAngleToGeodeticLatitude(mercatorAngle: scala.Double): scala.Double = js.native
}

