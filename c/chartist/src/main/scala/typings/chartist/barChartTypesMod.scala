package typings.chartist

import typings.chartist.anon.Bar
import typings.chartist.anon.PartialChartPadding
import typings.chartist.axesMod.Axis
import typings.chartist.chartistStrings.accumulate
import typings.chartist.chartistStrings.bar
import typings.chartist.chartistStrings.labelInterpolationFnc
import typings.chartist.chartistStrings.labelOffset
import typings.chartist.chartistStrings.offset
import typings.chartist.chartistStrings.position
import typings.chartist.chartistStrings.scaleMinSpace
import typings.chartist.chartistStrings.showGrid
import typings.chartist.chartistStrings.showLabel
import typings.chartist.chartsTypesMod.BaseChartEventsTypes
import typings.chartist.coreTypesMod.AllSeriesTypes
import typings.chartist.coreTypesMod.AxesDrawEvent
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.ChartRect
import typings.chartist.coreTypesMod.CreatedEvent
import typings.chartist.coreTypesMod.Data
import typings.chartist.coreTypesMod.DrawEvent
import typings.chartist.coreTypesMod.Meta
import typings.chartist.coreTypesMod.NormalizedMulti
import typings.chartist.coreTypesMod.Options
import typings.chartist.coreTypesMod.Plugin
import typings.chartist.svgMod.Svg
import typings.chartist.utilsTypesMod.RequiredKeys
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartTypesMod {
  
  type BarChartCreatedEvent = CreatedEvent[BarChartOptions[AxisOptions, AxisOptions]]
  
  type BarChartData = Data[AllSeriesTypes]
  
  type BarChartEventsTypes = BaseChartEventsTypes[BarChartCreatedEvent, AxesDrawEvent | BarDrawEvent]
  
  trait BarChartOptions[TXAxisOptions, TYAxisOptions]
    extends StObject
       with Options[TXAxisOptions, TYAxisOptions] {
    
    @JSName("classNames")
    var classNames_BarChartOptions: js.UndefOr[Bar] = js.undefined
    
    var distributeSeries: js.UndefOr[Boolean] = js.undefined
    
    var horizontalBars: js.UndefOr[Boolean] = js.undefined
    
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    var seriesBarDistance: js.UndefOr[Double] = js.undefined
    
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    var stackBars: js.UndefOr[Boolean] = js.undefined
    
    var stackMode: js.UndefOr[accumulate | Boolean] = js.undefined
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
      
      inline def setStackMode(value: accumulate | Boolean): Self = StObject.set(x, "stackMode", value.asInstanceOf[js.Any])
      
      inline def setStackModeUndefined: Self = StObject.set(x, "stackMode", js.undefined)
    }
  }
  
  /* Inlined chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/charts/BarChart/BarChart.types.BarChartOptions<chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc' | 'scaleMinSpace', never>, chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc' | 'scaleMinSpace', never>>, 'referenceValue' | 'chartPadding' | 'seriesBarDistance' | 'stackMode' | 'axisX' | 'axisY', 'classNames'> */
  trait BarChartOptionsWithDefaults extends StObject {
    
    var axisX: (js.UndefOr[
        RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]
      ]) & (RequiredKeys[
        AxisOptions, 
        offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
        scala.Nothing
      ])
    
    var axisY: (js.UndefOr[
        RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]
      ]) & (RequiredKeys[
        AxisOptions, 
        offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
        scala.Nothing
      ])
    
    var chartPadding: (js.UndefOr[Double | PartialChartPadding]) & (Double | PartialChartPadding)
    
    var classNames: js.UndefOr[Bar] & Bar & Required[js.UndefOr[Bar]]
    
    var distributeSeries: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    var horizontalBars: js.UndefOr[Boolean] = js.undefined
    
    var low: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
    
    var referenceValue: js.UndefOr[Double] & Double
    
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    var seriesBarDistance: js.UndefOr[Double] & Double
    
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    var stackBars: js.UndefOr[Boolean] = js.undefined
    
    var stackMode: (js.UndefOr[accumulate | Boolean]) & (accumulate | Boolean)
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object BarChartOptionsWithDefaults {
    
    inline def apply(
      axisX: (js.UndefOr[
          RequiredKeys[
            AxisOptions, 
            offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
            scala.Nothing
          ]
        ]) & (RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]),
      axisY: (js.UndefOr[
          RequiredKeys[
            AxisOptions, 
            offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
            scala.Nothing
          ]
        ]) & (RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
          scala.Nothing
        ]),
      chartPadding: (js.UndefOr[Double | PartialChartPadding]) & (Double | PartialChartPadding),
      classNames: js.UndefOr[Bar] & Bar & Required[js.UndefOr[Bar]],
      referenceValue: js.UndefOr[Double] & Double,
      seriesBarDistance: js.UndefOr[Double] & Double,
      stackMode: (js.UndefOr[accumulate | Boolean]) & (accumulate | Boolean)
    ): BarChartOptionsWithDefaults = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartPadding = chartPadding.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], referenceValue = referenceValue.asInstanceOf[js.Any], seriesBarDistance = seriesBarDistance.asInstanceOf[js.Any], stackMode = stackMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarChartOptionsWithDefaults]
    }
    
    extension [Self <: BarChartOptionsWithDefaults](x: Self) {
      
      inline def setAxisX(
        value: (js.UndefOr[
              RequiredKeys[
                AxisOptions, 
                offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
                scala.Nothing
              ]
            ]) & (RequiredKeys[
              AxisOptions, 
              offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
              scala.Nothing
            ])
      ): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
      
      inline def setAxisY(
        value: (js.UndefOr[
              RequiredKeys[
                AxisOptions, 
                offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
                scala.Nothing
              ]
            ]) & (RequiredKeys[
              AxisOptions, 
              offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc | scaleMinSpace, 
              scala.Nothing
            ])
      ): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
      
      inline def setChartPadding(value: (js.UndefOr[Double | PartialChartPadding]) & (Double | PartialChartPadding)): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
      
      inline def setClassNames(value: js.UndefOr[Bar] & Bar & Required[js.UndefOr[Bar]]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
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
      
      inline def setReferenceValue(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
      
      inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
      
      inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
      
      inline def setSeriesBarDistance(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "seriesBarDistance", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
      
      inline def setStackBars(value: Boolean): Self = StObject.set(x, "stackBars", value.asInstanceOf[js.Any])
      
      inline def setStackBarsUndefined: Self = StObject.set(x, "stackBars", js.undefined)
      
      inline def setStackMode(value: (js.UndefOr[accumulate | Boolean]) & (accumulate | Boolean)): Self = StObject.set(x, "stackMode", value.asInstanceOf[js.Any])
      
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
