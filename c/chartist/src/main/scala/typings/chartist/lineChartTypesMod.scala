package typings.chartist

import typings.chartist.anon.Area
import typings.chartist.anon.OmitLineChartOptionsRequi
import typings.chartist.anon.PartialChartPadding
import typings.chartist.axesMod.Axis
import typings.chartist.chartistStrings.area
import typings.chartist.chartistStrings.labelInterpolationFnc
import typings.chartist.chartistStrings.labelOffset
import typings.chartist.chartistStrings.line
import typings.chartist.chartistStrings.offset
import typings.chartist.chartistStrings.point
import typings.chartist.chartistStrings.position
import typings.chartist.chartistStrings.scaleMinSpace
import typings.chartist.chartistStrings.series
import typings.chartist.chartistStrings.showGrid
import typings.chartist.chartistStrings.showLabel
import typings.chartist.chartsTypesMod.BaseChartEventsTypes
import typings.chartist.coreTypesMod.AxesDrawEvent
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.ChartRect
import typings.chartist.coreTypesMod.CreatedEvent
import typings.chartist.coreTypesMod.Data
import typings.chartist.coreTypesMod.DrawEvent
import typings.chartist.coreTypesMod.Meta
import typings.chartist.coreTypesMod.NormalizedSeries
import typings.chartist.coreTypesMod.NormalizedSeriesValue
import typings.chartist.coreTypesMod.Options
import typings.chartist.coreTypesMod.Plugin
import typings.chartist.coreTypesMod.SegmentData
import typings.chartist.coreTypesMod.Series
import typings.chartist.coreTypesMod.SeriesObject
import typings.chartist.coreTypesMod.SeriesPrimitiveValue
import typings.chartist.svgMod.Svg
import typings.chartist.svgMod.SvgPath
import typings.chartist.utilsTypesMod.RequiredKeys
import typings.std.Omit
import typings.std.Record
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartTypesMod {
  
  trait AreaDrawEvent
    extends StObject
       with DrawEvent {
    
    var path: SvgPath
    
    @JSName("type")
    var type_AreaDrawEvent: area
    
    var values: NormalizedSeries
  }
  object AreaDrawEvent {
    
    inline def apply(
      axisX: Axis,
      axisY: Axis,
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      path: SvgPath,
      seriesIndex: Double,
      values: NormalizedSeries
    ): AreaDrawEvent = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("area")
      __obj.asInstanceOf[AreaDrawEvent]
    }
    
    extension [Self <: AreaDrawEvent](x: Self) {
      
      inline def setPath(value: SvgPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: area): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: NormalizedSeries): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: NormalizedSeriesValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type LineChartCreatedEvent = CreatedEvent[LineChartOptions[AxisOptions, AxisOptions]]
  
  type LineChartData = Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]]
  
  type LineChartEventsTypes = BaseChartEventsTypes[
    LineChartCreatedEvent, 
    AxesDrawEvent | PointDrawEvent | LineDrawEvent | AreaDrawEvent
  ]
  
  trait LineChartOptions[TXAxisOptions, TYAxisOptions]
    extends StObject
       with Options[TXAxisOptions, TYAxisOptions] {
    
    var areaBase: js.UndefOr[Double] = js.undefined
    
    @JSName("classNames")
    var classNames_LineChartOptions: js.UndefOr[Area] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var lineSmooth: js.UndefOr[Boolean | LineInterpolation] = js.undefined
    
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    var series: js.UndefOr[
        Record[
          String, 
          Omit[
            LineChartOptions[TXAxisOptions, TYAxisOptions], 
            typings.chartist.chartistStrings.series
          ]
        ]
      ] = js.undefined
    
    var showArea: js.UndefOr[Boolean] = js.undefined
    
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    var showLine: js.UndefOr[Boolean] = js.undefined
    
    var showPoint: js.UndefOr[Boolean] = js.undefined
  }
  object LineChartOptions {
    
    inline def apply[TXAxisOptions, TYAxisOptions](): LineChartOptions[TXAxisOptions, TYAxisOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineChartOptions[TXAxisOptions, TYAxisOptions]]
    }
    
    extension [Self <: LineChartOptions[?, ?], TXAxisOptions, TYAxisOptions](x: Self & (LineChartOptions[TXAxisOptions, TYAxisOptions])) {
      
      inline def setAreaBase(value: Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
      
      inline def setAreaBaseUndefined: Self = StObject.set(x, "areaBase", js.undefined)
      
      inline def setClassNames(value: Area): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setLineSmooth(value: Boolean | LineInterpolation): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
      
      inline def setLineSmoothFunction2(value: (/* pathCoordinates */ js.Array[Double], /* valueData */ js.Array[SegmentData]) => SvgPath): Self = StObject.set(x, "lineSmooth", js.Any.fromFunction2(value))
      
      inline def setLineSmoothUndefined: Self = StObject.set(x, "lineSmooth", js.undefined)
      
      inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
      
      inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
      
      inline def setSeries(value: Record[String, Omit[LineChartOptions[TXAxisOptions, TYAxisOptions], series]]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
      
      inline def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
      
      inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
      
      inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      inline def setShowPoint(value: Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
      
      inline def setShowPointUndefined: Self = StObject.set(x, "showPoint", js.undefined)
    }
  }
  
  /* Inlined chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/charts/LineChart/LineChart.types.LineChartOptions<chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc', never>, chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/core.AxisOptions, 'offset' | 'position' | 'labelOffset' | 'showLabel' | 'showGrid' | 'labelInterpolationFnc' | 'scaleMinSpace', never>>, 'showLine' | 'showPoint' | 'areaBase' | 'lineSmooth' | 'chartPadding' | 'axisX' | 'axisY', 'classNames'> */
  trait LineChartOptionsWithDefaults extends StObject {
    
    var areaBase: js.UndefOr[Double] & Double
    
    var axisX: (js.UndefOr[
        RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
          scala.Nothing
        ]
      ]) & (RequiredKeys[
        AxisOptions, 
        offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
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
    
    var classNames: js.UndefOr[Area] & Area & Required[js.UndefOr[Area]]
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    var lineSmooth: (js.UndefOr[Boolean | LineInterpolation]) & (Boolean | LineInterpolation)
    
    var low: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
    
    var referenceValue: js.UndefOr[Double] = js.undefined
    
    var reverseData: js.UndefOr[Boolean] = js.undefined
    
    var series: js.UndefOr[Record[String, OmitLineChartOptionsRequi]] = js.undefined
    
    var showArea: js.UndefOr[Boolean] = js.undefined
    
    var showGridBackground: js.UndefOr[Boolean] = js.undefined
    
    var showLine: js.UndefOr[Boolean] & Boolean
    
    var showPoint: js.UndefOr[Boolean] & Boolean
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object LineChartOptionsWithDefaults {
    
    inline def apply(
      areaBase: js.UndefOr[Double] & Double,
      axisX: (js.UndefOr[
          RequiredKeys[
            AxisOptions, 
            offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
            scala.Nothing
          ]
        ]) & (RequiredKeys[
          AxisOptions, 
          offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
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
      classNames: js.UndefOr[Area] & Area & Required[js.UndefOr[Area]],
      lineSmooth: (js.UndefOr[Boolean | LineInterpolation]) & (Boolean | LineInterpolation),
      showLine: js.UndefOr[Boolean] & Boolean,
      showPoint: js.UndefOr[Boolean] & Boolean
    ): LineChartOptionsWithDefaults = {
      val __obj = js.Dynamic.literal(areaBase = areaBase.asInstanceOf[js.Any], axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartPadding = chartPadding.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], lineSmooth = lineSmooth.asInstanceOf[js.Any], showLine = showLine.asInstanceOf[js.Any], showPoint = showPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineChartOptionsWithDefaults]
    }
    
    extension [Self <: LineChartOptionsWithDefaults](x: Self) {
      
      inline def setAreaBase(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "areaBase", value.asInstanceOf[js.Any])
      
      inline def setAxisX(
        value: (js.UndefOr[
              RequiredKeys[
                AxisOptions, 
                offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
                scala.Nothing
              ]
            ]) & (RequiredKeys[
              AxisOptions, 
              offset | position | labelOffset | showLabel | showGrid | labelInterpolationFnc, 
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
      
      inline def setClassNames(value: js.UndefOr[Area] & Area & Required[js.UndefOr[Area]]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setLineSmooth(value: (js.UndefOr[Boolean | LineInterpolation]) & (Boolean | LineInterpolation)): Self = StObject.set(x, "lineSmooth", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin | (js.Tuple2[Plugin, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin | (js.Tuple2[Plugin, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
      
      inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
      
      inline def setReverseData(value: Boolean): Self = StObject.set(x, "reverseData", value.asInstanceOf[js.Any])
      
      inline def setReverseDataUndefined: Self = StObject.set(x, "reverseData", js.undefined)
      
      inline def setSeries(value: Record[String, OmitLineChartOptionsRequi]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setShowArea(value: Boolean): Self = StObject.set(x, "showArea", value.asInstanceOf[js.Any])
      
      inline def setShowAreaUndefined: Self = StObject.set(x, "showArea", js.undefined)
      
      inline def setShowGridBackground(value: Boolean): Self = StObject.set(x, "showGridBackground", value.asInstanceOf[js.Any])
      
      inline def setShowGridBackgroundUndefined: Self = StObject.set(x, "showGridBackground", js.undefined)
      
      inline def setShowLine(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowPoint(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "showPoint", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LineDrawEvent
    extends StObject
       with DrawEvent {
    
    var path: SvgPath
    
    @JSName("type")
    var type_LineDrawEvent: line
    
    var values: NormalizedSeries
  }
  object LineDrawEvent {
    
    inline def apply(
      axisX: Axis,
      axisY: Axis,
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      path: SvgPath,
      seriesIndex: Double,
      values: NormalizedSeries
    ): LineDrawEvent = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("line")
      __obj.asInstanceOf[LineDrawEvent]
    }
    
    extension [Self <: LineDrawEvent](x: Self) {
      
      inline def setPath(value: SvgPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: NormalizedSeries): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: NormalizedSeriesValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type LineInterpolation = js.Function2[
    /* pathCoordinates */ js.Array[Double], 
    /* valueData */ js.Array[SegmentData], 
    SvgPath
  ]
  
  trait PointDrawEvent
    extends StObject
       with DrawEvent {
    
    @JSName("type")
    var type_PointDrawEvent: point
    
    var value: NormalizedSeriesValue
    
    var x: Double
    
    var y: Double
  }
  object PointDrawEvent {
    
    inline def apply(
      axisX: Axis,
      axisY: Axis,
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      seriesIndex: Double,
      x: Double,
      y: Double
    ): PointDrawEvent = {
      val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("point")
      __obj.asInstanceOf[PointDrawEvent]
    }
    
    extension [Self <: PointDrawEvent](x: Self) {
      
      inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: NormalizedSeriesValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
