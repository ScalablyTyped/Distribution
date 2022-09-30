package typings.d3Array

import org.scalablytyped.runtime.NumberDictionary
import typings.d3Array.anon.FnCall
import typings.std.Array
import typings.std.ArrayLike
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("d3-array", "Adder")
  @js.native
  /**
    * Creates a full precision adder for IEEE 754 floating point numbers, setting its initial value to 0.
    */
  open class Adder () extends StObject {
    
    /**
      * Adds the specified number to the adder’s current value and returns the adder.
      */
    def add(number: Double): Adder = js.native
  }
  
  @JSImport("d3-array", "InternMap")
  @js.native
  open class InternMap[K, V] ()
    extends StObject
       with Map[K, V]
  
  @JSImport("d3-array", "InternSet")
  @js.native
  open class InternSet[T] ()
    extends StObject
       with Set[T]
  
  inline def ascending(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ascending")().asInstanceOf[Double]
  inline def ascending(a: Unit, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def ascending(a: Primitive): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def ascending(a: Primitive, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bin(): HistogramGeneratorNumber[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")().asInstanceOf[HistogramGeneratorNumber[Double, Double]]
  
  inline def bin_DatumValue[Datum, Value /* <: js.UndefOr[Double] */](): HistogramGeneratorNumber[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")().asInstanceOf[HistogramGeneratorNumber[Datum, Value]]
  
  inline def bin_DatumValue_HistogramGeneratorDate[Datum, Value /* <: js.UndefOr[js.Date] */](): HistogramGeneratorDate[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")().asInstanceOf[HistogramGeneratorDate[Datum, Value]]
  
  inline def bisect(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[js.Date], x: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[js.Date], x: js.Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[js.Date], x: js.Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[js.Date], x: js.Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisect(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bisectCenter(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[js.Date], x: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[js.Date], x: js.Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[js.Date], x: js.Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[js.Date], x: js.Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectCenter(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bisectLeft(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[js.Date], x: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[js.Date], x: js.Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[js.Date], x: js.Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[js.Date], x: js.Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectLeft(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bisectRight(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[js.Date], x: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[js.Date], x: js.Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[js.Date], x: js.Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[js.Date], x: js.Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bisectRight(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def bisector[T, U](accessor: js.Function1[/* x */ T, U]): Bisector_[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("bisector")(accessor.asInstanceOf[js.Any]).asInstanceOf[Bisector_[T, U]]
  inline def bisector[T, U](comparator: js.Function2[/* a */ T, /* b */ U, Double]): Bisector_[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("bisector")(comparator.asInstanceOf[js.Any]).asInstanceOf[Bisector_[T, U]]
  
  inline def count(iterable: js.Iterable[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def count[TObject](
    iterable: js.Iterable[TObject],
    accessor: js.Function2[/* a */ TObject, /* b */ TObject, js.UndefOr[Double | Null]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def cross[S, T](a: js.Iterable[S], b: js.Iterable[T]): js.Array[js.Tuple2[S, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[S, T]]]
  inline def cross[S, T, U](a: js.Iterable[S], b: js.Iterable[T], reducer: js.Function2[/* a */ S, /* b */ T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def cumsum(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): js.typedarray.Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
  inline def cumsum[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Iterable[T], js.UndefOr[Double | Null]]
  ): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  
  inline def descending(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("descending")().asInstanceOf[Double]
  inline def descending(a: Unit, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("descending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def descending(a: Primitive): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("descending")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def descending(a: Primitive, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("descending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def deviation(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("deviation")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def deviation[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("deviation")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def difference[T](iterable: js.Iterable[T], others: js.Iterable[T]*): InternSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(scala.List(iterable.asInstanceOf[js.Any]).`++`(others.asInstanceOf[Seq[js.Any]])*).asInstanceOf[InternSet[T]]
  
  inline def disjoint[T](a: js.Iterable[T], b: js.Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("disjoint")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every[T](
    iterable: js.Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ js.Iterable[T], Any]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(iterable.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extent(iterable: js.Iterable[String]): js.Tuple2[String | Unit, String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String | Unit, String | Unit]]
  inline def extent[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[String | Null]
    ]
  ): js.Tuple2[String | Unit, String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String | Unit, String | Unit]]
  
  inline def extent_T[T /* <: Numeric */](iterable: js.Iterable[T]): js.Tuple2[T | Unit, T | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T | Unit, T | Unit]]
  
  inline def extent_TU[T, U /* <: Numeric */](
    iterable: js.Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ js.Iterable[T], js.UndefOr[U | Null]]
  ): js.Tuple2[U | Unit, U | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[U | Unit, U | Unit]]
  
  inline def fcumsum(values: js.Iterable[js.UndefOr[Numeric | Null]]): js.typedarray.Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fcumsum")(values.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
  inline def fcumsum[T](
    values: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fcumsum")(values.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  
  inline def filter[T](
    iterable: js.Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ js.Iterable[T], Any]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(iterable.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def flatGroup[TObject, TKey](iterable: js.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, js.Array[TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatGroup")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, js.Array[TObject]]]]
  inline def flatGroup[TObject, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple3[TKey1, TKey2, js.Array[TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatGroup")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple3[TKey1, TKey2, js.Array[TObject]]]]
  inline def flatGroup[TObject, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[js.Tuple4[TKey1, TKey2, TKey3, js.Array[TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatGroup")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple4[TKey1, TKey2, TKey3, js.Array[TObject]]]]
  
  inline def flatRollup[TObject, TReduce, TKey](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): js.Array[js.Tuple2[TKey, TReduce]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatRollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, TReduce]]]
  inline def flatRollup[TObject, TReduce, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple3[TKey1, TKey2, TReduce]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatRollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple3[TKey1, TKey2, TReduce]]]
  inline def flatRollup[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[js.Tuple4[TKey1, TKey2, TKey3, TReduce]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatRollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple4[TKey1, TKey2, TKey3, TReduce]]]
  
  inline def fsum(values: js.Iterable[js.UndefOr[Numeric | Null]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fsum")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def fsum[T](
    values: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fsum")(values.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def greatest[T](iterable: js.Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("greatest")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def greatest[T](iterable: js.Iterable[T], accessor: js.Function1[/* a */ T, Any]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatest")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def greatest[T](iterable: js.Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatest")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def greatestIndex(iterable: js.Iterable[Any]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("greatestIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def greatestIndex[T](iterable: js.Iterable[T], accessor: js.Function1[/* a */ T, Any]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatestIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def greatestIndex[T](iterable: js.Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatestIndex")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def group[TObject, TKey](iterable: js.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): InternMap[TKey, js.Array[TObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey, js.Array[TObject]]]
  inline def group[TObject, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): InternMap[TKey1, InternMap[TKey2, js.Array[TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey1, InternMap[TKey2, js.Array[TObject]]]]
  inline def group[TObject, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): InternMap[TKey1, InternMap[TKey2, InternMap[TKey3, js.Array[TObject]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey1, InternMap[TKey2, InternMap[TKey3, js.Array[TObject]]]]]
  
  inline def groupSort[TObject, TKey](
    iterable: js.Iterable[TObject],
    // tslint:disable-next-line:unified-signatures
  accessor: js.Function1[/* value */ js.Array[TObject], Any],
    key: js.Function1[/* value */ TObject, TKey]
  ): js.Array[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupSort")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[TKey]]
  inline def groupSort[TObject, TKey](
    iterable: js.Iterable[TObject],
    comparator: js.Function2[/* a */ js.Array[TObject], /* b */ js.Array[TObject], Double],
    key: js.Function1[/* value */ TObject, TKey]
  ): js.Array[TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupSort")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[TKey]]
  
  inline def groups[TObject, TKey](iterable: js.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, js.Array[TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groups")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, js.Array[TObject]]]]
  inline def groups[TObject, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[TObject]]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groups")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[TObject]]]]]]
  inline def groups[TObject, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, js.Array[TObject]]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groups")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, js.Array[TObject]]]]]]
  ]]
  
  inline def histogram(): HistogramGeneratorNumber[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("histogram")().asInstanceOf[HistogramGeneratorNumber[Double, Double]]
  
  inline def histogram_DatumValue[Datum, Value /* <: js.UndefOr[Double] */](): HistogramGeneratorNumber[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("histogram")().asInstanceOf[HistogramGeneratorNumber[Datum, Value]]
  
  inline def histogram_DatumValue_HistogramGeneratorDate[Datum, Value /* <: js.UndefOr[js.Date] */](): HistogramGeneratorDate[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("histogram")().asInstanceOf[HistogramGeneratorDate[Datum, Value]]
  
  inline def index[TObject, TKey](iterable: js.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): InternMap[TKey, TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey, TObject]]
  inline def index[TObject, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): InternMap[TKey1, InternMap[TKey2, TObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey1, InternMap[TKey2, TObject]]]
  inline def index[TObject, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): InternMap[TKey1, InternMap[TKey2, InternMap[TKey3, TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey1, InternMap[TKey2, InternMap[TKey3, TObject]]]]
  
  inline def indexes[TObject, TKey](iterable: js.Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, TObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexes")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, TObject]]]
  inline def indexes[TObject, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TObject]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexes")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TObject]]]]]
  inline def indexes[TObject, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TObject]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexes")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TObject]]]]]
  ]]
  
  inline def intersection[T](iterables: js.Iterable[T]*): InternSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(iterables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[InternSet[T]]
  
  inline def least[T](iterable: js.Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("least")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def least[T](iterable: js.Iterable[T], accessor: js.Function1[/* a */ T, Any]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("least")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def least[T](iterable: js.Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("least")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def leastIndex(iterable: js.Iterable[Any]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("leastIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def leastIndex[T](iterable: js.Iterable[T], accessor: js.Function1[/* a */ T, Any]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("leastIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def leastIndex[T](iterable: js.Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("leastIndex")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def map[T, U](
    iterable: js.Iterable[T],
    mapper: js.Function3[/* value */ T, /* index */ Double, /* iterable */ js.Iterable[T], U]
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(iterable.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def max(iterable: js.Iterable[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def max[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[String | Null]
    ]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def maxIndex(iterable: js.Iterable[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def maxIndex[TDatum](
    iterable: js.Iterable[TDatum],
    accessor: js.Function3[/* datum */ TDatum, /* index */ Double, /* array */ js.Iterable[TDatum], Any]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def max_T[T /* <: Numeric */](iterable: js.Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def max_TU[T, U /* <: Numeric */](
    iterable: js.Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ js.Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  inline def mean(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def mean[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def median(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def median[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("median")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def merge[T](iterables: js.Iterable[js.Iterable[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(iterables.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def min(iterable: js.Iterable[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def min[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[String | Null]
    ]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def minIndex(iterable: js.Iterable[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def minIndex[TDatum](
    iterable: js.Iterable[TDatum],
    accessor: js.Function3[/* datum */ TDatum, /* index */ Double, /* array */ js.Iterable[TDatum], Any]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def min_T[T /* <: Numeric */](iterable: js.Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def min_TU[T, U /* <: Numeric */](
    iterable: js.Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ js.Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  inline def mode(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mode")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def mode[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mode")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nice(start: Double, stop: Double, count: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def pairs[T](iterable: js.Iterable[T]): js.Array[js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[T, T]]]
  inline def pairs[T, U](iterable: js.Iterable[T], reducer: js.Function2[/* a */ T, /* b */ T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def permute[T](source: NumberDictionary[T], keys: js.Iterable[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("permute")(source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def permute[T, K /* <: /* keyof T */ String */](source: T, keys: js.Iterable[K]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("permute")(source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  
  inline def quantile(iterable: js.Iterable[js.UndefOr[Numeric | Null]], p: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(iterable.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def quantile[T](
    iterable: js.Iterable[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(iterable.asInstanceOf[js.Any], p.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def quantileSorted(array: js.Array[js.UndefOr[Numeric | Null]], p: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileSorted")(array.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def quantileSorted[T](
    array: js.Array[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Array[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileSorted")(array.asInstanceOf[js.Any], p.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def quickselect[T](array: ArrayLike[T], k: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def quickselect[T](array: ArrayLike[T], k: Double, left: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def quickselect[T](array: ArrayLike[T], k: Double, left: Double, right: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def quickselect[T](
    array: ArrayLike[T],
    k: Double,
    left: Double,
    right: Double,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def quickselect[T](
    array: ArrayLike[T],
    k: Double,
    left: Double,
    right: Unit,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def quickselect[T](array: ArrayLike[T], k: Double, left: Unit, right: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def quickselect[T](
    array: ArrayLike[T],
    k: Double,
    left: Unit,
    right: Double,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def quickselect[T](
    array: ArrayLike[T],
    k: Double,
    left: Unit,
    right: Unit,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def range(start: Double, stop: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def range(start: Double, stop: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def range(stop: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(stop.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def rank(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): js.typedarray.Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("rank")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
  inline def rank[T](
    iterable: js.Iterable[T],
    accessorOrComparator: js.Function2[/* a */ T, /* b */ T, js.UndefOr[Double | Null]]
  ): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(iterable.asInstanceOf[js.Any], accessorOrComparator.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  inline def rank[T](
    iterable: js.Iterable[T],
    accessorOrComparator: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("rank")(iterable.asInstanceOf[js.Any], accessorOrComparator.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  
  inline def reduce[T](
    iterable: js.Iterable[T],
    reducer: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ js.Iterable[T], 
      T
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reduce[T](
    iterable: js.Iterable[T],
    reducer: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ js.Iterable[T], 
      T
    ],
    initialValue: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def reduce_TU_U[T, U](
    iterable: js.Iterable[T],
    reducer: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ js.Iterable[T], 
      U
    ],
    initialValue: U
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def reverse[T](iterable: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def rollup[TObject, TReduce, TKey](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): InternMap[TKey, TReduce] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey, TReduce]]
  inline def rollup[TObject, TReduce, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): InternMap[TKey1, InternMap[TKey2, TReduce]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey1, InternMap[TKey2, TReduce]]]
  inline def rollup[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): InternMap[TKey1, InternMap[TKey2, InternMap[TKey3, TReduce]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[InternMap[TKey1, InternMap[TKey2, InternMap[TKey3, TReduce]]]]
  
  inline def rollups[TObject, TReduce, TKey](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): js.Array[js.Tuple2[TKey, TReduce]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollups")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, TReduce]]]
  inline def rollups[TObject, TReduce, TKey1, TKey2](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TReduce]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollups")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TReduce]]]]]
  inline def rollups[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: js.Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TReduce]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollups")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TReduce]]]]]
  ]]
  
  inline def shuffle(array: js.typedarray.Float32Array): js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
  inline def shuffle(array: js.typedarray.Float32Array, lo: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def shuffle(array: js.typedarray.Float32Array, lo: Double, hi: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def shuffle(array: js.typedarray.Float32Array, lo: Unit, hi: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  inline def shuffle(array: js.typedarray.Float64Array): js.typedarray.Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
  inline def shuffle(array: js.typedarray.Float64Array, lo: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  inline def shuffle(array: js.typedarray.Float64Array, lo: Double, hi: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  inline def shuffle(array: js.typedarray.Float64Array, lo: Unit, hi: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  inline def shuffle(array: js.typedarray.Int16Array): js.typedarray.Int16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int16Array]
  inline def shuffle(array: js.typedarray.Int16Array, lo: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  inline def shuffle(array: js.typedarray.Int16Array, lo: Double, hi: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  inline def shuffle(array: js.typedarray.Int16Array, lo: Unit, hi: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  inline def shuffle(array: js.typedarray.Int32Array): js.typedarray.Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
  inline def shuffle(array: js.typedarray.Int32Array, lo: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  inline def shuffle(array: js.typedarray.Int32Array, lo: Double, hi: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  inline def shuffle(array: js.typedarray.Int32Array, lo: Unit, hi: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  inline def shuffle(array: js.typedarray.Int8Array): js.typedarray.Int8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int8Array]
  inline def shuffle(array: js.typedarray.Int8Array, lo: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  inline def shuffle(array: js.typedarray.Int8Array, lo: Double, hi: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  inline def shuffle(array: js.typedarray.Int8Array, lo: Unit, hi: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  inline def shuffle(array: js.typedarray.Uint16Array): js.typedarray.Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array]
  inline def shuffle(array: js.typedarray.Uint16Array, lo: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  inline def shuffle(array: js.typedarray.Uint16Array, lo: Double, hi: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  inline def shuffle(array: js.typedarray.Uint16Array, lo: Unit, hi: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  inline def shuffle(array: js.typedarray.Uint32Array): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  inline def shuffle(array: js.typedarray.Uint32Array, lo: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  inline def shuffle(array: js.typedarray.Uint32Array, lo: Double, hi: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  inline def shuffle(array: js.typedarray.Uint32Array, lo: Unit, hi: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  inline def shuffle(array: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def shuffle(array: js.typedarray.Uint8Array, lo: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def shuffle(array: js.typedarray.Uint8Array, lo: Double, hi: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def shuffle(array: js.typedarray.Uint8Array, lo: Unit, hi: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def shuffle(array: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
  inline def shuffle(array: js.typedarray.Uint8ClampedArray, lo: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  inline def shuffle(array: js.typedarray.Uint8ClampedArray, lo: Double, hi: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  inline def shuffle(array: js.typedarray.Uint8ClampedArray, lo: Unit, hi: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  inline def shuffle[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def shuffle[T](array: js.Array[T], lo: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def shuffle[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def shuffle[T](array: js.Array[T], lo: Unit, hi: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def shuffler(random: js.Function0[Double]): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffler")(random.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  inline def some[T](
    iterable: js.Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ js.Iterable[T], Any]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(iterable.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sort[T](iterable: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def sort[T](iterable: js.Iterable[T], accessors: (js.Function1[/* a */ T, Any])*): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(scala.List(iterable.asInstanceOf[js.Any]).`++`(accessors.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[T]]
  inline def sort[T](iterable: js.Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def subset[T](a: js.Iterable[T], b: js.Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sum(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def sum[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def superset[T](a: js.Iterable[T], b: js.Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("superset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def thresholdFreedmanDiaconis(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("thresholdFreedmanDiaconis")(values.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def thresholdScott(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("thresholdScott")(values.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def thresholdSturges(values: ArrayLike[js.UndefOr[Double]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdSturges")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tickIncrement(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickIncrement")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tickStep(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickStep")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ticks(start: Double, stop: Double, count: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ticks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def transpose[T](matrix: ArrayLike[ArrayLike[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def union[T](iterables: js.Iterable[T]*): InternSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(iterables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[InternSet[T]]
  
  inline def variance(iterable: js.Iterable[js.UndefOr[Numeric | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def variance[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("variance")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def zip[T](arrays: ArrayLike[T]*): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[js.Array[T]]]
  
  @js.native
  trait Bin_[Datum, Value /* <: js.UndefOr[Double | js.Date] */]
    extends StObject
       with Array[Datum] {
    
    var x0: js.UndefOr[Value] = js.native
    
    var x1: js.UndefOr[Value] = js.native
  }
  
  @js.native
  trait Bisector_[T, U] extends StObject {
    
    def center(array: ArrayLike[T], x: U): Double = js.native
    def center(array: ArrayLike[T], x: U, lo: Double): Double = js.native
    def center(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
    def center(array: ArrayLike[T], x: U, lo: Unit, hi: Double): Double = js.native
    
    def left(array: ArrayLike[T], x: U): Double = js.native
    def left(array: ArrayLike[T], x: U, lo: Double): Double = js.native
    def left(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
    def left(array: ArrayLike[T], x: U, lo: Unit, hi: Double): Double = js.native
    
    def right(array: ArrayLike[T], x: U): Double = js.native
    def right(array: ArrayLike[T], x: U, lo: Double): Double = js.native
    def right(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
    def right(array: ArrayLike[T], x: U, lo: Unit, hi: Double): Double = js.native
  }
  
  @js.native
  trait HistogramCommon[Datum, Value /* <: js.UndefOr[Double | js.Date] */] extends StObject {
    
    def apply(data: ArrayLike[Datum]): js.Array[Bin_[Datum, Value]] = js.native
    
    def value(): js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value] = js.native
    def value(valueAccessor: js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value]): this.type = js.native
  }
  
  @js.native
  trait HistogramGeneratorDate[Datum, Value /* <: js.UndefOr[js.Date] */]
    extends StObject
       with HistogramCommon[Datum, js.Date] {
    
    def domain(): js.Function1[/* values */ ArrayLike[Value], js.Tuple2[js.Date, js.Date]] = js.native
    def domain(domain: js.Function1[/* values */ ArrayLike[Value], js.Tuple2[js.Date, js.Date]]): this.type = js.native
    def domain(domain: js.Tuple2[js.Date, js.Date]): this.type = js.native
    
    def thresholds(): ThresholdDateArrayGenerator[Value] = js.native
    def thresholds(thresholds: ThresholdDateArrayGenerator[Value]): this.type = js.native
    /**
      * Set the array of values to be used as thresholds in determining the bins.
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param thresholds Either an array of threshold values used for binning. The elements must
      * be of the same type as the materialized values of the histogram.
      * Or a function which accepts as arguments the array of materialized values, and
      * optionally the domain minimum and maximum. The function calculates and returns the array of values to be used as
      * thresholds in determining the bins.
      */
    def thresholds(thresholds: ArrayLike[Value]): this.type = js.native
  }
  
  @js.native
  trait HistogramGeneratorNumber[Datum, Value /* <: js.UndefOr[Double] */]
    extends StObject
       with HistogramCommon[Datum, Value] {
    
    def domain(): js.Function1[/* values */ js.Iterable[Value], js.Tuple2[Double | Unit, Double | Unit]] = js.native
    def domain(domain: js.Function1[/* values */ js.Iterable[Value], js.Tuple2[Double | Unit, Double | Unit]]): this.type = js.native
    def domain(domain: js.Tuple2[Double, Double]): this.type = js.native
    
    def thresholds(): ThresholdCountGenerator[Value] | ThresholdNumberArrayGenerator[Value] = js.native
    def thresholds(count: ThresholdCountGenerator[Value] | ThresholdNumberArrayGenerator[Value]): this.type = js.native
    /**
      * Divide the domain uniformly into approximately count bins. IMPORTANT: This threshold
      * setting approach only works, when the materialized values are numbers!
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param count Either the desired number of uniform bins or a function which accepts as arguments the array of
      * materialized values, and optionally the domain minimum and maximum. The function calculates and returns the
      * suggested number of bins.
      */
    def thresholds(count: Double): this.type = js.native
    /**
      * Set the array of values to be used as thresholds in determining the bins.
      *
      * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
      * and the last bin.x1 is always equal to the maximum domain value.
      *
      * @param thresholds Either an array of threshold values used for binning. The elements must
      * be of the same type as the materialized values of the histogram.
      * Or a function which accepts as arguments the array of materialized values, and
      * optionally the domain minimum and maximum. The function calculates and returns the array of values to be used as
      * thresholds in determining the bins.
      */
    // tslint:disable-next-line:unified-signatures
    def thresholds(thresholds: ArrayLike[Value]): this.type = js.native
  }
  
  trait Numeric extends StObject
  
  type Primitive = Double | String | Boolean | js.Date
  
  type ThresholdCountGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, Double]
  
  type ThresholdDateArrayGenerator[Value /* <: js.UndefOr[js.Date] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ js.Date, /* max */ js.Date, js.Array[Value]]
  
  type ThresholdNumberArrayGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, js.Array[Value]]
}
