package typings.chartJs.mod

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
  var custom: js.UndefOr[js.Function1[/* tooltipModel */ ChartTooltipModel, Unit]] = js.undefined
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
  var itemSort: js.UndefOr[
    js.Function3[
      /* itemA */ ChartTooltipItem, 
      /* itemB */ ChartTooltipItem, 
      /* data */ js.UndefOr[ChartData], 
      Double
    ]
  ] = js.undefined
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
    bodyFontSize: js.UndefOr[Double] = js.undefined,
    bodyFontStyle: String = null,
    bodySpacing: js.UndefOr[Double] = js.undefined,
    borderColor: ChartColor = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    callbacks: ChartTooltipCallback = null,
    caretPadding: js.UndefOr[Double] = js.undefined,
    caretSize: js.UndefOr[Double] = js.undefined,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    custom: /* tooltipModel */ ChartTooltipModel => Unit = null,
    displayColors: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    filter: (/* item */ ChartTooltipItem, /* data */ ChartData) => Boolean = null,
    footerAlign: TextAlignment = null,
    footerFontColor: ChartColor = null,
    footerFontFamily: String = null,
    footerFontSize: js.UndefOr[Double] = js.undefined,
    footerFontStyle: String = null,
    footerMarginTop: js.UndefOr[Double] = js.undefined,
    footerSpacing: js.UndefOr[Double] = js.undefined,
    intersect: js.UndefOr[Boolean] = js.undefined,
    itemSort: (/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem, /* data */ js.UndefOr[ChartData]) => Double = null,
    mode: InteractionMode = null,
    multiKeyBackground: String = null,
    position: String = null,
    titleAlign: TextAlignment = null,
    titleFontColor: ChartColor = null,
    titleFontFamily: String = null,
    titleFontSize: js.UndefOr[Double] = js.undefined,
    titleFontStyle: String = null,
    titleMarginBottom: js.UndefOr[Double] = js.undefined,
    titleSpacing: js.UndefOr[Double] = js.undefined,
    xPadding: js.UndefOr[Double] = js.undefined,
    yPadding: js.UndefOr[Double] = js.undefined
  ): ChartTooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bodyAlign != null) __obj.updateDynamic("bodyAlign")(bodyAlign.asInstanceOf[js.Any])
    if (bodyFontColor != null) __obj.updateDynamic("bodyFontColor")(bodyFontColor.asInstanceOf[js.Any])
    if (bodyFontFamily != null) __obj.updateDynamic("bodyFontFamily")(bodyFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyFontSize)) __obj.updateDynamic("bodyFontSize")(bodyFontSize.get.asInstanceOf[js.Any])
    if (bodyFontStyle != null) __obj.updateDynamic("bodyFontStyle")(bodyFontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bodySpacing)) __obj.updateDynamic("bodySpacing")(bodySpacing.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(caretPadding)) __obj.updateDynamic("caretPadding")(caretPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caretSize)) __obj.updateDynamic("caretSize")(caretSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(js.Any.fromFunction1(custom))
    if (!js.isUndefined(displayColors)) __obj.updateDynamic("displayColors")(displayColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (footerAlign != null) __obj.updateDynamic("footerAlign")(footerAlign.asInstanceOf[js.Any])
    if (footerFontColor != null) __obj.updateDynamic("footerFontColor")(footerFontColor.asInstanceOf[js.Any])
    if (footerFontFamily != null) __obj.updateDynamic("footerFontFamily")(footerFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(footerFontSize)) __obj.updateDynamic("footerFontSize")(footerFontSize.get.asInstanceOf[js.Any])
    if (footerFontStyle != null) __obj.updateDynamic("footerFontStyle")(footerFontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(footerMarginTop)) __obj.updateDynamic("footerMarginTop")(footerMarginTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(footerSpacing)) __obj.updateDynamic("footerSpacing")(footerSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intersect)) __obj.updateDynamic("intersect")(intersect.get.asInstanceOf[js.Any])
    if (itemSort != null) __obj.updateDynamic("itemSort")(js.Any.fromFunction3(itemSort))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (multiKeyBackground != null) __obj.updateDynamic("multiKeyBackground")(multiKeyBackground.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign.asInstanceOf[js.Any])
    if (titleFontColor != null) __obj.updateDynamic("titleFontColor")(titleFontColor.asInstanceOf[js.Any])
    if (titleFontFamily != null) __obj.updateDynamic("titleFontFamily")(titleFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(titleFontSize)) __obj.updateDynamic("titleFontSize")(titleFontSize.get.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(titleMarginBottom)) __obj.updateDynamic("titleMarginBottom")(titleMarginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleSpacing)) __obj.updateDynamic("titleSpacing")(titleSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xPadding)) __obj.updateDynamic("xPadding")(xPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yPadding)) __obj.updateDynamic("yPadding")(yPadding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipOptions]
  }
}

