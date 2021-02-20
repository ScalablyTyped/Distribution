package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartesian2")
@js.native
class Cartesian2 () extends Packable {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  
  def clone(result: Cartesian2): Cartesian2 = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Cartesian2): Boolean = js.native
  
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Cartesian2 {
  
  @JSImport("cesium", "Cartesian2")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.UNIT_X")
  @js.native
  def UNIT_X: Cartesian2 = js.native
  @scala.inline
  def UNIT_X_=(x: Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian2.UNIT_Y")
  @js.native
  def UNIT_Y: Cartesian2 = js.native
  @scala.inline
  def UNIT_Y_=(x: Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian2.ZERO")
  @js.native
  def ZERO: Cartesian2 = js.native
  @scala.inline
  def ZERO_=(x: Cartesian2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian2.abs")
  @js.native
  def abs(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.add")
  @js.native
  def add(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.angleBetween")
  @js.native
  def angleBetween(left: Cartesian2, right: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.clone")
  @js.native
  def clone_(cartesian: Cartesian2): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.clone")
  @js.native
  def clone_(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.distance")
  @js.native
  def distance(left: Cartesian2, right: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.distanceSquared")
  @js.native
  def distanceSquared(left: Cartesian2, right: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.divideByScalar")
  @js.native
  def divideByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.dot")
  @js.native
  def dot(left: Cartesian2, right: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double): Boolean = js.native
  @JSImport("cesium", "Cartesian2.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "Cartesian2.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: Cartesian2): Boolean = js.native
  @JSImport("cesium", "Cartesian2.equals")
  @js.native
  def equals_(left: Cartesian2): Boolean = js.native
  @JSImport("cesium", "Cartesian2.equals")
  @js.native
  def equals_(left: Cartesian2, right: Cartesian2): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double]): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian2): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.fromCartesian3")
  @js.native
  def fromCartesian3(cartesian: Cartesian3): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.fromCartesian3")
  @js.native
  def fromCartesian3(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.fromCartesian4")
  @js.native
  def fromCartesian4(cartesian: Cartesian4): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.fromCartesian4")
  @js.native
  def fromCartesian4(cartesian: Cartesian4, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.fromElements")
  @js.native
  def fromElements(x: Double, y: Double): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.fromElements")
  @js.native
  def fromElements(x: Double, y: Double, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.lerp")
  @js.native
  def lerp(start: Cartesian2, end: Cartesian2, t: Double, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.magnitude")
  @js.native
  def magnitude(cartesian: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.magnitudeSquared")
  @js.native
  def magnitudeSquared(cartesian: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.maximumByComponent")
  @js.native
  def maximumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.maximumComponent")
  @js.native
  def maximumComponent(cartesian: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.minimumByComponent")
  @js.native
  def minimumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.minimumComponent")
  @js.native
  def minimumComponent(cartesian: Cartesian2): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.mostOrthogonalAxis")
  @js.native
  def mostOrthogonalAxis(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.multiplyByScalar")
  @js.native
  def multiplyByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.multiplyComponents")
  @js.native
  def multiplyComponents(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.negate")
  @js.native
  def negate(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.normalize")
  @js.native
  def normalize(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.pack")
  @js.native
  def pack(value: Cartesian2, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "Cartesian2.pack")
  @js.native
  def pack(value: Cartesian2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.subtract")
  @js.native
  def subtract(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian2.unpack")
  @js.native
  def unpack(array: js.Array[Double]): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian2): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian2 = js.native
  @JSImport("cesium", "Cartesian2.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = js.native
}
