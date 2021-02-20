package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cartesian4")
@js.native
class Cartesian4 () extends Packable {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    z: js.UndefOr[scala.Nothing],
    w: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  
  def clone(result: Cartesian4): Cartesian4 = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Cartesian4): Boolean = js.native
  
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  var w: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
object Cartesian4 {
  
  @JSImport("cesium", "Cartesian4")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_W")
  @js.native
  def UNIT_W: Cartesian4 = js.native
  @scala.inline
  def UNIT_W_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_W")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_X")
  @js.native
  def UNIT_X: Cartesian4 = js.native
  @scala.inline
  def UNIT_X_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_X")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_Y")
  @js.native
  def UNIT_Y: Cartesian4 = js.native
  @scala.inline
  def UNIT_Y_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Y")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.UNIT_Z")
  @js.native
  def UNIT_Z: Cartesian4 = js.native
  @scala.inline
  def UNIT_Z_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT_Z")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.ZERO")
  @js.native
  def ZERO: Cartesian4 = js.native
  @scala.inline
  def ZERO_=(x: Cartesian4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Cartesian4.abs")
  @js.native
  def abs(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.add")
  @js.native
  def add(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.clone")
  @js.native
  def clone_(cartesian: Cartesian4): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.clone")
  @js.native
  def clone_(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.distance")
  @js.native
  def distance(left: Cartesian4, right: Cartesian4): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.distanceSquared")
  @js.native
  def distanceSquared(left: Cartesian4, right: Cartesian4): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.divideByScalar")
  @js.native
  def divideByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.dot")
  @js.native
  def dot(left: Cartesian4, right: Cartesian4): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double): Boolean = js.native
  @JSImport("cesium", "Cartesian4.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "Cartesian4.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: Cartesian4): Boolean = js.native
  @JSImport("cesium", "Cartesian4.equals")
  @js.native
  def equals_(left: Cartesian4): Boolean = js.native
  @JSImport("cesium", "Cartesian4.equals")
  @js.native
  def equals_(left: Cartesian4, right: Cartesian4): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.fromArray")
  @js.native
  def fromArray(array: js.Array[Double]): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian4): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.fromArray")
  @js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.fromColor")
  @js.native
  def fromColor(color: Color): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.fromColor")
  @js.native
  def fromColor(color: Color, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.fromElements")
  @js.native
  def fromElements(x: Double, y: Double, z: Double, w: Double): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.fromElements")
  @js.native
  def fromElements(x: Double, y: Double, z: Double, w: Double, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.lerp")
  @js.native
  def lerp(start: Cartesian4, end: Cartesian4, t: Double, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.magnitude")
  @js.native
  def magnitude(cartesian: Cartesian4): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.magnitudeSquared")
  @js.native
  def magnitudeSquared(cartesian: Cartesian4): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.maximumByComponent")
  @js.native
  def maximumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.maximumComponent")
  @js.native
  def maximumComponent(cartesian: Cartesian4): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.minimumByComponent")
  @js.native
  def minimumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.minimumComponent")
  @js.native
  def minimumComponent(cartesian: Cartesian4): Double = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.mostOrthogonalAxis")
  @js.native
  def mostOrthogonalAxis(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.multiplyByScalar")
  @js.native
  def multiplyByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.multiplyComponents")
  @js.native
  def multiplyComponents(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.negate")
  @js.native
  def negate(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.normalize")
  @js.native
  def normalize(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.pack")
  @js.native
  def pack(value: Cartesian4, array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("cesium", "Cartesian4.pack")
  @js.native
  def pack(value: Cartesian4, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.subtract")
  @js.native
  def subtract(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  
  /* static member */
  @JSImport("cesium", "Cartesian4.unpack")
  @js.native
  def unpack(array: js.Array[Double]): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian4): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian4 = js.native
  @JSImport("cesium", "Cartesian4.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = js.native
}
