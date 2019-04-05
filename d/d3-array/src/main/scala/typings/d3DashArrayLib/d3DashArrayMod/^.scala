package typings
package d3DashArrayLib.d3DashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val bisect: d3DashArrayLib.Anon_Array = js.native
  def ascending(): scala.Double = js.native
  def ascending(a: Primitive | js.UndefOr[scala.Nothing], b: Primitive): scala.Double = js.native
  def ascending(a: Primitive): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[java.lang.String], x: java.lang.String): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[java.lang.String], x: java.lang.String, lo: scala.Double): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[java.lang.String], x: java.lang.String, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[scala.Double], x: scala.Double): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[scala.Double], x: scala.Double, lo: scala.Double): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[scala.Double], x: scala.Double, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[stdLib.Date], x: stdLib.Date): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[stdLib.Date], x: stdLib.Date, lo: scala.Double): scala.Double = js.native
  def bisectLeft(array: stdLib.ArrayLike[stdLib.Date], x: stdLib.Date, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[java.lang.String], x: java.lang.String): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[java.lang.String], x: java.lang.String, lo: scala.Double): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[java.lang.String], x: java.lang.String, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[scala.Double], x: scala.Double): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[scala.Double], x: scala.Double, lo: scala.Double): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[scala.Double], x: scala.Double, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[stdLib.Date], x: stdLib.Date): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[stdLib.Date], x: stdLib.Date, lo: scala.Double): scala.Double = js.native
  def bisectRight(array: stdLib.ArrayLike[stdLib.Date], x: stdLib.Date, lo: scala.Double, hi: scala.Double): scala.Double = js.native
  def bisector[T, U](accessor: js.Function1[/* x */ T, U]): Bisector[T, U] = js.native
  def bisector[T, U](comparator: js.Function2[/* a */ T, /* b */ U, scala.Double]): Bisector[T, U] = js.native
  def cross[S, T](a: stdLib.Iterable[S], b: stdLib.Iterable[T]): js.Array[js.Tuple2[S, T]] = js.native
  def cross[S, T, U](a: stdLib.Iterable[S], b: stdLib.Iterable[T], reducer: js.Function2[/* a */ S, /* b */ T, U]): js.Array[U] = js.native
  def descending(): scala.Double = js.native
  def descending(a: Primitive | js.UndefOr[scala.Nothing], b: Primitive): scala.Double = js.native
  def descending(a: Primitive): scala.Double = js.native
  def deviation[T /* <: Numeric */](array: stdLib.Iterable[js.UndefOr[T | scala.Null]]): js.UndefOr[scala.Double] = js.native
  def deviation[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[scala.Double | scala.Null]
    ]
  ): js.UndefOr[scala.Double] = js.native
  def extent(array: stdLib.Iterable[java.lang.String]): (js.Tuple2[java.lang.String, java.lang.String]) | (js.Tuple2[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]) = js.native
  def extent[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[java.lang.String | scala.Null]
    ]
  ): (js.Tuple2[java.lang.String, java.lang.String]) | (js.Tuple2[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]) = js.native
  @JSName("extent")
  def extent_TNumeric[T /* <: Numeric */](array: stdLib.Iterable[T]): (js.Tuple2[T, T]) | (js.Tuple2[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]) = js.native
  @JSName("extent")
  def extent_TUNumeric[T, U /* <: Numeric */](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[U | scala.Null]
    ]
  ): (js.Tuple2[U, U]) | (js.Tuple2[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]) = js.native
  def group[TObject, TKey](a: stdLib.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): stdLib.Map[TKey, js.Array[TObject]] = js.native
  def histogram(): HistogramGeneratorNumber[scala.Double, scala.Double] = js.native
  @JSName("histogram")
  def histogram_DatumValueUndefOr[Datum, Value /* <: js.UndefOr[scala.Double] */](): HistogramGeneratorNumber[Datum, Value] = js.native
  @JSName("histogram")
  def histogram_DatumValueUndefOrHistogramGeneratorDate[Datum, Value /* <: js.UndefOr[stdLib.Date] */](): HistogramGeneratorDate[Datum, Value] = js.native
  def max(array: stdLib.Iterable[java.lang.String]): js.UndefOr[java.lang.String] = js.native
  def max[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[java.lang.String | scala.Null]
    ]
  ): js.UndefOr[java.lang.String] = js.native
  @JSName("max")
  def max_TNumeric[T /* <: Numeric */](array: stdLib.Iterable[T]): js.UndefOr[T] = js.native
  @JSName("max")
  def max_TUNumeric[T, U /* <: Numeric */](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[U | scala.Null]
    ]
  ): js.UndefOr[U] = js.native
  def mean[T /* <: Numeric */](array: stdLib.Iterable[js.UndefOr[T | scala.Null]]): js.UndefOr[scala.Double] = js.native
  def mean[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[scala.Double | scala.Null]
    ]
  ): js.UndefOr[scala.Double] = js.native
  def median[T /* <: Numeric */](array: stdLib.Iterable[js.UndefOr[T | scala.Null]]): js.UndefOr[scala.Double] = js.native
  def median[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* element */ T, 
      /* i */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[scala.Double | scala.Null]
    ]
  ): js.UndefOr[scala.Double] = js.native
  def merge[T](arrays: stdLib.Iterable[stdLib.Iterable[T]]): js.Array[T] = js.native
  def min(array: stdLib.Iterable[java.lang.String]): js.UndefOr[java.lang.String] = js.native
  def min[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[java.lang.String | scala.Null]
    ]
  ): js.UndefOr[java.lang.String] = js.native
  @JSName("min")
  def min_TNumeric[T /* <: Numeric */](array: stdLib.Iterable[T]): js.UndefOr[T] = js.native
  @JSName("min")
  def min_TUNumeric[T, U /* <: Numeric */](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[U | scala.Null]
    ]
  ): js.UndefOr[U] = js.native
  def pairs[T](array: stdLib.Iterable[T]): js.Array[js.Tuple2[T, T]] = js.native
  def pairs[T, U](array: stdLib.Iterable[T], reducer: js.Function2[/* a */ T, /* b */ T, U]): js.Array[U] = js.native
  def permute[T](array: org.scalablytyped.runtime.NumberDictionary[T], keys: stdLib.ArrayLike[scala.Double]): js.Array[T] = js.native
  def permute[T, K /* <: java.lang.String */](`object`: T, keys: stdLib.ArrayLike[K]): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def quantile[T /* <: Numeric */](array: stdLib.Iterable[js.UndefOr[T | scala.Null]], p: scala.Double): js.UndefOr[scala.Double] = js.native
  def quantile[T](
    array: stdLib.Iterable[T],
    p: scala.Double,
    accessor: js.Function3[
      /* element */ T, 
      /* i */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[scala.Double | scala.Null]
    ]
  ): js.UndefOr[scala.Double] = js.native
  def quickselect[T](array: stdLib.ArrayLike[T], k: scala.Double): js.Array[T] = js.native
  def quickselect[T](array: stdLib.ArrayLike[T], k: scala.Double, left: scala.Double): js.Array[T] = js.native
  def quickselect[T](array: stdLib.ArrayLike[T], k: scala.Double, left: scala.Double, right: scala.Double): js.Array[T] = js.native
  def quickselect[T](
    array: stdLib.ArrayLike[T],
    k: scala.Double,
    left: scala.Double,
    right: scala.Double,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], scala.Double]
  ): js.Array[T] = js.native
  def range(start: scala.Double, stop: scala.Double): js.Array[scala.Double] = js.native
  def range(start: scala.Double, stop: scala.Double, step: scala.Double): js.Array[scala.Double] = js.native
  def range(stop: scala.Double): js.Array[scala.Double] = js.native
  def rollup[TObject, TKey, TReduce](
    a: stdLib.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): stdLib.Map[TKey, TReduce] = js.native
  def scan(array: stdLib.Iterable[scala.Double]): js.UndefOr[scala.Double] = js.native
  def scan(
    array: stdLib.Iterable[scala.Double],
    comparator: js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]
  ): js.UndefOr[scala.Double] = js.native
  @JSName("scan")
  def scan_T[T](array: stdLib.Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.UndefOr[scala.Double] = js.native
  def shuffle(array: stdLib.Float32Array): stdLib.Float32Array = js.native
  def shuffle(array: stdLib.Float32Array, lo: scala.Double): stdLib.Float32Array = js.native
  def shuffle(array: stdLib.Float32Array, lo: scala.Double, hi: scala.Double): stdLib.Float32Array = js.native
  def shuffle(array: stdLib.Float64Array): stdLib.Float64Array = js.native
  def shuffle(array: stdLib.Float64Array, lo: scala.Double): stdLib.Float64Array = js.native
  def shuffle(array: stdLib.Float64Array, lo: scala.Double, hi: scala.Double): stdLib.Float64Array = js.native
  def shuffle(array: stdLib.Int16Array): stdLib.Int16Array = js.native
  def shuffle(array: stdLib.Int16Array, lo: scala.Double): stdLib.Int16Array = js.native
  def shuffle(array: stdLib.Int16Array, lo: scala.Double, hi: scala.Double): stdLib.Int16Array = js.native
  def shuffle(array: stdLib.Int32Array): stdLib.Int32Array = js.native
  def shuffle(array: stdLib.Int32Array, lo: scala.Double): stdLib.Int32Array = js.native
  def shuffle(array: stdLib.Int32Array, lo: scala.Double, hi: scala.Double): stdLib.Int32Array = js.native
  def shuffle(array: stdLib.Int8Array): stdLib.Int8Array = js.native
  def shuffle(array: stdLib.Int8Array, lo: scala.Double): stdLib.Int8Array = js.native
  def shuffle(array: stdLib.Int8Array, lo: scala.Double, hi: scala.Double): stdLib.Int8Array = js.native
  def shuffle(array: stdLib.Uint16Array): stdLib.Uint16Array = js.native
  def shuffle(array: stdLib.Uint16Array, lo: scala.Double): stdLib.Uint16Array = js.native
  def shuffle(array: stdLib.Uint16Array, lo: scala.Double, hi: scala.Double): stdLib.Uint16Array = js.native
  def shuffle(array: stdLib.Uint32Array): stdLib.Uint32Array = js.native
  def shuffle(array: stdLib.Uint32Array, lo: scala.Double): stdLib.Uint32Array = js.native
  def shuffle(array: stdLib.Uint32Array, lo: scala.Double, hi: scala.Double): stdLib.Uint32Array = js.native
  def shuffle(array: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def shuffle(array: stdLib.Uint8Array, lo: scala.Double): stdLib.Uint8Array = js.native
  def shuffle(array: stdLib.Uint8Array, lo: scala.Double, hi: scala.Double): stdLib.Uint8Array = js.native
  def shuffle(array: stdLib.Uint8ClampedArray): stdLib.Uint8ClampedArray = js.native
  def shuffle(array: stdLib.Uint8ClampedArray, lo: scala.Double): stdLib.Uint8ClampedArray = js.native
  def shuffle(array: stdLib.Uint8ClampedArray, lo: scala.Double, hi: scala.Double): stdLib.Uint8ClampedArray = js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  def shuffle[T](array: js.Array[T], lo: scala.Double): js.Array[T] = js.native
  def shuffle[T](array: js.Array[T], lo: scala.Double, hi: scala.Double): js.Array[T] = js.native
  def sum[T /* <: Numeric */](array: stdLib.Iterable[js.UndefOr[T | scala.Null]]): scala.Double = js.native
  def sum[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[scala.Double | scala.Null]
    ]
  ): scala.Double = js.native
  def thresholdFreedmanDiaconis(values: stdLib.ArrayLike[js.UndefOr[scala.Double]], min: scala.Double, max: scala.Double): scala.Double = js.native
  def thresholdScott(values: stdLib.ArrayLike[js.UndefOr[scala.Double]], min: scala.Double, max: scala.Double): scala.Double = js.native
  def thresholdSturges(values: stdLib.ArrayLike[js.UndefOr[scala.Double]]): scala.Double = js.native
  def tickIncrement(start: scala.Double, stop: scala.Double, count: scala.Double): scala.Double = js.native
  def tickStep(start: scala.Double, stop: scala.Double, count: scala.Double): scala.Double = js.native
  def ticks(start: scala.Double, stop: scala.Double, count: scala.Double): js.Array[scala.Double] = js.native
  def transpose[T](matrix: stdLib.ArrayLike[stdLib.ArrayLike[T]]): js.Array[js.Array[T]] = js.native
  def variance[T /* <: Numeric */](array: stdLib.Iterable[js.UndefOr[T | scala.Null]]): js.UndefOr[scala.Double] = js.native
  def variance[T](
    array: stdLib.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ scala.Double, 
      /* array */ stdLib.Iterable[T], 
      js.UndefOr[scala.Double | scala.Null]
    ]
  ): js.UndefOr[scala.Double] = js.native
  def zip[T](arrays: stdLib.ArrayLike[T]*): js.Array[js.Array[T]] = js.native
}

