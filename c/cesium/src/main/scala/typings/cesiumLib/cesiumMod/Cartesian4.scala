package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cartesian4")
@js.native
class Cartesian4 () extends Packable {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def clone(result: Cartesian4): Cartesian4 = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: Cartesian4): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: Cartesian4, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Cartesian4")
@js.native
object Cartesian4 extends js.Object {
  var UNIT_W: cesiumLib.cesiumMod.Cartesian4 = js.native
  var UNIT_X: cesiumLib.cesiumMod.Cartesian4 = js.native
  var UNIT_Y: cesiumLib.cesiumMod.Cartesian4 = js.native
  var UNIT_Z: cesiumLib.cesiumMod.Cartesian4 = js.native
  var ZERO: cesiumLib.cesiumMod.Cartesian4 = js.native
  def abs(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def add(
    left: cesiumLib.cesiumMod.Cartesian4,
    right: cesiumLib.cesiumMod.Cartesian4,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def clone(cartesian: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def clone(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def distance(left: cesiumLib.cesiumMod.Cartesian4, right: cesiumLib.cesiumMod.Cartesian4): scala.Double = js.native
  def distanceSquared(left: cesiumLib.cesiumMod.Cartesian4, right: cesiumLib.cesiumMod.Cartesian4): scala.Double = js.native
  def divideByScalar(
    cartesian: cesiumLib.cesiumMod.Cartesian4,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def dot(left: cesiumLib.cesiumMod.Cartesian4, right: cesiumLib.cesiumMod.Cartesian4): scala.Double = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartesian4): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.Cartesian4, right: cesiumLib.cesiumMod.Cartesian4): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.Cartesian4,
    right: cesiumLib.cesiumMod.Cartesian4,
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.Cartesian4,
    right: cesiumLib.cesiumMod.Cartesian4,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def fromArray(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Cartesian4 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Cartesian4 = js.native
  def fromArray(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def fromColor(color: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Cartesian4 = js.native
  def fromColor(color: cesiumLib.cesiumMod.Color, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def fromElements(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): cesiumLib.cesiumMod.Cartesian4 = js.native
  def fromElements(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    w: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def lerp(
    start: cesiumLib.cesiumMod.Cartesian4,
    end: cesiumLib.cesiumMod.Cartesian4,
    t: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def magnitude(cartesian: cesiumLib.cesiumMod.Cartesian4): scala.Double = js.native
  def magnitudeSquared(cartesian: cesiumLib.cesiumMod.Cartesian4): scala.Double = js.native
  def maximumByComponent(
    first: cesiumLib.cesiumMod.Cartesian4,
    second: cesiumLib.cesiumMod.Cartesian4,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def maximumComponent(cartesian: cesiumLib.cesiumMod.Cartesian4): scala.Double = js.native
  def minimumByComponent(
    first: cesiumLib.cesiumMod.Cartesian4,
    second: cesiumLib.cesiumMod.Cartesian4,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def minimumComponent(cartesian: cesiumLib.cesiumMod.Cartesian4): scala.Double = js.native
  def mostOrthogonalAxis(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def multiplyByScalar(
    cartesian: cesiumLib.cesiumMod.Cartesian4,
    scalar: scala.Double,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def multiplyComponents(
    left: cesiumLib.cesiumMod.Cartesian4,
    right: cesiumLib.cesiumMod.Cartesian4,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def negate(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def normalize(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
  def pack(value: cesiumLib.cesiumMod.Cartesian4, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Cartesian4, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def subtract(
    left: cesiumLib.cesiumMod.Cartesian4,
    right: cesiumLib.cesiumMod.Cartesian4,
    result: cesiumLib.cesiumMod.Cartesian4
  ): cesiumLib.cesiumMod.Cartesian4 = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Cartesian4 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Cartesian4 = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Cartesian4 = js.native
}

