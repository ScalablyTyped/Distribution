package typings.cesium.mod

import org.scalablytyped.runtime.StObject
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
object Cartesian3 {
  
  @JSImport("cesium", "Cartesian3")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.UNIT_X")
  @js.native
  def UNIT_X: Cartesian3 = js.native
  @scala.inline
  def UNIT_X_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian3.UNIT_Y")
  @js.native
  def UNIT_Y: Cartesian3 = js.native
  @scala.inline
  def UNIT_Y_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian3.UNIT_Z")
  @js.native
  def UNIT_Z: Cartesian3 = js.native
  @scala.inline
  def UNIT_Z_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Z")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian3.ZERO")
  @js.native
  def ZERO: Cartesian3 = js.native
  @scala.inline
  def ZERO_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian3.abs")
  @js.native
  def abs(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.add")
  @js.native
  def add(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.angleBetween")
  @js.native
  def angleBetween(left: Cartesian3, right: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.clone")
  @js.native
  def clone_(cartesian: Cartesian3): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.clone")
  @js.native
  def clone_(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.cross")
  @js.native
  def cross(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.distance")
  @js.native
  def distance(left: Cartesian3, right: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.distanceSquared")
  @js.native
  def distanceSquared(left: Cartesian3, right: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.divideByScalar")
  @js.native
  def divideByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.dot")
  @js.native
  def dot(left: Cartesian3, right: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double): Boolean = js.native
  @JSImport("cesium", "Cartesian3.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "Cartesian3.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: Cartesian3): Boolean = js.native
  @JSImport("cesium", "Cartesian3.equals")
  @js.native
  def equals_(left: Cartesian3): Boolean = js.native
  @JSImport("cesium", "Cartesian3.equals")
  @js.native
  def equals_(left: Cartesian3, right: Cartesian3): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double]): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromCartesian4")
  @js.native
  def fromCartesian4(cartesian: Cartesian4): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromCartesian4")
  @js.native
  def fromCartesian4(cartesian: Cartesian4, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], ellipsoid: Ellipsoid): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid,
    result: Cartesian3
  ): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(
    longitude: Double,
    latitude: Double,
    height: Double,
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromDegrees")
  @js.native
  def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromDegreesArray")
  @js.native
  def fromDegreesArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromDegreesArray")
  @js.native
  def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromDegreesArray")
  @js.native
  def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromDegreesArray")
  @js.native
  def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromDegreesArrayHeights")
  @js.native
  def fromDegreesArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromDegreesArrayHeights")
  @js.native
  def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromDegreesArrayHeights")
  @js.native
  def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromDegreesArrayHeights")
  @js.native
  def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromElements")
  @js.native
  def fromElements(x: Double, y: Double, z: Double): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromElements")
  @js.native
  def fromElements(x: Double, y: Double, z: Double, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double, height: js.UndefOr[scala.Nothing], ellipsoid: Ellipsoid): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(
    longitude: Double,
    latitude: Double,
    height: js.UndefOr[scala.Nothing],
    ellipsoid: Ellipsoid,
    result: Cartesian3
  ): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(
    longitude: Double,
    latitude: Double,
    height: Double,
    ellipsoid: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromRadians")
  @js.native
  def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromRadiansArray")
  @js.native
  def fromRadiansArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromRadiansArray")
  @js.native
  def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromRadiansArray")
  @js.native
  def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromRadiansArray")
  @js.native
  def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromRadiansArrayHeights")
  @js.native
  def fromRadiansArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromRadiansArrayHeights")
  @js.native
  def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: js.UndefOr[scala.Nothing], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromRadiansArrayHeights")
  @js.native
  def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = js.native
  @JSImport("cesium", "Cartesian3.fromRadiansArrayHeights")
  @js.native
  def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.fromSpherical")
  @js.native
  def fromSpherical(spherical: Spherical): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.fromSpherical")
  @js.native
  def fromSpherical(spherical: Spherical, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.lerp")
  @js.native
  def lerp(start: Cartesian3, end: Cartesian3, t: Double, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.magnitude")
  @js.native
  def magnitude(cartesian: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.magnitudeSquared")
  @js.native
  def magnitudeSquared(cartesian: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.maximumByComponent")
  @js.native
  def maximumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.maximumComponent")
  @js.native
  def maximumComponent(cartesian: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.minimumByComponent")
  @js.native
  def minimumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.minimumComponent")
  @js.native
  def minimumComponent(cartesian: Cartesian3): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.mostOrthogonalAxis")
  @js.native
  def mostOrthogonalAxis(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.multiplyByScalar")
  @js.native
  def multiplyByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.multiplyComponents")
  @js.native
  def multiplyComponents(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.negate")
  @js.native
  def negate(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.normalize")
  @js.native
  def normalize(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.pack")
  @js.native
  def pack(value: Cartesian3, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "Cartesian3.pack")
  @js.native
  def pack(value: Cartesian3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.subtract")
  @js.native
  def subtract(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian3.unpack")
  @js.native
  def unpack(array: js.Array[Double]): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian3 = js.native
  @JSImport("cesium", "Cartesian3.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = js.native
}
