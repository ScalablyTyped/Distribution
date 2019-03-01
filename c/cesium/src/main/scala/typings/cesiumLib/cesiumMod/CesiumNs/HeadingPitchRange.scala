package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingPitchRange extends js.Object {
  var heading: scala.Double
  var pitch: scala.Double
  var range: scala.Double
}

object HeadingPitchRange {
  @scala.inline
  def apply(heading: scala.Double, pitch: scala.Double, range: scala.Double): HeadingPitchRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heading")(heading)
    __obj.updateDynamic("pitch")(pitch)
    __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[HeadingPitchRange]
  }
}

