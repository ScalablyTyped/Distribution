package typings.chartist

import typings.chartist.anon.ChartDonut
import typings.chartist.anon.PartialChartPadding
import typings.chartist.chartistStrings.label
import typings.chartist.chartistStrings.slice
import typings.chartist.distChartsTypesMod.BaseChartEventsTypes
import typings.chartist.distCoreTypesMod.ChartRect
import typings.chartist.distCoreTypesMod.Data
import typings.chartist.distCoreTypesMod.FlatSeries
import typings.chartist.distCoreTypesMod.FlatSeriesPrimitiveValue
import typings.chartist.distCoreTypesMod.FlatSeriesValue
import typings.chartist.distCoreTypesMod.Label
import typings.chartist.distCoreTypesMod.Meta
import typings.chartist.distCoreTypesMod.NormalizedSeriesValue
import typings.chartist.distCoreTypesMod.Plugin
import typings.chartist.distCoreTypesMod.Series
import typings.chartist.distCoreTypesMod.SeriesObject
import typings.chartist.distCoreTypesMod.SeriesPrimitiveValue
import typings.chartist.distCoreTypesMod.SeriesValue
import typings.chartist.distSvgMod.Svg
import typings.chartist.distSvgMod.SvgPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsPieChartPieChartDottypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.chartist.chartistStrings.start
    - typings.chartist.chartistStrings.middle
    - typings.chartist.chartistStrings.end
  */
  trait AnchorPosition extends StObject
  object AnchorPosition {
    
    inline def end: typings.chartist.chartistStrings.end = "end".asInstanceOf[typings.chartist.chartistStrings.end]
    
    inline def middle: typings.chartist.chartistStrings.middle = "middle".asInstanceOf[typings.chartist.chartistStrings.middle]
    
    inline def start: typings.chartist.chartistStrings.start = "start".asInstanceOf[typings.chartist.chartistStrings.start]
  }
  
  trait Dot extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Dot {
    
    inline def apply(x: Double, y: Double): Dot = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dot] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chartist.chartistStrings.implode
    - typings.chartist.chartistStrings.neutral
    - typings.chartist.chartistStrings.explode
  */
  trait LabelDirection extends StObject
  object LabelDirection {
    
    inline def explode: typings.chartist.chartistStrings.explode = "explode".asInstanceOf[typings.chartist.chartistStrings.explode]
    
    inline def implode: typings.chartist.chartistStrings.implode = "implode".asInstanceOf[typings.chartist.chartistStrings.implode]
    
    inline def neutral: typings.chartist.chartistStrings.neutral = "neutral".asInstanceOf[typings.chartist.chartistStrings.neutral]
  }
  
  /* Inlined std.Omit<chartist.chartist/dist/core.CreatedEvent<chartist.chartist/dist/charts/PieChart/PieChart.types.PieChartOptions>, 'axisX' | 'axisY'> */
  trait PieChartCreatedEvent extends StObject {
    
    var chartRect: ChartRect
    
    var options: PieChartOptions
    
    var svg: Svg
  }
  object PieChartCreatedEvent {
    
    inline def apply(chartRect: ChartRect, options: PieChartOptions, svg: Svg): PieChartCreatedEvent = {
      val __obj = js.Dynamic.literal(chartRect = chartRect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieChartCreatedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieChartCreatedEvent] (val x: Self) extends AnyVal {
      
      inline def setChartRect(value: ChartRect): Self = StObject.set(x, "chartRect", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: PieChartOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: Svg): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
  
  type PieChartData = Data[FlatSeries[FlatSeriesPrimitiveValue]]
  
  type PieChartEventsTypes = BaseChartEventsTypes[PieChartCreatedEvent, SliceDrawEvent | SliceLabelDrawEvent]
  
  /* Inlined parent std.Omit<chartist.chartist/dist/core.Options<chartist.chartist/dist/core/types.AxisOptions, chartist.chartist/dist/core/types.AxisOptions>, 'axisX' | 'axisY'> */
  trait PieChartOptions extends StObject {
    
    var chartPadding: js.UndefOr[Double | PartialChartPadding] = js.undefined
    
    /**
      * Override the class names that are used to generate the SVG structure of the chart
      */
    var classNames: js.UndefOr[ChartDonut] = js.undefined
    
    /**
      * If specified the donut CSS classes will be used and strokes will be drawn instead of pie slices.
      */
    var donut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the donut stroke width, currently done in javascript for convenience. May move to CSS styles in the future.
      * This option can be set as number or string to specify a relative width (i.e. 100 or '30%').
      */
    var donutWidth: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    /**
      * If true empty values will be ignored to avoid drawing unnecessary slices and labels
      */
    var ignoreEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Label direction can be 'neutral', 'explode' or 'implode'.
      * The labels anchor will be positioned based on those settings as well as the fact if the labels are on the right or left side of the center of the chart.
      * Usually explode is useful when labels are positioned far away from the center.
      */
    var labelDirection: js.UndefOr[LabelDirection] = js.undefined
    
    /**
      * An interpolation function for the label value
      */
    var labelInterpolationFnc: js.UndefOr[js.Function2[/* value */ Label, /* index */ Double, js.UndefOr[Label | Null]]] = js.undefined
    
    /**
      * Label position offset from the standard position which is half distance of the radius. This value can be either positive or negative. Positive values will position the label away from the center.
      */
    var labelOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * This option can be set to 'inside', 'outside' or 'center'.
      * Positioned with 'inside' the labels will be placed on half the distance of the radius to the border of the Pie by respecting the 'labelOffset'.
      * The 'outside' option will place the labels at the border of the pie and 'center' will place the labels in the absolute center point of the chart.
      * The 'center' option only makes sense in conjunction with the 'labelOffset' option.
      */
    var labelPosition: js.UndefOr[RadialLabelPosition] = js.undefined
    
    var low: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
    
    var referenceValue: js.UndefOr[Double] = js.undefined
    
    /**
      * If a label should be shown or not
      */
    var showLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The start angle of the pie chart in degrees where 0 points north. A higher value offsets the start angle clockwise.
      */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional total you can specify. By specifying a total value, the sum of the values in the series must be this total in order to draw a full pie. You can use this parameter to draw only parts of a pie or gauge charts.
      */
    var total: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object PieChartOptions {
    
    inline def apply(): PieChartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieChartOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieChartOptions] (val x: Self) extends AnyVal {
      
      inline def setChartPadding(value: Double | PartialChartPadding): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
      
      inline def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
      
      inline def setClassNames(value: ChartDonut): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDonut(value: Boolean): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
      
      inline def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
      
      inline def setDonutWidth(value: Double | String): Self = StObject.set(x, "donutWidth", value.asInstanceOf[js.Any])
      
      inline def setDonutWidthUndefined: Self = StObject.set(x, "donutWidth", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setIgnoreEmptyValues(value: Boolean): Self = StObject.set(x, "ignoreEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptyValuesUndefined: Self = StObject.set(x, "ignoreEmptyValues", js.undefined)
      
      inline def setLabelDirection(value: LabelDirection): Self = StObject.set(x, "labelDirection", value.asInstanceOf[js.Any])
      
      inline def setLabelDirectionUndefined: Self = StObject.set(x, "labelDirection", js.undefined)
      
      inline def setLabelInterpolationFnc(value: (/* value */ Label, /* index */ Double) => js.UndefOr[Label | Null]): Self = StObject.set(x, "labelInterpolationFnc", js.Any.fromFunction2(value))
      
      inline def setLabelInterpolationFncUndefined: Self = StObject.set(x, "labelInterpolationFnc", js.undefined)
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelPosition(value: RadialLabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin | (js.Tuple2[Plugin, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin | (js.Tuple2[Plugin, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
      
      inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
      
      inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined chartist.chartist/dist/utils.RequiredKeys<chartist.chartist/dist/charts/PieChart/PieChart.types.PieChartOptions, 'chartPadding' | 'startAngle' | 'donutWidth' | 'showLabel' | 'labelOffset' | 'labelPosition' | 'labelInterpolationFnc' | 'labelDirection', 'classNames'> */
  trait PieChartOptionsWithDefaults extends StObject {
    
    var chartPadding: js.UndefOr[Double | PartialChartPadding] = js.undefined
    
    /**
      * Override the class names that are used to generate the SVG structure of the chart
      */
    var classNames: js.UndefOr[ChartDonut] = js.undefined
    
    /**
      * If specified the donut CSS classes will be used and strokes will be drawn instead of pie slices.
      */
    var donut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the donut stroke width, currently done in javascript for convenience. May move to CSS styles in the future.
      * This option can be set as number or string to specify a relative width (i.e. 100 or '30%').
      */
    var donutWidth: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    /**
      * If true empty values will be ignored to avoid drawing unnecessary slices and labels
      */
    var ignoreEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Label direction can be 'neutral', 'explode' or 'implode'.
      * The labels anchor will be positioned based on those settings as well as the fact if the labels are on the right or left side of the center of the chart.
      * Usually explode is useful when labels are positioned far away from the center.
      */
    var labelDirection: js.UndefOr[LabelDirection] = js.undefined
    
    def labelInterpolationFnc(value: Label, index: Double): js.UndefOr[Label | Null]
    /**
      * An interpolation function for the label value
      */
    @JSName("labelInterpolationFnc")
    var labelInterpolationFnc_Original: js.UndefOr[js.Function2[/* value */ Label, /* index */ Double, js.UndefOr[Label | Null]]] = js.undefined
    
    /**
      * Label position offset from the standard position which is half distance of the radius. This value can be either positive or negative. Positive values will position the label away from the center.
      */
    var labelOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * This option can be set to 'inside', 'outside' or 'center'.
      * Positioned with 'inside' the labels will be placed on half the distance of the radius to the border of the Pie by respecting the 'labelOffset'.
      * The 'outside' option will place the labels at the border of the pie and 'center' will place the labels in the absolute center point of the chart.
      * The 'center' option only makes sense in conjunction with the 'labelOffset' option.
      */
    var labelPosition: js.UndefOr[RadialLabelPosition] = js.undefined
    
    var low: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin | (js.Tuple2[Plugin, Any])]] = js.undefined
    
    var referenceValue: js.UndefOr[Double] = js.undefined
    
    /**
      * If a label should be shown or not
      */
    var showLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The start angle of the pie chart in degrees where 0 points north. A higher value offsets the start angle clockwise.
      */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional total you can specify. By specifying a total value, the sum of the values in the series must be this total in order to draw a full pie. You can use this parameter to draw only parts of a pie or gauge charts.
      */
    var total: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object PieChartOptionsWithDefaults {
    
    inline def apply(): PieChartOptionsWithDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieChartOptionsWithDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieChartOptionsWithDefaults] (val x: Self) extends AnyVal {
      
      inline def setChartPadding(value: Double | PartialChartPadding): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
      
      inline def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
      
      inline def setClassNames(value: ChartDonut): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDonut(value: Boolean): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
      
      inline def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
      
      inline def setDonutWidth(value: Double | String): Self = StObject.set(x, "donutWidth", value.asInstanceOf[js.Any])
      
      inline def setDonutWidthUndefined: Self = StObject.set(x, "donutWidth", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setIgnoreEmptyValues(value: Boolean): Self = StObject.set(x, "ignoreEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEmptyValuesUndefined: Self = StObject.set(x, "ignoreEmptyValues", js.undefined)
      
      inline def setLabelDirection(value: LabelDirection): Self = StObject.set(x, "labelDirection", value.asInstanceOf[js.Any])
      
      inline def setLabelDirectionUndefined: Self = StObject.set(x, "labelDirection", js.undefined)
      
      inline def setLabelInterpolationFnc(value: (/* value */ Label, /* index */ Double) => js.UndefOr[Label | Null]): Self = StObject.set(x, "labelInterpolationFnc", js.Any.fromFunction2(value))
      
      inline def setLabelInterpolationFncUndefined: Self = StObject.set(x, "labelInterpolationFnc", js.undefined)
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelPosition(value: RadialLabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin | (js.Tuple2[Plugin, Any])]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin | (js.Tuple2[Plugin, Any]))*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
      
      inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
      
      inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chartist.chartistStrings.inside
    - typings.chartist.chartistStrings.center
    - typings.chartist.chartistStrings.outside
  */
  trait RadialLabelPosition extends StObject
  object RadialLabelPosition {
    
    inline def center: typings.chartist.chartistStrings.center = "center".asInstanceOf[typings.chartist.chartistStrings.center]
    
    inline def inside: typings.chartist.chartistStrings.inside = "inside".asInstanceOf[typings.chartist.chartistStrings.inside]
    
    inline def outside: typings.chartist.chartistStrings.outside = "outside".asInstanceOf[typings.chartist.chartistStrings.outside]
  }
  
  /* Inlined parent std.Omit<chartist.chartist/dist/core.DrawEvent, 'axisX' | 'axisY' | 'seriesIndex'> */
  trait SliceDrawEvent extends StObject {
    
    var center: Dot
    
    var chartRect: ChartRect
    
    var element: Svg
    
    var endAngle: Double
    
    var group: Svg
    
    var index: Double
    
    var meta: Meta
    
    var path: SvgPath
    
    var radius: Double
    
    var series: FlatSeriesValue[FlatSeriesPrimitiveValue] | Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]
    
    var startAngle: Double
    
    var totalDataSum: Double
    
    var `type`: slice
    
    var value: NormalizedSeriesValue
  }
  object SliceDrawEvent {
    
    inline def apply(
      center: Dot,
      chartRect: ChartRect,
      element: Svg,
      endAngle: Double,
      group: Svg,
      index: Double,
      meta: Meta,
      path: SvgPath,
      radius: Double,
      startAngle: Double,
      totalDataSum: Double
    ): SliceDrawEvent = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], totalDataSum = totalDataSum.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("slice")
      __obj.asInstanceOf[SliceDrawEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliceDrawEvent] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: Dot): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setChartRect(value: ChartRect): Self = StObject.set(x, "chartRect", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Svg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: Svg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setPath(value: SvgPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSeries(
        value: FlatSeriesValue[FlatSeriesPrimitiveValue] | Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]
      ): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesNull: Self = StObject.set(x, "series", null)
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setSeriesVarargs(value: SeriesValue[SeriesPrimitiveValue]*): Self = StObject.set(x, "series", js.Array(value*))
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setTotalDataSum(value: Double): Self = StObject.set(x, "totalDataSum", value.asInstanceOf[js.Any])
      
      inline def setType(value: slice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: NormalizedSeriesValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<chartist.chartist/dist/core.DrawEvent, 'axisX' | 'axisY' | 'seriesIndex'> */
  trait SliceLabelDrawEvent extends StObject {
    
    var chartRect: ChartRect
    
    var element: Svg
    
    var group: Svg
    
    var index: Double
    
    var meta: Meta
    
    var series: FlatSeriesValue[FlatSeriesPrimitiveValue] | Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]
    
    var text: String
    
    var `type`: label
    
    var x: Double
    
    var y: Double
  }
  object SliceLabelDrawEvent {
    
    inline def apply(
      chartRect: ChartRect,
      element: Svg,
      group: Svg,
      index: Double,
      meta: Meta,
      text: String,
      x: Double,
      y: Double
    ): SliceLabelDrawEvent = {
      val __obj = js.Dynamic.literal(chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("label")
      __obj.asInstanceOf[SliceLabelDrawEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliceLabelDrawEvent] (val x: Self) extends AnyVal {
      
      inline def setChartRect(value: ChartRect): Self = StObject.set(x, "chartRect", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Svg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: Svg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSeries(
        value: FlatSeriesValue[FlatSeriesPrimitiveValue] | Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]
      ): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesNull: Self = StObject.set(x, "series", null)
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setSeriesVarargs(value: SeriesValue[SeriesPrimitiveValue]*): Self = StObject.set(x, "series", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
