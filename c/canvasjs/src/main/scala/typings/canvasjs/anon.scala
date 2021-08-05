package typings.canvasjs

import typings.canvasjs.canvasjsStrings.jpg
import typings.canvasjs.canvasjsStrings.png
import typings.canvasjs.mod.ChartAxisYOptions
import typings.canvasjs.mod.ChartDataPoint
import typings.canvasjs.mod.ChartDataSeriesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Axis extends StObject {
    
    var axis: ChartAxisYOptions
    
    var chart: typings.canvasjs.mod.Chart
    
    var stripline: this.type
  }
  object Axis {
    
    inline def apply(axis: ChartAxisYOptions, chart: typings.canvasjs.mod.Chart, stripline: Axis): Axis = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], stripline = stripline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Axis]
    }
    
    extension [Self <: Axis](x: Self) {
      
      inline def setAxis(value: ChartAxisYOptions): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setStripline(value: Axis): Self = StObject.set(x, "stripline", value.asInstanceOf[js.Any])
    }
  }
  
  trait Chart extends StObject {
    
    var chart: typings.canvasjs.mod.Chart
    
    var dataPoint: ChartDataPoint
    
    var dataSeries: ChartDataSeriesOptions
    
    var legend: this.type
  }
  object Chart {
    
    inline def apply(
      chart: typings.canvasjs.mod.Chart,
      dataPoint: ChartDataPoint,
      dataSeries: ChartDataSeriesOptions,
      legend: Chart
    ): Chart = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chart]
    }
    
    extension [Self <: Chart](x: Self) {
      
      inline def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setDataPoint(value: ChartDataPoint): Self = StObject.set(x, "dataPoint", value.asInstanceOf[js.Any])
      
      inline def setDataSeries(value: ChartDataSeriesOptions): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
      
      inline def setLegend(value: Chart): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataPoint extends StObject {
    
    var dataPoint: ChartDataPoint
    
    var dataSeries: ChartDataSeriesOptions
  }
  object DataPoint {
    
    inline def apply(dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): DataPoint = {
      val __obj = js.Dynamic.literal(dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPoint]
    }
    
    extension [Self <: DataPoint](x: Self) {
      
      inline def setDataPoint(value: ChartDataPoint): Self = StObject.set(x, "dataPoint", value.asInstanceOf[js.Any])
      
      inline def setDataSeries(value: ChartDataSeriesOptions): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataSeries extends StObject {
    
    var chart: typings.canvasjs.mod.Chart
    
    var dataPoint: ChartDataPoint
    
    var dataSeries: ChartDataSeriesOptions
    
    var index: js.UndefOr[Double] = js.undefined
    
    var pencent: js.UndefOr[Double] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object DataSeries {
    
    inline def apply(chart: typings.canvasjs.mod.Chart, dataPoint: ChartDataPoint, dataSeries: ChartDataSeriesOptions): DataSeries = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataPoint = dataPoint.asInstanceOf[js.Any], dataSeries = dataSeries.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSeries]
    }
    
    extension [Self <: DataSeries](x: Self) {
      
      inline def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setDataPoint(value: ChartDataPoint): Self = StObject.set(x, "dataPoint", value.asInstanceOf[js.Any])
      
      inline def setDataSeries(value: ChartDataSeriesOptions): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setPencent(value: Double): Self = StObject.set(x, "pencent", value.asInstanceOf[js.Any])
      
      inline def setPencentUndefined: Self = StObject.set(x, "pencent", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait Entries extends StObject {
    
    var chart: typings.canvasjs.mod.Chart
    
    var entries: js.Array[DataPoint]
    
    var toolTip: this.type
  }
  object Entries {
    
    inline def apply(chart: typings.canvasjs.mod.Chart, entries: js.Array[DataPoint], toolTip: Entries): Entries = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entries]
    }
    
    extension [Self <: Entries](x: Self) {
      
      inline def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: js.Array[DataPoint]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: DataPoint*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      inline def setToolTip(value: Entries): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileName extends StObject {
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var format: jpg | png
    
    var toDataURL: js.UndefOr[Boolean] = js.undefined
  }
  object FileName {
    
    inline def apply(format: jpg | png): FileName = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileName]
    }
    
    extension [Self <: FileName](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFormat(value: jpg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setToDataURL(value: Boolean): Self = StObject.set(x, "toDataURL", value.asInstanceOf[js.Any])
      
      inline def setToDataURLUndefined: Self = StObject.set(x, "toDataURL", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var axis: ChartAxisYOptions
    
    var chart: typings.canvasjs.mod.Chart
    
    var label: String
    
    var value: Double
  }
  object Label {
    
    inline def apply(axis: ChartAxisYOptions, chart: typings.canvasjs.mod.Chart, label: String, value: Double): Label = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setAxis(value: ChartAxisYOptions): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setChart(value: typings.canvasjs.mod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait X1 extends StObject {
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object X1 {
    
    inline def apply(x1: Double, x2: Double, y1: Double, y2: Double): X1 = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[X1]
    }
    
    extension [Self <: X1](x: Self) {
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
