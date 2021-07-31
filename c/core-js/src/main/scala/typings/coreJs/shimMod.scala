package typings.coreJs

import typings.coreJs.anon.FnCall
import typings.coreJs.anon.Typeofcore
import typings.coreJs.core.Locale
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Iterator
import typings.std.MapConstructor
import typings.std.PromiseConstructor
import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import typings.std.SetConstructor
import typings.std.TemplateStringsArray
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimMod {
  
  @JSImport("core-js/library/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Array {
    
    @JSImport("core-js/library/shim", "Array")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def concat[T](array: ArrayLike[T], items: (typings.coreJs.Array[T] | T)*): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(array.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Tuple2[Double, T]]]
    
    @scala.inline
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def fill[T](array: ArrayLike[T], value: T): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def fill[T](array: ArrayLike[T], value: T, start: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def fill[T](array: ArrayLike[T], value: T, start: Unit, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit],
      thisArg: js.Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def from[T](arrayLike: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def from[T](arrayLike: Iterable[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    @scala.inline
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    @scala.inline
    def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    @scala.inline
    def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayLike.asInstanceOf[js.Any], mapfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    
    @scala.inline
    def includes[T](array: ArrayLike[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def indexOf[T](array: ArrayLike[T], searchElement: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def isArray(arg: js.Any): /* is core-js.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is core-js.Array<any> */ Boolean]
    
    @scala.inline
    def join[T](array: ArrayLike[T]): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(array.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def keys[T](array: ArrayLike[T]): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
    
    @scala.inline
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], earchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U]
    ): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    @scala.inline
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U],
      thisArg: js.Any
    ): typings.coreJs.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[U]]
    
    @scala.inline
    def of[T](items: T*): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def pop[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def push[T](array: ArrayLike[T], items: T*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(array.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def reduce[T](
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
    
    @scala.inline
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def reduceRight[T](
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
    
    @scala.inline
    def reduceRight_TU_U[T, U](
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
    
    @scala.inline
    def reduce_TU_U[T, U](
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
    
    @scala.inline
    def reverse[T](array: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def shift[T](array: ArrayLike[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(array.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def slice[T](array: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def slice[T](array: ArrayLike[T], start: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def slice[T](array: ArrayLike[T], start: Double, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def slice[T](array: ArrayLike[T], start: Unit, end: Double): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def sort[T](array: ArrayLike[T]): typings.coreJs.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: Unit, items: T*): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    
    @scala.inline
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typings.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): typings.coreJs.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[typings.coreJs.Array[T]]
    @scala.inline
    def turn[T](
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
    @scala.inline
    def turn[T, U](
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
    
    @scala.inline
    def turn_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("turn")(array.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[U]
    
    @scala.inline
    def unshift[T](array: ArrayLike[T], items: T*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(array.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def values[T](array: ArrayLike[T]): IterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[T]]
  }
  
  object Date {
    
    @JSImport("core-js/library/shim", "Date")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def format(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def format(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def formatUTC(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def formatUTC(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUTC")(date.asInstanceOf[js.Any], template.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    @scala.inline
    def toISOString(date: typings.coreJs.Date): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toISOString")(date.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  @JSImport("core-js/library/shim", "Dict")
  @js.native
  val Dict: DictConstructor = js.native
  
  object Function {
    
    @JSImport("core-js/library/shim", "Function")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def bind(target: typings.coreJs.Function, thisArg: js.Any, argArray: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any], argArray.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def part(target: typings.coreJs.Function, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("part")(target.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "Map")
  @js.native
  class Map[K, V] ()
    extends StObject
       with typings.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/library/shim", "Map")
  @js.native
  val Map: MapConstructor = js.native
  
  object Math {
    
    @JSImport("core-js/library/shim", "Math")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def acosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def asinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def atanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def cbrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def clz32(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clz32")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def cosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def expm1(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fround(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def hypot(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def imul(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("imul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def log1p(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def log2(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def sinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def tanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def trunc(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object Number {
    
    @JSImport("core-js/library/shim", "Number")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("core-js/library/shim", "Number.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    @scala.inline
    def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/library/shim", "Number.MAX_SAFE_INTEGER")
    @js.native
    def MAX_SAFE_INTEGER: Double = js.native
    @scala.inline
    def MAX_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/library/shim", "Number.MIN_SAFE_INTEGER")
    @js.native
    def MIN_SAFE_INTEGER: Double = js.native
    @scala.inline
    def MIN_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def acosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def asinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def atanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def cbrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def clz32(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clz32")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def cosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def expm1(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fround(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def hypot(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def imul(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("imul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def isFinite(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isInteger(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isNaN(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isSafeInteger(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def log1p(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def log2(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def parseFloat(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFloat")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def parseInt(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def parseInt(string: java.lang.String, radix: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
    @scala.inline
    def random(lim: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(lim.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def sinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def tanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def trunc(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object Object {
    
    @JSImport("core-js/library/shim", "Object")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def assign(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def classof(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classof")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    @scala.inline
    def create(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def define[T](target: T, mixin: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(target.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def entries(`object`: js.Any): Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
    
    @scala.inline
    def freeze[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptor]
    
    @scala.inline
    def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptors")(`object`.asInstanceOf[js.Any]).asInstanceOf[PropertyDescriptorMap]
    
    @scala.inline
    def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyNames")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
    
    @scala.inline
    def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertySymbols")(o.asInstanceOf[js.Any]).asInstanceOf[Array[js.Symbol]]
    
    @scala.inline
    def getPrototypeOf(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def is(value1: js.Any, value2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isExtensible(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isFrozen(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozen")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isSealed(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSealed")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def keys(o: js.Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
    
    @scala.inline
    def make[T](proto: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def make[T](proto: T, mixin: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def preventExtensions[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def seal[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("seal")(o.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def values(`object`: js.Any): Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "Promise")
  @js.native
  class Promise[T] protected ()
    extends StObject
       with typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
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
    
    @scala.inline
    def apply(target: Function, thisArgument: js.Any, argumentsList: ArrayLike[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def construct(target: Function, argumentsList: ArrayLike[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
    @scala.inline
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    @scala.inline
    def deleteMetadata(metadataKey: js.Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def get(target: js.Any, propertyKey: PropertyKey): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
    @scala.inline
    def getMetadata(metadataKey: js.Any, target: Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
    @scala.inline
    def getMetadataKeys(target: Object): Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
    @scala.inline
    def getMetadataKeys(target: Object, targetKey: java.lang.String): Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[js.Any]]
    @scala.inline
    def getMetadataKeys(target: Object, targetKey: js.Symbol): Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[js.Any]]
    
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
    @scala.inline
    def getOwnMetadata(metadataKey: js.Any, target: Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
    @scala.inline
    def getOwnMetadataKeys(target: Object): Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
    @scala.inline
    def getOwnMetadataKeys(target: Object, targetKey: java.lang.String): Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[js.Any]]
    @scala.inline
    def getOwnMetadataKeys(target: Object, targetKey: js.Symbol): Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[js.Any]]
    
    @scala.inline
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptor]
    
    @scala.inline
    def getPrototypeOf(target: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def has(target: js.Any, propertyKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def has(target: js.Any, propertyKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    @scala.inline
    def hasMetadata(metadataKey: js.Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    @scala.inline
    def hasOwnMetadata(metadataKey: js.Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isExtensible(target: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
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
    @scala.inline
    def metadata(metadataKey: js.Any, metadataValue: js.Any): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[FnCall]
    
    @scala.inline
    def ownKeys(target: js.Any): Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[PropertyKey]]
    
    @scala.inline
    def preventExtensions(target: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object RegExp {
    
    @JSImport("core-js/library/shim", "RegExp")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def escape(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "Set")
  @js.native
  class Set[T] ()
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
    
    @scala.inline
    def at(text: java.lang.String, index: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("at")(text.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def codePointAt(text: java.lang.String, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("codePointAt")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], endPosition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def escapeHTML(text: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHTML")(text.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    @scala.inline
    def fromCodePoint(codePoints: Double*): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    @scala.inline
    def includes(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def padEnd(text: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padEnd")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def padStart(text: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(text.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fillStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(template.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def repeat(text: java.lang.String, count: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(text.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(text.asInstanceOf[js.Any], searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def unescapeHTML(text: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeHTML")(text.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  
  @JSImport("core-js/library/shim", "Symbol")
  @js.native
  val Symbol: SymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/shim", "WeakMap")
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
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
  class WeakSet[T /* <: js.Object */] ()
    extends StObject
       with typings.std.WeakSet[T] {
    def this(iterable: Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/library/shim", "WeakSet")
  @js.native
  val WeakSet: WeakSetConstructor = js.native
  
  @JSImport("core-js/library/shim", "_")
  @js.native
  val _underscore: Boolean = js.native
  
  @scala.inline
  def addLocale(lang: java.lang.String, locale: Locale): Typeofcore = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(lang.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Typeofcore]
  
  @scala.inline
  def clearImmediate(handle: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def delay(msec: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(msec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def `for`[T](iterable: Iterable[T]): typings.coreJs.`for`[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("$for")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.coreJs.`for`[T]]
  
  @scala.inline
  def getIterator[T](iterable: Iterable[T]): Iterator[T, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(iterable.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, Unit]]
  
  @JSImport("core-js/library/shim", "global")
  @js.native
  val global: js.Any = js.native
  
  @scala.inline
  def isIterable(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def locale(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[java.lang.String]
  @scala.inline
  def locale(lang: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(lang.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def setImmediate(expression: js.Any, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(expression.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setInterval(handler: js.Any, timeout: Unit, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(handler: js.Any, timeout: Unit, args: js.Any*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("core-js/library/shim", "version")
  @js.native
  val version: java.lang.String = js.native
}
