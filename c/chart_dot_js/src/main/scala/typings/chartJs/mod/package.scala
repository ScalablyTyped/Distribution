package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.chartJs.anon.CanvasHTMLCanvasElement
import typings.chartJs.anon.Fn
import typings.chartJs.basicMod.AnyObject
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.elementMod.Element
import typings.chartJs.geometricMod.Point
import typings.chartJs.mod.^
import typings.chartJs.utilsMod.DeepPartial
import typings.chartJs.utilsMod.DistributiveArray
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BarController = DatasetController[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type BubbleController = DatasetController[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type CategoryScale[O /* <: CategoryScaleOptions */] = Scale[O]

inline def Decimation: Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("Decimation").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def Filler: Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("Filler").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def Legend: Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("Legend").asInstanceOf[Plugin[ChartType, AnyObject]]

type LineController = DatasetController[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type LinearScale[O /* <: LinearScaleOptions */] = Scale[O]

type LogarithmicScale[O /* <: LogarithmicScaleOptions */] = Scale[O]

type PieController = DoughnutController

type RadarController = DatasetController[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type ScatterController = LineController

inline def SubTitle: Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("SubTitle").asInstanceOf[Plugin[ChartType, AnyObject]]

type TimeSeriesScale[O /* <: TimeScaleOptions */] = TimeScale[O]

inline def Title: Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("Title").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def defaults: Defaults_ = ^.asInstanceOf[js.Dynamic].selectDynamic("defaults").asInstanceOf[Defaults_]

inline def registerables: js.Array[ChartComponentLike] = ^.asInstanceOf[js.Dynamic].selectDynamic("registerables").asInstanceOf[js.Array[ChartComponentLike]]

inline def registry: Registry_ = ^.asInstanceOf[js.Dynamic].selectDynamic("registry").asInstanceOf[Registry_]

type AnimationsSpec[TType /* <: ChartType */] = StringDictionary[`false` | (AnimationSpec[TType] & Fn[TType])]

type ChartComponentLike = ChartComponent | (js.Array[ChartComponent | (Plugin[ChartType, AnyObject])]) | StringDictionary[ChartComponent] | (Plugin[ChartType, AnyObject])

type ChartDataset[TType /* <: ChartType */, TData] = (DeepPartial[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinChartTypetypekeyChar[TType] */ js.Any]) & (ChartDatasetProperties[TType, TData])

type ChartDatasetCustomTypesPerDataset[TType /* <: ChartType */, TData] = (DeepPartial[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinChartTypetypekeyChar[TType] */ js.Any]) & (ChartDatasetPropertiesCustomTypesPerDataset[TType, TData])

type ChartItem = String | CanvasRenderingContext2D | HTMLCanvasElement | CanvasHTMLCanvasElement | (ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement])

type ChartMeta[TElement /* <: Element[AnyObject, AnyObject] */, TDatasetElement /* <: Element[AnyObject, AnyObject] */, // TODO - V4, move this to the first parameter.
// When this was introduced, doing so was a breaking change
TType /* <: ChartType */] = (DeepPartial[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinChartTypeChartTypeRe[TType] */ js.Any]) & (ChartMetaCommon[TElement, TDatasetElement])

type ChartOptions[TType /* <: ChartType */] = DeepPartial[
CoreChartOptions[TType] & ElementChartOptions[TType] & PluginChartOptions[TType] & DatasetChartOptions[TType] & ScaleChartOptions[TType] & (/* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js.ChartTypeRegistry[TType]['chartOptions'] */ js.Any)]

type DatasetChartOptions[TType /* <: ChartType */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in TType ]: {  datasets :chart.js.chart.js.ChartTypeRegistry[key]['datasetOptions']}}
  */ typings.chartJs.chartJsStrings.DatasetChartOptions & TopLevel[ChartTypeRegistry]

type DefaultDataPoint[TType /* <: ChartType */] = DistributiveArray[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js.ChartTypeRegistry[TType]['defaultDataPoint'] */ js.Any]

type DoughnutDataPoint = Double

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typings.chartJs.anon.Value
  - typings.chartJs.chartJsStrings.start
  - typings.chartJs.chartJsStrings.end
  - typings.chartJs.chartJsStrings.origin
  - typings.chartJs.chartJsStrings.stack
  - typings.chartJs.chartJsStrings.shape
  - scala.Boolean
*/
type FillTarget = _FillTarget | Double | String | Boolean

type InteractionModeFunction = js.Function4[
/* chart */ Chart[ChartType, DefaultDataPoint[ChartType], Any], 
/* e */ ChartEvent, 
/* options */ InteractionOptions, 
/* useFinalPosition */ js.UndefOr[Boolean], 
js.Array[InteractionItem]]

type ParsedDataType[TType /* <: ChartType */] = /* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js.ChartTypeRegistry[TType]['parsedDataType'] */ js.Any

type PieAnimationOptions = DoughnutAnimationOptions

type PieControllerChartOptions = DoughnutControllerChartOptions

type PieControllerDatasetOptions = DoughnutControllerDatasetOptions

type PieDataPoint = DoughnutDataPoint

type PieMetaExtensions = DoughnutMetaExtensions

/* Rewritten from type alias, can be one of: 
  - typings.chartJs.chartJsStrings.circle
  - typings.chartJs.chartJsStrings.cross
  - typings.chartJs.chartJsStrings.crossRot
  - typings.chartJs.chartJsStrings.dash
  - typings.chartJs.chartJsStrings.line
  - typings.chartJs.chartJsStrings.rect
  - typings.chartJs.chartJsStrings.rectRounded
  - typings.chartJs.chartJsStrings.rectRot
  - typings.chartJs.chartJsStrings.star
  - typings.chartJs.chartJsStrings.triangle
  - typings.std.HTMLImageElement
  - typings.std.HTMLCanvasElement
*/
type PointStyle = _PointStyle | HTMLImageElement | HTMLCanvasElement

type PolarAreaAnimationOptions = DoughnutAnimationOptions

type RadarControllerChartOptions = LineControllerChartOptions

type ScaleOptions[TScale /* <: ScaleType */] = DeepPartial[ScaleOptionsByType[TScale]]

type ScaleOptionsByType[TScale /* <: ScaleType */] = /* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinScaleTypetypekeyScal[TScale] */ js.Any

type ScatterControllerChartOptions = LineControllerChartOptions

type ScatterControllerDatasetOptions = LineControllerDatasetOptions

type Scriptable[T, TContext] = T | (js.Function2[/* ctx */ TContext, /* options */ AnyObject, js.UndefOr[T]])

type ScriptableAndArray[T, TContext] = js.Array[T] | (Scriptable[T, TContext])

type ScriptableAndArrayOptions[T, TContext] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: chart.js.chart.js.ScriptableAndArray<T[P], TContext>}
  */ typings.chartJs.chartJsStrings.ScriptableAndArrayOptions & TopLevel[T]

type ScriptableAndScriptableOptions[T, TContext] = (Scriptable[T, TContext]) | (ScriptableOptions[T, TContext])

type ScriptableOptions[T, TContext] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: chart.js.chart.js.Scriptable<T[P], TContext>}
  */ typings.chartJs.chartJsStrings.ScriptableOptions & TopLevel[T]

type TooltipPositionerFunction[TType /* <: ChartType */] = js.ThisFunction2[
/* this */ TooltipModel[TType], 
/* items */ js.Array[ActiveElement], 
/* eventPosition */ Point, 
TooltipPosition | `false`]

type TransitionsSpec[TType /* <: ChartType */] = StringDictionary[TransitionSpec[TType]]

type UpdateMode = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateModeEnum * / any */ String
