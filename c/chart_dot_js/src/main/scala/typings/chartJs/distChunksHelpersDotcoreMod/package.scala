package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.Canvas
import typings.chartJs.anon.Fn
import typings.chartJs.anon.OptionsPlugin
import typings.chartJs.anon.PartialTRBL
import typings.chartJs.anon.PartialTRBLCorners
import typings.chartJs.anon.Value
import typings.chartJs.distChunksHelpersDotcoreMod.^
import typings.std.ArrayLike
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def F: Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("F").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def G: Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("G").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def H_ : Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("H").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def J_ : Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("J").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def K_ : Plugin[ChartType, AnyObject] = ^.asInstanceOf[js.Dynamic].selectDynamic("K").asInstanceOf[Plugin[ChartType, AnyObject]]

inline def M_ : Tooltip = ^.asInstanceOf[js.Dynamic].selectDynamic("M").asInstanceOf[Tooltip]

inline def X_ : js.Array[ChartComponentLike] = ^.asInstanceOf[js.Dynamic].selectDynamic("X").asInstanceOf[js.Array[ChartComponentLike]]

inline def cA[T, TA](loopable: js.Array[T], fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cA[T, TA](
  loopable: js.Array[T],
  fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
  thisArg: TA
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cA[T, TA](
  loopable: js.Array[T],
  fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
  thisArg: TA,
  reverse: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cA[T, TA](
  loopable: js.Array[T],
  fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ Double, Unit],
  thisArg: Unit,
  reverse: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Note(SB) for performance sake, this method should only be used when loopable type
  * is unknown or in none intensive code (not called often and small loopable). Else
  * it's preferable to use a regular for() loop and save extra function calls.
  * @param loopable - The object or array to be iterated.
  * @param fn - The function to call for each item.
  * @param [thisArg] - The value of `this` provided for the call to `fn`.
  * @param [reverse] - If true, iterates backward on the loopable.
  */
inline def cA[T, TA](loopable: Record[String, T], fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cA[T, TA](
  loopable: Record[String, T],
  fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
  thisArg: TA
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cA[T, TA](
  loopable: Record[String, T],
  fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
  thisArg: TA,
  reverse: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def cA[T, TA](
  loopable: Record[String, T],
  fn: js.ThisFunction2[/* this */ TA, /* v */ T, /* i */ String, Unit],
  thisArg: Unit,
  reverse: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cA")(loopable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Returns true if the `a0` and `a1` arrays have the same content, else returns false.
  * @param a0 - The array to compare
  * @param a1 - The array to compare
  * @private
  */
inline def cB(a0: js.Array[ActiveDataPoint], a1: js.Array[ActiveDataPoint]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cB")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Returns a deep copy of `source` without keeping references on objects and arrays.
  * @param source - The value to clone.
  */
inline def cC[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cC")(source.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * The default merger when Chart.helpers.merge is called without merger option.
  * Note(SB): also used by mergeConfig and mergeScaleConfig as fallback.
  * @private
  */
inline def cD(key: String, target: AnyObject, source: AnyObject, options: AnyObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cD")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cF[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
inline def cF[T](target: T, source: js.Array[AnyObject], options: MergeOptions): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
inline def cF[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
inline def cF[T, S1](target: T, source: S1, options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]
inline def cF[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
inline def cF[T, S1, S2](target: T, source: js.Tuple2[S1, S2], options: MergeOptions): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
inline def cF[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
inline def cF[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3], options: MergeOptions): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
inline def cF[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]
inline def cF[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4], options: MergeOptions): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]

inline def cF_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
inline def cF_TS1_Intersection[T, S1](target: T, source: js.Array[S1], options: MergeOptions): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T & S1]

/**
  * Recursively deep copies `source` properties into `target` with the given `options`.
  * IMPORTANT: `target` is not cloned and will be updated with `source` properties.
  * @param target - The target object in which all sources are merged into.
  * @param source - Object(s) to merge into `target`.
  * @param [options] - Merging options:
  * @param [options.merger] - The merge method (key, target, source, options)
  * @returns The `target` object.
  */
inline def cF_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
inline def cF_T_T[T](target: T, source: js.Array[Any], options: MergeOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cF")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]

inline def cG[T](target: T, source: js.Array[AnyObject]): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("cG")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[AnyObject]
inline def cG[T, S1](target: T, source: S1): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cG")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]
inline def cG[T, S1, S2](target: T, source: js.Tuple2[S1, S2]): T & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cG")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2]
inline def cG[T, S1, S2, S3](target: T, source: js.Tuple3[S1, S2, S3]): T & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cG")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3]
inline def cG[T, S1, S2, S3, S4](target: T, source: js.Tuple4[S1, S2, S3, S4]): T & S1 & S2 & S3 & S4 = (^.asInstanceOf[js.Dynamic].applyDynamic("cG")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1 & S2 & S3 & S4]

inline def cG_TS1_Intersection[T, S1](target: T, source: js.Array[S1]): T & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cG")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S1]

/**
  * Recursively deep copies `source` properties into `target` *only* if not defined in target.
  * IMPORTANT: `target` is not cloned and will be updated with `source` properties.
  * @param target - The target object in which all sources are merged into.
  * @param source - Object(s) to merge into `target`.
  * @returns The `target` object.
  */
inline def cG_T_T[T](target: T, source: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cG")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Merges source[key] in target[key] only if target[key] is undefined.
  * @private
  */
inline def cH(key: String, target: AnyObject, source: AnyObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cH")(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * @private
  */
inline def cI_(scope: String, value: Any, previous: String, current: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cI")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], previous.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * @private
  */
inline def cJ(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("cJ")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def cK(obj: AnyObject, key: String): AnyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("cK")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[AnyObject]

/**
  * @private
  */
inline def cL(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cL")(str.asInstanceOf[js.Any]).asInstanceOf[String]

inline def cM(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cM")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def cN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def cO[T](a: Set[T], b: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cO")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * @param e - The event
  * @private
  */
inline def cP(e: ChartEvent1): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cP")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Returns true if `value` is a finite number, else returns false
  * @param value  - The value to test.
  */
inline def cq(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cq")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]

/**
  * Returns a unique id, sequentially generated from a global variable.
  */
inline def cr(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cr")().asInstanceOf[Double]

/**
  * Returns true if `value` is neither null nor undefined, else returns false.
  * @param value - The value to test.
  * @since 2.7.0
  */
inline def cs(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cs")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Returns true if `value` is an array (including typed arrays), else returns false.
  * @param value - The value to test.
  * @function
  */
inline def ct[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ct")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]

/**
  * Returns true if `value` is an object (excluding null), else returns false.
  * @param value - The value to test.
  * @since 2.7.0
  */
inline def cu(value: Any): /* is chart.js.chart.js/dist/chunks/helpers.core.AnyObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cu")(value.asInstanceOf[js.Any]).asInstanceOf[/* is chart.js.chart.js/dist/chunks/helpers.core.AnyObject */ Boolean]

/**
  * Returns `value` if finite, else returns `defaultValue`.
  * @param value - The value to return if defined.
  * @param defaultValue - The value to return if `value` is not finite.
  */
inline def cv(value: Any, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cv")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
  * Returns `value` if defined, else returns `defaultValue`.
  * @param value - The value to return if defined.
  * @param defaultValue - The value to return if `value` is undefined.
  */
inline def cw[T](value: T, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cw")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
inline def cw[T](value: Unit, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cw")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]

inline def cx(value: String, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cx")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def cx(value: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cx")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def cy(value: String, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cy")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def cy(value: Double, dimension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cy")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
  * Calls `fn` with the given `args` in the scope defined by `thisArg` and returns the
  * value returned by `fn`. If `fn` is not a function, this method returns undefined.
  * @param fn - The function to call.
  * @param args - The arguments with which `fn` should be called.
  * @param [thisArg] - The value of `this` provided for the call to `fn`.
  */
inline def cz[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("cz")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
inline def cz[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: T, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("cz")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
inline def cz[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any]): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("cz")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]
inline def cz[T /* <: js.ThisFunction1[/* this */ TA, /* repeated */ Any, R] */, TA, R](fn: Unit, args: js.Array[Any], thisArg: TA): js.UndefOr[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("cz")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R]]

/**
  * @namespace Chart.helpers
  */
/**
  * An empty function that can be used, for example, for optional callback.
  */
inline def n(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("n")().asInstanceOf[Unit]

inline def s: Defaults1 = ^.asInstanceOf[js.Dynamic].selectDynamic("s").asInstanceOf[Defaults1]

inline def u: Registry1 = ^.asInstanceOf[js.Dynamic].selectDynamic("u").asInstanceOf[Registry1]

type Align = "start" | "center" | "end"

type AnimationsSpec[TType /* <: ChartType */] = StringDictionary[false | (AnimationSpec[TType] & Fn[TType])]

type AnyObject = Record[String, Any]

type BarController = DatasetController1[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type BasicPlatform = BasePlatform

type BubbleController = DatasetController1[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type CategoryScale[O /* <: CategoryScaleOptions */] = Scale2[O]

type Chart = Chart2

type Chart1 = Chart2

type Chart3 = Chart2

type ChartComponentLike = ChartComponent | (js.Array[ChartComponent | (Plugin[ChartType, AnyObject])]) | StringDictionary[ChartComponent] | (Plugin[ChartType, AnyObject])

type ChartDataset[TType /* <: ChartType */, TData] = (DeepPartial[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinChartTypetypekeyChar[TType] */ js.Any]) & (ChartDatasetProperties[TType, TData])

type ChartDatasetCustomTypesPerDataset[TType /* <: ChartType */, TData] = (DeepPartial[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinChartTypetypekeyChar[TType] */ js.Any]) & (ChartDatasetPropertiesCustomTypesPerDataset[TType, TData])

type ChartEvent = ChartEvent1

type ChartItem = String | CanvasRenderingContext2D | HTMLCanvasElement | Canvas | (ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement])

type ChartMeta[TType /* <: ChartType */, TElement /* <: Element[AnyObject, AnyObject] */, TDatasetElement /* <: Element[AnyObject, AnyObject] */] = (DeepPartial[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinChartTypeChartTypeRe[TType] */ js.Any]) & (ChartMetaCommon[TElement, TDatasetElement])

type ChartOptions[TType /* <: ChartType */] = DeepPartial[
CoreChartOptions[TType] & ElementChartOptions[TType] & PluginChartOptions[TType] & DatasetChartOptions[TType] & ScaleChartOptions[TType] & (/* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js/dist/chunks/helpers.core.ChartTypeRegistry[TType]['chartOptions'] */ js.Any)]

type ChartType = "bar" | "line" | "scatter" | "bubble" | "pie" | "doughnut" | "polarArea" | "radar"

type Color = String | CanvasGradient | CanvasPattern

type CornerRadius = Double | PartialTRBLCorners

type DecimationAlgorithm = "lttb" | "min-max"

type DecimationOptions = LttbDecimationOptions | MinMaxDecimationOptions

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Function ? T : T extends std.Array<infer U> ? chart.js.chart.js/dist/chunks/helpers.core._DeepPartialArray<U> : T extends object ? chart.js.chart.js/dist/chunks/helpers.core._DeepPartialObject<T> : T | undefined
  }}}
  */
type DeepPartial[T] = T

type DeepPartialArray[T] = js.Array[DeepPartial[T]]

type DefaultDataPoint[TType /* <: ChartType */] = DistributiveArray[
/* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js/dist/chunks/helpers.core.ChartTypeRegistry[TType]['defaultDataPoint'] */ js.Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [unknown] ? std.Array<T> : never
  }}}
  */
type DistributiveArray[T] = js.Array[T]

type DomPlatform = BasePlatform

type DoughnutDataPoint = Double

type EasingFunction = /* keyof chart.js.anon.EaseInBack */ "linear" | "easeInQuad" | "easeOutQuad" | "easeInOutQuad" | "easeInCubic" | "easeOutCubic" | "easeInOutCubic" | "easeInQuart" | "easeOutQuart" | "easeInOutQuart" | "easeInQuint" | "easeOutQuint" | "easeInOutQuint" | "easeInSine" | "easeOutSine" | "easeInOutSine" | "easeInExpo" | "easeOutExpo" | "easeInOutExpo" | "easeInCirc" | "easeOutCirc" | "easeInOutCirc" | "easeInElastic" | "easeOutElastic" | "easeInOutElastic" | "easeInBack" | "easeOutBack" | "easeInOutBack" | "easeInBounce" | "easeOutBounce" | "easeInOutBounce"

type EmptyObject = Record[String, scala.Nothing]

type FillTarget = Double | String | Value | "start" | "end" | "origin" | "stack" | "shape" | Boolean

type InteractionAxis = "x" | "y" | "xy" | "r"

type InteractionMode = "index" | "dataset" | "point" | "nearest" | "x" | "y"

type InteractionModeFunction = js.Function4[
/* chart */ Chart4[ChartType, DefaultDataPoint[ChartType], Any], 
/* e */ ChartEvent1, 
/* options */ InteractionOptions, 
/* useFinalPosition */ js.UndefOr[Boolean], 
js.Array[InteractionItem]]

type LayoutPosition = "left" | "top" | "right" | "bottom" | "center" | "chartArea" | StringDictionary[Double]

type LineController = DatasetController1[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type LinearScale[O /* <: LinearScaleOptions */] = Scale2[O]

type LogarithmicScale[O /* <: LogarithmicScaleOptions */] = Scale2[O]

type Padding = PartialTRBL | Double | Point1

type ParsedDataType[TType /* <: ChartType */] = /* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js/dist/chunks/helpers.core.ChartTypeRegistry[TType]['parsedDataType'] */ js.Any

type PieAnimationOptions = DoughnutAnimationOptions

type PieController = DoughnutController

type PieControllerChartOptions = DoughnutControllerChartOptions

type PieControllerDatasetOptions = DoughnutControllerDatasetOptions

type PieDataPoint = DoughnutDataPoint

type PieMetaExtensions = DoughnutMetaExtensions

type Point = Point1

type PointProps = Point1

type PointStyle = "circle" | "cross" | "crossRot" | "dash" | "line" | "rect" | "rectRounded" | "rectRot" | "star" | "triangle" | HTMLImageElement | HTMLCanvasElement

type PolarAreaAnimationOptions = DoughnutAnimationOptions

type RadarController = DatasetController1[
ChartType, 
Element[AnyObject, AnyObject], 
Element[AnyObject, AnyObject], 
ParsedDataType[ChartType]]

type RadarControllerChartOptions = LineControllerChartOptions

type Scale = Scale1

// Convenience alias for creating and manipulating scale options in user code
type ScaleOptions[TScale /* <: ScaleType */] = DeepPartial[ScaleOptionsByType[TScale]]

type ScaleOptionsByType[TScale /* <: ScaleType */] = /* import warning: importer.ImportType#apply Failed type conversion: chart.js.anon.keyinScaleTypetypekeyScal[TScale] */ js.Any

type ScaleType = /* keyof chart.js.chart.js/dist/chunks/helpers.core.ScaleTypeRegistry */ "linear" | "logarithmic" | "category" | "time" | "timeseries" | "radialLinear"

type ScatterController = LineController

type ScatterControllerChartOptions = LineControllerChartOptions

type ScatterControllerDatasetOptions = LineControllerDatasetOptions

type ScatterDataPoint = Point1

type Scriptable[T, TContext] = T | (js.Function2[/* ctx */ TContext, /* options */ AnyObject, js.UndefOr[T]])

type ScriptableAndArray[T, TContext] = js.Array[T] | (Scriptable[T, TContext])

type ScriptableAndScriptableOptions[T, TContext] = (Scriptable[T, TContext]) | (ScriptableOptions[T, TContext])

type TextAlign = "left" | "center" | "right"

type TimeSeriesScale[O /* <: TimeScaleOptions */] = TimeScale[O]

/**
  * @namespace Chart._adapters
  * @since 2.8.0
  * @private
  */
type TimeUnit = "millisecond" | "second" | "minute" | "hour" | "day" | "week" | "month" | "quarter" | "year"

type TooltipPositioner = "average" | "nearest"

type TooltipPositionerFunction[TType /* <: ChartType */] = js.ThisFunction2[
/* this */ TooltipModel[TType], 
/* items */ js.Array[ActiveElement], 
/* eventPosition */ Point1, 
TooltipPosition | false]

type TooltipXAlignment = "left" | "center" | "right"

type TooltipYAlignment = "top" | "center" | "bottom"

type TransitionsSpec[TType /* <: ChartType */] = StringDictionary[TransitionSpec[TType]]

type UpdateMode = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpdateModeEnum * / any */ String

type UpdateModeEnum = "resize" | "reset" | "none" | "hide" | "show" | "normal" | "active"

type filterCallback = js.Function4[
/* value */ OptionsPlugin, 
/* index */ js.UndefOr[Double], 
/* array */ js.UndefOr[js.Array[Any]], 
/* thisArg */ js.UndefOr[js.Object], 
Boolean]
