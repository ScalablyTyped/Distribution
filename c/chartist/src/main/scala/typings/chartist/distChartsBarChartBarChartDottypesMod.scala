package typings.chartist

import typings.chartist.anon.Bar
import typings.chartist.anon.PartialChartPadding
import typings.chartist.chartistStrings.`accumulate-relative`
import typings.chartist.chartistStrings.accumulate
import typings.chartist.chartistStrings.bar
import typings.chartist.chartistStrings.labelInterpolationFnc
import typings.chartist.chartistStrings.labelOffset
import typings.chartist.chartistStrings.offset
import typings.chartist.chartistStrings.position
import typings.chartist.chartistStrings.scaleMinSpace
import typings.chartist.chartistStrings.showGrid
import typings.chartist.chartistStrings.showLabel
import typings.chartist.distAxesMod.Axis
import typings.chartist.distChartsTypesMod.BaseChartEventsTypes
import typings.chartist.distCoreTypesMod.AllSeriesTypes
import typings.chartist.distCoreTypesMod.AxesDrawEvent
import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.ChartRect
import typings.chartist.distCoreTypesMod.CreatedEvent
import typings.chartist.distCoreTypesMod.Data
import typings.chartist.distCoreTypesMod.DrawEvent
import typings.chartist.distCoreTypesMod.Meta
import typings.chartist.distCoreTypesMod.NormalizedMulti
import typings.chartist.distCoreTypesMod.Options
import typings.chartist.distCoreTypesMod.Plugin
import typings.chartist.distSvgMod.Svg
import typings.chartist.distUtilsTypesMod.RequiredKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsBarChartBarChartDottypesMod {
  
  type BarChartCreatedEvent = CreatedEvent[BarChartOptions[AxisOptions, AxisOptions]]
  
  type BarChartData = Data[AllSeriesTypes]
  
  type BarChartEventsTypes = BaseChartEventsTypes[BarChartCreatedEvent, AxesDrawEvent | BarDrawEvent]
  
  trait BarChartOptions[TXAxisOptions, TYAxisOptions]
    extends StObject
       with Options[TXAxisOptions, TYAxisOptions] {
    
    /**
      * Override the class names that get used to generate the SVG structure of the chart
      */
    @JSName("classNames")
    var classNames_BarChartOptions: js.UndefOr[Bar] = js.undefined
    
    /**
      * If set to true then each bar will represent a series and the data array is expected to be a one dimensional array of data values rather than a series array of series. This is useful if the bar chart should represent a profile rather than some data over time.
      */
    var distributeSeries: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inverts the axes of the bar chart in order to draw a horizontal bar chart. Be aware that you also need to invert your axis settings as the Y Axis will now display the labels and the X Axis the values.
      */
    var horizontalBars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
      */
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the distance in pixel of bars in a group
      */
    var seriesBarDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * If the bar chart should add a background fill to the .ct-grids group.
      */
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true this property will cause the series bars to be stacked. Check the `stackMode` option for further stacking options.
      */
    var stackBars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true this property will force the stacked bars to draw from the zero line.
      * If set to 'accumulate' this property will form a total for each series point. This will also influence the y-axis and the overall bounds of the chart. In stacked mode the seriesBarDistance property will have no effect.
      * If set to 'accumulate-relative' positive and negative values will be handled separately.
      */
    var stackMode: js.UndefOr[accumulate | `accumulate-relative` | Boolean] = js.undefined
  }
  object BarChartOptions {
    
    inline def apply[TXAxisOptions, TYAxisOptions](): BarChartOptions[TXAxisOptions, TYAxisOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarChartOptions[TXAxisOptions, TYAxisOptions]]
    }
    
    extension [Self <: BarChartOptions[?, ?], TXAxisOptions, TYAxisOptions](x: Self & (BarChartOptions[TXAxisOptions, TYAxisOptions])) {
      
      inline def setClassNames(value: Bar): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDistributeSeries(value: Boolean): Self = StObject.set(x, "distributeSeries", value.asInstanceOf[js.Any])
      
      inline def setDistributeSeriesUndefined: Self = StObject.set(x, "distributeSeries", js.undefined)
      
      inline def setHorizontalBars(value: Boolean): Self = StObject.set(x, "horizontalBars", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBarsUndefined: Self = StObject.set(x, "horizontalBars", js.undefined)
      
      inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
      
      inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
      
      inline def setSeriesBarDistance(value: Double): Self = StObject.set(x, "seriesBarDistance", value.asInstanceOf[js.Any])
      
      inline def setSeriesBarDistanceUndefined: Self = StObject.set(x, "seriesBarDistance", js.undefined)
      
      inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
      
      inline def setStackBars(value: Boolean): Self = StObject.set(x, "stackBars", value.asInstanceOf[js.Any])
      
      inline def setStackBarsUndefined: Self = StObject.set(x, "stackBars", js.undefined)
      
      inline def setStackMode(value: accumulate | `accumulate-relative` | Boolean): Self = StObject.set(x, "stackMode", value.asInstanceOf[js.Any])
      
      inline def setStackModeUndefined: Self = StObject.set(x, "stackMode", js.undefined)
    }
  }
  
  /* Inlined chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/charts/BarChart/BarChart.types.BarChartOptions<chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc' | 'scaleMinSpace', never>, chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc' | 'scaleMinSpace', never>>, 'referenceValue' | 'chartPadding' | 'seriesBarDistance' | 'stackMode' | 'axisX' | 'axisY', 'classNames'> */
  trait BarChartOptionsWithDefaults extends StObject {
    
    /**
      * Options for X-Axis
      */
    var axisX: js.UndefOr[
        RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]
      ] = js.undefined
    
    /**
      * Options for Y-Axis
      */
    var axisY: js.UndefOr[
        RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]
      ] = js.undefined
    
    /**
      *  Padding of the chart drawing area to the container element and labels as a number or padding object.
      */
    var chartPadding: js.UndefOr[Double | PartialChartPadding] = js.undefined
    
    /**
      * Override the class names that get used to generate the SVG structure of the chart
      */
    var classNames: js.UndefOr[Bar] = js.undefined
    
    /**
      * If set to true then each bar will represent a series and the data array is expected to be a one dimensional array of data values rather than a series array of series. This is useful if the bar chart should represent a profile rather than some data over time.
      */
    var distributeSeries: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Overriding the natural high of the chart allows you to zoom in or limit the charts highest displayed value
      */
    var high: js.UndefOr[Double] = js.undefined
    
    /**
      * Inverts the axes of the bar chart in order to draw a horizontal bar chart. Be aware that you also need to invert your axis settings as the Y Axis will now display the labels and the X Axis the values.
      */
    var horizontalBars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overriding the natural low of the chart allows you to zoom in or limit the charts lowest displayed value
      */
    var low: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
    
    /**
      * Unless low/high are explicitly set, bar chart will be centered at zero by default. Set referenceValue to null to auto scale.
      */
    var referenceValue: js.UndefOr[Double] = js.undefined
    
    /**
      * If true the whole data is reversed including labels, the series order as well as the whole series data arrays.
      */
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the distance in pixel of bars in a group
      */
    var seriesBarDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * If the bar chart should add a background fill to the .ct-grids group.
      */
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true this property will cause the series bars to be stacked. Check the `stackMode` option for further stacking options.
      */
    var stackBars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true this property will force the stacked bars to draw from the zero line.
      * If set to 'accumulate' this property will form a total for each series point. This will also influence the y-axis and the overall bounds of the chart. In stacked mode the seriesBarDistance property will have no effect.
      * If set to 'accumulate-relative' positive and negative values will be handled separately.
      */
    var stackMode: js.UndefOr[accumulate | `accumulate-relative` | Boolean] = js.undefined
    
    /**
      * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object BarChartOptionsWithDefaults {
    
    inline def apply(): BarChartOptionsWithDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarChartOptionsWithDefaults]
    }
    
    extension [Self <: BarChartOptionsWithDefaults](x: Self) {
      
      inline def setAxisX(
        value: RequiredKeys[
              AxisOptions, 
              offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
              scala.Nothing
            ]
      ): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
      
      inline def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
      
      inline def setAxisY(
        value: RequiredKeys[
              AxisOptions, 
              offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
              scala.Nothing
            ]
      ): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
      
      inline def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
      
      inline def setChartPadding(value: Double | PartialChartPadding): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
      
      inline def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
      
      inline def setClassNames(value: Bar): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDistributeSeries(value: Boolean): Self = StObject.set(x, "distributeSeries", value.asInstanceOf[js.Any])
      
      inline def setDistributeSeriesUndefined: Self = StObject.set(x, "distributeSeries", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHorizontalBars(value: Boolean): Self = StObject.set(x, "horizontalBars", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBarsUndefined: Self = StObject.set(x, "horizontalBars", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin | (js.Tuple2[Plugin, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin | (js.Tuple2[Plugin, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
      
      inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
      
      inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
      
      inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
      
      inline def setSeriesBarDistance(value: Double): Self = StObject.set(x, "seriesBarDistance", value.asInstanceOf[js.Any])
      
      inline def setSeriesBarDistanceUndefined: Self = StObject.set(x, "seriesBarDistance", js.undefined)
      
      inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
      
      inline def setStackBars(value: Boolean): Self = StObject.set(x, "stackBars", value.asInstanceOf[js.Any])
      
      inline def setStackBarsUndefined: Self = StObject.set(x, "stackBars", js.undefined)
      
      inline def setStackMode(value: accumulate | `accumulate-relative` | Boolean): Self = StObject.set(x, "stackMode", value.asInstanceOf[js.Any])
      
      inline def setStackModeUndefined: Self = StObject.set(x, "stackMode", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait BarDrawEvent
    extends StObject
       with DrawEvent {
    
    @JSName("type")
    var type_BarDrawEvent: bar
    
    var value: Double | NormalizedMulti
    
    var x1: Double
    
    var x2: Double
    
    var y1: Double
    
    var y2: Double
  }
  object BarDrawEvent {
    
    inline def apply(
      axisX: Axis,
      axisY: Axis,
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      seriesIndex: Double,
      value: Double | NormalizedMulti,
      x1: Double,
      x2: Double,
      y1: Double,
      y2: Double
    ): BarDrawEvent = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bar")
      __obj.asInstanceOf[BarDrawEvent]
    }
    
    extension [Self <: BarDrawEvent](x: Self) {
      
      inline def setType(value: bar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | NormalizedMulti): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
