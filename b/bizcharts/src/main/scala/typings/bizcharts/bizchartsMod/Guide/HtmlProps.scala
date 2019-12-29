package typings.bizcharts.bizchartsMod.Guide

import typings.bizcharts.bizchartsMod.AlignXType
import typings.bizcharts.bizchartsMod.AlignYType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlProps extends js.Object {
  var alignX: js.UndefOr[AlignXType] = js.undefined
  var alignY: js.UndefOr[AlignYType] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object HtmlProps {
  @scala.inline
  def apply(
    alignX: AlignXType = null,
    alignY: AlignYType = null,
    html: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    position: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    zIndex: Int | Double = null
  ): HtmlProps = {
    val __obj = js.Dynamic.literal()
    if (alignX != null) __obj.updateDynamic("alignX")(alignX.asInstanceOf[js.Any])
    if (alignY != null) __obj.updateDynamic("alignY")(alignY.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlProps]
  }
}

