package typings.cesium

import typings.cesium.cesiumMod.HeadingPitchRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var maximumHeight: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[HeadingPitchRange] = js.undefined
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    maximumHeight: Int | Double = null,
    offset: HeadingPitchRange = null
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (maximumHeight != null) __obj.updateDynamic("maximumHeight")(maximumHeight.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_Duration]
  }
}

