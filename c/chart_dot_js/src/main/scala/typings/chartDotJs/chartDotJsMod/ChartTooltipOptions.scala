package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  var bodyAlign: js.UndefOr[TextAlignment] = js.undefined
  var bodyFontColor: js.UndefOr[ChartColor] = js.undefined
  var bodyFontFamily: js.UndefOr[String] = js.undefined
  var bodyFontSize: js.UndefOr[Double] = js.undefined
  var bodyFontStyle: js.UndefOr[String] = js.undefined
  var bodySpacing: js.UndefOr[Double] = js.undefined
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var callbacks: js.UndefOr[ChartTooltipCallback] = js.undefined
  var caretPadding: js.UndefOr[Double] = js.undefined
  var caretSize: js.UndefOr[Double] = js.undefined
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var custom: js.UndefOr[js.Function1[/* a */ js.Any, Unit]] = js.undefined
  var displayColors: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[js.Function2[/* item */ ChartTooltipItem, /* data */ ChartData, Boolean]] = js.undefined
  var footerAlign: js.UndefOr[TextAlignment] = js.undefined
  var footerFontColor: js.UndefOr[ChartColor] = js.undefined
  var footerFontFamily: js.UndefOr[String] = js.undefined
  var footerFontSize: js.UndefOr[Double] = js.undefined
  var footerFontStyle: js.UndefOr[String] = js.undefined
  var footerMarginTop: js.UndefOr[Double] = js.undefined
  var footerSpacing: js.UndefOr[Double] = js.undefined
  var intersect: js.UndefOr[Boolean] = js.undefined
  var itemSort: js.UndefOr[js.Function2[/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem, Double]] = js.undefined
  var mode: js.UndefOr[InteractionMode] = js.undefined
  var multiKeyBackground: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var titleAlign: js.UndefOr[TextAlignment] = js.undefined
  var titleFontColor: js.UndefOr[ChartColor] = js.undefined
  var titleFontFamily: js.UndefOr[String] = js.undefined
  var titleFontSize: js.UndefOr[Double] = js.undefined
  var titleFontStyle: js.UndefOr[String] = js.undefined
  var titleMarginBottom: js.UndefOr[Double] = js.undefined
  var titleSpacing: js.UndefOr[Double] = js.undefined
  var xPadding: js.UndefOr[Double] = js.undefined
  var yPadding: js.UndefOr[Double] = js.undefined
}

object ChartTooltipOptions {
  @scala.inline
  def apply(
    backgroundColor: ChartColor = null,
    bodyAlign: TextAlignment = null,
    bodyFontColor: ChartColor = null,
    bodyFontFamily: String = null,
    bodyFontSize: Int | Double = null,
    bodyFontStyle: String = null,
    bodySpacing: Int | Double = null,
    borderColor: ChartColor = null,
    borderWidth: Int | Double = null,
    callbacks: ChartTooltipCallback = null,
    caretPadding: Int | Double = null,
    caretSize: Int | Double = null,
    cornerRadius: Int | Double = null,
    custom: /* a */ js.Any => Unit = null,
    displayColors: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    filter: (/* item */ ChartTooltipItem, /* data */ ChartData) => Boolean = null,
    footerAlign: TextAlignment = null,
    footerFontColor: ChartColor = null,
    footerFontFamily: String = null,
    footerFontSize: Int | Double = null,
    footerFontStyle: String = null,
    footerMarginTop: Int | Double = null,
    footerSpacing: Int | Double = null,
    intersect: js.UndefOr[Boolean] = js.undefined,
    itemSort: (/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem) => Double = null,
    mode: InteractionMode = null,
    multiKeyBackground: String = null,
    position: String = null,
    titleAlign: TextAlignment = null,
    titleFontColor: ChartColor = null,
    titleFontFamily: String = null,
    titleFontSize: Int | Double = null,
    titleFontStyle: String = null,
    titleMarginBottom: Int | Double = null,
    titleSpacing: Int | Double = null,
    xPadding: Int | Double = null,
    yPadding: Int | Double = null
  ): ChartTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bodyAlign != null) __obj.updateDynamic("bodyAlign")(bodyAlign)
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
    if (custom != null) __obj.updateDynamic("custom")(js.Any.fromFunction1(custom))
    if (!js.isUndefined(displayColors)) __obj.updateDynamic("displayColors")(displayColors)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (footerAlign != null) __obj.updateDynamic("footerAlign")(footerAlign)
    if (footerFontColor != null) __obj.updateDynamic("footerFontColor")(footerFontColor.asInstanceOf[js.Any])
    if (footerFontFamily != null) __obj.updateDynamic("footerFontFamily")(footerFontFamily)
    if (footerFontSize != null) __obj.updateDynamic("footerFontSize")(footerFontSize.asInstanceOf[js.Any])
    if (footerFontStyle != null) __obj.updateDynamic("footerFontStyle")(footerFontStyle)
    if (footerMarginTop != null) __obj.updateDynamic("footerMarginTop")(footerMarginTop.asInstanceOf[js.Any])
    if (footerSpacing != null) __obj.updateDynamic("footerSpacing")(footerSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(intersect)) __obj.updateDynamic("intersect")(intersect)
    if (itemSort != null) __obj.updateDynamic("itemSort")(js.Any.fromFunction2(itemSort))
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (multiKeyBackground != null) __obj.updateDynamic("multiKeyBackground")(multiKeyBackground)
    if (position != null) __obj.updateDynamic("position")(position)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
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

