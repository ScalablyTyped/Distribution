package typings.coreJs

import typings.coreJs.anon.FnCall
import typings.coreJs.anon.Typeofcore
import typings.coreJs.core.Locale
import typings.std.ArrayLike
import typings.std.IterableIterator
import typings.std.MapConstructor
import typings.std.PromiseConstructor
import typings.std.PromiseLike
import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import typings.std.SetConstructor
import typings.std.TemplateStringsArray
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryShimMod {
  
  @JSImport("core-js/library/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Array {
    
    @JSImport("core-js/library/shim", "Array")
    @js.native
    val ^ : js.Any = js.native
    
    inline def concat[T](array: ArrayLike[T], items: (typings.coreJs.Array[T] | T)*): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(scala.List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Tuple2[Double, T]]]
    
    inline def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fill[T](array: ArrayLike[T], value: T): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def fill[T](array: ArrayLike[T], value: T, start: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def fill[T](array: ArrayLike[T], value: T, start: Unit, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: Any
    ): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean],
      thisArg: Any
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit],
      thisArg: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def from[T](arrayLike: js.Iterable[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    inline def from[T](arrayLike: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    inline def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    inline def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    inline def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    inline def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: Any): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    
    inline def includes[T](array: ArrayLike[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def indexOf[T](array: ArrayLike[T], searchElement: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isArray(arg: Any): /* is core-js.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is core-js.Array<any> */ Boolean]
    
    inline def join[T](array: ArrayLike[T]): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    inline def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    inline def keys[T](array: ArrayLike[T]): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
    
    inline def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U]
    ): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    inline def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U],
      thisArg: Any
    ): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    
    inline def of[T](items: T*): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def pop[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def push[T](array: ArrayLike[T], items: T*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(scala.List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
    
    inline def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ],
      initialValue: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ],
      initialValue: T
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def reduceRight_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    inline def reduce_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          U
        ],
      initialValue: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U]
    
    inline def reverse[T](array: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def shift[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(array.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def slice[T](array: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    inline def slice[T](array: ArrayLike[T], start: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def slice[T](array: ArrayLike[T], start: Double, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def slice[T](array: ArrayLike[T], start: Unit, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def sort[T](array: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    inline def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.coreJs.Array[T]]
    inline def splice[T](array: ArrayLike[T], start: Double, deleteCount: Unit, items: T*): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.coreJs.Array[T]]
    
    inline def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typings.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typings.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ],
      memo: typings.coreJs.Array[T]
    ): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    inline def turn[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ],
      memo: U
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[U]
    
    inline def turn_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[U]
    
    inline def unshift[T](array: ArrayLike[T], items: T*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(scala.List(array.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
    
    inline def values[T](array: ArrayLike[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  }
  
  object Date {
    
    @JSImport("core-js/library/shim", "Date")
    @js.native
    val ^ : js.Any = js.native
    
    inline def format(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def format(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    inline def formatUTC(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def formatUTC(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    inline def toISOString(date: typings.coreJs.Date): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toISOString")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  @JSImport("core-js/library/shim", "Dict")
  @js.native
  val Dict: DictConstructor = js.native
  
  object Function {
    
    @JSImport("core-js/library/shim", "Function")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bind(target: typings.coreJs.Function, thisArg: Any, argArray: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")((scala.List(target.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).`++`(argArray.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
    
    inline def part(target: typings.coreJs.Function, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("part")(scala.List(target.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "Map")
  @js.native
  /* standard es2015.collection */
  open class Map[K, V] ()
    extends StObject
       with typings.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/library/shim", "Map")
  @js.native
  val Map: MapConstructor = js.native
  
  object Math {
    
    @JSImport("core-js/library/shim", "Math")
    @js.native
    val ^ : js.Any = js.native
    
    inline def acosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def asinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def atanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def cbrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def clz32(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clz32")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def cosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def expm1(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fround(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def hypot(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
    
    inline def imul(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("imul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def log1p(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def log2(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def sinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def tanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def trunc(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object Number {
    
    @JSImport("core-js/library/shim", "Number")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("core-js/library/shim", "Number.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    inline def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/library/shim", "Number.MAX_SAFE_INTEGER")
    @js.native
    def MAX_SAFE_INTEGER: Double = js.native
    inline def MAX_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/library/shim", "Number.MIN_SAFE_INTEGER")
    @js.native
    def MIN_SAFE_INTEGER: Double = js.native
    inline def MIN_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    inline def acosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def asinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def atanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def cbrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def clz32(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clz32")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def cosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def expm1(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fround(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def hypot(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
    
    inline def imul(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("imul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isFinite(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isInteger(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNaN(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSafeInteger(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def log1p(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def log2(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def parseFloat(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFloat")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def parseInt(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def parseInt(string: java.lang.String, radix: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
    inline def random(lim: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(lim.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def sinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def tanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def trunc(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object Object {
    
    @JSImport("core-js/library/shim", "Object")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def classof(value: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classof")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    inline def create(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create(o: Any, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def define[T](target: T, mixin: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(target.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def defineProperties(o: Any, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def defineProperty(o: Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def entries(`object`: Any): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
    
    inline def freeze[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def getOwnPropertyDescriptor(o: Any, propertyKey: PropertyKey): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
    
    inline def getOwnPropertyDescriptors(`object`: Any): PropertyDescriptorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptors")(`object`.asInstanceOf[js.Any]).asInstanceOf[PropertyDescriptorMap]
    
    inline def getOwnPropertyNames(o: Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyNames")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
    
    inline def getOwnPropertySymbols(o: Any): Array[js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertySymbols")(o.asInstanceOf[js.Any]).asInstanceOf[Array[js.Symbol]]
    
    inline def getPrototypeOf(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def is(value1: Any, value2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isExtensible(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFrozen(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozen")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSealed(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSealed")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def keys(o: Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
    
    inline def make[T](proto: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def make[T](proto: T, mixin: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def preventExtensions[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def seal[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("seal")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def setPrototypeOf(o: Any, proto: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def values(`object`: Any): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "Promise")
  @js.native
  open class Promise[T] protected ()
    extends StObject
       with typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    /* standard es2015.promise */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | PromiseLike[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("core-js/library/shim", "Promise")
  @js.native
  val Promise: PromiseConstructor = js.native
  
  object Reflect {
    
    @JSImport("core-js/library/shim", "Reflect")
    @js.native
    val ^ : js.Any = js.native
    
    inline def apply(target: Function, thisArgument: Any, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def construct(target: Function, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Define a unique metadata entry on the target.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param metadataValue A value that contains attached metadata.
      * @param target The target object on which to define metadata.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  Reflect.defineMetadata("custom:annotation", options, Example);
      *
      *  // decorator factory as metadata-producing annotation.
      *  function MyAnnotation(options): ClassDecorator {
      *      return target => Reflect.defineMetadata("custom:annotation", options, target);
      *  }
      * ```
      */
    inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: Object, targetKey: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: Object, targetKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def defineProperty(target: Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Deletes the metadata entry from the target object with the provided key.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata entry was found and deleted; otherwise, false.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.deleteMetadata("custom:annotation", Example);
      * ```
      */
    inline def deleteMetadata(metadataKey: Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def deleteMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def deleteMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def deleteProperty(target: Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def get(target: Any, propertyKey: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def get(target: Any, propertyKey: PropertyKey, receiver: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getMetadata("custom:annotation", Example);
      * ```
      */
    inline def getMetadata(metadataKey: Any, target: Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Gets the metadata keys defined on the target object or its prototype chain.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getMetadataKeys(Example);
      * ```
      */
    inline def getMetadataKeys(target: Object): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
    inline def getMetadataKeys(target: Object, targetKey: java.lang.String): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
    inline def getMetadataKeys(target: Object, targetKey: js.Symbol): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
    
    /**
      * Gets the metadata value for the provided metadata key on the target object.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getOwnMetadata("custom:annotation", Example);
      * ```
      */
    inline def getOwnMetadata(metadataKey: Any, target: Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getOwnMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getOwnMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Gets the unique metadata keys defined on the target object.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getOwnMetadataKeys(Example);
      * ```
      */
    inline def getOwnMetadataKeys(target: Object): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
    inline def getOwnMetadataKeys(target: Object, targetKey: java.lang.String): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
    inline def getOwnMetadataKeys(target: Object, targetKey: js.Symbol): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
    
    inline def getOwnPropertyDescriptor(target: Any, propertyKey: PropertyKey): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
    
    inline def getPrototypeOf(target: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def has(target: Any, propertyKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def has(target: Any, propertyKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.hasMetadata("custom:annotation", Example);
      * ```
      */
    inline def hasMetadata(metadataKey: Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Gets a value indicating whether the target object has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.hasOwnMetadata("custom:annotation", Example);
      * ```
      */
    inline def hasOwnMetadata(metadataKey: Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasOwnMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasOwnMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isExtensible(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * A default metadata decorator factory that can be used on a class, class member, or parameter.
      * @param metadataKey The key for the metadata entry.
      * @param metadataValue The value for the metadata entry.
      * @returns A decorator function.
      * @remarks
      * If `metadataKey` is already defined for the target and target key, the
      * metadataValue for that key will be overwritten.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  // constructor
      *  @Reflect.metadata(key, value)
      *  class Example {
      *  }
      *
      *  // property (on constructor, TypeScript only)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      static staticProperty;
      *  }
      *
      *  // property (on prototype, TypeScript only)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      property;
      *  }
      *
      *  // method (on constructor)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      static staticMethod() { }
      *  }
      *
      *  // method (on prototype)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      method() { }
      *  }
      * ```
      */
    inline def metadata(metadataKey: Any, metadataValue: Any): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[FnCall]
    
    inline def ownKeys(target: Any): Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[PropertyKey]]
    
    inline def preventExtensions(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def set(target: Any, propertyKey: PropertyKey, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def set(target: Any, propertyKey: PropertyKey, value: Any, receiver: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setPrototypeOf(target: Any, proto: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object RegExp {
    
    @JSImport("core-js/library/shim", "RegExp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def escape(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "Set")
  @js.native
  /* standard es2015.collection */
  open class Set[T] ()
    extends StObject
       with typings.std.Set[T] {
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/library/shim", "Set")
  @js.native
  val Set: SetConstructor = js.native
  
  object String {
    
    @JSImport("core-js/library/shim", "String")
    @js.native
    val ^ : js.Any = js.native
    
    inline def at(text: java.lang.String, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("at")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    inline def codePointAt(text: java.lang.String, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("codePointAt")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], endPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def escapeHTML(text: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHTML")(text.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    inline def fromCodePoint(codePoints: Double*): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[java.lang.String]
    
    inline def includes(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def padEnd(text: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    inline def padStart(text: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    inline def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    inline def raw(template: TemplateStringsArray, substitutions: Any*): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(scala.List(template.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[java.lang.String]
    
    inline def repeat(text: java.lang.String, count: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(text.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    inline def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def unescapeHTML(text: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeHTML")(text.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  @JSImport("core-js/library/shim", "Symbol")
  @js.native
  val Symbol: SymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "WeakMap")
  @js.native
  /* standard es2015.collection */
  open class WeakMap[K /* <: js.Object */, V] ()
    extends StObject
       with typings.std.WeakMap[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/library/shim", "WeakMap")
  @js.native
  val WeakMap: WeakMapConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "WeakSet")
  @js.native
  /* standard es2015.collection */
  open class WeakSet[T /* <: js.Object */] ()
    extends StObject
       with typings.std.WeakSet[T] {
    /* standard es2015.iterable */
    def this(iterable: js.Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/library/shim", "WeakSet")
  @js.native
  val WeakSet: WeakSetConstructor = js.native
  
  @JSImport("core-js/library/shim", "_")
  @js.native
  val _underscore: Boolean = js.native
  
  inline def addLocale(lang: java.lang.String, locale: Locale): Typeofcore = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(lang.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Typeofcore]
  
  inline def clearImmediate(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def delay(msec: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def `for`[T](iterable: js.Iterable[T]): typings.coreJs.`for`[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("$for")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.`for`[T]]
  
  inline def getIterator[T](iterable: js.Iterable[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
  
  @JSImport("core-js/library/shim", "global")
  @js.native
  val global: Any = js.native
  
  inline def isIterable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def locale(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[java.lang.String]
  inline def locale(lang: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(lang.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def setImmediate(expression: Any, args: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(scala.List(expression.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  
  inline def setInterval(handler: Any, timeout: Any, args: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setInterval(handler: Any, timeout: Unit, args: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  
  inline def setTimeout(handler: Any, timeout: Any, args: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setTimeout(handler: Any, timeout: Unit, args: Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  
  @JSImport("core-js/library/shim", "version")
  @js.native
  val version: java.lang.String = js.native
}
