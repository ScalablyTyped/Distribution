package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var MaximumLatitude: Double = js.native
  
  def geodeticLatitudeToMercatorAngle(latitude: Double): Double = js.native
  
  def mercatorAngleToGeodeticLatitude(mercatorAngle: Double): Double = js.native
}
