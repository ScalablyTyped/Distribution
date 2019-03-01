package typings
package calDashHeatmapLib.calDashHeatmapMod.Global.CalHeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeOptions extends InitOptions {
  /** Margin around each domain, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("domainMargin")
  var domainMargin_RuntimeOptions: js.Array[scala.Double]
  /** List of dates to highlight */
  @JSName("highlight")
  var highlight_RuntimeOptions: js.Array[stdLib.Date]
  /**
  			 * Name of the items to represent in the calendar.
  			 * First index is singular form, and the second index, the plural form.
  			 */
  @JSName("itemName")
  var itemName_RuntimeOptions: js.Array[java.lang.String]
  /** Margin around the legend, in pixels. Ordered like in CSS (top, right, bottom, left) */
  @JSName("legendMargin")
  var legendMargin_RuntimeOptions: js.Array[scala.Double]
}

object RuntimeOptions {
  @scala.inline
  def apply(
    domainMargin: js.Array[scala.Double],
    highlight: js.Array[stdLib.Date],
    itemName: js.Array[java.lang.String],
    legendMargin: js.Array[scala.Double],
    afterLoad: js.Function0[scala.Unit] = null,
    afterLoadData: js.Function1[/* data */ js.Any, DataFormat] = null,
    afterLoadNextDomain: js.Function1[/* date */ stdLib.Date, scala.Unit] = null,
    afterLoadPreviousDomain: js.Function1[/* date */ stdLib.Date, scala.Unit] = null,
    animationDuration: scala.Int | scala.Double = null,
    cellPadding: scala.Int | scala.Double = null,
    cellRadius: scala.Int | scala.Double = null,
    cellSize: scala.Int | scala.Double = null,
    colLimit: scala.Int | scala.Double = null,
    considerMissingDataAsZero: js.UndefOr[scala.Boolean] = js.undefined,
    data: java.lang.String | js.Object = null,
    dataType: java.lang.String = null,
    displayLegend: js.UndefOr[scala.Boolean] = js.undefined,
    domain: java.lang.String = null,
    domainDynamicDimension: js.UndefOr[scala.Boolean] = js.undefined,
    domainGutter: scala.Int | scala.Double = null,
    domainLabelFormat: java.lang.String | js.Function = null,
    itemNamespace: java.lang.String = null,
    itemSelector: java.lang.String | stdLib.HTMLElement | stdLib.Element | stdLib.EventTarget = null,
    label: Label = null,
    legend: js.Array[scala.Double] = null,
    legendCellPadding: scala.Int | scala.Double = null,
    legendCellSize: scala.Int | scala.Double = null,
    legendColors: LegendColor | js.Array[java.lang.String] = null,
    legendHorizontalPosition: java.lang.String = null,
    legendOrientation: java.lang.String = null,
    legendTitleFormat: LegendTitleTemplates = null,
    legendVerticalPosition: java.lang.String = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    nextSelector: java.lang.String | stdLib.HTMLElement = null,
    onClick: js.Function2[/* date */ stdLib.Date, /* value */ scala.Double, scala.Unit] = null,
    onComplete: js.Function0[scala.Unit] = null,
    onMaxDomainReached: js.Function1[/* reached */ scala.Boolean, scala.Unit] = null,
    onMinDomainReached: js.Function1[/* reached */ scala.Boolean, scala.Unit] = null,
    previousSelector: java.lang.String | stdLib.HTMLElement = null,
    range: scala.Int | scala.Double = null,
    rowLimit: scala.Int | scala.Double = null,
    start: stdLib.Date = null,
    subDomain: java.lang.String = null,
    subDomainDateFormat: java.lang.String | js.Function = null,
    subDomainTextFormat: java.lang.String | js.Function = null,
    subDomainTitleFormat: SubDomainFormatTemplates = null,
    tooltip: js.UndefOr[scala.Boolean] = js.undefined,
    verticalOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    weekStartOnMonday: js.UndefOr[scala.Boolean] = js.undefined
  ): RuntimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domainMargin")(domainMargin)
    __obj.updateDynamic("highlight")(highlight)
    __obj.updateDynamic("itemName")(itemName)
    __obj.updateDynamic("legendMargin")(legendMargin)
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(afterLoad)
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(afterLoadData)
    if (afterLoadNextDomain != null) __obj.updateDynamic("afterLoadNextDomain")(afterLoadNextDomain)
    if (afterLoadPreviousDomain != null) __obj.updateDynamic("afterLoadPreviousDomain")(afterLoadPreviousDomain)
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
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onMaxDomainReached != null) __obj.updateDynamic("onMaxDomainReached")(onMaxDomainReached)
    if (onMinDomainReached != null) __obj.updateDynamic("onMinDomainReached")(onMinDomainReached)
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

