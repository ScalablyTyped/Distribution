package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cesiumLib.cesiumMod.PositionProperty because Inheritance from two classes. Inlined referenceFrame, getValueInReferenceFrame, getValueInReferenceFrame */ @JSImport("cesium", "Cartesian3")
@js.native
class Cartesian3 () extends Packable {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var definitionChanged: Event[js.Array[_]] = js.native
  var isConstant: scala.Boolean = js.native
  var referenceFrame: ReferenceFrame = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def clone(result: Cartesian3): Cartesian3 = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Cartesian3): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
  def getValue(time: JulianDate): Cartesian3 = js.native
  def getValue(time: JulianDate, result: Cartesian3): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
}

/* static members */
@JSImport("cesium", "Cartesian3")
@js.native
object Cartesian3 extends js.Object {
  var UNIT_X: cesiumLib.cesiumMod.Cartesian3 = js.native
  var UNIT_Y: cesiumLib.cesiumMod.Cartesian3 = js.native
  var UNIT_Z: cesiumLib.cesiumMod.Cartesian3 = js.native
  var ZERO: cesiumLib.cesiumMod.Cartesian3 = js.native
  def abs(cartesian: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def add(
    left: cesiumLib.cesiumMod.Cartesian3,
    right: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def angleBetween(left: cesiumLib.cesiumMod.Cartesian3, right: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def clone(cartesian: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def clone(cartesian: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def cross(
    left: cesiumLib.cesiumMod.Cartesian3,
    right: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def distance(left: cesiumLib.cesiumMod.Cartesian3, right: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def distanceSquared(left: cesiumLib.cesiumMod.Cartesian3, right: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def divideByScalar(
    cartesian: cesiumLib.cesiumMod.Cartesian3,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def dot(left: cesiumLib.cesiumMod.Cartesian3, right: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartesian3): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartesian3, right: cesiumLib.cesiumMod.Cartesian3): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.Cartesian3,
    right: cesiumLib.cesiumMod.Cartesian3,
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.Cartesian3,
    right: cesiumLib.cesiumMod.Cartesian3,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromDegrees(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromDegrees(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromDegrees(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromDegreesArray(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromDegreesArray(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.Ellipsoid): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromDegreesArray(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromDegreesArrayHeights(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromDegreesArrayHeights(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.Ellipsoid): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromDegreesArrayHeights(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromElements(x: scala.Double, y: scala.Double, z: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromElements(x: scala.Double, y: scala.Double, z: scala.Double, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromRadians(longitude: scala.Double, latitude: scala.Double, height: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromRadians(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromRadians(
    longitude: scala.Double,
    latitude: scala.Double,
    height: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromRadiansArray(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromRadiansArray(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.Ellipsoid): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromRadiansArray(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromRadiansArrayHeights(coordinates: js.Array[scala.Double]): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromRadiansArrayHeights(coordinates: js.Array[scala.Double], ellipsoid: cesiumLib.cesiumMod.Ellipsoid): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromRadiansArrayHeights(
    coordinates: js.Array[scala.Double],
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid,
    result: js.Array[cesiumLib.cesiumMod.Cartesian3]
  ): js.Array[cesiumLib.cesiumMod.Cartesian3] = js.native
  def fromSpherical(spherical: cesiumLib.cesiumMod.Spherical): cesiumLib.cesiumMod.Cartesian3 = js.native
  def fromSpherical(spherical: cesiumLib.cesiumMod.Spherical, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def lerp(
    start: cesiumLib.cesiumMod.Cartesian3,
    end: cesiumLib.cesiumMod.Cartesian3,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def magnitude(cartesian: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def magnitudeSquared(cartesian: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def maximumByComponent(
    first: cesiumLib.cesiumMod.Cartesian3,
    second: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def maximumComponent(cartesian: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def minimumByComponent(
    first: cesiumLib.cesiumMod.Cartesian3,
    second: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def minimumComponent(cartesian: cesiumLib.cesiumMod.Cartesian3): scala.Double = js.native
  def mostOrthogonalAxis(cartesian: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def multiplyByScalar(
    cartesian: cesiumLib.cesiumMod.Cartesian3,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def multiplyComponents(
    left: cesiumLib.cesiumMod.Cartesian3,
    right: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def negate(cartesian: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def normalize(cartesian: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
  def pack(value: cesiumLib.cesiumMod.Cartesian3, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Cartesian3, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def subtract(
    left: cesiumLib.cesiumMod.Cartesian3,
    right: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Cartesian3 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Cartesian3 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian3 = js.native
}

