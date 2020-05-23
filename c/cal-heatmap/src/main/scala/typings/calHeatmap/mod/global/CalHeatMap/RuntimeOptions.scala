package typings.calHeatmap.mod.global.CalHeatMap

import typings.std.Date
import typings.std.Element
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeOptions extends InitOptions {
  /** Margin around each domain, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("domainMargin")
  var domainMargin_RuntimeOptions: js.Array[Double]
  /** List of dates to highlight */
  @JSName("highlight")
  var highlight_RuntimeOptions: js.Array[Date]
  /**
    * Name of the items to represent in the calendar.
    * First index is singular form, and the second index, the plural form.
    */
  @JSName("itemName")
  var itemName_RuntimeOptions: js.Array[String]
  /** Margin around the legend, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("legendMargin")
  var legendMargin_RuntimeOptions: js.Array[Double]
}

object RuntimeOptions {
  @scala.inline
  def apply(
    domainMargin: js.Array[Double],
    highlight: js.Array[Date],
    itemName: js.Array[String],
    legendMargin: js.Array[Double],
    afterLoad: () => Unit = null,
    afterLoadData: /* data */ js.Any => DataFormat = null,
    afterLoadNextDomain: /* date */ Date => Unit = null,
    afterLoadPreviousDomain: /* date */ Date => Unit = null,
    animationDuration: js.UndefOr[Double] = js.undefined,
    cellPadding: js.UndefOr[Double] = js.undefined,
    cellRadius: js.UndefOr[Double] = js.undefined,
    cellSize: js.UndefOr[Double] = js.undefined,
    colLimit: js.UndefOr[Double] = js.undefined,
    considerMissingDataAsZero: js.UndefOr[Boolean] = js.undefined,
    data: String | js.Object = null,
    dataType: String = null,
    displayLegend: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    domainDynamicDimension: js.UndefOr[Boolean] = js.undefined,
    domainGutter: js.UndefOr[Double] = js.undefined,
    domainLabelFormat: String | js.Function = null,
    itemNamespace: String = null,
    itemSelector: String | HTMLElement | Element | EventTarget = null,
    label: Label = null,
    legend: js.Array[Double] = null,
    legendCellPadding: js.UndefOr[Double] = js.undefined,
    legendCellSize: js.UndefOr[Double] = js.undefined,
    legendColors: LegendColor | js.Array[String] = null,
    legendHorizontalPosition: String = null,
    legendOrientation: String = null,
    legendTitleFormat: LegendTitleTemplates = null,
    legendVerticalPosition: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    nextSelector: String | HTMLElement = null,
    onClick: (/* date */ Date, /* value */ Double) => Unit = null,
    onComplete: () => Unit = null,
    onMaxDomainReached: /* reached */ Boolean => Unit = null,
    onMinDomainReached: /* reached */ Boolean => Unit = null,
    previousSelector: String | HTMLElement = null,
    range: js.UndefOr[Double] = js.undefined,
    rowLimit: js.UndefOr[Double] = js.undefined,
    start: Date = null,
    subDomain: String = null,
    subDomainDateFormat: String | js.Function = null,
    subDomainTextFormat: String | js.Function = null,
    subDomainTitleFormat: SubDomainFormatTemplates = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    verticalOrientation: js.UndefOr[Boolean] = js.undefined,
    weekStartOnMonday: js.UndefOr[Boolean] = js.undefined
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal(domainMargin = domainMargin.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], legendMargin = legendMargin.asInstanceOf[js.Any])
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(js.Any.fromFunction1(afterLoadData))
    if (afterLoadNextDomain != null) __obj.updateDynamic("afterLoadNextDomain")(js.Any.fromFunction1(afterLoadNextDomain))
    if (afterLoadPreviousDomain != null) __obj.updateDynamic("afterLoadPreviousDomain")(js.Any.fromFunction1(afterLoadPreviousDomain))
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellPadding)) __obj.updateDynamic("cellPadding")(cellPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellRadius)) __obj.updateDynamic("cellRadius")(cellRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellSize)) __obj.updateDynamic("cellSize")(cellSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colLimit)) __obj.updateDynamic("colLimit")(colLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(considerMissingDataAsZero)) __obj.updateDynamic("considerMissingDataAsZero")(considerMissingDataAsZero.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLegend)) __obj.updateDynamic("displayLegend")(displayLegend.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(domainDynamicDimension)) __obj.updateDynamic("domainDynamicDimension")(domainDynamicDimension.get.asInstanceOf[js.Any])
    if (!js.isUndefined(domainGutter)) __obj.updateDynamic("domainGutter")(domainGutter.get.asInstanceOf[js.Any])
    if (domainLabelFormat != null) __obj.updateDynamic("domainLabelFormat")(domainLabelFormat.asInstanceOf[js.Any])
    if (itemNamespace != null) __obj.updateDynamic("itemNamespace")(itemNamespace.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (!js.isUndefined(legendCellPadding)) __obj.updateDynamic("legendCellPadding")(legendCellPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(legendCellSize)) __obj.updateDynamic("legendCellSize")(legendCellSize.get.asInstanceOf[js.Any])
    if (legendColors != null) __obj.updateDynamic("legendColors")(legendColors.asInstanceOf[js.Any])
    if (legendHorizontalPosition != null) __obj.updateDynamic("legendHorizontalPosition")(legendHorizontalPosition.asInstanceOf[js.Any])
    if (legendOrientation != null) __obj.updateDynamic("legendOrientation")(legendOrientation.asInstanceOf[js.Any])
    if (legendTitleFormat != null) __obj.updateDynamic("legendTitleFormat")(legendTitleFormat.asInstanceOf[js.Any])
    if (legendVerticalPosition != null) __obj.updateDynamic("legendVerticalPosition")(legendVerticalPosition.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (nextSelector != null) __obj.updateDynamic("nextSelector")(nextSelector.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onMaxDomainReached != null) __obj.updateDynamic("onMaxDomainReached")(js.Any.fromFunction1(onMaxDomainReached))
    if (onMinDomainReached != null) __obj.updateDynamic("onMinDomainReached")(js.Any.fromFunction1(onMinDomainReached))
    if (previousSelector != null) __obj.updateDynamic("previousSelector")(previousSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowLimit)) __obj.updateDynamic("rowLimit")(rowLimit.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain.asInstanceOf[js.Any])
    if (subDomainDateFormat != null) __obj.updateDynamic("subDomainDateFormat")(subDomainDateFormat.asInstanceOf[js.Any])
    if (subDomainTextFormat != null) __obj.updateDynamic("subDomainTextFormat")(subDomainTextFormat.asInstanceOf[js.Any])
    if (subDomainTitleFormat != null) __obj.updateDynamic("subDomainTitleFormat")(subDomainTitleFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOrientation)) __obj.updateDynamic("verticalOrientation")(verticalOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStartOnMonday)) __obj.updateDynamic("weekStartOnMonday")(weekStartOnMonday.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeOptions]
  }
}

