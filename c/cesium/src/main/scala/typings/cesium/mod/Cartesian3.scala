package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cesium.mod.Property because Inheritance from two classes. Inlined isConstant, definitionChanged, getValue, getValue, getValue, getValue, equals, equals
- typings.cesium.mod.PositionProperty because Inheritance from two classes. Inlined referenceFrame, getValueInReferenceFrame, getValueInReferenceFrame */ @JSImport("cesium", "Cartesian3")
@js.native
class Cartesian3 () extends Packable {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  
  def clone(result: Cartesian3): Cartesian3 = js.native
  
  var definitionChanged: Event[js.Array[js.Any]] = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  def equals(right: Cartesian3): Boolean = js.native
  
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  def getValue(): js.Any = js.native
  def getValue(time: Unit, result: js.Any): js.Any = js.native
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
  inline def UNIT_X_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian3.UNIT_Y")
  @js.native
  def UNIT_Y: Cartesian3 = js.native
  inline def UNIT_Y_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian3.UNIT_Z")
  @js.native
  def UNIT_Z: Cartesian3 = js.native
  inline def UNIT_Z_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Z")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian3.ZERO")
  @js.native
  def ZERO: Cartesian3 = js.native
  inline def ZERO_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def abs(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def add(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def angleBetween(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def clone_(cartesian: Cartesian3): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def clone_(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def cross(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def distance(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def distanceSquared(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def divideByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def dot(left: Cartesian3, right: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Cartesian3, right: Cartesian3, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], relativeEpsilon.asInstanceOf[js.Any], absoluteEpsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: Cartesian3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: Cartesian3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: Cartesian3, right: Cartesian3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromArray(array: js.Array[Double]): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromArray(array: js.Array[Double], startingIndex: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def fromCartesian4(cartesian: Cartesian4): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def fromCartesian4(cartesian: Cartesian4, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def fromDegrees(longitude: Double, latitude: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromDegrees(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def fromDegreesArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /* static member */
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromDegreesArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDegreesArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /* static member */
  inline def fromElements(x: Double, y: Double, z: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromElements(x: Double, y: Double, z: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElements")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def fromRadians(longitude: Double, latitude: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Double, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, ellipsoid: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def fromRadians(longitude: Double, latitude: Double, height: Unit, ellipsoid: Ellipsoid, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], height.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def fromRadiansArray(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArray(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArray")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /* static member */
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double]): js.Array[Cartesian3] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Unit, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  inline def fromRadiansArrayHeights(coordinates: js.Array[Double], ellipsoid: Ellipsoid, result: js.Array[Cartesian3]): js.Array[Cartesian3] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRadiansArrayHeights")(coordinates.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cartesian3]]
  
  /* static member */
  inline def fromSpherical(spherical: Spherical): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSpherical")(spherical.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def fromSpherical(spherical: Spherical, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSpherical")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def lerp(start: Cartesian3, end: Cartesian3, t: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def magnitude(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitude")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def magnitudeSquared(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magnitudeSquared")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def maximumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def maximumComponent(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def minimumByComponent(first: Cartesian3, second: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumByComponent")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def minimumComponent(cartesian: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumComponent")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def mostOrthogonalAxis(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mostOrthogonalAxis")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def multiplyByScalar(cartesian: Cartesian3, scalar: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(cartesian.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def multiplyComponents(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyComponents")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def negate(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def normalize(cartesian: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def pack(value: Cartesian3, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Cartesian3, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def subtract(left: Cartesian3, right: Cartesian3, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
}
