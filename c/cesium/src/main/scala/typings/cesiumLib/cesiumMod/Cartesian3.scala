package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartesian3")
@js.native
class Cartesian3 ()
  extends cesiumLib.cesiumMod.CesiumNs.Cartesian3 {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
}

@JSImport("cesium", "Cartesian3")
@js.native
object Cartesian3 extends js.Object {
  var UNIT_X: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  var UNIT_Y: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  var UNIT_Z: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  var ZERO: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def abs(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def add(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def angleBetween(left: cesiumLib.cesiumMod.CesiumNs.Cartesian3, right: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def clone(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def clone(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def cross(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def distance(left: cesiumLib.cesiumMod.CesiumNs.Cartesian3, right: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def distanceSquared(left: cesiumLib.cesiumMod.CesiumNs.Cartesian3, right: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def divideByScalar(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def dot(left: cesiumLib.cesiumMod.CesiumNs.Cartesian3, right: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Cartesian3, right: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromArray(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian4): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromCartesian4(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian4,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromDegrees(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromDegrees(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromDegreesArray(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromDegreesArray(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromDegreesArray(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromDegreesArrayHeights(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromDegreesArrayHeights(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromDegreesArrayHeights(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromElements(x: scala.Double, y: scala.Double, z: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromElements(x: scala.Double, y: scala.Double, z: scala.Double, result: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromRadians(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromRadians(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromRadiansArray(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromRadiansArray(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromRadiansArray(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromRadiansArrayHeights(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromRadiansArrayHeights(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromRadiansArrayHeights(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3] = js.native
  def fromSpherical(spherical: cesiumLib.cesiumMod.CesiumNs.Spherical): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def fromSpherical(spherical: cesiumLib.cesiumMod.CesiumNs.Spherical, result: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def lerp(
    start: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    end: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    t: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def magnitude(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def magnitudeSquared(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def maximumByComponent(
    first: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    second: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def maximumComponent(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def minimumByComponent(
    first: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    second: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def minimumComponent(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
  def mostOrthogonalAxis(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def multiplyByScalar(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def multiplyComponents(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def negate(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def normalize(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.Cartesian3, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def subtract(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
}

