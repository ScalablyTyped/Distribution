package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  var bodyFontColor: js.UndefOr[ChartColor] = js.undefined
  var bodyFontFamily: js.UndefOr[java.lang.String] = js.undefined
  var bodyFontSize: js.UndefOr[scala.Double] = js.undefined
  var bodyFontStyle: js.UndefOr[java.lang.String] = js.undefined
  var bodySpacing: js.UndefOr[scala.Double] = js.undefined
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var callbacks: js.UndefOr[ChartTooltipCallback] = js.undefined
  var caretPadding: js.UndefOr[scala.Double] = js.undefined
  var caretSize: js.UndefOr[scala.Double] = js.undefined
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  var custom: js.UndefOr[js.Function1[/* a */ js.Any, scala.Unit]] = js.undefined
  var displayColors: js.UndefOr[scala.Boolean] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[js.Function1[/* item */ ChartTooltipItem, scala.Boolean]] = js.undefined
  var footerFontColor: js.UndefOr[ChartColor] = js.undefined
  var footerFontFamily: js.UndefOr[java.lang.String] = js.undefined
  var footerFontSize: js.UndefOr[scala.Double] = js.undefined
  var footerFontStyle: js.UndefOr[java.lang.String] = js.undefined
  var footerMarginTop: js.UndefOr[scala.Double] = js.undefined
  var footerSpacing: js.UndefOr[scala.Double] = js.undefined
  var intersect: js.UndefOr[scala.Boolean] = js.undefined
  var itemSort: js.UndefOr[
    js.Function2[/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem, scala.Double]
  ] = js.undefined
  var mode: js.UndefOr[InteractionMode] = js.undefined
  var multiKeyBackground: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var titleFontColor: js.UndefOr[ChartColor] = js.undefined
  var titleFontFamily: js.UndefOr[java.lang.String] = js.undefined
  var titleFontSize: js.UndefOr[scala.Double] = js.undefined
  var titleFontStyle: js.UndefOr[java.lang.String] = js.undefined
  var titleMarginBottom: js.UndefOr[scala.Double] = js.undefined
  var titleSpacing: js.UndefOr[scala.Double] = js.undefined
  var xPadding: js.UndefOr[scala.Double] = js.undefined
  var yPadding: js.UndefOr[scala.Double] = js.undefined
}

object ChartTooltipOptions {
  @scala.inline
  def apply(
    backgroundColor: ChartColor = null,
    bodyFontColor: ChartColor = null,
    bodyFontFamily: java.lang.String = null,
    bodyFontSize: scala.Int | scala.Double = null,
    bodyFontStyle: java.lang.String = null,
    bodySpacing: scala.Int | scala.Double = null,
    borderColor: ChartColor = null,
    borderWidth: scala.Int | scala.Double = null,
    callbacks: ChartTooltipCallback = null,
    caretPadding: scala.Int | scala.Double = null,
    caretSize: scala.Int | scala.Double = null,
    cornerRadius: scala.Int | scala.Double = null,
    custom: js.Function1[/* a */ js.Any, scala.Unit] = null,
    displayColors: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.Function1[/* item */ ChartTooltipItem, scala.Boolean] = null,
    footerFontColor: ChartColor = null,
    footerFontFamily: java.lang.String = null,
    footerFontSize: scala.Int | scala.Double = null,
    footerFontStyle: java.lang.String = null,
    footerMarginTop: scala.Int | scala.Double = null,
    footerSpacing: scala.Int | scala.Double = null,
    intersect: js.UndefOr[scala.Boolean] = js.undefined,
    itemSort: js.Function2[/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem, scala.Double] = null,
    mode: InteractionMode = null,
    multiKeyBackground: java.lang.String = null,
    position: java.lang.String = null,
    titleFontColor: ChartColor = null,
    titleFontFamily: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null,
    titleFontStyle: java.lang.String = null,
    titleMarginBottom: scala.Int | scala.Double = null,
    titleSpacing: scala.Int | scala.Double = null,
    xPadding: scala.Int | scala.Double = null,
    yPadding: scala.Int | scala.Double = null
  ): ChartTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bodyFontColor != null) __obj.updateDynamic("bodyFontColor")(bodyFontColor.asInstanceOf[js.Any])
    if (bodyFontFamily != null) __obj.updateDynamic("bodyFontFamily")(bodyFontFamily)
    if (bodyFontSize != null) __obj.updateDynamic("bodyFontSize")(bodyFontSize.asInstanceOf[js.Any])
    if (bodyFontStyle != null) __obj.updateDynamic("bodyFontStyle")(bodyFontStyle)
    if (bodySpacing != null) __obj.updateDynamic("bodySpacing")(bodySpacing.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (caretPadding != null) __obj.updateDynamic("caretPadding")(caretPadding.asInstanceOf[js.Any])
    if (caretSize != null) __obj.updateDynamic("caretSize")(caretSize.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(displayColors)) __obj.updateDynamic("displayColors")(displayColors)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (footerFontColor != null) __obj.updateDynamic("footerFontColor")(footerFontColor.asInstanceOf[js.Any])
    if (footerFontFamily != null) __obj.updateDynamic("footerFontFamily")(footerFontFamily)
    if (footerFontSize != null) __obj.updateDynamic("footerFontSize")(footerFontSize.asInstanceOf[js.Any])
    if (footerFontStyle != null) __obj.updateDynamic("footerFontStyle")(footerFontStyle)
    if (footerMarginTop != null) __obj.updateDynamic("footerMarginTop")(footerMarginTop.asInstanceOf[js.Any])
    if (footerSpacing != null) __obj.updateDynamic("footerSpacing")(footerSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(intersect)) __obj.updateDynamic("intersect")(intersect)
    if (itemSort != null) __obj.updateDynamic("itemSort")(itemSort)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (multiKeyBackground != null) __obj.updateDynamic("multiKeyBackground")(multiKeyBackground)
    if (position != null) __obj.updateDynamic("position")(position)
    if (titleFontColor != null) __obj.updateDynamic("titleFontColor")(titleFontColor.asInstanceOf[js.Any])
    if (titleFontFamily != null) __obj.updateDynamic("titleFontFamily")(titleFontFamily)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle)
    if (titleMarginBottom != null) __obj.updateDynamic("titleMarginBottom")(titleMarginBottom.asInstanceOf[js.Any])
    if (titleSpacing != null) __obj.updateDynamic("titleSpacing")(titleSpacing.asInstanceOf[js.Any])
    if (xPadding != null) __obj.updateDynamic("xPadding")(xPadding.asInstanceOf[js.Any])
    if (yPadding != null) __obj.updateDynamic("yPadding")(yPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipOptions]
  }
}

