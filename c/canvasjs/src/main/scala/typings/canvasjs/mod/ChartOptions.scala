package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartOptions extends js.Object {
  
  /**
    * Sets the duration of animation in milliseconds.
    * Default: 1200
    * Example: 1000, 500 etc.
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Enables Animation while rendering the Chart.
    * Default: true
    * Example: false, true
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * axisX object lets you set various parameters of X Axis like interval, grid lines, etc. It is mostly horizontal, except when we are working with Bar Charts, where axisX is vertical.
    */
  var axisX: js.UndefOr[ChartAxisXOptions | js.Array[ChartAxisXOptions]] = js.native
  
  /**
    * axisX2 is the secondary axis which renders on the opposite of primary axis (axisX).
    * It is mostly horizontal on top, except when we are working with Bar Charts, where axisX2 is vertical on right.
    */
  var axisX2: js.UndefOr[ChartAxisXOptions | js.Array[ChartAxisXOptions]] = js.native
  
  /**
    * axisY object lets you set various parameters of Y Axis like interval, grid lines, etc. It is mostly vertical, except when we are working with Bar Charts, where axisY is horizontal.
    */
  var axisY: js.UndefOr[ChartAxisYOptions | js.Array[ChartAxisYOptions]] = js.native
  
  /**
    * axisY2 is the secondary axis which renders on the opposite of primary axis (axisY). It is mostly vertical, except when we are working with Bar Charts, where axisY2 is horizontal.
    */
  var axisY2: js.UndefOr[ChartAxisYOptions | js.Array[ChartAxisYOptions]] = js.native
  
  /**
    * Sets the background color of entire Chart Area. Values can be "HTML Color Name", "hex code" or "rgba values"
    * Default: "white"
    * Example: "yellow", "#F5DEB3"..
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the colorSet of the Chart. Color Set is an array of colors that are used to render data. Various predefined Color Sets are bundled along with the library.
    * You can either choose from the pre-defined Color Sets or define your own Color Set.
    * Default: "colorset1" or as defined in the selected theme
    * Example: "colorSet1", "colorSet2", "colorSet3"
    */
  var colorSet: js.UndefOr[String] = js.native
  
  /**
    * CanvasJS allows you to localize various culture / language / country specific elements in the Chart like number formatting style – where you can choose
    * which character to use as a decimal separator and as a digit group separator (also referred to as a thousand separator).
    * By default CanvasJS is set to Neutral English Culture – "en".
    * Default: "en"
    */
  var culture: js.UndefOr[String] = js.native
  
  /**
    * data is an array of dataSeries Objects.
    */
  var data: js.Array[ChartDataSeriesOptions] = js.native
  
  /**
    * dataPointMaxWidth sets the maximum width of dataPoints in column / bar, ohlc and candlestick, charts.
    * This allows you to limit the width of dataPoints when there are very few of them in the chart.
    * At the same time, when the number of dataPoints increase, chart reduces their width so that they don’t overlap.
    * Default : Automatically calculated based on the chart size.
    * Example : 10, 20, 30, etc.
    */
  var dataPointMaxWidth: js.UndefOr[Double] = js.native
  
  /**
    * dataPointMinWidth sets the minimum width of dataPoints in column / bar, ohlc and candlestick, charts.
    * This allows you to set a minimum limit on the width of dataPoints so that they don’t become very thin when there are too many dataPoints.
    * At the same time, when the number of dataPoints decrease, chart increase their width automatically.
    * Default : 1.
    * Example : 2, 10, 25, etc.
    */
  var dataPointMinWidth: js.UndefOr[Double] = js.native
  
  /**
    * dataPointWidth sets the width of dataPoints in column / bar, ohlc and candlestick, charts.
    * This allows you to fix the width of dataPoints such that their width doesn’t change when the total number of dataPoints varies.
    * At the same time, when the number of dataPoints increase, it can lead to overlap if dataPointWidth is not set properly.
    * This allows you to set the width of dataPoints.
    * Default : Automatically calculated based on the chart size.
    * Example : 10, 20, 30, etc.
    */
  var dataPointWidth: js.UndefOr[Double] = js.native
  
  /**
    * Setting exportEnabled to true enables the export feature. As of now JPG & PNG formats are supported. Export feature is available in all Chart Types.
    * Default: false
    * Options: true, false
    */
  var exportEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * While exporting any chart, "Chart" is used as the default fine name with corresponding extension "jpg" or "png". You can override this name using exportFileName property.
    * Default: Chart
    */
  var exportFileName: js.UndefOr[String] = js.native
  
  /**
    * Sets the width of the Chart
    * Default: Takes chart container’s height by default. If the height is not set for the chart container, defaults to 400.
    * Example: 260, 300, 400
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Enables / Disables Chart interactivity like toolTip, mouse and touch events.
    * Default: true
    * Example: false, true
    */
  var interactivityEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whenever the chart contains multiple dataSeries, it is recommended to represent each dataSeries in a legend.
    * This way it becomes easier for the user to know what exactly is represented by each of the dataSeries.
    * In case of Pie and Doughnut charts, an entry is created for each dataPoint and in rest of the chart types entries are created for each dataSeries.
    * You can selectively show or hide a dataSeries in the Legend using showInLegend property of dataSeries.
    */
  var legend: js.UndefOr[ChartLegendOptions] = js.native
  
  /**
    * subtitles is a collection of subtitle elements. This allows you to have as many subtitles as you want in a chart.
    * subtitle allows you to set content, appearance and position of Chart’s subtitle. subtitle is very much like title except that its font size is lesser than title by default.
    */
  var subtitles: js.UndefOr[js.Array[ChartTitleOptions]] = js.native
  
  /**
    * Sets the theme of the Chart. Various predefined themes are bundled along with the library. User can easily switch these themes by changing theme property to the below mentioned options.
    * Default: "theme1"
    * Options: "theme1","theme2", "theme3"
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Title allows you to set content, appearance and position of Chart’s Title.
    */
  var title: ChartTitleOptions = js.native
  
  /**
    * toolTip object lets user set behaviour of toolTip at global level like enabling/disabling animation, setting Border Color, sharing toolTip between multiple dataSeries, etc.
    * You can also disable the toolTip by setting enabled property to false.
    */
  var toolTip: js.UndefOr[ChartToolTipOptions] = js.native
  
  /**
    * Sets the width of the Chart.
    * Default: Takes chart container’s width by default. If the width is not set for the chart container, defaults to 500.
    * Example: 380, 500, 720
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Setting zoomEnabled to true enables zooming and panning feature of Chart.
    * This way you can zoom into an area of interest when there is a large amount of data.
    * This will also allow you to pan through the chart.
    * If not set, the property is automatically enabled for large number of dataPoints. You can switch between zooming & panning using the toolbar that appears on the chart.
    * After Zooming in, you can reset the chart by clicking the reset button.
    * Default: false
    * Options: true, false
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.native
}
object ChartOptions {
  
  @scala.inline
  def apply(data: js.Array[ChartDataSeriesOptions], title: ChartTitleOptions): ChartOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
  
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataVarargs(value: ChartDataSeriesOptions*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ChartDataSeriesOptions]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ChartTitleOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    
    @scala.inline
    def setAxisXVarargs(value: ChartAxisXOptions*): Self = this.set("axisX", js.Array(value :_*))
    
    @scala.inline
    def setAxisX(value: ChartAxisXOptions | js.Array[ChartAxisXOptions]): Self = this.set("axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisX: Self = this.set("axisX", js.undefined)
    
    @scala.inline
    def setAxisX2Varargs(value: ChartAxisXOptions*): Self = this.set("axisX2", js.Array(value :_*))
    
    @scala.inline
    def setAxisX2(value: ChartAxisXOptions | js.Array[ChartAxisXOptions]): Self = this.set("axisX2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisX2: Self = this.set("axisX2", js.undefined)
    
    @scala.inline
    def setAxisYVarargs(value: ChartAxisYOptions*): Self = this.set("axisY", js.Array(value :_*))
    
    @scala.inline
    def setAxisY(value: ChartAxisYOptions | js.Array[ChartAxisYOptions]): Self = this.set("axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisY: Self = this.set("axisY", js.undefined)
    
    @scala.inline
    def setAxisY2Varargs(value: ChartAxisYOptions*): Self = this.set("axisY2", js.Array(value :_*))
    
    @scala.inline
    def setAxisY2(value: ChartAxisYOptions | js.Array[ChartAxisYOptions]): Self = this.set("axisY2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisY2: Self = this.set("axisY2", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColorSet(value: String): Self = this.set("colorSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSet: Self = this.set("colorSet", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setDataPointMaxWidth(value: Double): Self = this.set("dataPointMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPointMaxWidth: Self = this.set("dataPointMaxWidth", js.undefined)
    
    @scala.inline
    def setDataPointMinWidth(value: Double): Self = this.set("dataPointMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPointMinWidth: Self = this.set("dataPointMinWidth", js.undefined)
    
    @scala.inline
    def setDataPointWidth(value: Double): Self = this.set("dataPointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPointWidth: Self = this.set("dataPointWidth", js.undefined)
    
    @scala.inline
    def setExportEnabled(value: Boolean): Self = this.set("exportEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportEnabled: Self = this.set("exportEnabled", js.undefined)
    
    @scala.inline
    def setExportFileName(value: String): Self = this.set("exportFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportFileName: Self = this.set("exportFileName", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInteractivityEnabled(value: Boolean): Self = this.set("interactivityEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractivityEnabled: Self = this.set("interactivityEnabled", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegendOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setSubtitlesVarargs(value: ChartTitleOptions*): Self = this.set("subtitles", js.Array(value :_*))
    
    @scala.inline
    def setSubtitles(value: js.Array[ChartTitleOptions]): Self = this.set("subtitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitles: Self = this.set("subtitles", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setToolTip(value: ChartToolTipOptions): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoomEnabled(value: Boolean): Self = this.set("zoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomEnabled: Self = this.set("zoomEnabled", js.undefined)
  }
}
