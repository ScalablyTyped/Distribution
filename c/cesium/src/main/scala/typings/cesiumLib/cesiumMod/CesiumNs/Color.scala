package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends Packable {
  var alpha: scala.Double = js.native
  var blue: scala.Double = js.native
  var green: scala.Double = js.native
  var red: scala.Double = js.native
  def brighten(magnitude: scala.Double, result: Color): Color = js.native
  def clone(result: Color): Color = js.native
  def darken(magnitude: scala.Double, result: Color): Color = js.native
  def equals(other: Color): scala.Boolean = js.native
  def equalsEpsilon(other: Color): scala.Boolean = js.native
  def equalsEpsilon(other: Color, epsilon: scala.Double): scala.Boolean = js.native
  def toBytes(): js.Array[scala.Double] = js.native
  def toBytes(result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toCssColorString(): java.lang.String = js.native
  def toRgba(): scala.Double = js.native
  def withAlpha(alpha: scala.Double): Color = js.native
  def withAlpha(alpha: scala.Double, result: Color): Color = js.native
}

