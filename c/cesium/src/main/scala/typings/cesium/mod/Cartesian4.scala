package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartesian4")
@js.native
class Cartesian4 () extends Packable {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def clone(result: Cartesian4): Cartesian4 = js.native
  def equals(): Boolean = js.native
  def equals(right: Cartesian4): Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "Cartesian4")
@js.native
object Cartesian4 extends js.Object {
  var UNIT_W: Cartesian4 = js.native
  var UNIT_X: Cartesian4 = js.native
  var UNIT_Y: Cartesian4 = js.native
  var UNIT_Z: Cartesian4 = js.native
  var ZERO: Cartesian4 = js.native
  def abs(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def add(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def clone(cartesian: Cartesian4): Cartesian4 = js.native
  def clone(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def distance(left: Cartesian4, right: Cartesian4): Double = js.native
  def distanceSquared(left: Cartesian4, right: Cartesian4): Double = js.native
  def divideByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = js.native
  def dot(left: Cartesian4, right: Cartesian4): Double = js.native
  def equals(): Boolean = js.native
  def equals(left: Cartesian4): Boolean = js.native
  def equals(left: Cartesian4, right: Cartesian4): Boolean = js.native
  def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Cartesian4, right: Cartesian4, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def fromArray(array: js.Array[Double]): Cartesian4 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double): Cartesian4 = js.native
  def fromArray(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = js.native
  def fromColor(color: Color): Cartesian4 = js.native
  def fromColor(color: Color, result: Cartesian4): Cartesian4 = js.native
  def fromElements(x: Double, y: Double, z: Double, w: Double): Cartesian4 = js.native
  def fromElements(x: Double, y: Double, z: Double, w: Double, result: Cartesian4): Cartesian4 = js.native
  def lerp(start: Cartesian4, end: Cartesian4, t: Double, result: Cartesian4): Cartesian4 = js.native
  def magnitude(cartesian: Cartesian4): Double = js.native
  def magnitudeSquared(cartesian: Cartesian4): Double = js.native
  def maximumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def maximumComponent(cartesian: Cartesian4): Double = js.native
  def minimumByComponent(first: Cartesian4, second: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def minimumComponent(cartesian: Cartesian4): Double = js.native
  def mostOrthogonalAxis(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def multiplyByScalar(cartesian: Cartesian4, scalar: Double, result: Cartesian4): Cartesian4 = js.native
  def multiplyComponents(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def negate(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def normalize(cartesian: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def pack(value: Cartesian4, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Cartesian4, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def subtract(left: Cartesian4, right: Cartesian4, result: Cartesian4): Cartesian4 = js.native
  def unpack(array: js.Array[Double]): Cartesian4 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Cartesian4 = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Cartesian4): Cartesian4 = js.native
}

