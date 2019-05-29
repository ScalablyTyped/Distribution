package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeadingPitchRoll")
@js.native
class HeadingPitchRoll () extends js.Object {
  def this(heading: scala.Double) = this()
  def this(heading: scala.Double, pitch: scala.Double) = this()
  def this(heading: scala.Double, pitch: scala.Double, roll: scala.Double) = this()
  var heading: scala.Double = js.native
  var pitch: scala.Double = js.native
  var roll: scala.Double = js.native
  def clone(result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: HeadingPitchRoll): scala.Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[scala.Nothing], relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[scala.Nothing], relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: scala.Null, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(right: scala.Null, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "HeadingPitchRoll")
@js.native
object HeadingPitchRoll extends js.Object {
  def clone(headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll): cesiumLib.cesiumMod.HeadingPitchRoll = js.native
  def clone(
    headingPitchRoll: cesiumLib.cesiumMod.HeadingPitchRoll,
    result: cesiumLib.cesiumMod.HeadingPitchRoll
  ): cesiumLib.cesiumMod.HeadingPitchRoll = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: cesiumLib.cesiumMod.HeadingPitchRoll): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.HeadingPitchRoll): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.HeadingPitchRoll, right: cesiumLib.cesiumMod.HeadingPitchRoll): scala.Boolean = js.native
  def equals(left: scala.Null, right: cesiumLib.cesiumMod.HeadingPitchRoll): scala.Boolean = js.native
  def equalsEpsilon(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[scala.Nothing],
    right: cesiumLib.cesiumMod.HeadingPitchRoll,
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[scala.Nothing],
    right: cesiumLib.cesiumMod.HeadingPitchRoll,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(left: js.UndefOr[scala.Nothing], right: scala.Null, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[scala.Nothing],
    right: scala.Null,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.HeadingPitchRoll,
    right: js.UndefOr[scala.Nothing],
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.HeadingPitchRoll,
    right: js.UndefOr[scala.Nothing],
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.HeadingPitchRoll,
    right: cesiumLib.cesiumMod.HeadingPitchRoll,
    relativeEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.HeadingPitchRoll,
    right: cesiumLib.cesiumMod.HeadingPitchRoll,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(left: cesiumLib.cesiumMod.HeadingPitchRoll, right: scala.Null, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    left: cesiumLib.cesiumMod.HeadingPitchRoll,
    right: scala.Null,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(left: scala.Null, right: js.UndefOr[scala.Nothing], relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    left: scala.Null,
    right: js.UndefOr[scala.Nothing],
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(left: scala.Null, right: cesiumLib.cesiumMod.HeadingPitchRoll, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    left: scala.Null,
    right: cesiumLib.cesiumMod.HeadingPitchRoll,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def equalsEpsilon(left: scala.Null, right: scala.Null, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(left: scala.Null, right: scala.Null, relativeEpsilon: scala.Double, absoluteEpsilon: scala.Double): scala.Boolean = js.native
  def fromDegrees(heading: scala.Double, pitch: scala.Double, roll: scala.Double): cesiumLib.cesiumMod.HeadingPitchRoll = js.native
  def fromDegrees(
    heading: scala.Double,
    pitch: scala.Double,
    roll: scala.Double,
    result: cesiumLib.cesiumMod.HeadingPitchRoll
  ): cesiumLib.cesiumMod.HeadingPitchRoll = js.native
  def fromQuaternion(quaternion: cesiumLib.cesiumMod.Quaternion): cesiumLib.cesiumMod.HeadingPitchRoll = js.native
  def fromQuaternion(quaternion: cesiumLib.cesiumMod.Quaternion, result: cesiumLib.cesiumMod.HeadingPitchRoll): cesiumLib.cesiumMod.HeadingPitchRoll = js.native
}

