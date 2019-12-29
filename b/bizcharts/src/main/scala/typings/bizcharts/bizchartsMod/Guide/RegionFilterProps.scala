package typings.bizcharts.bizchartsMod.Guide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionFilterProps extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[js.Array[_]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.undefined
  var start: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
}

object RegionFilterProps {
  @scala.inline
  def apply(
    apply: js.Array[_] = null,
    color: String = null,
    end: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    start: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): RegionFilterProps = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionFilterProps]
  }
}

