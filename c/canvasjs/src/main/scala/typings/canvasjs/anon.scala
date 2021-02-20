package typings.canvasjs

import typings.canvasjs.canvasjsStrings.jpg
import typings.canvasjs.canvasjsStrings.png
import typings.canvasjs.mod.ChartAxisYOptions
import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Axis extends StObject {
    
    var axis: ChartAxisYOptions = js.native
    
    var chart: typings.canvasjs.mod.Chart = js.native
    
    var stripline: this.type = js.native
  }
  object Axis {
    
    @scala.inline
    def apply(axis: ChartAxisYOptions, chart: typings.canvasjs.mod.Chart, stripline: Axis): Axis = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Axis]
    }
    
    @scala.inline
    implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: ChartAxisYOptions): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripline(value: Axis): Self = StObject.set(x, "stripline", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Chart extends StObject {
    
    var chart: typings.canvasjs.mod.Chart = js.native
    
    var dataPoint: ChartDataPoint = js.native
    
    var dataSeries: ChartDataSeriesOptions = js.native
    
    var legend: this.type = js.native
  }
  object Chart {
    
    @scala.inline
    def apply(
      chart: typings.canvasjs.mod.Chart,
      dataPoint: ChartDataPoint,
      dataSeries: ChartDataSeriesOptions,
      legend: Chart
    ): Chart = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chart]
    }
    
    @scala.inline
    implicit class ChartMutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPoint(value: ChartDataPoint): Self = StObject.set(x, "dataPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSeries(value: ChartDataSeriesOptions): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegend(value: Chart): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataPoint extends StObject {
    
    var dataPoint: ChartDataPoint = js.native
    
    var dataSeries: ChartDataSeriesOptions = js.native
  }
  object DataPoint {
    
    @scala.inline
    def apply(dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): DataPoint = {
      val __obj = js.Dynamic.literal(dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPoint]
    }
    
    @scala.inline
    implicit class DataPointMutableBuilder[Self <: DataPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataPoint(value: ChartDataPoint): Self = StObject.set(x, "dataPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSeries(value: ChartDataSeriesOptions): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataSeries extends StObject {
    
    var chart: typings.canvasjs.mod.Chart = js.native
    
    var dataPoint: ChartDataPoint = js.native
    
    var dataSeries: ChartDataSeriesOptions = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var pencent: js.UndefOr[Double] = js.native
    
    var total: js.UndefOr[Double] = js.native
  }
  object DataSeries {
    
    @scala.inline
    def apply(chart: typings.canvasjs.mod.Chart, dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): DataSeries = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSeries]
    }
    
    @scala.inline
    implicit class DataSeriesMutableBuilder[Self <: DataSeries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPoint(value: ChartDataPoint): Self = StObject.set(x, "dataPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSeries(value: ChartDataSeriesOptions): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setPencent(value: Double): Self = StObject.set(x, "pencent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPencentUndefined: Self = StObject.set(x, "pencent", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  @js.native
  trait Entries extends StObject {
    
    var chart: typings.canvasjs.mod.Chart = js.native
    
    var entries: js.Array[DataPoint] = js.native
    
    var toolTip: this.type = js.native
  }
  object Entries {
    
    @scala.inline
    def apply(chart: typings.canvasjs.mod.Chart, entries: js.Array[DataPoint], toolTip: Entries): Entries = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries]
    }
    
    @scala.inline
    implicit class EntriesMutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntries(value: js.Array[DataPoint]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: DataPoint*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setToolTip(value: Entries): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileName extends StObject {
    
    var fileName: js.UndefOr[String] = js.native
    
    var format: jpg | png = js.native
    
    var toDataURL: js.UndefOr[Boolean] = js.native
  }
  object FileName {
    
    @scala.inline
    def apply(format: jpg | png): FileName = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileName]
    }
    
    @scala.inline
    implicit class FileNameMutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFormat(value: jpg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDataURL(value: Boolean): Self = StObject.set(x, "toDataURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDataURLUndefined: Self = StObject.set(x, "toDataURL", js.undefined)
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var axis: ChartAxisYOptions = js.native
    
    var chart: typings.canvasjs.mod.Chart = js.native
    
    var label: String = js.native
    
    var value: Double = js.native
  }
  object Label {
    
    @scala.inline
    def apply(axis: ChartAxisYOptions, chart: typings.canvasjs.mod.Chart, label: String, value: Double): Label = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: ChartAxisYOptions): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X1 extends StObject {
    
    var x1: Double = js.native
    
    var x2: Double = js.native
    
    var y1: Double = js.native
    
    var y2: Double = js.native
  }
  object X1 {
    
    @scala.inline
    def apply(x1: Double, x2: Double, y1: Double, y2: Double): X1 = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[X1]
    }
    
    @scala.inline
    implicit class X1MutableBuilder[Self <: X1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
