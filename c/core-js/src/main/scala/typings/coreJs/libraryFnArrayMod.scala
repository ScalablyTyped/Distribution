package typings.coreJs

import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Array` */
object libraryFnArrayMod {
  
  @JSImport("core-js/library/fn/array", "concat")
  @js.native
  def concat[T](array: ArrayLike[T], items: (Array[T] | T)*): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "copyWithin")
  @js.native
  def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "copyWithin")
  @js.native
  def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "entries")
  @js.native
  def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
  
  @JSImport("core-js/library/fn/array", "every")
  @js.native
  def every[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Boolean = js.native
  @JSImport("core-js/library/fn/array", "every")
  @js.native
  def every[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  
  @JSImport("core-js/library/fn/array", "fill")
  @js.native
  def fill[T](array: ArrayLike[T], value: T): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "fill")
  @js.native
  def fill[T](array: ArrayLike[T], value: T, start: js.UndefOr[scala.Nothing], end: Double): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "fill")
  @js.native
  def fill[T](array: ArrayLike[T], value: T, start: Double): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "fill")
  @js.native
  def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "filter")
  @js.native
  def filter[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "filter")
  @js.native
  def filter[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: js.Any
  ): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "find")
  @js.native
  def find[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean]
  ): T = js.native
  @JSImport("core-js/library/fn/array", "find")
  @js.native
  def find[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean],
    thisArg: js.Any
  ): T = js.native
  
  @JSImport("core-js/library/fn/array", "findIndex")
  @js.native
  def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
  @JSImport("core-js/library/fn/array", "findIndex")
  @js.native
  def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
  
  @JSImport("core-js/library/fn/array", "forEach")
  @js.native
  def forEach[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Unit = js.native
  @JSImport("core-js/library/fn/array", "forEach")
  @js.native
  def forEach[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  @JSImport("core-js/library/fn/array", "from")
  @js.native
  def from[T](arrayLike: ArrayLike[T]): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "from")
  @js.native
  def from[T](arrayLike: Iterable[T]): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "from")
  @js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  @JSImport("core-js/library/fn/array", "from")
  @js.native
  def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
  @JSImport("core-js/library/fn/array", "from")
  @js.native
  def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
  @JSImport("core-js/library/fn/array", "from")
  @js.native
  def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
  
  @JSImport("core-js/library/fn/array", "includes")
  @js.native
  def includes[T](array: ArrayLike[T], value: T): Boolean = js.native
  @JSImport("core-js/library/fn/array", "includes")
  @js.native
  def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = js.native
  
  @JSImport("core-js/library/fn/array", "indexOf")
  @js.native
  def indexOf[T](array: ArrayLike[T], searchElement: T): Double = js.native
  @JSImport("core-js/library/fn/array", "indexOf")
  @js.native
  def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = js.native
  
  @JSImport("core-js/library/fn/array", "isArray")
  @js.native
  def isArray(arg: js.Any): /* is core-js.Array<any> */ Boolean = js.native
  
  @JSImport("core-js/library/fn/array", "join")
  @js.native
  def join[T](array: ArrayLike[T]): java.lang.String = js.native
  @JSImport("core-js/library/fn/array", "join")
  @js.native
  def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/array", "keys")
  @js.native
  def keys[T](array: ArrayLike[T]): IterableIterator[Double] = js.native
  
  @JSImport("core-js/library/fn/array", "lastIndexOf")
  @js.native
  def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = js.native
  @JSImport("core-js/library/fn/array", "lastIndexOf")
  @js.native
  def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = js.native
  
  @JSImport("core-js/library/fn/array", "map")
  @js.native
  def map[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U]
  ): Array[U] = js.native
  @JSImport("core-js/library/fn/array", "map")
  @js.native
  def map[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U],
    thisArg: js.Any
  ): Array[U] = js.native
  
  @JSImport("core-js/library/fn/array", "of")
  @js.native
  def of[T](items: T*): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "pop")
  @js.native
  def pop[T](array: ArrayLike[T]): T = js.native
  
  @JSImport("core-js/library/fn/array", "push")
  @js.native
  def push[T](array: ArrayLike[T], items: T*): Double = js.native
  
  @JSImport("core-js/library/fn/array", "reduce")
  @js.native
  def reduce[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  @JSImport("core-js/library/fn/array", "reduce")
  @js.native
  def reduce[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  
  @JSImport("core-js/library/fn/array", "reduceRight")
  @js.native
  def reduceRight[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ]
  ): T = js.native
  @JSImport("core-js/library/fn/array", "reduceRight")
  @js.native
  def reduceRight[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  @JSImport("core-js/library/fn/array", "reduceRight")
  @js.native
  def reduceRight_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  
  @JSImport("core-js/library/fn/array", "reduce")
  @js.native
  def reduce_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  
  @JSImport("core-js/library/fn/array", "reverse")
  @js.native
  def reverse[T](array: ArrayLike[T]): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "shift")
  @js.native
  def shift[T](array: ArrayLike[T]): T = js.native
  
  @JSImport("core-js/library/fn/array", "slice")
  @js.native
  def slice[T](array: ArrayLike[T]): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "slice")
  @js.native
  def slice[T](array: ArrayLike[T], start: js.UndefOr[scala.Nothing], end: Double): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "slice")
  @js.native
  def slice[T](array: ArrayLike[T], start: Double): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "slice")
  @js.native
  def slice[T](array: ArrayLike[T], start: Double, end: Double): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "some")
  @js.native
  def some[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Boolean = js.native
  @JSImport("core-js/library/fn/array", "some")
  @js.native
  def some[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  
  @JSImport("core-js/library/fn/array", "sort")
  @js.native
  def sort[T](array: ArrayLike[T]): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "sort")
  @js.native
  def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "splice")
  @js.native
  def splice[T](array: ArrayLike[T], start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "splice")
  @js.native
  def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = js.native
  
  @JSImport("core-js/library/fn/array", "turn")
  @js.native
  def turn[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "turn")
  @js.native
  def turn[T](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: Array[T]
  ): Array[T] = js.native
  @JSImport("core-js/library/fn/array", "turn")
  @js.native
  def turn[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    memo: U
  ): U = js.native
  @JSImport("core-js/library/fn/array", "turn")
  @js.native
  def turn_TU_U[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): U = js.native
  
  @JSImport("core-js/library/fn/array", "unshift")
  @js.native
  def unshift[T](array: ArrayLike[T], items: T*): Double = js.native
  
  @JSImport("core-js/library/fn/array", "values")
  @js.native
  def values[T](array: ArrayLike[T]): IterableIterator[T] = js.native
}
