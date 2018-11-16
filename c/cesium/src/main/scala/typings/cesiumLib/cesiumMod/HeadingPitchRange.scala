package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeadingPitchRange")
@js.native
class HeadingPitchRange ()
  extends cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange {
  def this(heading: scala.Double) = this()
  def this(heading: scala.Double, pitch: scala.Double) = this()
  def this(heading: scala.Double, pitch: scala.Double, range: scala.Double) = this()
  /* CompleteClass */
  override var heading: scala.Double = js.native
  /* CompleteClass */
  override var pitch: scala.Double = js.native
  /* CompleteClass */
  override var range: scala.Double = js.native
}

@JSImport("cesium", "HeadingPitchRange")
@js.native
object HeadingPitchRange extends js.Object {
  def clone(hpr: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange): cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange = js.native
  def clone(
    hpr: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange,
    result: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange
  ): cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange = js.native
}

