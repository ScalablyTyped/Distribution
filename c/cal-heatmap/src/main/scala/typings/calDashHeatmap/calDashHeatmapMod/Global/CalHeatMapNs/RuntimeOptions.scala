package typings.calDashHeatmap.calDashHeatmapMod.Global.CalHeatMapNs

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
    animationDuration: Int | Double = null,
    cellPadding: Int | Double = null,
    cellRadius: Int | Double = null,
    cellSize: Int | Double = null,
    colLimit: Int | Double = null,
    considerMissingDataAsZero: js.UndefOr[Boolean] = js.undefined,
    data: String | js.Object = null,
    dataType: String = null,
    displayLegend: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    domainDynamicDimension: js.UndefOr[Boolean] = js.undefined,
    domainGutter: Int | Double = null,
    domainLabelFormat: String | js.Function = null,
    itemNamespace: String = null,
    itemSelector: String | HTMLElement | Element | EventTarget = null,
    label: Label = null,
    legend: js.Array[Double] = null,
    legendCellPadding: Int | Double = null,
    legendCellSize: Int | Double = null,
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
    range: Int | Double = null,
    rowLimit: Int | Double = null,
    start: Date = null,
    subDomain: String = null,
    subDomainDateFormat: String | js.Function = null,
    subDomainTextFormat: String | js.Function = null,
    subDomainTitleFormat: SubDomainFormatTemplates = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    verticalOrientation: js.UndefOr[Boolean] = js.undefined,
    weekStartOnMonday: js.UndefOr[Boolean] = js.undefined
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal(domainMargin = domainMargin, highlight = highlight, itemName = itemName, legendMargin = legendMargin)
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(js.Any.fromFunction1(afterLoadData))
    if (afterLoadNextDomain != null) __obj.updateDynamic("afterLoadNextDomain")(js.Any.fromFunction1(afterLoadNextDomain))
    if (afterLoadPreviousDomain != null) __obj.updateDynamic("afterLoadPreviousDomain")(js.Any.fromFunction1(afterLoadPreviousDomain))
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellRadius != null) __obj.updateDynamic("cellRadius")(cellRadius.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (colLimit != null) __obj.updateDynamic("colLimit")(colLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(considerMissingDataAsZero)) __obj.updateDynamic("considerMissingDataAsZero")(considerMissingDataAsZero)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (!js.isUndefined(displayLegend)) __obj.updateDynamic("displayLegend")(displayLegend)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(domainDynamicDimension)) __obj.updateDynamic("domainDynamicDimension")(domainDynamicDimension)
    if (domainGutter != null) __obj.updateDynamic("domainGutter")(domainGutter.asInstanceOf[js.Any])
    if (domainLabelFormat != null) __obj.updateDynamic("domainLabelFormat")(domainLabelFormat.asInstanceOf[js.Any])
    if (itemNamespace != null) __obj.updateDynamic("itemNamespace")(itemNamespace)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendCellPadding != null) __obj.updateDynamic("legendCellPadding")(legendCellPadding.asInstanceOf[js.Any])
    if (legendCellSize != null) __obj.updateDynamic("legendCellSize")(legendCellSize.asInstanceOf[js.Any])
    if (legendColors != null) __obj.updateDynamic("legendColors")(legendColors.asInstanceOf[js.Any])
    if (legendHorizontalPosition != null) __obj.updateDynamic("legendHorizontalPosition")(legendHorizontalPosition)
    if (legendOrientation != null) __obj.updateDynamic("legendOrientation")(legendOrientation)
    if (legendTitleFormat != null) __obj.updateDynamic("legendTitleFormat")(legendTitleFormat)
    if (legendVerticalPosition != null) __obj.updateDynamic("legendVerticalPosition")(legendVerticalPosition)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (nextSelector != null) __obj.updateDynamic("nextSelector")(nextSelector.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onMaxDomainReached != null) __obj.updateDynamic("onMaxDomainReached")(js.Any.fromFunction1(onMaxDomainReached))
    if (onMinDomainReached != null) __obj.updateDynamic("onMinDomainReached")(js.Any.fromFunction1(onMinDomainReached))
    if (previousSelector != null) __obj.updateDynamic("previousSelector")(previousSelector.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rowLimit != null) __obj.updateDynamic("rowLimit")(rowLimit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain)
    if (subDomainDateFormat != null) __obj.updateDynamic("subDomainDateFormat")(subDomainDateFormat.asInstanceOf[js.Any])
    if (subDomainTextFormat != null) __obj.updateDynamic("subDomainTextFormat")(subDomainTextFormat.asInstanceOf[js.Any])
    if (subDomainTitleFormat != null) __obj.updateDynamic("subDomainTitleFormat")(subDomainTitleFormat)
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(verticalOrientation)) __obj.updateDynamic("verticalOrientation")(verticalOrientation)
    if (!js.isUndefined(weekStartOnMonday)) __obj.updateDynamic("weekStartOnMonday")(weekStartOnMonday)
    __obj.asInstanceOf[RuntimeOptions]
  }
}

