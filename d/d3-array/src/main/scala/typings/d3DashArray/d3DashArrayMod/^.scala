package typings.d3DashArray.d3DashArrayMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.ArrayLike
import typings.std.Date
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Iterable
import typings.std.Map
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ascending(): Double = js.native
  def ascending(a: js.UndefOr[Primitive], b: Primitive): Double = js.native
  def ascending(a: Primitive): Double = js.native
  def bisectLeft(array: ArrayLike[String], x: String): Double = js.native
  def bisectLeft(array: ArrayLike[String], x: String, lo: Double): Double = js.native
  def bisectLeft(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = js.native
  def bisectLeft(array: ArrayLike[Double], x: Double): Double = js.native
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double): Double = js.native
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = js.native
  def bisectLeft(array: ArrayLike[Date], x: Date): Double = js.native
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: Double): Double = js.native
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = js.native
  def bisectRight(array: ArrayLike[String], x: String): Double = js.native
  def bisectRight(array: ArrayLike[String], x: String, lo: Double): Double = js.native
  def bisectRight(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = js.native
  def bisectRight(array: ArrayLike[Double], x: Double): Double = js.native
  def bisectRight(array: ArrayLike[Double], x: Double, lo: Double): Double = js.native
  def bisectRight(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = js.native
  def bisectRight(array: ArrayLike[Date], x: Date): Double = js.native
  def bisectRight(array: ArrayLike[Date], x: Date, lo: Double): Double = js.native
  def bisectRight(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = js.native
  def bisector[T, U](accessor: js.Function1[/* x */ T, U]): Bisector[T, U] = js.native
  def bisector[T, U](comparator: js.Function2[/* a */ T, /* b */ U, Double]): Bisector[T, U] = js.native
  def cross[S, T](a: Iterable[S], b: Iterable[T]): js.Array[js.Tuple2[S, T]] = js.native
  def cross[S, T, U](a: Iterable[S], b: Iterable[T], reducer: js.Function2[/* a */ S, /* b */ T, U]): js.Array[U] = js.native
  def descending(): Double = js.native
  def descending(a: js.UndefOr[Primitive], b: Primitive): Double = js.native
  def descending(a: Primitive): Double = js.native
  def deviation[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  def deviation[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  def extent(array: Iterable[String]): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  def extent[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  @JSName("extent")
  def extent_TU_Numeric[T, U /* <: Numeric */](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.Tuple2[js.UndefOr[U], js.UndefOr[U]] = js.native
  @JSName("extent")
  def extent_T_Numeric[T /* <: Numeric */](array: Iterable[T]): js.Tuple2[js.UndefOr[T], js.UndefOr[T]] = js.native
  def group[TObject, TKey](a: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, js.Array[TObject]] = js.native
  def histogram(): HistogramGeneratorNumber[Double, Double] = js.native
  @JSName("histogram")
  def `histogram_DatumValue_UnionDatejs.undefinedNothing_HistogramGeneratorDate`[Datum, Value /* <: js.UndefOr[Date] */](): HistogramGeneratorDate[Datum, Value] = js.native
  @JSName("histogram")
  def `histogram_DatumValue_UnionDoublejs.undefinedNothing`[Datum, Value /* <: js.UndefOr[Double] */](): HistogramGeneratorNumber[Datum, Value] = js.native
  def max(array: Iterable[String]): js.UndefOr[String] = js.native
  def max[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.UndefOr[String] = js.native
  @JSName("max")
  def max_TU_Numeric[T, U /* <: Numeric */](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = js.native
  @JSName("max")
  def max_T_Numeric[T /* <: Numeric */](array: Iterable[T]): js.UndefOr[T] = js.native
  def mean[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  def mean[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  def median[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  def median[T](
    array: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  def merge[T](arrays: Iterable[Iterable[T]]): js.Array[T] = js.native
  def min(array: Iterable[String]): js.UndefOr[String] = js.native
  def min[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.UndefOr[String] = js.native
  @JSName("min")
  def min_TU_Numeric[T, U /* <: Numeric */](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = js.native
  @JSName("min")
  def min_T_Numeric[T /* <: Numeric */](array: Iterable[T]): js.UndefOr[T] = js.native
  def pairs[T](array: Iterable[T]): js.Array[js.Tuple2[T, T]] = js.native
  def pairs[T, U](array: Iterable[T], reducer: js.Function2[/* a */ T, /* b */ T, U]): js.Array[U] = js.native
  def permute[T](array: NumberDictionary[T], keys: ArrayLike[Double]): js.Array[T] = js.native
  def permute[T, K /* <: String */](`object`: T, keys: ArrayLike[K]): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def quantile[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = js.native
  def quantile[T](
    array: Iterable[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  def quickselect[T](array: ArrayLike[T], k: Double): js.Array[T] = js.native
  def quickselect[T](array: ArrayLike[T], k: Double, left: Double): js.Array[T] = js.native
  def quickselect[T](array: ArrayLike[T], k: Double, left: Double, right: Double): js.Array[T] = js.native
  def quickselect[T](
    array: ArrayLike[T],
    k: Double,
    left: Double,
    right: Double,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = js.native
  def range(start: Double, stop: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
  def range(stop: Double): js.Array[Double] = js.native
  def rollup[TObject, TKey, TReduce](
    a: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): Map[TKey, TReduce] = js.native
  def scan(array: Iterable[Double]): js.UndefOr[Double] = js.native
  def scan(array: Iterable[Double], comparator: js.Function2[/* a */ Double, /* b */ Double, Double]): js.UndefOr[Double] = js.native
  @JSName("scan")
  def scan_T[T](array: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = js.native
  def shuffle(array: Float32Array): Float32Array = js.native
  def shuffle(array: Float32Array, lo: Double): Float32Array = js.native
  def shuffle(array: Float32Array, lo: Double, hi: Double): Float32Array = js.native
  def shuffle(array: Float64Array): Float64Array = js.native
  def shuffle(array: Float64Array, lo: Double): Float64Array = js.native
  def shuffle(array: Float64Array, lo: Double, hi: Double): Float64Array = js.native
  def shuffle(array: Int16Array): Int16Array = js.native
  def shuffle(array: Int16Array, lo: Double): Int16Array = js.native
  def shuffle(array: Int16Array, lo: Double, hi: Double): Int16Array = js.native
  def shuffle(array: Int32Array): Int32Array = js.native
  def shuffle(array: Int32Array, lo: Double): Int32Array = js.native
  def shuffle(array: Int32Array, lo: Double, hi: Double): Int32Array = js.native
  def shuffle(array: Int8Array): Int8Array = js.native
  def shuffle(array: Int8Array, lo: Double): Int8Array = js.native
  def shuffle(array: Int8Array, lo: Double, hi: Double): Int8Array = js.native
  def shuffle(array: Uint16Array): Uint16Array = js.native
  def shuffle(array: Uint16Array, lo: Double): Uint16Array = js.native
  def shuffle(array: Uint16Array, lo: Double, hi: Double): Uint16Array = js.native
  def shuffle(array: Uint32Array): Uint32Array = js.native
  def shuffle(array: Uint32Array, lo: Double): Uint32Array = js.native
  def shuffle(array: Uint32Array, lo: Double, hi: Double): Uint32Array = js.native
  def shuffle(array: Uint8Array): Uint8Array = js.native
  def shuffle(array: Uint8Array, lo: Double): Uint8Array = js.native
  def shuffle(array: Uint8Array, lo: Double, hi: Double): Uint8Array = js.native
  def shuffle(array: Uint8ClampedArray): Uint8ClampedArray = js.native
  def shuffle(array: Uint8ClampedArray, lo: Double): Uint8ClampedArray = js.native
  def shuffle(array: Uint8ClampedArray, lo: Double, hi: Double): Uint8ClampedArray = js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  def shuffle[T](array: js.Array[T], lo: Double): js.Array[T] = js.native
  def shuffle[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  def sum[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): Double = js.native
  def sum[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Double = js.native
  def thresholdFreedmanDiaconis(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = js.native
  def thresholdScott(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = js.native
  def thresholdSturges(values: ArrayLike[js.UndefOr[Double]]): Double = js.native
  def tickIncrement(start: Double, stop: Double, count: Double): Double = js.native
  def tickStep(start: Double, stop: Double, count: Double): Double = js.native
  def ticks(start: Double, stop: Double, count: Double): js.Array[Double] = js.native
  def transpose[T](matrix: ArrayLike[ArrayLike[T]]): js.Array[js.Array[T]] = js.native
  def variance[T /* <: Numeric */](array: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  def variance[T](
    array: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  def zip[T](arrays: ArrayLike[T]*): js.Array[js.Array[T]] = js.native
}

