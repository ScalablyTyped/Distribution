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
    anchor: js.UndefOr[ControlAnchor] = js.undefined,
    imageHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: Double | String = null,
    offset: Size = null
  ): AlbumsControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageHeight)) __obj.updateDynamic("imageHeight")(imageHeight.get.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumsControlOptions]
  }
}

