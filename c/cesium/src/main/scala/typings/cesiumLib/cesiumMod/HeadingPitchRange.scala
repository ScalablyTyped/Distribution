package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeadingPitchRange")
@js.native
class HeadingPitchRange () extends js.Object {
  def this(heading: scala.Double) = this()
  def this(heading: scala.Double, pitch: scala.Double) = this()
  def this(heading: scala.Double, pitch: scala.Double, range: scala.Double) = this()
  var heading: scala.Double = js.native
  var pitch: scala.Double = js.native
  var range: scala.Double = js.native
}

/* static members */
@JSImport("cesium", "HeadingPitchRange")
@js.native
object HeadingPitchRange extends js.Object {
  def clone(hpr: cesiumLib.cesiumMod.HeadingPitchRange): cesiumLib.cesiumMod.HeadingPitchRange = js.native
  def clone(hpr: cesiumLib.cesiumMod.HeadingPitchRange, result: cesiumLib.cesiumMod.HeadingPitchRange): cesiumLib.cesiumMod.HeadingPitchRange = js.native
}

