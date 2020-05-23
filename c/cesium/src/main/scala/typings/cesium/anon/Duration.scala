package typings.cesium.anon

import typings.cesium.mod.HeadingPitchRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var maximumHeight: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[HeadingPitchRange] = js.undefined
}

object Duration {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    maximumHeight: js.UndefOr[Double] = js.undefined,
    offset: HeadingPitchRange = null
  ): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumHeight)) __obj.updateDynamic("maximumHeight")(maximumHeight.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

