package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeadingPitchRoll")
@js.native
class HeadingPitchRoll () extends js.Object {
  def this(heading: Double) = this()
  def this(heading: js.UndefOr[scala.Nothing], pitch: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: js.UndefOr[scala.Nothing], pitch: js.UndefOr[scala.Nothing], roll: Double) = this()
  def this(heading: js.UndefOr[scala.Nothing], pitch: Double, roll: Double) = this()
  def this(heading: Double, pitch: js.UndefOr[scala.Nothing], roll: Double) = this()
  def this(heading: Double, pitch: Double, roll: Double) = this()
  var heading: Double = js.native
  var pitch: Double = js.native
  var roll: Double = js.native
  def clone(result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def equals(): Boolean = js.native
  def equals(right: HeadingPitchRoll): Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[scala.Nothing], relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[scala.Nothing], relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Null, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "HeadingPitchRoll")
@js.native
object HeadingPitchRoll extends js.Object {
  def clone(headingPitchRoll: HeadingPitchRoll): HeadingPitchRoll = js.native
  def clone(headingPitchRoll: HeadingPitchRoll, result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: HeadingPitchRoll): Boolean = js.native
  def equals(left: Null, right: HeadingPitchRoll): Boolean = js.native
  def equals(left: HeadingPitchRoll): Boolean = js.native
  def equals(left: HeadingPitchRoll, right: HeadingPitchRoll): Boolean = js.native
  def equalsEpsilon(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    relativeEpsilon: Double,
    absoluteEpsilon: Double
  ): Boolean = js.native
  def equalsEpsilon(left: js.UndefOr[scala.Nothing], right: Null, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: js.UndefOr[scala.Nothing], right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: js.UndefOr[scala.Nothing], right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[scala.Nothing],
    right: HeadingPitchRoll,
    relativeEpsilon: Double,
    absoluteEpsilon: Double
  ): Boolean = js.native
  def equalsEpsilon(left: Null, right: js.UndefOr[scala.Nothing], relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Null, right: js.UndefOr[scala.Nothing], relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Null, right: Null, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Null, right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Null, right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Null, right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: HeadingPitchRoll, right: js.UndefOr[scala.Nothing], relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(
    left: HeadingPitchRoll,
    right: js.UndefOr[scala.Nothing],
    relativeEpsilon: Double,
    absoluteEpsilon: Double
  ): Boolean = js.native
  def equalsEpsilon(left: HeadingPitchRoll, right: Null, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: HeadingPitchRoll, right: Null, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: HeadingPitchRoll, right: HeadingPitchRoll, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def fromDegrees(heading: Double, pitch: Double, roll: Double): HeadingPitchRoll = js.native
  def fromDegrees(heading: Double, pitch: Double, roll: Double, result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def fromQuaternion(quaternion: Quaternion): HeadingPitchRoll = js.native
  def fromQuaternion(quaternion: Quaternion, result: HeadingPitchRoll): HeadingPitchRoll = js.native
}

