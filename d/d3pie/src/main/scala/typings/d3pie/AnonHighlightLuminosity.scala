package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighlightLuminosity extends js.Object {
  var highlightLuminosity: js.UndefOr[Double] = js.undefined
  var highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.undefined
  var load: js.UndefOr[AnonDefault] = js.undefined
  var pullOutSegmentOnClick: js.UndefOr[AnonBack] = js.undefined
}

object AnonHighlightLuminosity {
  @scala.inline
  def apply(
    highlightLuminosity: Int | Double = null,
    highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.undefined,
    load: AnonDefault = null,
    pullOutSegmentOnClick: AnonBack = null
  ): AnonHighlightLuminosity = {
    val __obj = js.Dynamic.literal()
    if (highlightLuminosity != null) __obj.updateDynamic("highlightLuminosity")(highlightLuminosity.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSegmentOnMouseover)) __obj.updateDynamic("highlightSegmentOnMouseover")(highlightSegmentOnMouseover.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (pullOutSegmentOnClick != null) __obj.updateDynamic("pullOutSegmentOnClick")(pullOutSegmentOnClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlightLuminosity]
  }
}

