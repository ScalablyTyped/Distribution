package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  /**
    * Sets the duration of animation in milliseconds.
    * Default: 1200
    * Example: 1000, 500 etc.
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables Animation while rendering the Chart.
    * Default: true
    * Example: false, true
    */
  var animationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * axisX object lets you set various parameters of X Axis like interval, grid lines, etc. It is mostly horizontal, except when we are working with Bar Charts, where axisX is vertical.
    */
  var axisX: js.UndefOr[ChartAxisXOptions | js.Array[ChartAxisXOptions]] = js.undefined
  /**
    * axisX2 is the secondary axis which renders on the opposite of primary axis (axisX).
    * It is mostly horizontal on top, except when we are working with Bar Charts, where axisX2 is vertical on right.
    */
  var axisX2: js.UndefOr[ChartAxisXOptions | js.Array[ChartAxisXOptions]] = js.undefined
  /**
    * axisY object lets you set various parameters of Y Axis like interval, grid lines, etc. It is mostly vertical, except when we are working with Bar Charts, where axisY is horizontal.
    */
  var axisY: js.UndefOr[ChartAxisYOptions | js.Array[ChartAxisYOptions]] = js.undefined
  /**
    * axisY2 is the secondary axis which renders on the opposite of primary axis (axisY). It is mostly vertical, except when we are working with Bar Charts, where axisY2 is horizontal.
    */
  var axisY2: js.UndefOr[ChartAxisYOptions | js.Array[ChartAxisYOptions]] = js.undefined
  /**
    * Sets the background color of entire Chart Area. Values can be "HTML Color Name", "hex code" or "rgba values"
    * Default: "white"
    * Example: "yellow", "#F5DEB3"..
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the colorSet of the Chart. Color Set is an array of colors that are used to render data. Various predefined Color Sets are bundled along with the library.
    * You can either choose from the pre-defined Color Sets or define your own Color Set.
    * Default: "colorset1" or as defined in the selected theme
    * Example: "colorSet1", "colorSet2", "colorSet3"
    */
  var colorSet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CanvasJS allows you to localize various culture / language / country specific elements in the Chart like number formatting style – where you can choose
    * which character to use as a decimal separator and as a digit group separator (also referred to as a thousand separator).
    * By default CanvasJS is set to Neutral English Culture – "en".
    * Default: "en"
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * data is an array of dataSeries Objects.
    */
  var data: js.Array[ChartDataSeriesOptions]
  /**
    * dataPointMaxWidth sets the maximum width of dataPoints in column / bar, ohlc and candlestick, charts.
    * This allows you to limit the width of dataPoints when there are very few of them in the chart.
    * At the same time, when the number of dataPoints increase, chart reduces their width so that they don’t overlap.
    * Default : Automatically calculated based on the chart size.
    * Example : 10, 20, 30, etc.
    */
  var dataPointMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Setting exportEnabled to true enables the export feature. As of now JPG & PNG formats are supported. Export feature is available in all Chart Types.
    * Default: false
    * Options: true, false
    */
  var exportEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * While exporting any chart, "Chart" is used as the default fine name with corresponding extension "jpg" or "png". You can override this name using exportFileName property.
    * Default: Chart
    */
  var exportFileName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the width of the Chart
    * Default: Takes chart container’s height by default. If the height is not set for the chart container, defaults to 400.
    * Example: 260, 300, 400
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables / Disables Chart interactivity like toolTip, mouse and touch events.
    * Default: true
    * Example: false, true
    */
  var interactivityEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whenever the chart contains multiple dataSeries, it is recommended to represent each dataSeries in a legend.
    * This way it becomes easier for the user to know what exactly is represented by each of the dataSeries.
    * In case of Pie and Doughnut charts, an entry is created for each dataPoint and in rest of the chart types entries are created for each dataSeries.
    * You can selectively show or hide a dataSeries in the Legend using showInLegend property of dataSeries.
    */
  var legend: js.UndefOr[ChartLegendOptions] = js.undefined
  /**
    * subtitles is a collection of subtitle elements. This allows you to have as many subtitles as you want in a chart.
    * subtitle allows you to set content, appearance and position of Chart’s subtitle. subtitle is very much like title except that its font size is lesser than title by default.
    */
  var subtitles: js.UndefOr[js.Array[ChartTitleOptions]] = js.undefined
  /**
    * Sets the theme of the Chart. Various predefined themes are bundled along with the library. User can easily switch these themes by changing theme property to the below mentioned options.
    * Default: "theme1"
    * Options: "theme1","theme2", "theme3"
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title allows you to set content, appearance and position of Chart’s Title.
    */
  var title: ChartTitleOptions
  /**
    * toolTip object lets user set behaviour of toolTip at global level like enabling/disabling animation, setting Border Color, sharing toolTip between multiple dataSeries, etc.
    * You can also disable the toolTip by setting enabled property to false.
    */
  var toolTip: js.UndefOr[ChartToolTipOptions] = js.undefined
  /**
    * Sets the width of the Chart.
    * Default: Takes chart container’s width by default. If the width is not set for the chart container, defaults to 500.
    * Example: 380, 500, 720
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Setting zoomEnabled to true enables zooming and panning feature of Chart.
    * This way you can zoom into an area of interest when there is a large amount of data.
    * This will also allow you to pan through the chart.
    * If not set, the property is automatically enabled for large number of dataPoints. You can switch between zooming & panning using the toolbar that appears on the chart.
    * After Zooming in, you can reset the chart by clicking the reset button.
    * Default: false
    * Options: true, false
    */
  var zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    data: js.Array[ChartDataSeriesOptions],
    title: ChartTitleOptions,
    animationDuration: scala.Int | scala.Double = null,
    animationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    axisX: ChartAxisXOptions | js.Array[ChartAxisXOptions] = null,
    axisX2: ChartAxisXOptions | js.Array[ChartAxisXOptions] = null,
    axisY: ChartAxisYOptions | js.Array[ChartAxisYOptions] = null,
    axisY2: ChartAxisYOptions | js.Array[ChartAxisYOptions] = null,
    backgroundColor: java.lang.String = null,
    colorSet: java.lang.String = null,
    culture: java.lang.String = null,
    dataPointMaxWidth: scala.Int | scala.Double = null,
    exportEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    exportFileName: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    interactivityEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    legend: ChartLegendOptions = null,
    subtitles: js.Array[ChartTitleOptions] = null,
    theme: java.lang.String = null,
    toolTip: ChartToolTipOptions = null,
    width: scala.Int | scala.Double = null,
    zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("title")(title)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEnabled)) __obj.updateDynamic("animationEnabled")(animationEnabled)
    if (axisX != null) __obj.updateDynamic("axisX")(axisX.asInstanceOf[js.Any])
    if (axisX2 != null) __obj.updateDynamic("axisX2")(axisX2.asInstanceOf[js.Any])
    if (axisY != null) __obj.updateDynamic("axisY")(axisY.asInstanceOf[js.Any])
    if (axisY2 != null) __obj.updateDynamic("axisY2")(axisY2.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (colorSet != null) __obj.updateDynamic("colorSet")(colorSet)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (dataPointMaxWidth != null) __obj.updateDynamic("dataPointMaxWidth")(dataPointMaxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(exportEnabled)) __obj.updateDynamic("exportEnabled")(exportEnabled)
    if (exportFileName != null) __obj.updateDynamic("exportFileName")(exportFileName)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(interactivityEnabled)) __obj.updateDynamic("interactivityEnabled")(interactivityEnabled)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled)
    __obj.asInstanceOf[ChartOptions]
  }
}

