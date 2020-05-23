package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightLuminosity extends js.Object {
  var highlightLuminosity: js.UndefOr[Double] = js.undefined
  var highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.undefined
  var load: js.UndefOr[Effect] = js.undefined
  var pullOutSegmentOnClick: js.UndefOr[Size] = js.undefined
}

object HighlightLuminosity {
  @scala.inline
  def apply(
    highlightLuminosity: js.UndefOr[Double] = js.undefined,
    highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.undefined,
    load: Effect = null,
    pullOutSegmentOnClick: Size = null
  ): HighlightLuminosity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlightLuminosity)) __obj.updateDynamic("highlightLuminosity")(highlightLuminosity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSegmentOnMouseover)) __obj.updateDynamic("highlightSegmentOnMouseover")(highlightSegmentOnMouseover.get.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (pullOutSegmentOnClick != null) __obj.updateDynamic("pullOutSegmentOnClick")(pullOutSegmentOnClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightLuminosity]
  }
}

