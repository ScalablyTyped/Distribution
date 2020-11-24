package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cesium.mod.Property because Inheritance from two classes. Inlined isConstant, definitionChanged, getValue, getValue, getValue, getValue, equals, equals
- typings.cesium.mod.PositionProperty because Inheritance from two classes. Inlined referenceFrame, getValueInReferenceFrame, getValueInReferenceFrame */ @JSImport("cesium", "Cartesian3")
@js.native
class Cartesian3 () extends Packable {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  
  def clone(result: Cartesian3): Cartesian3 = js.native
  
  var definitionChanged: Event[js.Array[_]] = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  def equals(right: Cartesian3): Boolean = js.native
  
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  def getValue(): js.Any = js.native
  def getValue(time: js.UndefOr[scala.Nothing], result: js.Any): js.Any = js.native
  def getValue(time: JulianDate): js.Any = js.native
  def getValue(time: JulianDate, result: js.Any): js.Any = js.native
  def getValue(time: JulianDate, result: Cartesian3): Cartesian3 = js.native
  
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame): Cartesian3 = js.native
  def getValueInReferenceFrame(time: JulianDate, referenceFrame: ReferenceFrame, result: Cartesian3): Cartesian3 = js.native
  
  @JSName("getValue")
  def getValue_Cartesian3(time: JulianDate): Cartesian3 = js.native
  
  var isConstant: Boolean = js.native
  
  var referenceFrame: ReferenceFrame = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
/* static members */
@JSImport("cesium", "Cartesian3")
@js.native
object Cartesian3 extends js.Object {
  
  var UNIT_X: Cartesian3 = js.native
  
  var UNIT_Y: Cartesian3 = js.native
  
  var UNIT_Z: Cartesian3 = js.native
  
  var ZERO: Cartesian3 = js.native
  
  def abs(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def add(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def angleBetween(left: Cartesian3, right: Cartesian3): Double = js.native
  
  def clone(cartesian: Cartesian3): Cartesian3 = js.native
  def clone(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def cross(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def distance(left: Cartesian3, right: Cartesian3): Double = js.native
  
  def distanceSquared(left: Cartesian3, right: Cartesian3): Double = js.native
  
  def divideByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = js.native
  
  def dot(left: Cartesian3, right: Cartesian3): Double = js.native
  
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: Cartesian3): Boolean = js.native
  def equals(left: Cartesian3): Boolean = js.native
  def equals(left: Cartesian3, right: Cartesian3): Boolean = js.native
  
  def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  def fromArray(array: js.Array[Double]): Cartesian3 = js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian3 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = js.native
  
  def fromCartesian4(cartesian: Cartesian4): Cartesian3 = js.native
  def fromCartesian4(cartesian: Cartesian4, result: Cartesian3): Cartesian3 = js.native
  
  def fromDegrees(longitude: Double, latitude: Double): Cartesian3 = js.native
  def fromDegrees(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], ellipsoid: Ellipsoid): Cartesian3 = js.native
  def fromDegrees(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid,
    result: Cartesian3
  ): Cartesian3 = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartesian3 = js.native
  def fromDegrees(
    longitude: Double,
    latitude: Double,
    height: Double,
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
  
  def fromDegreesArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def fromDegreesArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def fromElements(x: Double, y: Double, z: Double): Cartesian3 = js.native
  def fromElements(x: Double, y: Double, z: Double, result: Cartesian3): Cartesian3 = js.native
  
  def fromRadians(longitude: Double, latitude: Double): Cartesian3 = js.native
  def fromRadians(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def fromRadians(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], ellipsoid: Ellipsoid): Cartesian3 = js.native
  def fromRadians(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid,
    result: Cartesian3
  ): Cartesian3 = js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double): Cartesian3 = js.native
  def fromRadians(
    longitude: Double,
    latitude: Double,
    height: Double,
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
  
  def fromRadiansArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def fromRadiansArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  def fromSpherical(spherical: Spherical): Cartesian3 = js.native
  def fromSpherical(spherical: Spherical, result: Cartesian3): Cartesian3 = js.native
  
  def lerp(start: Cartesian3, end: Cartesian3, t: Double, result: Cartesian3): Cartesian3 = js.native
  
  def magnitude(cartesian: Cartesian3): Double = js.native
  
  def magnitudeSquared(cartesian: Cartesian3): Double = js.native
  
  def maximumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def maximumComponent(cartesian: Cartesian3): Double = js.native
  
  def minimumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def minimumComponent(cartesian: Cartesian3): Double = js.native
  
  def mostOrthogonalAxis(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def multiplyByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = js.native
  
  def multiplyComponents(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def negate(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def normalize(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def pack(value: Cartesian3, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Cartesian3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  def subtract(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  def unpack(array: js.Array[Double]): Cartesian3 = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian3 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = js.native
}
