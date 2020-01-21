package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlbumsControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  var imageHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var offset: js.UndefOr[Size] = js.undefined
}

object AlbumsControlOptions {
  @scala.inline
  def apply(
    anchor: Int | Double = null,
    imageHeight: Int | Double = null,
    maxWidth: Double | String = null,
    offset: Size = null
  ): AlbumsControlOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (imageHeight != null) __obj.updateDynamic("imageHeight")(imageHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumsControlOptions]
  }
}

