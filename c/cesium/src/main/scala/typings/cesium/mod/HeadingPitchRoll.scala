package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeadingPitchRoll")
@js.native
class HeadingPitchRoll () extends js.Object {
  def this(heading: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: Double, pitch: Double, roll: Double) = this()
  var heading: Double = js.native
  var pitch: Double = js.native
  var roll: Double = js.native
  def clone(result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def equals(): Boolean = js.native
  def equals(right: HeadingPitchRoll): Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[HeadingPitchRoll | Null], relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(right: js.UndefOr[HeadingPitchRoll | Null], relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
}

/* static members */
@JSImport("cesium", "HeadingPitchRoll")
@js.native
object HeadingPitchRoll extends js.Object {
  def clone(headingPitchRoll: HeadingPitchRoll): HeadingPitchRoll = js.native
  def clone(headingPitchRoll: HeadingPitchRoll, result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def equals(): Boolean = js.native
  def equals(left: Null, right: HeadingPitchRoll): Boolean = js.native
  def equals(left: HeadingPitchRoll): Boolean = js.native
  def equals(left: HeadingPitchRoll, right: HeadingPitchRoll): Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[HeadingPitchRoll | Null],
    right: js.UndefOr[HeadingPitchRoll | Null],
    relativeEpsilon: Double
  ): Boolean = js.native
  def equalsEpsilon(
    left: js.UndefOr[HeadingPitchRoll | Null],
    right: js.UndefOr[HeadingPitchRoll | Null],
    relativeEpsilon: Double,
    absoluteEpsilon: Double
  ): Boolean = js.native
  def fromDegrees(heading: Double, pitch: Double, roll: Double): HeadingPitchRoll = js.native
  def fromDegrees(heading: Double, pitch: Double, roll: Double, result: HeadingPitchRoll): HeadingPitchRoll = js.native
  def fromQuaternion(quaternion: Quaternion): HeadingPitchRoll = js.native
  def fromQuaternion(quaternion: Quaternion, result: HeadingPitchRoll): HeadingPitchRoll = js.native
}

