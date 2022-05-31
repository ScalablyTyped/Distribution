package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.WebMercatorProjection")
@js.native
class WebMercatorProjection ()
  extends typings.cesium.mod.WebMercatorProjection {
  def this(ellipsoid: typings.cesium.mod.Ellipsoid) = this()
}
object WebMercatorProjection {
  
  @JSGlobal("Cesium.WebMercatorProjection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.WebMercatorProjection.MaximumLatitude")
  @js.native
  def MaximumLatitude: Double = js.native
  inline def MaximumLatitude_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaximumLatitude")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def geodeticLatitudeToMercatorAngle(latitude: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geodeticLatitudeToMercatorAngle")(latitude.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def mercatorAngleToGeodeticLatitude(mercatorAngle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mercatorAngleToGeodeticLatitude")(mercatorAngle.asInstanceOf[js.Any]).asInstanceOf[Double]
}
