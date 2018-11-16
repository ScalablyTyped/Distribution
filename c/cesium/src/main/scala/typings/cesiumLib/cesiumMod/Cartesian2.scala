package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartesian2")
@js.native
class Cartesian2 ()
  extends cesiumLib.cesiumMod.CesiumNs.Cartesian2 {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
}

@JSImport("cesium", "Cartesian2")
@js.native
object Cartesian2 extends js.Object {
  var UNIT_X: cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  var UNIT_Y: cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  var ZERO: cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def abs(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def add(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def angleBetween(left: cesiumLib.cesiumMod.CesiumNs.Cartesian2, right: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def clone(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def clone(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def distance(left: cesiumLib.cesiumMod.CesiumNs.Cartesian2, right: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def distanceSquared(left: cesiumLib.cesiumMod.CesiumNs.Cartesian2, right: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def divideByScalar(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def dot(left: cesiumLib.cesiumMod.CesiumNs.Cartesian2, right: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Cartesian2, right: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromArray(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromCartesian3(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromCartesian3(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian4): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromCartesian4(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian4,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromElements(x: scala.Double, y: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def fromElements(x: scala.Double, y: scala.Double, result: cesiumLib.cesiumMod.CesiumNs.Cartesian2): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def lerp(
    start: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    end: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    t: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def magnitude(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def magnitudeSquared(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def maximumByComponent(
    first: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    second: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def maximumComponent(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def minimumByComponent(
    first: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    second: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def minimumComponent(cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2): scala.Double = js.native
  def mostOrthogonalAxis(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def multiplyByScalar(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def multiplyComponents(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def negate(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def normalize(
    cartesian: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.Cartesian2, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def subtract(
    left: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    right: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian2 = js.native
}

