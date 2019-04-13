package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Ellipsoid")
@js.native
class Ellipsoid () extends Packable {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var maximumRadius: scala.Double = js.native
  var minimumRadius: scala.Double = js.native
  var oneOverRadii: Cartesian3 = js.native
  var oneOverRadiiSquared: Cartesian3 = js.native
  var radii: Cartesian3 = js.native
  var radiiSquared: Cartesian3 = js.native
  var radiiToTheFourth: Cartesian3 = js.native
  def cartesianArrayToCartographicArray(cartesians: js.Array[Cartesian3]): js.Array[Cartographic] = js.native
  def cartesianArrayToCartographicArray(cartesians: js.Array[Cartesian3], result: js.Array[Cartographic]): js.Array[Cartographic] = js.native
  def cartesianToCartographic(cartesian: Cartesian3): Cartographic = js.native
  def cartesianToCartographic(cartesian: Cartesian3, result: Cartographic): Cartographic = js.native
  def cartographicArrayToCartesianArray(cartographics: js.Array[Cartographic]): js.Array[Cartesian3] = js.native
  def cartographicArrayToCartesianArray(cartographics: js.Array[Cartographic], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def cartographicToCartesian(cartographic: Cartographic): Cartesian3 = js.native
  def cartographicToCartesian(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  def clone(result: Ellipsoid): Ellipsoid = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Ellipsoid): scala.Boolean = js.native
  def geocentricSurfaceNormal(cartesian: Cartesian3): Cartesian3 = js.native
  def geocentricSurfaceNormal(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def geodeticSurfaceNormal(cartesian: Cartesian3): Cartesian3 = js.native
  def geodeticSurfaceNormal(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def geodeticSurfaceNormalCartographic(cartographic: Cartographic): Cartesian3 = js.native
  def geodeticSurfaceNormalCartographic(cartographic: Cartographic, result: Cartesian3): Cartesian3 = js.native
  def scaleToGeocentricSurface(cartesian: Cartesian3): Cartesian3 = js.native
  def scaleToGeocentricSurface(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def scaleToGeodeticSurface(cartesian: Cartesian3): Cartesian3 = js.native
  def scaleToGeodeticSurface(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def transformPositionFromScaledSpace(position: Cartesian3): Cartesian3 = js.native
  def transformPositionFromScaledSpace(position: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  def transformPositionToScaledSpace(position: Cartesian3): Cartesian3 = js.native
  def transformPositionToScaledSpace(position: Cartesian3, result: Cartesian3): Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "Ellipsoid")
@js.native
object Ellipsoid extends js.Object {
  var MOON: cesiumLib.cesiumMod.Ellipsoid = js.native
  var UNIT_SPHERE: cesiumLib.cesiumMod.Ellipsoid = js.native
  var WGS84: cesiumLib.cesiumMod.Ellipsoid = js.native
  def clone(ellipsoid: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.Ellipsoid = js.native
  def clone(ellipsoid: cesiumLib.cesiumMod.Ellipsoid, result: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.Ellipsoid = js.native
  def fromCartesian3(): cesiumLib.cesiumMod.Ellipsoid = js.native
  def fromCartesian3(radii: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Ellipsoid = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Ellipsoid = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Ellipsoid = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.Ellipsoid = js.native
}

