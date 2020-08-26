package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartesian2")
@js.native
class Cartesian2 () extends Packable {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  def clone(result: Cartesian2): Cartesian2 = js.native
  def equals(): Boolean = js.native
  def equals(right: Cartesian2): Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "Cartesian2")
@js.native
object Cartesian2 extends js.Object {
  var UNIT_X: Cartesian2 = js.native
  var UNIT_Y: Cartesian2 = js.native
  var ZERO: Cartesian2 = js.native
  def abs(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def add(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def angleBetween(left: Cartesian2, right: Cartesian2): Double = js.native
  def clone(cartesian: Cartesian2): Cartesian2 = js.native
  def clone(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def distance(left: Cartesian2, right: Cartesian2): Double = js.native
  def distanceSquared(left: Cartesian2, right: Cartesian2): Double = js.native
  def divideByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = js.native
  def dot(left: Cartesian2, right: Cartesian2): Double = js.native
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: Cartesian2): Boolean = js.native
  def equals(left: Cartesian2): Boolean = js.native
  def equals(left: Cartesian2, right: Cartesian2): Boolean = js.native
  def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Cartesian2, right: Cartesian2, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def fromArray(array: js.Array[Double]): Cartesian2 = js.native
  def fromArray(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian2): Cartesian2 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian2 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = js.native
  def fromCartesian3(cartesian: Cartesian3): Cartesian2 = js.native
  def fromCartesian3(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  def fromCartesian4(cartesian: Cartesian4): Cartesian2 = js.native
  def fromCartesian4(cartesian: Cartesian4, result: Cartesian2): Cartesian2 = js.native
  def fromElements(x: Double, y: Double): Cartesian2 = js.native
  def fromElements(x: Double, y: Double, result: Cartesian2): Cartesian2 = js.native
  def lerp(start: Cartesian2, end: Cartesian2, t: Double, result: Cartesian2): Cartesian2 = js.native
  def magnitude(cartesian: Cartesian2): Double = js.native
  def magnitudeSquared(cartesian: Cartesian2): Double = js.native
  def maximumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def maximumComponent(cartesian: Cartesian2): Double = js.native
  def minimumByComponent(first: Cartesian2, second: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def minimumComponent(cartesian: Cartesian2): Double = js.native
  def mostOrthogonalAxis(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def multiplyByScalar(cartesian: Cartesian2, scalar: Double, result: Cartesian2): Cartesian2 = js.native
  def multiplyComponents(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def negate(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def normalize(cartesian: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def pack(value: Cartesian2, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Cartesian2, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def subtract(left: Cartesian2, right: Cartesian2, result: Cartesian2): Cartesian2 = js.native
  def unpack(array: js.Array[Double]): Cartesian2 = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Cartesian2): Cartesian2 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian2 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian2): Cartesian2 = js.native
}

