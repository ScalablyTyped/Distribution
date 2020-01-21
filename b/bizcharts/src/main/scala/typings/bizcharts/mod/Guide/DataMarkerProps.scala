package typings.bizcharts.mod.Guide

import typings.bizcharts.bizchartsStrings.downward
import typings.bizcharts.bizchartsStrings.upward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMarkerProps extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[upward | downward] = js.undefined
  var display: js.UndefOr[js.Object] = js.undefined
  var lineLength: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
}

object DataMarkerProps {
  @scala.inline
  def apply(
    content: String = null,
    direction: upward | downward = null,
    display: js.Object = null,
    lineLength: Int | Double = null,
    position: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    style: js.Object = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): DataMarkerProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (lineLength != null) __obj.updateDynamic("lineLength")(lineLength.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMarkerProps]
  }
}

