package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeadingPitchRange")
@js.native
class HeadingPitchRange () extends js.Object {
  def this(heading: Double) = this()
  def this(heading: Double, pitch: Double) = this()
  def this(heading: Double, pitch: Double, range: Double) = this()
  var heading: Double = js.native
  var pitch: Double = js.native
  var range: Double = js.native
}

/* static members */
@JSImport("cesium", "HeadingPitchRange")
@js.native
object HeadingPitchRange extends js.Object {
  def clone(hpr: HeadingPitchRange): HeadingPitchRange = js.native
  def clone(hpr: HeadingPitchRange, result: HeadingPitchRange): HeadingPitchRange = js.native
}

