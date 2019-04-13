package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartesian2")
@js.native
class Cartesian2 () extends Packable {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def clone(result: Cartesian2): Cartesian2 = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Cartesian2): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian2, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Cartesian2")
@js.native
object Cartesian2 extends js.Object {
  var UNIT_X: cesiumLib.cesiumMod.Cartesian2 = js.native
  var UNIT_Y: cesiumLib.cesiumMod.Cartesian2 = js.native
  var ZERO: cesiumLib.cesiumMod.Cartesian2 = js.native
  def abs(cartesian: cesiumLib.cesiumMod.Cartesian2, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def add(
    left: cesiumLib.cesiumMod.Cartesian2,
    right: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def angleBetween(left: cesiumLib.cesiumMod.Cartesian2, right: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def clone(cartesian: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def clone(cartesian: cesiumLib.cesiumMod.Cartesian2, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def distance(left: cesiumLib.cesiumMod.Cartesian2, right: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def distanceSquared(left: cesiumLib.cesiumMod.Cartesian2, right: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def divideByScalar(
    cartesian: cesiumLib.cesiumMod.Cartesian2,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def dot(left: cesiumLib.cesiumMod.Cartesian2, right: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartesian2): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartesian2, right: cesiumLib.cesiumMod.Cartesian2): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.Cartesian2,
    right: cesiumLib.cesiumMod.Cartesian2,
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.Cartesian2,
    right: cesiumLib.cesiumMod.Cartesian2,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromCartesian3(cartesian: cesiumLib.cesiumMod.Cartesian3): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromCartesian3(cartesian: cesiumLib.cesiumMod.Cartesian3, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromElements(x: scala.Double, y: scala.Double): cesiumLib.cesiumMod.Cartesian2 = js.native
  def fromElements(x: scala.Double, y: scala.Double, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def lerp(
    start: cesiumLib.cesiumMod.Cartesian2,
    end: cesiumLib.cesiumMod.Cartesian2,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def magnitude(cartesian: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def magnitudeSquared(cartesian: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def maximumByComponent(
    first: cesiumLib.cesiumMod.Cartesian2,
    second: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def maximumComponent(cartesian: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def minimumByComponent(
    first: cesiumLib.cesiumMod.Cartesian2,
    second: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def minimumComponent(cartesian: cesiumLib.cesiumMod.Cartesian2): scala.Double = js.native
  def mostOrthogonalAxis(cartesian: cesiumLib.cesiumMod.Cartesian2, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def multiplyByScalar(
    cartesian: cesiumLib.cesiumMod.Cartesian2,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def multiplyComponents(
    left: cesiumLib.cesiumMod.Cartesian2,
    right: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def negate(cartesian: cesiumLib.cesiumMod.Cartesian2, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def normalize(cartesian: cesiumLib.cesiumMod.Cartesian2, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
  def pack(value: cesiumLib.cesiumMod.Cartesian2, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Cartesian2, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def subtract(
    left: cesiumLib.cesiumMod.Cartesian2,
    right: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.Cartesian2
  ): cesiumLib.cesiumMod.Cartesian2 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Cartesian2 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Cartesian2 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.Cartesian2 = js.native
}

