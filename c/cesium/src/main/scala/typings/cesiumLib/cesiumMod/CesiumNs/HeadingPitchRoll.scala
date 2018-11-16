package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadingPitchRoll extends js.Object {
  var heading: scala.Double = js.native
  var pitch: scala.Double = js.native
  var roll: scala.Double = js.native
  def clone(result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: HeadingPitchRoll): scala.Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[scala.Nothing], relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[scala.Nothing], relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: scala.Null, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: scala.Null, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
}

