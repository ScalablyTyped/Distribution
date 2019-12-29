package typings.bizcharts.bizchartsMod.Guide

import typings.atAntvG2.atAntvG2Mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.undefined
  var style: js.UndefOr[text] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    content: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    position: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    style: text = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

