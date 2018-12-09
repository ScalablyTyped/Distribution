package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var chartRegistry: ChartRegistry = js.native
  var disableTransitions: scala.Boolean = js.native
  var errors: Errors = js.native
  var events: Events = js.native
  var logger: Logger = js.native
  var printers: Printers = js.native
  var round: Round = js.native
  var units: Units = js.native
  var utils: Utils = js.native
  // http://dc-js.github.io/dc.js/docs/html/core.js.html, Line 20
  var version: java.lang.String = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.barChart.html
  def barChart(parent: CompositeChart): BarChart = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.barChart.html
  def barChart(parent: CompositeChart, chartGroup: java.lang.String): BarChart = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.barChart.html
  def barChart(parent: java.lang.String): BarChart = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.barChart.html
  def barChart(parent: java.lang.String, chartGroup: java.lang.String): BarChart = js.native
  def boxPlot(parent: java.lang.String): BoxPlot = js.native
  def boxPlot(parent: java.lang.String, chartGroup: java.lang.String): BoxPlot = js.native
  def bubbleChart(parent: java.lang.String): BubbleChart = js.native
  def bubbleChart(parent: java.lang.String, chartGroup: java.lang.String): BubbleChart = js.native
  def bubbleOverlayChart(parent: java.lang.String): BubbleOverlayChart = js.native
  def bubbleOverlayChart(parent: java.lang.String, chartGroup: java.lang.String): BubbleOverlayChart = js.native
  def compositeChart(parent: java.lang.String): CompositeChart = js.native
  def compositeChart(parent: java.lang.String, chartGroup: java.lang.String): CompositeChart = js.native
  def dataCount(parent: java.lang.String): DataCountWidget = js.native
  def dataCount(parent: java.lang.String, chartGroup: java.lang.String): DataCountWidget = js.native
  def dataGrid(parent: java.lang.String): DataGridWidget = js.native
  def dataGrid(parent: java.lang.String, chartGroup: java.lang.String): DataGridWidget = js.native
  def dataTable(parent: java.lang.String): DataTableWidget = js.native
  def dataTable(parent: java.lang.String, chartGroup: java.lang.String): DataTableWidget = js.native
  def deregisterAllCharts(): scala.Unit = js.native
  def deregisterAllCharts(group: java.lang.String): scala.Unit = js.native
  def deregisterChart(chart: BaseMixin[_]): scala.Unit = js.native
  def deregisterChart(chart: BaseMixin[_], group: java.lang.String): scala.Unit = js.native
  def filterAll(): scala.Unit = js.native
  def filterAll(group: java.lang.String): scala.Unit = js.native
  def geoChoroplethChart(parent: java.lang.String): GeoChoroplethChart = js.native
  def geoChoroplethChart(parent: java.lang.String, chartGroup: java.lang.String): GeoChoroplethChart = js.native
  def hasChart(chart: BaseMixin[_]): scala.Boolean = js.native
  def heatMap(parent: java.lang.String): HeatMap = js.native
  def heatMap(parent: java.lang.String, chartGroup: java.lang.String): HeatMap = js.native
  def instanceOfChart(`object`: js.Any): scala.Boolean = js.native
  def legend(): Legend = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.lineChart.html
  def lineChart(parent: CompositeChart): LineChart = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.lineChart.html
  def lineChart(parent: CompositeChart, chartGroup: java.lang.String): LineChart = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.lineChart.html
  def lineChart(parent: java.lang.String): LineChart = js.native
  // http://dc-js.github.io/dc.js/docs/html/dc.lineChart.html
  def lineChart(parent: java.lang.String, chartGroup: java.lang.String): LineChart = js.native
  def numberDisplay(parent: java.lang.String): NumberDisplayWidget = js.native
  def numberDisplay(parent: java.lang.String, chartGroup: java.lang.String): NumberDisplayWidget = js.native
  def `override`(`object`: js.Any, fnName: java.lang.String, newFn: js.Function): scala.Unit = js.native
  def pieChart(parent: java.lang.String): PieChart = js.native
  def pieChart(parent: java.lang.String, chartGroup: java.lang.String): PieChart = js.native
  def pluck(n: java.lang.String): Accessor[_, _] = js.native
  def pluck(n: java.lang.String, f: Accessor[_, _]): Accessor[_, _] = js.native
  def redrawAll(): scala.Unit = js.native
  def redrawAll(group: java.lang.String): scala.Unit = js.native
  def refocusAll(): scala.Unit = js.native
  def refocusAll(group: java.lang.String): scala.Unit = js.native
  def registerChart(chart: BaseMixin[_]): scala.Unit = js.native
  def registerChart(chart: BaseMixin[_], group: java.lang.String): scala.Unit = js.native
  def renderAll(): scala.Unit = js.native
  def renderAll(group: java.lang.String): scala.Unit = js.native
  def rowChart(parent: java.lang.String): RowChart = js.native
  def rowChart(parent: java.lang.String, chartGroup: java.lang.String): RowChart = js.native
  def scatterPlot(parent: java.lang.String): ScatterPlot = js.native
  def scatterPlot(parent: java.lang.String, chartGroup: java.lang.String): ScatterPlot = js.native
  def selectMenu(parent: java.lang.String): SelectMenu = js.native
  def selectMenu(parent: java.lang.String, chartGroup: java.lang.String): SelectMenu = js.native
  def seriesChart(parent: java.lang.String): SeriesChart = js.native
  def seriesChart(parent: java.lang.String, chartGroup: java.lang.String): SeriesChart = js.native
  def transition(
    selections: d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, d3DashSelectionLib.d3DashSelectionMod.BaseType, _],
    duration: scala.Double,
    callback: js.Function1[
      /* s */ d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, d3DashSelectionLib.d3DashSelectionMod.BaseType, _], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

