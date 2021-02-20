package typings.d3Array

import org.scalablytyped.runtime.NumberDictionary
import typings.d3Array.anon.FnCall
import typings.std.Array
import typings.std.ArrayLike
import typings.std.Date
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Iterable
import typings.std.Map
import typings.std.Set
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-array", "Adder")
  @js.native
  /**
    * Creates a full precision adder for IEEE 754 floating point numbers, setting its initial value to 0.
    */
  class Adder () extends StObject {
    
    /**
      * Adds the specified number to the adder’s current value and returns the adder.
      */
    def add(number: Double): Adder = js.native
  }
  
  @JSImport("d3-array", "ascending")
  @js.native
  def ascending(): Double = js.native
  @JSImport("d3-array", "ascending")
  @js.native
  def ascending(a: js.UndefOr[Primitive], b: Primitive): Double = js.native
  @JSImport("d3-array", "ascending")
  @js.native
  def ascending(a: Primitive): Double = js.native
  
  @JSImport("d3-array", "bin")
  @js.native
  def bin(): HistogramGeneratorNumber[Double, Double] = js.native
  
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[String], x: String): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[String], x: String, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[String], x: String, lo: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Double], x: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Double], x: Double, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Double], x: Double, lo: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Date], x: Date): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Date], x: Date, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Date], x: Date, lo: Double): Double = js.native
  @JSImport("d3-array", "bisect")
  @js.native
  def bisect(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = js.native
  
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[String], x: String): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[String], x: String, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[String], x: String, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Double], x: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Double], x: Double, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Double], x: Double, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Date], x: Date): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Date], x: Date, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Date], x: Date, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectCenter")
  @js.native
  def bisectCenter(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = js.native
  
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[String], x: String): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[String], x: String, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[String], x: String, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Double], x: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Date], x: Date): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectLeft")
  @js.native
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = js.native
  
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[String], x: String): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[String], x: String, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[String], x: String, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Double], x: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Double], x: Double, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Double], x: Double, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Date], x: Date): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Date], x: Date, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Date], x: Date, lo: Double): Double = js.native
  @JSImport("d3-array", "bisectRight")
  @js.native
  def bisectRight(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = js.native
  
  @JSImport("d3-array", "bisector")
  @js.native
  def bisector[T, U](accessor: js.Function1[/* x */ T, U]): Bisector_[T, U] = js.native
  @JSImport("d3-array", "bisector")
  @js.native
  def bisector[T, U](comparator: js.Function2[/* a */ T, /* b */ U, Double]): Bisector_[T, U] = js.native
  
  @JSImport("d3-array", "count")
  @js.native
  def count[TObject](iterable: Iterable[TObject]): Double = js.native
  @JSImport("d3-array", "count")
  @js.native
  def count[TObject](
    iterable: Iterable[TObject],
    accessor: js.Function2[/* a */ TObject, /* b */ TObject, js.UndefOr[Double | Null]]
  ): Double = js.native
  
  @JSImport("d3-array", "cross")
  @js.native
  def cross[S, T](a: Iterable[S], b: Iterable[T]): js.Array[js.Tuple2[S, T]] = js.native
  @JSImport("d3-array", "cross")
  @js.native
  def cross[S, T, U](a: Iterable[S], b: Iterable[T], reducer: js.Function2[/* a */ S, /* b */ T, U]): js.Array[U] = js.native
  
  @JSImport("d3-array", "cumsum")
  @js.native
  def cumsum[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): Float64Array = js.native
  @JSImport("d3-array", "cumsum")
  @js.native
  def cumsum[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Float64Array = js.native
  
  @JSImport("d3-array", "descending")
  @js.native
  def descending(): Double = js.native
  @JSImport("d3-array", "descending")
  @js.native
  def descending(a: js.UndefOr[Primitive], b: Primitive): Double = js.native
  @JSImport("d3-array", "descending")
  @js.native
  def descending(a: Primitive): Double = js.native
  
  @JSImport("d3-array", "deviation")
  @js.native
  def deviation[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "deviation")
  @js.native
  def deviation[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "difference")
  @js.native
  def difference[T](iterable: Iterable[T], others: Iterable[T]*): Set[T] = js.native
  
  @JSImport("d3-array", "disjoint")
  @js.native
  def disjoint[T](a: Iterable[T], b: Iterable[T]): Boolean = js.native
  
  @JSImport("d3-array", "every")
  @js.native
  def every[T](
    iterable: Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], _]
  ): Boolean = js.native
  
  @JSImport("d3-array", "extent")
  @js.native
  def extent(iterable: Iterable[String]): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  @JSImport("d3-array", "extent")
  @js.native
  def extent[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  @JSImport("d3-array", "extent")
  @js.native
  def extent_TU_Numeric[T, U /* <: Numeric */](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.Tuple2[js.UndefOr[U], js.UndefOr[U]] = js.native
  @JSImport("d3-array", "extent")
  @js.native
  def extent_T_Numeric[T /* <: Numeric */](iterable: Iterable[T]): js.Tuple2[js.UndefOr[T], js.UndefOr[T]] = js.native
  
  @JSImport("d3-array", "filter")
  @js.native
  def filter[T](
    iterable: Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], _]
  ): js.Array[T] = js.native
  
  @JSImport("d3-array", "fsum")
  @js.native
  def fsum[T /* <: Numeric */](values: Iterable[js.UndefOr[T | Null]]): Double = js.native
  @JSImport("d3-array", "fsum")
  @js.native
  def fsum[T](
    values: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Double = js.native
  
  @JSImport("d3-array", "greatest")
  @js.native
  def greatest[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  @JSImport("d3-array", "greatest")
  @js.native
  def greatest[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[T] = js.native
  @JSImport("d3-array", "greatest")
  @js.native
  def greatest[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[T] = js.native
  
  @JSImport("d3-array", "greatestIndex")
  @js.native
  def greatestIndex[T](iterable: Iterable[T]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "greatestIndex")
  @js.native
  def greatestIndex[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "greatestIndex")
  @js.native
  def greatestIndex[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "group")
  @js.native
  def group[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, js.Array[TObject]] = js.native
  @JSImport("d3-array", "group")
  @js.native
  def group[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, js.Array[TObject]]] = js.native
  @JSImport("d3-array", "group")
  @js.native
  def group[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, js.Array[TObject]]]] = js.native
  
  @JSImport("d3-array", "groups")
  @js.native
  def groups[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, js.Array[TObject]]] = js.native
  @JSImport("d3-array", "groups")
  @js.native
  def groups[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[TObject]]]]] = js.native
  @JSImport("d3-array", "groups")
  @js.native
  def groups[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, js.Array[TObject]]]]]]
  ] = js.native
  
  @JSImport("d3-array", "histogram")
  @js.native
  def histogram(): HistogramGeneratorNumber[Double, Double] = js.native
  
  @JSImport("d3-array", "index")
  @js.native
  def index[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, TObject] = js.native
  @JSImport("d3-array", "index")
  @js.native
  def index[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, TObject]] = js.native
  @JSImport("d3-array", "index")
  @js.native
  def index[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, TObject]]] = js.native
  
  @JSImport("d3-array", "indexes")
  @js.native
  def indexes[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, TObject]] = js.native
  @JSImport("d3-array", "indexes")
  @js.native
  def indexes[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TObject]]]] = js.native
  @JSImport("d3-array", "indexes")
  @js.native
  def indexes[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TObject]]]]]
  ] = js.native
  
  @JSImport("d3-array", "intersection")
  @js.native
  def intersection[T](iterables: Iterable[T]*): Set[T] = js.native
  
  @JSImport("d3-array", "least")
  @js.native
  def least[T](iterable: Iterable[T]): js.UndefOr[T] = js.native
  @JSImport("d3-array", "least")
  @js.native
  def least[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[T] = js.native
  @JSImport("d3-array", "least")
  @js.native
  def least[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[T] = js.native
  
  @JSImport("d3-array", "leastIndex")
  @js.native
  def leastIndex[T](iterable: Iterable[T]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "leastIndex")
  @js.native
  def leastIndex[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "leastIndex")
  @js.native
  def leastIndex[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "map")
  @js.native
  def map[T, U](
    iterable: Iterable[T],
    mapper: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], U]
  ): js.Array[U] = js.native
  
  @JSImport("d3-array", "max")
  @js.native
  def max(iterable: Iterable[String]): js.UndefOr[String] = js.native
  @JSImport("d3-array", "max")
  @js.native
  def max[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.UndefOr[String] = js.native
  
  @JSImport("d3-array", "maxIndex")
  @js.native
  def maxIndex[T](iterable: Iterable[T]): Double = js.native
  @JSImport("d3-array", "maxIndex")
  @js.native
  def maxIndex[TDatum, U](
    iterable: Iterable[TDatum],
    accessor: js.Function3[
      /* datum */ TDatum, 
      /* index */ Double, 
      /* array */ Iterable[TDatum], 
      js.UndefOr[U | Null]
    ]
  ): Double = js.native
  
  @JSImport("d3-array", "max")
  @js.native
  def max_TU_Numeric[T, U /* <: Numeric */](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = js.native
  @JSImport("d3-array", "max")
  @js.native
  def max_T_Numeric[T /* <: Numeric */](iterable: Iterable[T]): js.UndefOr[T] = js.native
  
  @JSImport("d3-array", "mean")
  @js.native
  def mean[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "mean")
  @js.native
  def mean[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "median")
  @js.native
  def median[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "median")
  @js.native
  def median[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "merge")
  @js.native
  def merge[T](iterables: Iterable[Iterable[T]]): js.Array[T] = js.native
  
  @JSImport("d3-array", "min")
  @js.native
  def min(iterable: Iterable[String]): js.UndefOr[String] = js.native
  @JSImport("d3-array", "min")
  @js.native
  def min[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.UndefOr[String] = js.native
  
  @JSImport("d3-array", "minIndex")
  @js.native
  def minIndex[T](iterable: Iterable[T]): Double = js.native
  @JSImport("d3-array", "minIndex")
  @js.native
  def minIndex[TDatum, U](
    iterable: Iterable[TDatum],
    accessor: js.Function3[
      /* datum */ TDatum, 
      /* index */ Double, 
      /* array */ Iterable[TDatum], 
      js.UndefOr[U | Null]
    ]
  ): Double = js.native
  
  @JSImport("d3-array", "min")
  @js.native
  def min_TU_Numeric[T, U /* <: Numeric */](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = js.native
  @JSImport("d3-array", "min")
  @js.native
  def min_T_Numeric[T /* <: Numeric */](iterable: Iterable[T]): js.UndefOr[T] = js.native
  
  @JSImport("d3-array", "nice")
  @js.native
  def nice(start: Double, stop: Double, count: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("d3-array", "pairs")
  @js.native
  def pairs[T](iterable: Iterable[T]): js.Array[js.Tuple2[T, T]] = js.native
  @JSImport("d3-array", "pairs")
  @js.native
  def pairs[T, U](iterable: Iterable[T], reducer: js.Function2[/* a */ T, /* b */ T, U]): js.Array[U] = js.native
  
  @JSImport("d3-array", "permute")
  @js.native
  def permute[T](source: NumberDictionary[T], keys: Iterable[Double]): js.Array[T] = js.native
  @JSImport("d3-array", "permute")
  @js.native
  def permute[T, K /* <: /* keyof T */ String */](source: T, keys: Iterable[K]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  @JSImport("d3-array", "quantile")
  @js.native
  def quantile[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "quantile")
  @js.native
  def quantile[T](
    iterable: Iterable[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "quantileSorted")
  @js.native
  def quantileSorted[T /* <: Numeric */](array: js.Array[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "quantileSorted")
  @js.native
  def quantileSorted[T](
    array: js.Array[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Array[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "quickselect")
  @js.native
  def quickselect[T](array: ArrayLike[T], k: Double): js.Array[T] = js.native
  @JSImport("d3-array", "quickselect")
  @js.native
  def quickselect[T](array: ArrayLike[T], k: Double, left: Double): js.Array[T] = js.native
  @JSImport("d3-array", "quickselect")
  @js.native
  def quickselect[T](array: ArrayLike[T], k: Double, left: Double, right: Double): js.Array[T] = js.native
  @JSImport("d3-array", "quickselect")
  @js.native
  def quickselect[T](
    array: ArrayLike[T],
    k: Double,
    left: Double,
    right: Double,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = js.native
  
  @JSImport("d3-array", "range")
  @js.native
  def range(start: Double, stop: Double): js.Array[Double] = js.native
  @JSImport("d3-array", "range")
  @js.native
  def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
  @JSImport("d3-array", "range")
  @js.native
  def range(stop: Double): js.Array[Double] = js.native
  
  @JSImport("d3-array", "reduce")
  @js.native
  def reduce[T](
    iterable: Iterable[T],
    reducer: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ Iterable[T], 
      T
    ]
  ): T = js.native
  @JSImport("d3-array", "reduce")
  @js.native
  def reduce[T](
    iterable: Iterable[T],
    reducer: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ Iterable[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  @JSImport("d3-array", "reduce")
  @js.native
  def reduce_TU_U[T, U](
    iterable: Iterable[T],
    reducer: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ Iterable[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  
  @JSImport("d3-array", "reverse")
  @js.native
  def reverse[T](iterable: Iterable[T]): js.Array[T] = js.native
  
  @JSImport("d3-array", "rollup")
  @js.native
  def rollup[TObject, TReduce, TKey](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): Map[TKey, TReduce] = js.native
  @JSImport("d3-array", "rollup")
  @js.native
  def rollup[TObject, TReduce, TKey1, TKey2](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, TReduce]] = js.native
  @JSImport("d3-array", "rollup")
  @js.native
  def rollup[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, TReduce]]] = js.native
  
  @JSImport("d3-array", "rollups")
  @js.native
  def rollups[TObject, TReduce, TKey](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): js.Array[js.Tuple2[TKey, TReduce]] = js.native
  @JSImport("d3-array", "rollups")
  @js.native
  def rollups[TObject, TReduce, TKey1, TKey2](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TReduce]]]] = js.native
  @JSImport("d3-array", "rollups")
  @js.native
  def rollups[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TReduce]]]]]
  ] = js.native
  
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float32Array): Float32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float32Array, lo: js.UndefOr[scala.Nothing], hi: Double): Float32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float32Array, lo: Double): Float32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float32Array, lo: Double, hi: Double): Float32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float64Array): Float64Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float64Array, lo: js.UndefOr[scala.Nothing], hi: Double): Float64Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float64Array, lo: Double): Float64Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Float64Array, lo: Double, hi: Double): Float64Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int16Array): Int16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int16Array, lo: js.UndefOr[scala.Nothing], hi: Double): Int16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int16Array, lo: Double): Int16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int16Array, lo: Double, hi: Double): Int16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int32Array): Int32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int32Array, lo: js.UndefOr[scala.Nothing], hi: Double): Int32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int32Array, lo: Double): Int32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int32Array, lo: Double, hi: Double): Int32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int8Array): Int8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int8Array, lo: js.UndefOr[scala.Nothing], hi: Double): Int8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int8Array, lo: Double): Int8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Int8Array, lo: Double, hi: Double): Int8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint16Array): Uint16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint16Array, lo: js.UndefOr[scala.Nothing], hi: Double): Uint16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint16Array, lo: Double): Uint16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint16Array, lo: Double, hi: Double): Uint16Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint32Array): Uint32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint32Array, lo: js.UndefOr[scala.Nothing], hi: Double): Uint32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint32Array, lo: Double): Uint32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint32Array, lo: Double, hi: Double): Uint32Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8Array): Uint8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8Array, lo: js.UndefOr[scala.Nothing], hi: Double): Uint8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8Array, lo: Double): Uint8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8Array, lo: Double, hi: Double): Uint8Array = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8ClampedArray): Uint8ClampedArray = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8ClampedArray, lo: js.UndefOr[scala.Nothing], hi: Double): Uint8ClampedArray = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8ClampedArray, lo: Double): Uint8ClampedArray = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle(array: Uint8ClampedArray, lo: Double, hi: Double): Uint8ClampedArray = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle[T](array: js.Array[T], lo: js.UndefOr[scala.Nothing], hi: Double): js.Array[T] = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle[T](array: js.Array[T], lo: Double): js.Array[T] = js.native
  @JSImport("d3-array", "shuffle")
  @js.native
  def shuffle[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = js.native
  
  @JSImport("d3-array", "shuffler")
  @js.native
  def shuffler(random: js.Function0[Double]): FnCall = js.native
  
  @JSImport("d3-array", "some")
  @js.native
  def some[T](
    iterable: Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], _]
  ): Boolean = js.native
  
  @JSImport("d3-array", "sort")
  @js.native
  def sort[T](iterable: Iterable[T]): js.Array[T] = js.native
  @JSImport("d3-array", "sort")
  @js.native
  def sort[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
  
  @JSImport("d3-array", "subset")
  @js.native
  def subset[T](a: Iterable[T], b: Iterable[T]): Boolean = js.native
  
  @JSImport("d3-array", "sum")
  @js.native
  def sum[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): Double = js.native
  @JSImport("d3-array", "sum")
  @js.native
  def sum[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Double = js.native
  
  @JSImport("d3-array", "superset")
  @js.native
  def superset[T](a: Iterable[T], b: Iterable[T]): Boolean = js.native
  
  @JSImport("d3-array", "thresholdFreedmanDiaconis")
  @js.native
  def thresholdFreedmanDiaconis(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = js.native
  
  @JSImport("d3-array", "thresholdScott")
  @js.native
  def thresholdScott(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = js.native
  
  @JSImport("d3-array", "thresholdSturges")
  @js.native
  def thresholdSturges(values: ArrayLike[js.UndefOr[Double]]): Double = js.native
  
  @JSImport("d3-array", "tickIncrement")
  @js.native
  def tickIncrement(start: Double, stop: Double, count: Double): Double = js.native
  
  @JSImport("d3-array", "tickStep")
  @js.native
  def tickStep(start: Double, stop: Double, count: Double): Double = js.native
  
  @JSImport("d3-array", "ticks")
  @js.native
  def ticks(start: Double, stop: Double, count: Double): js.Array[Double] = js.native
  
  @JSImport("d3-array", "transpose")
  @js.native
  def transpose[T](matrix: ArrayLike[ArrayLike[T]]): js.Array[js.Array[T]] = js.native
  
  @JSImport("d3-array", "union")
  @js.native
  def union[T](iterables: Iterable[T]*): Set[T] = js.native
  
  @JSImport("d3-array", "variance")
  @js.native
  def variance[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  @JSImport("d3-array", "variance")
  @js.native
  def variance[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
  
  @JSImport("d3-array", "zip")
  @js.native
  def zip[T](arrays: ArrayLike[T]*): js.Array[js.Array[T]] = js.native
  
  @js.native
  trait Bin_[Datum, Value /* <: js.UndefOr[Double | Date] */] extends Array[Datum] {
    
    var x0: js.UndefOr[Value] = js.native
    
    var x1: js.UndefOr[Value] = js.native
  }
  
  @js.native
  trait Bisector_[T, U] extends StObject {
    
    def center(array: ArrayLike[T], x: U): Double = js.native
    def center(array: ArrayLike[T], x: U, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
    def center(array: ArrayLike[T], x: U, lo: Double): Double = js.native
    def center(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
    
    def left(array: ArrayLike[T], x: U): Double = js.native
    def left(array: ArrayLike[T], x: U, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
    def left(array: ArrayLike[T], x: U, lo: Double): Double = js.native
    def left(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
    
    def right(array: ArrayLike[T], x: U): Double = js.native
    def right(array: ArrayLike[T], x: U, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
    def right(array: ArrayLike[T], x: U, lo: Double): Double = js.native
    def right(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
  }
  
  @js.native
  trait HistogramCommon[Datum, Value /* <: js.UndefOr[Double | Date] */] extends StObject {
    
    def apply(data: ArrayLike[Datum]): js.Array[Bin_[Datum, Value]] = js.native
    
    def value(): js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value] = js.native
    def value(valueAccessor: js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value]): this.type = js.native
  }
  
  @js.native
  trait HistogramGeneratorDate[Datum, Value /* <: js.UndefOr[Date] */] extends HistogramCommon[Datum, Date] {
    
    def domain(): js.Function1[/* values */ ArrayLike[Value], js.Tuple2[Date, Date]] = js.native
    def domain(domainAccessor: js.Function1[/* values */ ArrayLike[Value], js.Tuple2[Date, Date]]): this.type = js.native
    def domain(domain: js.Tuple2[Date, Date]): this.type = js.native
    
    def thresholds(): ThresholdDateArrayGenerator[Value] = js.native
    /**
      * Set a threshold accessor function, which returns the array of values to be used as
      * thresholds in determining the bins.
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param thresholds A function which accepts as arguments the array of materialized values, and
      * optionally the domain minimum and maximum. The function calculates and returns the array of values to be used as
      * thresholds in determining the bins.
      */
    def thresholds(thresholds: ThresholdDateArrayGenerator[Value]): this.type = js.native
    /**
      * Set the array of values to be used as thresholds in determining the bins.
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param thresholds Array of threshold values used for binning. The elements must
      * be of the same type as the materialized values of the histogram.
      */
    def thresholds(thresholds: ArrayLike[Value]): this.type = js.native
  }
  
  @js.native
  trait HistogramGeneratorNumber[Datum, Value /* <: js.UndefOr[Double] */] extends HistogramCommon[Datum, Value] {
    
    def domain(): js.Function1[/* values */ Iterable[Value], js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]] = js.native
    def domain(
      domainAccessor: js.Function1[/* values */ Iterable[Value], js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]]
    ): this.type = js.native
    def domain(domain: js.Tuple2[Double, Double]): this.type = js.native
    
    def thresholds(): ThresholdCountGenerator[Value] | ThresholdNumberArrayGenerator[Value] = js.native
    /**
      * Set a threshold accessor function, which returns the desired number of bins.
      * Divides the domain uniformly into approximately count bins. IMPORTANT: This threshold
      * setting approach only works, when the materialized values are numbers!
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param count A function which accepts as arguments the array of materialized values, and
      * optionally the domain minimum and maximum. The function calculates and returns the suggested
      * number of bins.
      */
    /**
      * Set a threshold accessor function, which returns the array of values to be used as
      * thresholds in determining the bins.
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param thresholds A function which accepts as arguments the array of materialized values, and
      * optionally the domain minimum and maximum. The function calculates and returns the array of values to be used as
      * thresholds in determining the bins.
      */
    def thresholds(count: ThresholdCountGenerator[Value] | ThresholdNumberArrayGenerator[Value]): this.type = js.native
    /**
      * Divide the domain uniformly into approximately count bins. IMPORTANT: This threshold
      * setting approach only works, when the materialized values are numbers!
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param count The desired number of uniform bins.
      */
    def thresholds(count: Double): this.type = js.native
    /**
      * Set the array of values to be used as thresholds in determining the bins.
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param thresholds Array of threshold values used for binning. The elements must
      * be of the same type as the materialized values of the histogram.
      */
    def thresholds(thresholds: ArrayLike[Value]): this.type = js.native
  }
  
  @js.native
  trait Numeric extends StObject
  
  type Primitive = Double | String | Boolean | Date
  
  type ThresholdCountGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, Double]
  
  type ThresholdDateArrayGenerator[Value /* <: js.UndefOr[Date] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Date, /* max */ Date, js.Array[Value]]
  
  type ThresholdNumberArrayGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, js.Array[Value]]
  
  @JSImport("d3-array", "bin")
  @js.native
  def `bin_DatumValue_UnionDate<undefined>_HistogramGeneratorDate`[Datum, Value /* <: js.UndefOr[Date] */](): HistogramGeneratorDate[Datum, Value] = js.native
  @JSImport("d3-array", "bin")
  @js.native
  def `bin_DatumValue_UnionDouble<undefined>`[Datum, Value /* <: js.UndefOr[Double] */](): HistogramGeneratorNumber[Datum, Value] = js.native
  
  @JSImport("d3-array", "histogram")
  @js.native
  def `histogram_DatumValue_UnionDate<undefined>_HistogramGeneratorDate`[Datum, Value /* <: js.UndefOr[Date] */](): HistogramGeneratorDate[Datum, Value] = js.native
  @JSImport("d3-array", "histogram")
  @js.native
  def `histogram_DatumValue_UnionDouble<undefined>`[Datum, Value /* <: js.UndefOr[Double] */](): HistogramGeneratorNumber[Datum, Value] = js.native
}
