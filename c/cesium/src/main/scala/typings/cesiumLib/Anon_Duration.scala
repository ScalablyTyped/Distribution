package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var maximumHeight: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    maximumHeight: scala.Int | scala.Double = null,
    offset: cesiumLib.cesiumMod.CesiumNs.HeadingPitchRange = null
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_Duration]
  }
}

