package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HighlightLuminosity extends js.Object {
  var highlightLuminosity: js.UndefOr[Double] = js.undefined
  var highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.undefined
  var load: js.UndefOr[Anon_Default] = js.undefined
  var pullOutSegmentOnClick: js.UndefOr[Anon_Back] = js.undefined
}

object Anon_HighlightLuminosity {
  @scala.inline
  def apply(
    highlightLuminosity: Int | Double = null,
    highlightSegmentOnMouseover: js.UndefOr[Boolean] = js.undefined,
    load: Anon_Default = null,
    pullOutSegmentOnClick: Anon_Back = null
  ): Anon_HighlightLuminosity = {
    val __obj = js.Dynamic.literal()
    if (highlightLuminosity != null) __obj.updateDynamic("highlightLuminosity")(highlightLuminosity.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSegmentOnMouseover)) __obj.updateDynamic("highlightSegmentOnMouseover")(highlightSegmentOnMouseover.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (pullOutSegmentOnClick != null) __obj.updateDynamic("pullOutSegmentOnClick")(pullOutSegmentOnClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HighlightLuminosity]
  }
}

