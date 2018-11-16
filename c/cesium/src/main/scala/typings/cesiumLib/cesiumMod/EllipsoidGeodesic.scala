package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidGeodesic")
@js.native
class EllipsoidGeodesic ()
  extends cesiumLib.cesiumMod.CesiumNs.EllipsoidGeodesic {
  def this(start: cesiumLib.cesiumMod.CesiumNs.Cartographic) = this()
  def this(start: cesiumLib.cesiumMod.CesiumNs.Cartographic, end: cesiumLib.cesiumMod.CesiumNs.Cartographic) = this()
  def this(start: cesiumLib.cesiumMod.CesiumNs.Cartographic, end: cesiumLib.cesiumMod.CesiumNs.Cartographic, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid) = this()
  /* CompleteClass */
  override var end: cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  /* CompleteClass */
  override var endHeading: scala.Double = js.native
  /* CompleteClass */
  override var start: cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  /* CompleteClass */
  override var startHeading: scala.Double = js.native
  /* CompleteClass */
  override var surfaceDistance: scala.Double = js.native
  /* CompleteClass */
  override def interpolateUsingFraction(fraction: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  /* CompleteClass */
  override def interpolateUsingSurfaceDistance(distance: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartographic = js.native
  /* CompleteClass */
  override def setEndPoints(start: cesiumLib.cesiumMod.CesiumNs.Cartographic, end: cesiumLib.cesiumMod.CesiumNs.Cartographic): scala.Unit = js.native
}

