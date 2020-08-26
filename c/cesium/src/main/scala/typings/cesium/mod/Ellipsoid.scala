package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Ellipsoid")
@js.native
class Ellipsoid () extends Packable {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  var maximumRadius: Double = js.native
  var minimumRadius: Double = js.native
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
  def equals(): Boolean = js.native
  def equals(right: Ellipsoid): Boolean = js.native
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
  var MOON: Ellipsoid = js.native
  var UNIT_SPHERE: Ellipsoid = js.native
  var WGS84: Ellipsoid = js.native
  def clone(ellipsoid: Ellipsoid): Ellipsoid = js.native
  def clone(ellipsoid: Ellipsoid, result: Ellipsoid): Ellipsoid = js.native
  def fromCartesian3(): Ellipsoid = js.native
  def fromCartesian3(radii: Cartesian3): Ellipsoid = js.native
  def unpack(array: js.Array[Double]): Ellipsoid = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Ellipsoid): Ellipsoid = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Ellipsoid = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Ellipsoid): Ellipsoid = js.native
}

