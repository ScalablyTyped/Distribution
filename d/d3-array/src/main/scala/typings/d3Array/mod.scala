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
  class Adder () extends StObject {
    
    /**
      * Adds the specified number to the adder’s current value and returns the adder.
      */
    def add(number: Double): Adder = js.native
  }
  
  @scala.inline
  def ascending(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ascending")().asInstanceOf[Double]
  @scala.inline
  def ascending(a: Unit, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def ascending(a: Primitive): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def ascending(a: Primitive, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def bin(): HistogramGeneratorNumber[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")().asInstanceOf[HistogramGeneratorNumber[Double, Double]]
  
  @scala.inline
  def `bin_DatumValue_UnionDate<undefined>_HistogramGeneratorDate`[Datum, Value /* <: js.UndefOr[Date] */](): HistogramGeneratorDate[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")().asInstanceOf[HistogramGeneratorDate[Datum, Value]]
  
  @scala.inline
  def `bin_DatumValue_UnionDouble<undefined>`[Datum, Value /* <: js.UndefOr[Double] */](): HistogramGeneratorNumber[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("bin")().asInstanceOf[HistogramGeneratorNumber[Datum, Value]]
  
  @scala.inline
  def bisect(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Date], x: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Date], x: Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisect(array: ArrayLike[Date], x: Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisect")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def bisectCenter(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Date], x: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Date], x: Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectCenter(array: ArrayLike[Date], x: Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectCenter")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def bisectLeft(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Date], x: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectLeft(array: ArrayLike[Date], x: Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectLeft")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def bisectRight(array: ArrayLike[String], x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[String], x: String, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[String], x: String, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[String], x: String, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Double], x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Double], x: Double, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Double], x: Double, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Double], x: Double, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Date], x: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Date], x: Date, lo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Date], x: Date, lo: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def bisectRight(array: ArrayLike[Date], x: Date, lo: Unit, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bisectRight")(array.asInstanceOf[js.Any], x.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def bisector[T, U](accessor: js.Function1[/* x */ T, U]): Bisector_[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("bisector")(accessor.asInstanceOf[js.Any]).asInstanceOf[Bisector_[T, U]]
  @scala.inline
  def bisector[T, U](comparator: js.Function2[/* a */ T, /* b */ U, Double]): Bisector_[T, U] = ^.asInstanceOf[js.Dynamic].applyDynamic("bisector")(comparator.asInstanceOf[js.Any]).asInstanceOf[Bisector_[T, U]]
  
  @scala.inline
  def count[TObject](iterable: Iterable[TObject]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def count[TObject](
    iterable: Iterable[TObject],
    accessor: js.Function2[/* a */ TObject, /* b */ TObject, js.UndefOr[Double | Null]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def cross[S, T](a: Iterable[S], b: Iterable[T]): js.Array[js.Tuple2[S, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[S, T]]]
  @scala.inline
  def cross[S, T, U](a: Iterable[S], b: Iterable[T], reducer: js.Function2[/* a */ S, /* b */ T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  @scala.inline
  def cumsum[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(iterable.asInstanceOf[js.Any]).asInstanceOf[Float64Array]
  @scala.inline
  def cumsum[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Float64Array]
  
  @scala.inline
  def descending(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("descending")().asInstanceOf[Double]
  @scala.inline
  def descending(a: Unit, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("descending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def descending(a: Primitive): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("descending")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def descending(a: Primitive, b: Primitive): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("descending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def deviation[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("deviation")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def deviation[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("deviation")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def difference[T](iterable: Iterable[T], others: Iterable[T]*): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(iterable.asInstanceOf[js.Any], others.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  
  @scala.inline
  def disjoint[T](a: Iterable[T], b: Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("disjoint")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def every[T](
    iterable: Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], js.Any]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(iterable.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def extent(iterable: Iterable[String]): js.Tuple2[String | Unit, String | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String | Unit, String | Unit]]
  @scala.inline
  def extent[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.Tuple2[String | Unit, String | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String | Unit, String | Unit]]
  
  @scala.inline
  def extent_TU_Numeric[T, U /* <: Numeric */](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.Tuple2[U | Unit, U | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[U | Unit, U | Unit]]
  
  @scala.inline
  def extent_T_Numeric[T /* <: Numeric */](iterable: Iterable[T]): js.Tuple2[T | Unit, T | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T | Unit, T | Unit]]
  
  @scala.inline
  def filter[T](
    iterable: Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], js.Any]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(iterable.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def fsum[T /* <: Numeric */](values: Iterable[js.UndefOr[T | Null]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fsum")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def fsum[T](
    values: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fsum")(values.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def greatest[T](iterable: Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("greatest")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def greatest[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatest")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def greatest[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatest")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def greatestIndex[T](iterable: Iterable[T]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("greatestIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def greatestIndex[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatestIndex")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def greatestIndex[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatestIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def group[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, js.Array[TObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Map[TKey, js.Array[TObject]]]
  @scala.inline
  def group[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, js.Array[TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[Map[TKey1, Map[TKey2, js.Array[TObject]]]]
  @scala.inline
  def group[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, js.Array[TObject]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[Map[TKey1, Map[TKey2, Map[TKey3, js.Array[TObject]]]]]
  
  @scala.inline
  def groups[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, js.Array[TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groups")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, js.Array[TObject]]]]
  @scala.inline
  def groups[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[TObject]]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groups")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[TObject]]]]]]
  @scala.inline
  def groups[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, js.Array[TObject]]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("groups")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, js.Array[TObject]]]]]]
  ]]
  
  @scala.inline
  def histogram(): HistogramGeneratorNumber[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("histogram")().asInstanceOf[HistogramGeneratorNumber[Double, Double]]
  
  @scala.inline
  def `histogram_DatumValue_UnionDate<undefined>_HistogramGeneratorDate`[Datum, Value /* <: js.UndefOr[Date] */](): HistogramGeneratorDate[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("histogram")().asInstanceOf[HistogramGeneratorDate[Datum, Value]]
  
  @scala.inline
  def `histogram_DatumValue_UnionDouble<undefined>`[Datum, Value /* <: js.UndefOr[Double] */](): HistogramGeneratorNumber[Datum, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("histogram")().asInstanceOf[HistogramGeneratorNumber[Datum, Value]]
  
  @scala.inline
  def index[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): Map[TKey, TObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Map[TKey, TObject]]
  @scala.inline
  def index[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, TObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[Map[TKey1, Map[TKey2, TObject]]]
  @scala.inline
  def index[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, TObject]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[Map[TKey1, Map[TKey2, Map[TKey3, TObject]]]]
  
  @scala.inline
  def indexes[TObject, TKey](iterable: Iterable[TObject], key: js.Function1[/* value */ TObject, TKey]): js.Array[js.Tuple2[TKey, TObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexes")(iterable.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, TObject]]]
  @scala.inline
  def indexes[TObject, TKey1, TKey2](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TObject]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexes")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TObject]]]]]
  @scala.inline
  def indexes[TObject, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TObject]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexes")(iterable.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TObject]]]]]
  ]]
  
  @scala.inline
  def intersection[T](iterables: Iterable[T]*): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(iterables.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
  
  @scala.inline
  def least[T](iterable: Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("least")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def least[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("least")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  @scala.inline
  def least[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("least")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def leastIndex[T](iterable: Iterable[T]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("leastIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def leastIndex[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("leastIndex")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def leastIndex[T, U](iterable: Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("leastIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def map[T, U](
    iterable: Iterable[T],
    mapper: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], U]
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(iterable.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  @scala.inline
  def max(iterable: Iterable[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def max[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def maxIndex[T](iterable: Iterable[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def maxIndex[TDatum, U](
    iterable: Iterable[TDatum],
    accessor: js.Function3[
      /* datum */ TDatum, 
      /* index */ Double, 
      /* array */ Iterable[TDatum], 
      js.UndefOr[U | Null]
    ]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def max_TU_Numeric[T, U /* <: Numeric */](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  @scala.inline
  def max_T_Numeric[T /* <: Numeric */](iterable: Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def mean[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def mean[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def median[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("median")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def median[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("median")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def merge[T](iterables: Iterable[Iterable[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(iterables.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def min(iterable: Iterable[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def min[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[String | Null]]
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def minIndex[T](iterable: Iterable[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minIndex")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def minIndex[TDatum, U](
    iterable: Iterable[TDatum],
    accessor: js.Function3[
      /* datum */ TDatum, 
      /* index */ Double, 
      /* array */ Iterable[TDatum], 
      js.UndefOr[U | Null]
    ]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minIndex")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def min_TU_Numeric[T, U /* <: Numeric */](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[U | Null]]
  ): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
  
  @scala.inline
  def min_T_Numeric[T /* <: Numeric */](iterable: Iterable[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def nice(start: Double, stop: Double, count: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def pairs[T](iterable: Iterable[T]): js.Array[js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[T, T]]]
  @scala.inline
  def pairs[T, U](iterable: Iterable[T], reducer: js.Function2[/* a */ T, /* b */ T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  @scala.inline
  def permute[T](source: NumberDictionary[T], keys: Iterable[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("permute")(source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def permute[T, K /* <: /* keyof T */ String */](source: T, keys: Iterable[K]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("permute")(source.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  
  @scala.inline
  def quantile[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(iterable.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def quantile[T](
    iterable: Iterable[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(iterable.asInstanceOf[js.Any], p.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def quantileSorted[T /* <: Numeric */](array: js.Array[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileSorted")(array.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def quantileSorted[T](
    array: js.Array[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Array[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantileSorted")(array.asInstanceOf[js.Any], p.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def quickselect[T](array: ArrayLike[T], k: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def quickselect[T](array: ArrayLike[T], k: Double, left: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def quickselect[T](array: ArrayLike[T], k: Double, left: Double, right: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def quickselect[T](
    array: ArrayLike[T],
    k: Double,
    left: Double,
    right: Double,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickselect")(array.asInstanceOf[js.Any], k.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def range(start: Double, stop: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def range(start: Double, stop: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def range(stop: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(stop.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def reduce[T](
    iterable: Iterable[T],
    reducer: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* iterable */ Iterable[T], 
      T
    ]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
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
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
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
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(iterable.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
  
  @scala.inline
  def reverse[T](iterable: Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def rollup[TObject, TReduce, TKey](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): Map[TKey, TReduce] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Map[TKey, TReduce]]
  @scala.inline
  def rollup[TObject, TReduce, TKey1, TKey2](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): Map[TKey1, Map[TKey2, TReduce]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[Map[TKey1, Map[TKey2, TReduce]]]
  @scala.inline
  def rollup[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): Map[TKey1, Map[TKey2, Map[TKey3, TReduce]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollup")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[Map[TKey1, Map[TKey2, Map[TKey3, TReduce]]]]
  
  @scala.inline
  def rollups[TObject, TReduce, TKey](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key: js.Function1[/* value */ TObject, TKey]
  ): js.Array[js.Tuple2[TKey, TReduce]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollups")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey, TReduce]]]
  @scala.inline
  def rollups[TObject, TReduce, TKey1, TKey2](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2]
  ): js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TReduce]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollups")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, TReduce]]]]]
  @scala.inline
  def rollups[TObject, TReduce, TKey1, TKey2, TKey3](
    iterable: Iterable[TObject],
    reduce: js.Function1[/* value */ js.Array[TObject], TReduce],
    key1: js.Function1[/* value */ TObject, TKey1],
    key2: js.Function1[/* value */ TObject, TKey2],
    key3: js.Function1[/* value */ TObject, TKey3]
  ): js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TReduce]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("rollups")(iterable.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any], key3.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    js.Tuple2[TKey1, js.Array[js.Tuple2[TKey2, js.Array[js.Tuple2[TKey3, TReduce]]]]]
  ]]
  
  @scala.inline
  def shuffle(array: Float32Array): Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Float32Array]
  @scala.inline
  def shuffle(array: Float32Array, lo: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def shuffle(array: Float32Array, lo: Double, hi: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def shuffle(array: Float32Array, lo: Unit, hi: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  @scala.inline
  def shuffle(array: Float64Array): Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Float64Array]
  @scala.inline
  def shuffle(array: Float64Array, lo: Double): Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Float64Array]
  @scala.inline
  def shuffle(array: Float64Array, lo: Double, hi: Double): Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Float64Array]
  @scala.inline
  def shuffle(array: Float64Array, lo: Unit, hi: Double): Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Float64Array]
  @scala.inline
  def shuffle(array: Int16Array): Int16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Int16Array]
  @scala.inline
  def shuffle(array: Int16Array, lo: Double): Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Int16Array]
  @scala.inline
  def shuffle(array: Int16Array, lo: Double, hi: Double): Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Int16Array]
  @scala.inline
  def shuffle(array: Int16Array, lo: Unit, hi: Double): Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Int16Array]
  @scala.inline
  def shuffle(array: Int32Array): Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Int32Array]
  @scala.inline
  def shuffle(array: Int32Array, lo: Double): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  @scala.inline
  def shuffle(array: Int32Array, lo: Double, hi: Double): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  @scala.inline
  def shuffle(array: Int32Array, lo: Unit, hi: Double): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  @scala.inline
  def shuffle(array: Int8Array): Int8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Int8Array]
  @scala.inline
  def shuffle(array: Int8Array, lo: Double): Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Int8Array]
  @scala.inline
  def shuffle(array: Int8Array, lo: Double, hi: Double): Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Int8Array]
  @scala.inline
  def shuffle(array: Int8Array, lo: Unit, hi: Double): Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Int8Array]
  @scala.inline
  def shuffle(array: Uint16Array): Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Uint16Array]
  @scala.inline
  def shuffle(array: Uint16Array, lo: Double): Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Uint16Array]
  @scala.inline
  def shuffle(array: Uint16Array, lo: Double, hi: Double): Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint16Array]
  @scala.inline
  def shuffle(array: Uint16Array, lo: Unit, hi: Double): Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint16Array]
  @scala.inline
  def shuffle(array: Uint32Array): Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Uint32Array]
  @scala.inline
  def shuffle(array: Uint32Array, lo: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  @scala.inline
  def shuffle(array: Uint32Array, lo: Double, hi: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  @scala.inline
  def shuffle(array: Uint32Array, lo: Unit, hi: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  @scala.inline
  def shuffle(array: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def shuffle(array: Uint8Array, lo: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def shuffle(array: Uint8Array, lo: Double, hi: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def shuffle(array: Uint8Array, lo: Unit, hi: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def shuffle(array: Uint8ClampedArray): Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Uint8ClampedArray]
  @scala.inline
  def shuffle(array: Uint8ClampedArray, lo: Double): Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Uint8ClampedArray]
  @scala.inline
  def shuffle(array: Uint8ClampedArray, lo: Double, hi: Double): Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint8ClampedArray]
  @scala.inline
  def shuffle(array: Uint8ClampedArray, lo: Unit, hi: Double): Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Uint8ClampedArray]
  @scala.inline
  def shuffle[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def shuffle[T](array: js.Array[T], lo: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def shuffle[T](array: js.Array[T], lo: Double, hi: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def shuffle[T](array: js.Array[T], lo: Unit, hi: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def shuffler(random: js.Function0[Double]): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffler")(random.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  @scala.inline
  def some[T](
    iterable: Iterable[T],
    test: js.Function3[/* value */ T, /* index */ Double, /* iterable */ Iterable[T], js.Any]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(iterable.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def sort[T](iterable: Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def sort[T](iterable: Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(iterable.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def subset[T](a: Iterable[T], b: Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def sum[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(iterable.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def sum[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def superset[T](a: Iterable[T], b: Iterable[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("superset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def thresholdFreedmanDiaconis(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("thresholdFreedmanDiaconis")(values.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def thresholdScott(values: ArrayLike[js.UndefOr[Double]], min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("thresholdScott")(values.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def thresholdSturges(values: ArrayLike[js.UndefOr[Double]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdSturges")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tickIncrement(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickIncrement")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tickStep(start: Double, stop: Double, count: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tickStep")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def ticks(start: Double, stop: Double, count: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ticks")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def transpose[T](matrix: ArrayLike[ArrayLike[T]]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(matrix.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  
  @scala.inline
  def union[T](iterables: Iterable[T]*): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(iterables.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
  
  @scala.inline
  def variance[T /* <: Numeric */](iterable: Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def variance[T](
    iterable: Iterable[T],
    accessor: js.Function3[/* datum */ T, /* index */ Double, /* array */ Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("variance")(iterable.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def zip[T](arrays: ArrayLike[T]*): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(arrays.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  
  @js.native
  trait Bin_[Datum, Value /* <: js.UndefOr[Double | Date] */]
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
  trait HistogramCommon[Datum, Value /* <: js.UndefOr[Double | Date] */] extends StObject {
    
    def apply(data: ArrayLike[Datum]): js.Array[Bin_[Datum, Value]] = js.native
    
    def value(): js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value] = js.native
    def value(valueAccessor: js.Function3[/* d */ Datum, /* i */ Double, /* data */ ArrayLike[Datum], Value]): this.type = js.native
  }
  
  @js.native
  trait HistogramGeneratorDate[Datum, Value /* <: js.UndefOr[Date] */]
    extends StObject
       with HistogramCommon[Datum, Date] {
    
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
  trait HistogramGeneratorNumber[Datum, Value /* <: js.UndefOr[Double] */]
    extends StObject
       with HistogramCommon[Datum, Value] {
    
    def domain(): js.Function1[/* values */ Iterable[Value], js.Tuple2[Double | Unit, Double | Unit]] = js.native
    def domain(
      domainAccessor: js.Function1[/* values */ Iterable[Value], js.Tuple2[Double | Unit, Double | Unit]]
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
  
  trait Numeric extends StObject
  
  type Primitive = Double | String | Boolean | Date
  
  type ThresholdCountGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, Double]
  
  type ThresholdDateArrayGenerator[Value /* <: js.UndefOr[Date] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Date, /* max */ Date, js.Array[Value]]
  
  type ThresholdNumberArrayGenerator[Value /* <: js.UndefOr[Double] */] = js.Function3[/* values */ ArrayLike[Value], /* min */ Double, /* max */ Double, js.Array[Value]]
}
