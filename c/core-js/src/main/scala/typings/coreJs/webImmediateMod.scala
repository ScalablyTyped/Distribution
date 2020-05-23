package typings.coreJs

import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web/immediate", JSImport.Namespace)
@js.native
object webImmediateMod extends js.Object {
  @js.native
  class Map[K, V] ()
    extends typings.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  class Promise[T] protected ()
    extends typings.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  
  @js.native
  class Set[T] ()
    extends typings.std.Set[T] {
    def this(values: js.Array[T]) = this()
  }
  
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typings.std.WeakMap[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  }
  
  @js.native
  class WeakSet[T /* <: js.Object */] ()
    extends typings.std.WeakSet[T] {
    def this(iterable: Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  
  val Dict: DictConstructor = js.native
  @JSName("_")
  val _underscore: Boolean = js.native
  val global: js.Any = js.native
  val version: java.lang.String = js.native
  def addLocale(lang: java.lang.String, locale: Locale): Typeofcore = js.native
  def clearImmediate(handle: Double): Unit = js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  @JSName("$for")
  def `for`[T](iterable: Iterable[T]): typings.coreJs.`for`[T] = js.native
  def getIterator[T](iterable: Iterable[T]): Iterator[T, _, js.UndefOr[scala.Nothing]] = js.native
  def isIterable(value: js.Any): Boolean = js.native
  def locale(): java.lang.String = js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Any): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setTimeout(handler: js.Any): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  @js.native
  object Array extends js.Object {
    def concat[T](array: ArrayLike[T], items: (typings.coreJs.Array[T] | T)*): typings.coreJs.Array[T] = js.native
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): typings.coreJs.Array[T] = js.native
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): typings.coreJs.Array[T] = js.native
    def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = js.native
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    def fill[T](array: ArrayLike[T], value: T): typings.coreJs.Array[T] = js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double): typings.coreJs.Array[T] = js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): typings.coreJs.Array[T] = js.native
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): typings.coreJs.Array[T] = js.native
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): typings.coreJs.Array[T] = js.native
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean]
    ): T = js.native
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): T = js.native
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit]
    ): Unit = js.native
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    def from[T](arrayLike: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    def from[T](arrayLike: Iterable[T]): typings.coreJs.Array[T] = js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typings.coreJs.Array[U] = js.native
    def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typings.coreJs.Array[U] = js.native
    def from[T, U](arrayLike: Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typings.coreJs.Array[U] = js.native
    def includes[T](array: ArrayLike[T], value: T): Boolean = js.native
    def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = js.native
    def indexOf[T](array: ArrayLike[T], searchElement: T): Double = js.native
    def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = js.native
    def isArray(arg: js.Any): /* is core-js.Array<any> */ Boolean = js.native
    def join[T](array: ArrayLike[T]): java.lang.String = js.native
    def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
    def keys[T](array: ArrayLike[T]): IterableIterator[Double] = js.native
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = js.native
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = js.native
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U]
    ): typings.coreJs.Array[U] = js.native
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], U],
      thisArg: js.Any
    ): typings.coreJs.Array[U] = js.native
    def of[T](items: T*): typings.coreJs.Array[T] = js.native
    def pop[T](array: ArrayLike[T]): T = js.native
    def push[T](array: ArrayLike[T], items: T*): Double = js.native
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = js.native
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
    ): T = js.native
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typings.coreJs.Array[T], 
          T
        ]
    ): T = js.native
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
    ): T = js.native
    @JSName("reduceRight")
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
    ): U = js.native
    @JSName("reduce")
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
    ): U = js.native
    def reverse[T](array: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    def shift[T](array: ArrayLike[T]): T = js.native
    def slice[T](array: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    def slice[T](array: ArrayLike[T], start: Double): typings.coreJs.Array[T] = js.native
    def slice[T](array: ArrayLike[T], start: Double, end: Double): typings.coreJs.Array[T] = js.native
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean]
    ): Boolean = js.native
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typings.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    def sort[T](array: ArrayLike[T]): typings.coreJs.Array[T] = js.native
    def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): typings.coreJs.Array[T] = js.native
    def splice[T](array: ArrayLike[T], start: Double): typings.coreJs.Array[T] = js.native
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): typings.coreJs.Array[T] = js.native
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typings.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): typings.coreJs.Array[T] = js.native
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
    ): typings.coreJs.Array[T] = js.native
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
    ): U = js.native
    @JSName("turn")
    def turn_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typings.coreJs.Array[T], 
          Unit
        ]
    ): U = js.native
    def unshift[T](array: ArrayLike[T], items: T*): Double = js.native
    def values[T](array: ArrayLike[T]): IterableIterator[T] = js.native
  }
  
  @js.native
  object Date extends js.Object {
    def format(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = js.native
    def format(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    def formatUTC(date: typings.coreJs.Date, template: java.lang.String): java.lang.String = js.native
    def formatUTC(date: typings.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    def now(): Double = js.native
    def toISOString(date: typings.coreJs.Date): java.lang.String = js.native
  }
  
  @js.native
  object Function extends js.Object {
    def bind(target: typings.coreJs.Function, thisArg: js.Any, argArray: js.Any*): js.Any = js.native
    def part(target: typings.coreJs.Function, args: js.Any*): js.Any = js.native
  }
  
  @js.native
  object Map extends TopLevel[MapConstructor]
  
  @js.native
  object Math extends js.Object {
    def acosh(x: Double): Double = js.native
    def asinh(x: Double): Double = js.native
    def atanh(x: Double): Double = js.native
    def cbrt(x: Double): Double = js.native
    def clz32(x: Double): Double = js.native
    def cosh(x: Double): Double = js.native
    def expm1(x: Double): Double = js.native
    def fround(x: Double): Double = js.native
    def hypot(values: Double*): Double = js.native
    def imul(x: Double, y: Double): Double = js.native
    def log10(x: Double): Double = js.native
    def log1p(x: Double): Double = js.native
    def log2(x: Double): Double = js.native
    def sign(x: Double): Double = js.native
    def sinh(x: Double): Double = js.native
    def tanh(x: Double): Double = js.native
    def trunc(x: Double): Double = js.native
  }
  
  @js.native
  object Number extends js.Object {
    var EPSILON: Double = js.native
    var MAX_SAFE_INTEGER: Double = js.native
    var MIN_SAFE_INTEGER: Double = js.native
    def acosh(x: Double): Double = js.native
    def asinh(x: Double): Double = js.native
    def atanh(x: Double): Double = js.native
    def cbrt(x: Double): Double = js.native
    def clz32(x: Double): Double = js.native
    def cosh(x: Double): Double = js.native
    def expm1(x: Double): Double = js.native
    def fround(x: Double): Double = js.native
    def hypot(values: Double*): Double = js.native
    def imul(x: Double, y: Double): Double = js.native
    def isFinite(number: Double): Boolean = js.native
    def isInteger(number: Double): Boolean = js.native
    def isNaN(number: Double): Boolean = js.native
    def isSafeInteger(number: Double): Boolean = js.native
    def log10(x: Double): Double = js.native
    def log1p(x: Double): Double = js.native
    def log2(x: Double): Double = js.native
    def parseFloat(string: java.lang.String): Double = js.native
    def parseInt(string: java.lang.String): Double = js.native
    def parseInt(string: java.lang.String, radix: Double): Double = js.native
    def random(): Double = js.native
    def random(lim: Double): Double = js.native
    def sign(x: Double): Double = js.native
    def sinh(x: Double): Double = js.native
    def tanh(x: Double): Double = js.native
    def trunc(x: Double): Double = js.native
  }
  
  @js.native
  object Object extends js.Object {
    def assign(target: js.Any, sources: js.Any*): js.Any = js.native
    def classof(value: js.Any): java.lang.String = js.native
    def create(o: js.Any): js.Any = js.native
    def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    def define[T](target: T, mixin: js.Any): T = js.native
    def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): js.Any = js.native
    def entries(`object`: js.Any): Array[_] = js.native
    def freeze[T](o: T): T = js.native
    def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
    def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
    def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
    def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
    def getPrototypeOf(o: js.Any): js.Any = js.native
    def is(value1: js.Any, value2: js.Any): Boolean = js.native
    def isExtensible(o: js.Any): Boolean = js.native
    def isFrozen(o: js.Any): Boolean = js.native
    def isObject(value: js.Any): Boolean = js.native
    def isSealed(o: js.Any): Boolean = js.native
    def keys(o: js.Any): Array[java.lang.String] = js.native
    def make[T](proto: T): T = js.native
    def make[T](proto: T, mixin: js.Any): T = js.native
    def preventExtensions[T](o: T): T = js.native
    def seal[T](o: T): T = js.native
    def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
    def values(`object`: js.Any): Array[_] = js.native
  }
  
  @js.native
  object Promise extends TopLevel[PromiseConstructor]
  
  @js.native
  object Reflect extends js.Object {
    @JSName("apply")
    def apply(target: Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
    def construct(target: Function, argumentsList: ArrayLike[_]): js.Any = js.native
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
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object): Unit = js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: java.lang.String): Unit = js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: js.Symbol): Unit = js.native
    def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): Boolean = js.native
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
    def deleteMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    def enumerate(target: js.Any): IterableIterator[_] = js.native
    def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
    def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
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
    def getMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
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
    def getMetadataKeys(target: Object): Array[_] = js.native
    def getMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    def getMetadataKeys(target: Object, targetKey: js.Symbol): Array[_] = js.native
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
    def getOwnMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
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
    def getOwnMetadataKeys(target: Object): Array[_] = js.native
    def getOwnMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    def getOwnMetadataKeys(target: Object, targetKey: js.Symbol): Array[_] = js.native
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
    def getPrototypeOf(target: js.Any): js.Any = js.native
    def has(target: js.Any, propertyKey: java.lang.String): Boolean = js.native
    def has(target: js.Any, propertyKey: js.Symbol): Boolean = js.native
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
    def hasMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
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
    def hasOwnMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    def isExtensible(target: js.Any): Boolean = js.native
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
    def metadata(metadataKey: js.Any, metadataValue: js.Any): FnCall = js.native
    def ownKeys(target: js.Any): Array[PropertyKey] = js.native
    def preventExtensions(target: js.Any): Boolean = js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = js.native
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  }
  
  @js.native
  object RegExp extends js.Object {
    def escape(str: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  object Set extends TopLevel[SetConstructor]
  
  @js.native
  object String extends js.Object {
    def at(text: java.lang.String, index: Double): java.lang.String = js.native
    def codePointAt(text: java.lang.String, pos: Double): Double = js.native
    def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = js.native
    def escapeHTML(text: java.lang.String): java.lang.String = js.native
    def fromCodePoint(codePoints: Double*): java.lang.String = js.native
    def includes(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    def padEnd(text: java.lang.String, length: Double): java.lang.String = js.native
    def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    def padStart(text: java.lang.String, length: Double): java.lang.String = js.native
    def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
    def repeat(text: java.lang.String, count: Double): java.lang.String = js.native
    def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    def unescapeHTML(text: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  object Symbol extends SymbolConstructor {
    /**
      * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
      */
    /* CompleteClass */
    override def useSimple(): Unit = js.native
    /**
      * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
      */
    /* CompleteClass */
    override def userSetter(): Unit = js.native
  }
  
  @js.native
  object WeakMap extends TopLevel[WeakMapConstructor]
  
  @js.native
  object WeakSet extends TopLevel[WeakSetConstructor]
  
}

