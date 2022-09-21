package typings.chartist

import typings.chartist.anon.Bottom
import typings.chartist.anon.FillHoles
import typings.chartist.anon.Height
import typings.chartist.anon.High
import typings.chartist.anon.PartialChartPadding
import typings.chartist.anon.Value
import typings.chartist.anon.X
import typings.chartist.axesMod.Axis
import typings.chartist.chartistBooleans.`false`
import typings.chartist.chartistBooleans.`true`
import typings.chartist.coreTypesMod.AxisName
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.Bounds
import typings.chartist.coreTypesMod.ChartRect
import typings.chartist.coreTypesMod.Data
import typings.chartist.coreTypesMod.FlatSeries
import typings.chartist.coreTypesMod.FlatSeriesPrimitiveValue
import typings.chartist.coreTypesMod.FlatSeriesValue
import typings.chartist.coreTypesMod.Label
import typings.chartist.coreTypesMod.Multi
import typings.chartist.coreTypesMod.NormalizedData
import typings.chartist.coreTypesMod.NormalizedFlatSeries
import typings.chartist.coreTypesMod.NormalizedSeries
import typings.chartist.coreTypesMod.Options
import typings.chartist.coreTypesMod.ResponsiveOptions
import typings.chartist.coreTypesMod.Segment
import typings.chartist.coreTypesMod.SegmentData
import typings.chartist.coreTypesMod.Series
import typings.chartist.coreTypesMod.SeriesObject
import typings.chartist.coreTypesMod.SeriesPrimitiveValue
import typings.chartist.eventMod.EventEmitter
import typings.chartist.optionsProviderMod.OptionsProvider_
import typings.chartist.svgSvgMod.Svg
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("chartist/dist/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chartist/dist/core", "EPSILON")
  @js.native
  val EPSILON: /* 2.221e-16 */ Double = js.native
  
  inline def alphaNumerate(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaNumerate")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createChartRect(svg: Svg, options: Options[AxisOptions, AxisOptions]): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("createChartRect")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def createGrid(
    position: Double,
    index: Double,
    axis: Axis,
    offset: Double,
    length: Double,
    group: Svg,
    classes: js.Array[String],
    eventEmitter: EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrid")(position.asInstanceOf[js.Any], index.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], group.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createGridBackground(gridGroup: Svg, chartRect: ChartRect, className: String, eventEmitter: EventEmitter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGridBackground")(gridGroup.asInstanceOf[js.Any], chartRect.asInstanceOf[js.Any], className.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createLabel(
    position: Double,
    length: Double,
    index: Double,
    label: Label,
    axis: Axis,
    axisOffset: Double,
    labelOffset: X,
    group: Svg,
    classes: js.Array[String],
    eventEmitter: EventEmitter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(position.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any], label.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], axisOffset.asInstanceOf[js.Any], labelOffset.asInstanceOf[js.Any], group.asInstanceOf[js.Any], classes.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createSvg(container: Element): Svg = ^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any]).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: String, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: Double, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: String, height: Unit, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: String, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: Double, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Double, height: Unit, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: String, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: Double): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: Double, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  inline def createSvg(container: Element, width: Unit, height: Unit, className: String): Svg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvg")(container.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Svg]
  
  inline def deserialize[T /* <: js.Object | Double | String */](): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")().asInstanceOf[js.UndefOr[T | Null]]
  inline def deserialize[T /* <: js.Object | Double | String */](data: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def deserialize_T_UnionObjectDoubleString_Union[T /* <: js.Object | Double | String */](data: String): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T | Null]]
  
  inline def ensureUnit[T](value: T, unit: String): String | T = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureUnit")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String | T]
  
  @JSImport("chartist/dist/core", "escapingMap")
  @js.native
  val escapingMap: Record[String, String] = js.native
  
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double, onlyInteger: Boolean): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any], onlyInteger.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions]): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[High]
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions], dimension: AxisName): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[High]
  
  inline def getMetaData(seriesData: FlatSeriesValue[FlatSeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetaData(seriesData: SeriesObject[SeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetaData(seriesData: Series[SeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMultiValue(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Any, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Double, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Multi): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Multi, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def isArrayOfSeries(value: Any): /* is std.Array<chartist.chartist/dist/core/types.Series<chartist.chartist/dist/core/types.SeriesPrimitiveValue> | chartist.chartist/dist/core/types.SeriesObject<chartist.chartist/dist/core/types.SeriesPrimitiveValue>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfSeries")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<chartist.chartist/dist/core/types.Series<chartist.chartist/dist/core/types.SeriesPrimitiveValue> | chartist.chartist/dist/core/types.SeriesObject<chartist.chartist/dist/core/types.SeriesPrimitiveValue>> */ Boolean]
  
  inline def isDataHoleValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataHoleValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMultiValue(value: Any): /* is chartist.chartist/dist/core/types.Multi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is chartist.chartist/dist/core/types.Multi */ Boolean]
  
  @JSImport("chartist/dist/core", "namespaces")
  @js.native
  val namespaces: Record[String, String] = js.native
  
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ]
  ): NormalizedData[NormalizedFlatSeries] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any]).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean
  ): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Unit,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Boolean, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Unit, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Boolean,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Unit,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  
  inline def normalizePadding(): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")().asInstanceOf[Bottom]
  inline def normalizePadding(padding: Double): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  inline def normalizePadding(padding: PartialChartPadding): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  inline def optionsProvider[T](options: T, responsiveOptions: Unit, eventEmitter: EventEmitter): OptionsProvider_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsProvider")(options.asInstanceOf[js.Any], responsiveOptions.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[OptionsProvider_[T]]
  inline def optionsProvider[T](options: T, responsiveOptions: ResponsiveOptions[T], eventEmitter: EventEmitter): OptionsProvider_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsProvider")(options.asInstanceOf[js.Any], responsiveOptions.asInstanceOf[js.Any], eventEmitter.asInstanceOf[js.Any])).asInstanceOf[OptionsProvider_[T]]
  
  inline def orderOfMagnitude(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("orderOfMagnitude")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def polarToCartesian(centerX: Double, centerY: Double, radius: Double, angleInDegrees: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("polarToCartesian")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[X]
  
  @JSImport("chartist/dist/core", "precision")
  @js.native
  val precision: /* 8 */ Double = js.native
  
  inline def projectLength(axisLength: Double, length: Double, bounds: Bounds): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("projectLength")(axisLength.asInstanceOf[js.Any], length.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def quantity[T](input: T): typings.chartist.anon.Unit | Value = ^.asInstanceOf[js.Dynamic].applyDynamic("quantity")(input.asInstanceOf[js.Any]).asInstanceOf[typings.chartist.anon.Unit | Value]
  
  inline def rho(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rho")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def roundWithPrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundWithPrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def roundWithPrecision(value: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundWithPrecision")(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def serialize(): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: Any): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serialize_Union(data: String): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: js.Object): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: Double): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData]): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData], options: FillHoles): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
}
