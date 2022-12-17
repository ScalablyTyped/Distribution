package typings.bluebird

import org.scalablytyped.runtime.Instantiable1
import typings.bluebird.anon.AsyncHooks
import typings.bluebird.anon.FnCall
import typings.bluebird.bluebirdStrings.Object
import typings.std.ArrayLike
import typings.std.Error
import typings.std.IterableIterator
import typings.std.Map
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bluebird", JSImport.Namespace)
  @js.native
  open class ^[R] protected ()
    extends StObject
       with Bluebird[R] {
    /**
      * Create a new promise. The passed in function will receive functions
      * `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
      *
      * If promise cancellation is enabled, passed in function will receive
      * one more function argument `onCancel` that allows to register an optional cancellation callback.
      */
    def this(callback: js.Function3[
            /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[Resolvable[R]], Unit], 
            /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
            /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
            Unit
          ]) = this()
    
    /**
      * See if the underlying promise was cancelled at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isCancelled(): Boolean = js.native
    
    /**
      * See if the underlying promise was fulfilled at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isFulfilled(): Boolean = js.native
    
    /**
      * See if the underlying promise was defer at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isPending(): Boolean = js.native
    
    /**
      * See if the underlying promise was rejected at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isRejected(): Boolean = js.native
    
    /**
      * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    /* CompleteClass */
    override def reason(): Any = js.native
    
    /**
      * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    /* CompleteClass */
    override def value(): R = js.native
  }
  @JSImport("bluebird", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A collection of errors. `AggregateError` is an array-like object, with numeric indices and a `.length` property.
    *  It supports all generic array methods such as `.forEach` directly.
    *
    * `AggregateError`s are caught in `.error` handlers, even if the contained errors are not operational.
    *
    * `Promise.some` and `Promise.any` use `AggregateError` as rejection reason when they fail.
    */
  @JSImport("bluebird", "AggregateError")
  @js.native
  open class AggregateError ()
    extends StObject
       with Error
       with ArrayLike[js.Error] {
    
    def every(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
    def every(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    def filter(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
    def filter(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: Any
    ): AggregateError = js.native
    
    def forEach(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    
    def indexOf(searchElement: js.Error): Double = js.native
    def indexOf(searchElement: js.Error, fromIndex: Double): Double = js.native
    
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    def lastIndexOf(searchElement: js.Error): Double = js.native
    def lastIndexOf(searchElement: js.Error, fromIndex: Double): Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    override val length: Double = js.native
    
    def map(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
    def map(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: Any
    ): AggregateError = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    def pop(): js.Error = js.native
    
    def push(errors: js.Error*): Double = js.native
    
    def reduce(
      callback: js.Function4[
          /* accumulator */ Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          Any
        ]
    ): Any = js.native
    def reduce(
      callback: js.Function4[
          /* accumulator */ Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          Any
        ]
    ): Any = js.native
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          Any
        ],
      initialValue: Any
    ): Any = js.native
    
    def reverse(): AggregateError = js.native
    
    def shift(): js.Error = js.native
    
    def slice(): AggregateError = js.native
    def slice(begin: Double): AggregateError = js.native
    def slice(begin: Double, end: Double): AggregateError = js.native
    def slice(begin: Unit, end: Double): AggregateError = js.native
    
    def some(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
    def some(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    def sort(): AggregateError = js.native
    def sort(compareFunction: js.Function2[/* errLeft */ js.Error, /* errRight */ js.Error, Double]): AggregateError = js.native
    
    def unshift(errors: js.Error*): Double = js.native
  }
  
  /**
    * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
    */
  @JSImport("bluebird", "CancellationError")
  @js.native
  open class CancellationError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * returned by `Bluebird.disposer()`.
    */
  @JSImport("bluebird", "Disposer")
  @js.native
  open class Disposer[R] () extends StObject
  
  /**
    * Represents an error is an explicit promise rejection as opposed to a thrown error.
    *  For example, if an error is errbacked by a callback API promisified through undefined or undefined
    *  and is not a typed error, it will be converted to a `OperationalError` which has the original error in
    *  the `.cause` property.
    *
    * `OperationalError`s are caught in `.error` handlers.
    */
  @JSImport("bluebird", "OperationalError")
  @js.native
  open class OperationalError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bluebird", "Promise")
  @js.native
  open class Promise[R] protected ()
    extends StObject
       with Bluebird[R] {
    /**
      * Create a new promise. The passed in function will receive functions
      * `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
      *
      * If promise cancellation is enabled, passed in function will receive
      * one more function argument `onCancel` that allows to register an optional cancellation callback.
      */
    def this(callback: js.Function3[
            /* resolve */ js.Function1[
              /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
            /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
            Unit
          ]) = this()
    
    /**
      * See if the underlying promise was cancelled at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isCancelled(): Boolean = js.native
    
    /**
      * See if the underlying promise was fulfilled at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isFulfilled(): Boolean = js.native
    
    /**
      * See if the underlying promise was defer at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isPending(): Boolean = js.native
    
    /**
      * See if the underlying promise was rejected at the creation time of this inspection object.
      */
    /* CompleteClass */
    override def isRejected(): Boolean = js.native
    
    /**
      * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    /* CompleteClass */
    override def reason(): Any = js.native
    
    /**
      * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    /* CompleteClass */
    override def value(): R = js.native
  }
  /**
    * Create a new promise. The passed in function will receive functions `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
    * If promise cancellation is enabled, passed in function will receive one more function argument `onCancel` that allows to register an optional cancellation callback.
    */
  /* static member */
  @JSImport("bluebird", "Promise")
  @js.native
  def Promise: Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  inline def Promise_=(
    x: Instantiable1[
      /* callback */ js.Function3[
        /* resolve */ js.Function1[
          /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
          Unit
        ], 
        /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
        /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
        Unit
      ], 
      Bluebird[js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  /**
    * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
    */
  @JSImport("bluebird", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* static member */
  inline def all[T1](values: js.Array[Resolvable[T1]]): Bluebird[js.Array[T1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Array[T1]]]
  // array with values
  /* static member */
  inline def all[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[js.Array[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Array[R]]]
  /* static member */
  inline def all[T1, T2](values: js.Tuple2[Resolvable[T1], Resolvable[T2]]): Bluebird[js.Tuple2[T1, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Tuple2[T1, T2]]]
  /* static member */
  inline def all[T1, T2, T3](values: js.Tuple3[Resolvable[T1], Resolvable[T2], Resolvable[T3]]): Bluebird[js.Tuple3[T1, T2, T3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Tuple3[T1, T2, T3]]]
  /* static member */
  inline def all[T1, T2, T3, T4](values: js.Tuple4[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4]]): Bluebird[js.Tuple4[T1, T2, T3, T4]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Tuple4[T1, T2, T3, T4]]]
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is fulfilled when all the items in the array are fulfilled.
    * The promise's fulfillment value is an array with fulfillment values at respective positions to the original array.
    * If any promise in the array rejects, the returned promise is rejected with the rejection reason.
    */
  // TODO enable more overloads
  // array with promises of different types
  /* static member */
  inline def all[T1, T2, T3, T4, T5](values: js.Tuple5[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4], Resolvable[T5]]): Bluebird[js.Tuple5[T1, T2, T3, T4, T5]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Tuple5[T1, T2, T3, T4, T5]]]
  
  /* static member */
  inline def allSettled[T1](values: js.Array[Resolvable[T1]]): Bluebird[js.Array[Inspection[T1]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Array[Inspection[T1]]]]
  /* static member */
  inline def allSettled[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[js.Array[Inspection[R]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Array[Inspection[R]]]]
  /* static member */
  inline def allSettled[T1, T2](values: js.Tuple2[Resolvable[T1], Resolvable[T2]]): Bluebird[js.Tuple2[Inspection[T1], Inspection[T2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Tuple2[Inspection[T1], Inspection[T2]]]]
  /* static member */
  inline def allSettled[T1, T2, T3](values: js.Tuple3[Resolvable[T1], Resolvable[T2], Resolvable[T3]]): Bluebird[js.Tuple3[Inspection[T1], Inspection[T2], Inspection[T3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Tuple3[Inspection[T1], Inspection[T2], Inspection[T3]]]]
  /* static member */
  inline def allSettled[T1, T2, T3, T4](values: js.Tuple4[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4]]): Bluebird[js.Tuple4[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[js.Tuple4[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4]]]]
  /* static member */
  inline def allSettled[T1, T2, T3, T4, T5](values: js.Tuple5[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4], Resolvable[T5]]): Bluebird[
    js.Tuple5[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4], Inspection[T5]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[
    js.Tuple5[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4], Inspection[T5]]
  ]]
  
  // tslint:disable-line:unified-signatures
  /**
    * Like `Promise.some()`, with 1 as `count`. However, if the promise fulfills, the fulfillment value is not an array of 1 but the value directly.
    */
  /* static member */
  inline def any[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[R]]
  
  /* static member */
  inline def attempt[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(fn.asInstanceOf[js.Any]).asInstanceOf[Bluebird[R]]
  
  /**
    * Sugar for `Promise.resolve(undefined).bind(thisArg);`. See `.bind()`.
    */
  /* static member */
  inline def bind(thisArg: Any): Bluebird[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(thisArg.asInstanceOf[js.Any]).asInstanceOf[Bluebird[Unit]]
  
  /**
    * Cast the given `value` to a trusted promise.
    *
    * If `value` is already a trusted `Promise`, it is returned as is. If `value` is not a thenable, a fulfilled is: Promise returned with `value` as its fulfillment value.
    * If `value` is a thenable (Promise-like object, like those returned by jQuery's `$.ajax`), returns a trusted that: Promise assimilates the state of the thenable.
    */
  /* static member */
  inline def cast[R](value: Resolvable[R]): Bluebird[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("cast")(value.asInstanceOf[js.Any]).asInstanceOf[Bluebird[R]]
  
  /**
    * Configure long stack traces, warnings, monitoring and cancellation.
    * Note that even though false is the default here, a development environment might be detected which automatically
    *  enables long stack traces and warnings.
    */
  /* static member */
  inline def config(options: AsyncHooks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns a function that can use `yield` to run asynchronous code synchronously.
    *
    * This feature requires the support of generators which are drafted in the next version of the language.
    * Node version greater than `0.11.2` is required and needs to be executed with the `--harmony-generators` (or `--harmony`) command-line switch.
    */
  // TODO: After https://github.com/Microsoft/TypeScript/issues/2983 is implemented, we can use
  // the return type propagation of generators to automatically infer the return type T.
  /* static member */
  inline def coroutine[T](generatorFunction: js.Function0[IterableIterator[Any]]): js.Function0[Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Bluebird[T]]]
  inline def coroutine[T](generatorFunction: js.Function0[IterableIterator[Any]], options: CoroutineOptions): js.Function0[Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Bluebird[T]]]
  /* static member */
  inline def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[Any]]): js.Function1[/* a1 */ A1, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a1 */ A1, Bluebird[T]]]
  inline def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[Any]], options: CoroutineOptions): js.Function1[/* a1 */ A1, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a1 */ A1, Bluebird[T]]]
  /* static member */
  inline def coroutine[T, A1, A2](generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[Any]]): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]]]
  inline def coroutine[T, A1, A2](
    generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[Any]],
    options: CoroutineOptions
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]]]
  /* static member */
  inline def coroutine[T, A1, A2, A3](generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[Any]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]]]
  inline def coroutine[T, A1, A2, A3](
    generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[Any]],
    options: CoroutineOptions
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]]]
  /* static member */
  inline def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[Any]]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]]]
  inline def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[Any]],
    options: CoroutineOptions
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]]]
  /* static member */
  inline def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[Any]]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]]]
  inline def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[Any]],
    options: CoroutineOptions
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]]]
  /* static member */
  inline def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[Any]
    ]
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]]]
  inline def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[Any]
    ],
    options: CoroutineOptions
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]]]
  /* static member */
  inline def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[Any]
    ]
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ]]
  inline def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[Any]
    ],
    options: CoroutineOptions
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ]]
  /* static member */
  inline def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[Any]
    ]
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ]]
  inline def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[Any]
    ],
    options: CoroutineOptions
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("coroutine")(generatorFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ]]
  
  /**
    * @deprecated
    * Create a promise with undecided fate and return a `PromiseResolver` to control it. See resolution?: Promise(#promise-resolution).
    * @see http://bluebirdjs.com/docs/deprecated-apis.html#promise-resolution
    */
  /* static member */
  inline def defer[R](): Resolver[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Resolver[R]]
  
  /* static member */
  inline def delay(ms: Double): Bluebird[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[Bluebird[Unit]]
  /**
    * Returns a promise that will be resolved with value (or undefined) after given ms milliseconds.
    * If value is a promise, the delay will start counting down when it is fulfilled and the returned
    *  promise will be fulfilled with the fulfillment value of the value promise.
    */
  /* static member */
  inline def delay[R](ms: Double, value: Resolvable[R]): Bluebird[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Bluebird[R]]
  
  /**
    * Iterate over an array, or a promise of an array,
    * which contains promises (or a mix of promises and values) with the given iterator function with the signature `(item, index, value)`
    * where item is the resolved value of a respective promise in the input array.
    * Iteration happens serially. If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * Resolves to the original array unmodified, this method is meant to be used for side effects.
    * If the iterator function returns a promise or a thenable, the result for the promise is awaited for before continuing with next iteration.
    */
  /* static member */
  inline def each[R](values: Resolvable[js.Iterable[Resolvable[R]]], iterator: IterateFunction[R, Any]): Bluebird[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(values.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Bluebird[js.Array[R]]]
  
  /**
    * Filter an array, or a promise of an array,
    * which contains a promises (or a mix of promises and values) with the given `filterer` function with the signature `(item, index, arrayLength)`
    * where `item` is the resolved value of a respective promise in the input array.
    * If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * The return values from the filtered functions are coerced to booleans, with the exception of promises and thenables which are awaited for their eventual result.
    *
    * *The original array is not modified.
    */
  /* static member */
  inline def filter[R](values: Resolvable[js.Iterable[Resolvable[R]]], filterer: IterateFunction[R, Boolean]): Bluebird[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(values.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any])).asInstanceOf[Bluebird[js.Array[R]]]
  inline def filter[R](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    filterer: IterateFunction[R, Boolean],
    option: ConcurrencyOption
  ): Bluebird[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(values.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Bluebird[js.Array[R]]]
  
  /* static member */
  inline def fromCallback[T](
    resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
  ): Bluebird[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(resolver.asInstanceOf[js.Any]).asInstanceOf[Bluebird[T]]
  inline def fromCallback[T](
    resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit],
    options: FromNodeOptions
  ): Bluebird[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(resolver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Bluebird[T]]
  
  /**
    * Returns a promise that is resolved by a node style callback function.
    */
  /* static member */
  inline def fromNode[T](
    resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
  ): Bluebird[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNode")(resolver.asInstanceOf[js.Any]).asInstanceOf[Bluebird[T]]
  inline def fromNode[T](
    resolver: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit],
    options: FromNodeOptions
  ): Bluebird[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNode")(resolver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Bluebird[T]]
  
  /**
    * Returns a new independent copy of the Bluebird library.
    *
    * This method should be used before you use any of the methods which would otherwise alter the global Bluebird object - to avoid polluting global state.
    */
  inline def getNewLibraryCopy(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNewLibraryCopy")().asInstanceOf[Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ]]
  
  /**
    * See if `value` is a trusted Promise.
    */
  /* static member */
  inline def is(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // variadic array
  /** @deprecated use .all instead */
  /* static member */
  inline def join[R](values: Resolvable[R]*): Bluebird[js.Array[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Bluebird[js.Array[R]]]
  /**
    * Promise.join(
    *   Promise<any>|any values...,
    *   function handler
    * ) -> Promise
    * For coordinating multiple concurrent discrete promises.
    *
    * Note: In 1.x and 0.x Promise.join used to be a Promise.all that took the values in as arguments instead in an array.
    * This behavior has been deprecated but is still supported partially - when the last argument is an immediate function value the new semantics will apply
    */
  /* static member */
  inline def join[R, A1](arg1: Resolvable[A1], handler: js.Function1[/* arg1 */ A1, Resolvable[R]]): Bluebird[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(arg1.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Bluebird[R]]
  /* static member */
  inline def join[R, A1, A2](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]
  ): Bluebird[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Bluebird[R]]
  /* static member */
  inline def join[R, A1, A2, A3](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]
  ): Bluebird[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Bluebird[R]]
  /* static member */
  inline def join[R, A1, A2, A3, A4](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    arg4: Resolvable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]
  ): Bluebird[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Bluebird[R]]
  /* static member */
  inline def join[R, A1, A2, A3, A4, A5](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    arg4: Resolvable[A4],
    arg5: Resolvable[A5],
    handler: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
  ): Bluebird[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Bluebird[R]]
  
  /**
    * Call this right after the library is loaded to enabled long stack traces.
    *
    * Long stack traces cannot be disabled after being enabled, and cannot be enabled after promises have already been created.
    * Long stack traces imply a substantial performance penalty, around 4-5x for throughput and 0.5x for latency.
    */
  /* static member */
  inline def longStackTraces(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("longStackTraces")().asInstanceOf[Unit]
  
  /**
    * Map an array, or a promise of an array,
    * which contains a promises (or a mix of promises and values) with the given `mapper` function with the signature `(item, index, arrayLength)`
    * where `item` is the resolved value of a respective promise in the input array.
    * If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * If the `mapper` function returns promises or thenables, the returned promise will wait for all the mapped results to be resolved as well.
    *
    * *The original array is not modified.*
    */
  /* static member */
  inline def map[R, U](values: Resolvable[js.Iterable[Resolvable[R]]], mapper: IterateFunction[R, U]): Bluebird[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(values.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[Bluebird[js.Array[U]]]
  inline def map[R, U](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    mapper: IterateFunction[R, U],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(values.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Bluebird[js.Array[U]]]
  
  /**
    * Given an Iterable(arrays are Iterable), or a promise of an Iterable, which produces promises (or a mix of promises and values),
    * iterate over all the values in the Iterable into an array and iterate over the array serially, in-order.
    *
    * Returns a promise for an array that contains the values returned by the iterator function in their respective positions.
    * The iterator won't be called for an item until its previous item, and the promise returned by the iterator for that item are fulfilled.
    * This results in a mapSeries kind of utility but it can also be used simply as a side effect iterator similar to Array#forEach.
    *
    * If any promise in the input array is rejected or any promise returned by the iterator function is rejected, the result will be rejected as well.
    */
  /* static member */
  inline def mapSeries[R, U](values: Resolvable[js.Iterable[Resolvable[R]]], iterator: IterateFunction[R, U]): Bluebird[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(values.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Bluebird[js.Array[U]]]
  
  /**
    * Returns a new function that wraps the given function `fn`.
    * The new function will always return a promise that is fulfilled with the original functions return values or rejected with thrown exceptions from the original function.
    * This method is convenient when a function can sometimes return synchronously or throw synchronously.
    */
  /* static member */
  inline def method[R](fn: js.Function0[Resolvable[R]]): js.Function0[Bluebird[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Bluebird[R]]]
  /* static member */
  inline def method[R](fn: js.Function1[/* repeated */ Any, Resolvable[R]]): js.Function1[/* repeated */ Any, Bluebird[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Bluebird[R]]]
  /* static member */
  inline def method[R, A1, A2](fn: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]]]
  /* static member */
  inline def method[R, A1, A2, A3](fn: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]]]
  /* static member */
  inline def method[R, A1, A2, A3, A4](fn: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]]]
  /* static member */
  inline def method[R, A1, A2, A3, A4, A5](
    fn: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]]]
  
  /* static member */
  inline def method_RA1[R, A1](fn: js.Function1[/* arg1 */ A1, Resolvable[R]]): js.Function1[/* arg1 */ A1, Bluebird[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Bluebird[R]]]
  
  /**
    * This is relevant to browser environments with no module loader.
    *
    * Release control of the Promise namespace to whatever it was before this library was loaded.
    * Returns a reference to the library namespace so you can attach it to something else.
    */
  inline def noConflict(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ]]
  
  /**
    * Add handler as the handler to call when there is a possibly unhandled rejection.
    * The default handler logs the error stack to stderr or console.error in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    *
    * Note: this hook is specific to the bluebird instance its called on, application developers should use global rejection events.
    */
  /* static member */
  inline def onPossiblyUnhandledRejection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPossiblyUnhandledRejection")().asInstanceOf[Unit]
  /**
    * Add `handler` as the handler to call when there is a possibly unhandled rejection. The default handler logs the error stack to stderr or `console.error` in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    */
  /* static member */
  inline def onPossiblyUnhandledRejection(handler: js.Function1[/* reason */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPossiblyUnhandledRejection")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onPossiblyUnhandledRejection(handler: js.Function2[/* error */ js.Error, /* promise */ Bluebird[Any], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPossiblyUnhandledRejection")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def promisify(nodeFunction: js.Function1[/* repeated */ Any, Unit]): js.Function1[/* repeated */ Any, Bluebird[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(nodeFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Bluebird[Any]]]
  inline def promisify(nodeFunction: js.Function1[/* repeated */ Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ Any, Bluebird[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(nodeFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Bluebird[Any]]]
  /* static member */
  inline def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Bluebird[T]]]
  inline def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Bluebird[T]]]
  /* static member */
  inline def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]]]
  inline def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]]]
  /* static member */
  inline def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]]]
  inline def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]]]
  /* static member */
  inline def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]]]
  inline def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]]]
  /* static member */
  inline def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]]]
  inline def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]]]
  
  /**
    * Promisifies the entire object by going through the object's properties and creating an async equivalent of each function on the object and its prototype chain.
    *
    * The promisified method name will be the original method name postfixed with `Async`. Returns the input object.
    *
    * Note that the original methods on the object are not overwritten but new methods are created with the `Async`-postfix. For example,
    * if you `promisifyAll()` the node.js `fs` object use `fs.statAsync()` to call the promisified `stat` method.
    */
  // TODO how to model promisifyAll?
  /* static member */
  inline def promisifyAll[T /* <: js.Object */](target: T): PromisifyAll_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisifyAll")(target.asInstanceOf[js.Any]).asInstanceOf[PromisifyAll_[T]]
  inline def promisifyAll[T /* <: js.Object */](target: T, options: PromisifyAllOptions[T]): PromisifyAll_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifyAll")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PromisifyAll_[T]]
  
  /**
    * Returns a function that will wrap the given `nodeFunction`.
    *
    * Instead of taking a callback, the returned function will return a promise whose fate is decided by the callback behavior of the given node function.
    * The node function should conform to node.js convention of accepting a callback as last argument and
    * calling that callback with error as the first argument and success value on the second argument.
    *
    * If the `nodeFunction` calls its callback with multiple success values, the fulfillment value will be an array of them.
    *
    * If you pass a `receiver`, the `nodeFunction` will be called as a method on the `receiver`.
    */
  /* static member */
  inline def promisify_T_Function0[T](
    func: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit]
  ): js.Function0[Bluebird[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Bluebird[T]]]
  inline def promisify_T_Function0[T](
    func: js.Function1[/* callback */ js.Function2[/* err */ Any, /* result */ js.UndefOr[T], Unit], Unit],
    options: PromisifyOptions
  ): js.Function0[Bluebird[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisify")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Bluebird[T]]]
  
  // object
  /* static member */
  inline def props[T](`object`: ResolvableProps[T]): Bluebird[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(`object`.asInstanceOf[js.Any]).asInstanceOf[Bluebird[T]]
  // trusted promise for object
  /* static member */
  inline def props[T](`object`: PromiseLike[ResolvableProps[T]]): Bluebird[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(`object`.asInstanceOf[js.Any]).asInstanceOf[Bluebird[T]]
  /**
    * Like ``Promise.all`` but for object properties instead of array items. Returns a promise that is fulfilled when all the properties of the object are fulfilled.
    *
    * The promise's fulfillment value is an object with fulfillment values at respective keys to the original object.
    * If any promise in the object rejects, the returned promise is rejected with the rejection reason.
    *
    * If `object` is a trusted `Promise`, then it will be treated as a promise for object rather than for its properties.
    * All other objects are treated for their properties as is returned by `Object.keys` - the object's own enumerable properties.
    *
    * *The original object is not modified.*
    */
  // map
  /* static member */
  inline def props[K, V](map: Resolvable[Map[K, Resolvable[V]]]): Bluebird[Map[K, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(map.asInstanceOf[js.Any]).asInstanceOf[Bluebird[Map[K, V]]]
  
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is
    * fulfilled or rejected as soon as a promise in the array is fulfilled or rejected with the respective rejection reason or fulfillment value.
    *
    * **Note** If you pass empty array or a sparse array with no values, or a promise/thenable for such, it will be forever pending.
    */
  /* static member */
  inline def race[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[Bluebird[R]]
  
  /**
    * Reduce an array, or a promise of an array,
    * which contains a promises (or a mix of promises and values) with the given `reducer` function with the signature `(total, current, index, arrayLength)`
    * where `item` is the resolved value of a respective promise in the input array.
    * If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * If the reducer function returns a promise or a thenable, the result for the promise is awaited for before continuing with next iteration.
    *
    * *The original array is not modified. If no `initialValue` is given and the array doesn't contain at least 2 items,
    * the callback will not be called and `undefined` is returned.
    *
    * If `initialValue` is given and the array doesn't have at least 1 item, `initialValue` is returned.*
    */
  /* static member */
  inline def reduce[R, U](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Resolvable[U]
    ]
  ): Bluebird[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(values.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[Bluebird[U]]
  inline def reduce[R, U](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Resolvable[U]
    ],
    initialValue: U
  ): Bluebird[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(values.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Bluebird[U]]
  
  /**
    * Create a promise that is rejected with the given `reason`.
    */
  /* static member */
  inline def reject(reason: Any): Bluebird[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(reason.asInstanceOf[js.Any]).asInstanceOf[Bluebird[scala.Nothing]]
  
  /**
    * Create a promise that is resolved with the given `value`. If `value` is a thenable or promise, the returned promise will assume its state.
    */
  /* static member */
  inline def resolve(): Bluebird[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Bluebird[Unit]]
  /* static member */
  inline def resolve[R](value: Resolvable[R]): Bluebird[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[Bluebird[R]]
  
  /**
    * Changes how bluebird schedules calls a-synchronously.
    *
    * @param scheduler Should be a function that asynchronously schedules
    *                  the calling of the passed in function
    */
  inline def setScheduler(scheduler: js.Function1[/* callback */ js.Function1[/* repeated */ Any, Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setScheduler")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Initiate a competitive race between multiple promises or values (values will become immediately fulfilled promises).
    * When `count` amount of promises have been fulfilled, the returned promise is fulfilled with an array that contains the fulfillment values of
    * the winners in order of resolution.
    *
    * If too many promises are rejected so that the promise can never become fulfilled,
    * it will be immediately rejected with an array of rejection reasons in the order they were thrown in.
    *
    * *The original array is not modified.*
    */
  /* static member */
  inline def some[R](values: Resolvable[js.Iterable[Resolvable[R]]], count: Double): Bluebird[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(values.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Bluebird[js.Array[R]]]
  
  /**
    * Start the chain of promises with `Promise.try`. Any synchronous exceptions will be turned into rejections on the returned promise.
    *
    * Note about second argument: if it's specifically a true array, its values become respective arguments for the function call.
    * Otherwise it is passed as is as the first argument for the function call.
    *
    * Alias for `attempt();` for compatibility with earlier ECMAScript version.
    */
  /* static member */
  inline def `try`[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("try")(fn.asInstanceOf[js.Any]).asInstanceOf[Bluebird[R]]
  
  /**
    * In conjunction with `.disposer`, using will make sure that no matter what, the specified disposer
    *  will be called when the promise returned by the callback passed to using has settled. The disposer is
    *  necessary because there is no standard interface in node for disposing resources.
    */
  /* static member */
  inline def `using`[R, T](disposer: Disposer[R], executor: js.Function1[/* transaction */ R, PromiseLike[T]]): Bluebird[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(disposer.asInstanceOf[js.Any], executor.asInstanceOf[js.Any])).asInstanceOf[Bluebird[T]]
  /* static member */
  inline def `using`[R1, R2, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    executor: js.Function2[/* transaction1 */ R1, /* transaction2 */ R2, PromiseLike[T]]
  ): Bluebird[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(disposer.asInstanceOf[js.Any], disposer2.asInstanceOf[js.Any], executor.asInstanceOf[js.Any])).asInstanceOf[Bluebird[T]]
  /* static member */
  inline def `using`[R1, R2, R3, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    disposer3: Disposer[R3],
    executor: js.Function3[/* transaction1 */ R1, /* transaction2 */ R2, /* transaction3 */ R3, PromiseLike[T]]
  ): Bluebird[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(disposer.asInstanceOf[js.Any], disposer2.asInstanceOf[js.Any], disposer3.asInstanceOf[js.Any], executor.asInstanceOf[js.Any])).asInstanceOf[Bluebird[T]]
  
  /**
    * The version number of the library
    */
  /* static member */
  @JSImport("bluebird", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Bluebird[R]
    extends StObject
       with PromiseLike[R]
       with Inspection[R] {
    
    /**
      * Same as calling `Promise.all(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def all(): Bluebird[scala.Nothing] = js.native
    @JSName("all")
    def all_R[R](): Bluebird[js.Array[R]] = js.native
    @JSName("all")
    def all_T1[T1](): Bluebird[js.Array[T1]] = js.native
    @JSName("all")
    def all_T1T2[T1, T2](): Bluebird[js.Tuple2[T1, T2]] = js.native
    @JSName("all")
    def all_T1T2T3[T1, T2, T3](): Bluebird[js.Tuple3[T1, T2, T3]] = js.native
    @JSName("all")
    def all_T1T2T3T4[T1, T2, T3, T4](): Bluebird[js.Tuple4[T1, T2, T3, T4]] = js.native
    /**
      * Same as calling `Promise.all(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    @JSName("all")
    def all_T1T2T3T4T5[T1, T2, T3, T4, T5](): Bluebird[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    
    /**
      * Same as calling `Promise.any(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def any(): Bluebird[scala.Nothing] = js.native
    /**
      * Same as calling `Promise.any(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    @JSName("any")
    def any_Q[Q](): Bluebird[Q] = js.native
    
    def asCallback(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
    def asCallback(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
    def asCallback(sink: Any*): this.type = js.native
    
    /**
      * Create a promise that follows this promise, but is bound to the given `thisArg` value.
      * A bound promise will call its handlers with the bound value set to `this`.
      *
      * Additionally promises derived from a bound promise will also be bound promises with the same `thisArg` binding as the original promise.
      */
    def bind(thisArg: Any): Bluebird[R] = js.native
    
    /**
      * This is a convenience method for doing:
      *
      * <code>
      * promise.then(function(obj){
      *     return obj[propertyName].call(obj, arg...);
      * });
      * </code>
      */
    def call[U /* <: /* keyof Q */ String */, Q](propertyName: U, args: Any*): Bluebird[
        /* import warning: importer.ImportType#apply Failed type conversion: Q[U] extends (args : ...any): any ? std.ReturnType<Q[U]> : never */ js.Any
      ] = js.native
    
    /**
      * Cancel this `promise`. Will not do anything if this promise is already settled or if the cancellation feature has not been enabled
      */
    def cancel(): Unit = js.native
    
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def `catch`[U](): Bluebird[U | R] = js.native
    def `catch`[U](onReject: js.Function1[/* error */ Any, Resolvable[U]]): Bluebird[U | R] = js.native
    def `catch`[U, E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    /**
      * This extends `.catch` to work more like catch-clauses in languages like Java or C#.
      *
      * Instead of manually checking `instanceof` or `.name === "SomeError"`,
      * you may specify a number of error constructors which are eligible for this catch handler.
      * The catch handler that is first met that has eligible constructors specified, is the one that will be called.
      *
      * This method also supports predicate-based filters.
      * If you pass a predicate function instead of an error constructor, the predicate will receive the error as an argument.
      * The return result of the predicate will be used determine whether the error handler should be called.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def `catch`[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[js.Error], filter2: CatchFilter[js.Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[js.Error], filter2: Constructor[js.Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[js.Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[js.Error], filter2: CatchFilter[js.Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    // No need to be specific about Error types in these overrides, since there's no handler function
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[js.Error], filter2: Constructor[js.Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[js.Error], value: U): Bluebird[R | U] = js.native
    /**
      * Convenience method for:
      *
      * <code>
      * .catch(function() {
      *    return value;
      * });
      * </code>
      *
      * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.catchReturn()`
      */
    def catchReturn[U](value: U): Bluebird[R | U] = js.native
    
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: CatchFilter[js.Error], filter2: CatchFilter[js.Error], reason: js.Error): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: CatchFilter[js.Error], filter2: Constructor[js.Error], reason: js.Error): Bluebird[R] = js.native
    def catchThrow(// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[js.Error], reason: js.Error): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: CatchFilter[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: Constructor[js.Error], filter2: CatchFilter[js.Error], reason: js.Error): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: CatchFilter[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    // No need to be specific about Error types in these overrides, since there's no handler function
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      filter5: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      filter4: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[js.Error],
      filter2: Constructor[js.Error],
      filter3: Constructor[js.Error],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: Constructor[js.Error], filter2: Constructor[js.Error], reason: js.Error): Bluebird[R] = js.native
    def catchThrow(filter1: Constructor[js.Error], reason: js.Error): Bluebird[R] = js.native
    /**
      * Convenience method for:
      *
      * <code>
      * .catch(function() {
      *    throw reason;
      * });
      * </code>
      * Same limitations apply as with `.catchReturn()`.
      */
    def catchThrow(reason: js.Error): Bluebird[R] = js.native
    
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def caught[U](): Bluebird[U | R] = js.native
    def caught[U](onReject: js.Function1[/* error */ Any, Resolvable[U]]): Bluebird[U | R] = js.native
    def caught[U, E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def caught[U, E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[U]]): Bluebird[U | R] = js.native
    def caught[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def caught[U, E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def caught[U, E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def caught[U, E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def caught[U, E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[U]]
    ): Bluebird[U | R] = js.native
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    @JSName("caught")
    var caught_Original: FnCall[R] = js.native
    
    /**
      * Same as calling `Promise.delay(ms, this)`.
      */
    def delay(ms: Double): Bluebird[R] = js.native
    
    /**
      * A meta method used to specify the disposer method that cleans up a resource when using `Promise.using`.
      *
      * Returns a Disposer object which encapsulates both the resource as well as the method to clean it up.
      *  The user can pass this object to `Promise.using` to get access to the resource when it becomes available,
      *  as well as to ensure its automatically cleaned up.
      *
      * The second argument passed to a disposer is the result promise of the using block, which you can
      *  inspect synchronously.
      */
    def disposer(disposeFn: js.Function2[/* arg */ R, /* promise */ Bluebird[R], Resolvable[Unit]]): Disposer[R] = js.native
    
    /**
      * Like `.then()`, but any unhandled rejection that ends up here will be thrown as an error.
      */
    def done[U](): Unit = js.native
    def done[U](onFulfilled: js.Function1[/* value */ R, Resolvable[U]]): Unit = js.native
    def done[U](
      onFulfilled: js.Function1[/* value */ R, Resolvable[U]],
      onRejected: js.Function1[/* error */ Any, Resolvable[U]]
    ): Unit = js.native
    def done[U](onFulfilled: Unit, onRejected: js.Function1[/* error */ Any, Resolvable[U]]): Unit = js.native
    
    /**
      * Same as calling ``Bluebird.each(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def each[Q](iterator: IterateFunction[Q, Any]): Bluebird[R] = js.native
    
    /**
      * Like `.catch` but instead of catching all types of exceptions,
      * it only catches those that don't originate from thrown errors but rather from explicit rejections.
      */
    def error[U](onReject: js.Function1[/* reason */ Any, Resolvable[U]]): Bluebird[U] = js.native
    
    /**
      * Same as calling ``Promise.filter(thisPromise, filterer)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def filter[Q](filterer: IterateFunction[Q, Boolean]): Bluebird[R] = js.native
    def filter[Q](filterer: IterateFunction[Q, Boolean], options: ConcurrencyOption): Bluebird[R] = js.native
    
    /**
      * Pass a handler that will be called regardless of this promise's fate. Returns a new promise chained from this promise.
      *
      * There are special semantics for `.finally()` in that the final value cannot be modified from the handler.
      *
      * Alias `.lastly();` for compatibility with earlier ECMAScript version.
      */
    def `finally`(handler: js.Function0[Resolvable[Any]]): Bluebird[R] = js.native
    
    /**
      * This is a convenience method for doing:
      *
      * <code>
      * promise.then(function(obj){
      *     return obj[propertyName];
      * });
      * </code>
      */
    def get[U /* <: /* keyof R */ String */](key: U): Bluebird[
        /* import warning: importer.ImportType#apply Failed type conversion: R[U] */ js.Any
      ] = js.native
    
    /**
      * See if this `promise` is resolved -> either fulfilled or rejected.
      */
    def isResolved(): Boolean = js.native
    
    def lastly(handler: js.Function0[Resolvable[Any]]): Bluebird[R] = js.native
    @JSName("lastly")
    var lastly_Original: js.Function1[/* handler */ js.Function0[Resolvable[Any]], Bluebird[R]] = js.native
    
    /**
      * Same as calling `Bluebird.map(thisPromise, mapper)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def map[U, Q](mapper: IterateFunction[Q, U]): Bluebird[js.Array[U]] = js.native
    def map[U, Q](mapper: IterateFunction[Q, U], options: ConcurrencyOption): Bluebird[js.Array[U]] = js.native
    
    /**
      * Same as calling ``Bluebird.mapSeries(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def mapSeries[U, Q](iterator: IterateFunction[Q, U]): Bluebird[js.Array[U]] = js.native
    
    /**
      * Register a node-style callback on this promise.
      *
      * When this promise is is either fulfilled or rejected,
      * the node callback will be called back with the node.js convention
      * where error reason is the first argument and success value is the second argument.
      *
      * The error argument will be `null` in case of success.
      * If the `callback` argument is not a function, this method does not do anything.
      */
    def nodeify(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
    def nodeify(callback: js.Function2[/* err */ Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
    def nodeify(sink: Any*): this.type = js.native
    
    def props[T](): Bluebird[T] = js.native
    /**
      * Same as calling `Promise.props(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    @JSName("props")
    def props_KV[K, V](): Bluebird[Map[K, V]] = js.native
    
    /**
      * Same as calling `Promise.race(thisPromise, count)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def race(): Bluebird[scala.Nothing] = js.native
    /**
      * Same as calling `Promise.race(thisPromise, count)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    @JSName("race")
    def race_Q[Q](): Bluebird[Q] = js.native
    
    /**
      * Same as calling `Promise.reduce(thisPromise, Function reducer, initialValue)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def reduce[U, Q](
      reducer: js.Function4[/* memo */ U, /* item */ Q, /* index */ Double, /* arrayLength */ Double, Resolvable[U]]
    ): Bluebird[U] = js.native
    def reduce[U, Q](
      reducer: js.Function4[/* memo */ U, /* item */ Q, /* index */ Double, /* arrayLength */ Double, Resolvable[U]],
      initialValue: U
    ): Bluebird[U] = js.native
    
    /**
      * Synchronously inspect the state of this `promise`. The `PromiseInspection` will represent the state of
      * the promise as snapshotted at the time of calling `.reflect()`.
      */
    def reflect(): Bluebird[Inspection[R]] = js.native
    
    /**
      * Convenience method for:
      *
      * <code>
      * .then(function() {
      *    return value;
      * });
      * </code>
      *
      * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.return()`
      *
      * Alias `.thenReturn();` for compatibility with earlier ECMAScript version.
      */
    def `return`(): Bluebird[Unit] = js.native
    def `return`[U](value: U): Bluebird[U] = js.native
    
    /**
      * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def some(count: Double): Bluebird[scala.Nothing] = js.native
    /**
      * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    @JSName("some")
    def some_Q[Q](count: Double): Bluebird[R] = js.native
    
    /**
      * Like calling `.then`, but the fulfillment value or rejection reason is assumed to be an array, which is flattened to the formal parameters of the handlers.
      */
    def spread[U, Q](fulfilledHandler: js.Function1[/* repeated */ Q, Resolvable[U]]): Bluebird[U] = js.native
    
    /**
      * Basically sugar for doing: somePromise.catch(function(){});
      *
      * Which is needed in case error handlers are attached asynchronously to the promise later, which would otherwise result in premature unhandled rejection reporting.
      */
    def suppressUnhandledRejections(): Unit = js.native
    
    /**
      * Like `.finally()`, but not called for rejections.
      */
    def tap(onFulFill: js.Function1[/* value */ R, Resolvable[Any]]): Bluebird[R] = js.native
    
    /**
      * Like `.catch()` but rethrows the error
      */
    def tapCatch(onReject: js.Function1[/* error */ js.UndefOr[Any], Resolvable[Any]]): Bluebird[R] = js.native
    def tapCatch[E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[Any]]): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[Any]]
    ): Bluebird[R] = js.native
    
    def thenReturn(): Bluebird[Unit] = js.native
    def thenReturn[U](value: U): Bluebird[U] = js.native
    
    def thenThrow(reason: js.Error): Bluebird[scala.Nothing] = js.native
    
    // For simpler signature help.
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](onfulfilled: js.Function1[/* value */ R, Resolvable[TResult1]]): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ R, Resolvable[TResult1]],
      onrejected: js.Function1[/* reason */ Any, Resolvable[TResult2]]
    ): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, Resolvable[TResult2]]): Bluebird[TResult1 | TResult2] = js.native
    
    /**
      * Convenience method for:
      *
      * <code>
      * .then(function() {
      *    throw reason;
      * });
      * </code>
      * Same limitations apply as with `.return()`.
      *
      * Alias `.thenThrow();` for compatibility with earlier ECMAScript version.
      */
    def `throw`(reason: js.Error): Bluebird[scala.Nothing] = js.native
    
    /**
      * Returns a promise that will be fulfilled with this promise's fulfillment value or rejection reason.
      *  However, if this promise is not fulfilled or rejected within ms milliseconds, the returned promise
      *  is rejected with a TimeoutError or the error as the reason.
      *
      * You may specify a custom error message with the `message` parameter.
      */
    def timeout(ms: Double): Bluebird[R] = js.native
    def timeout(ms: Double, message: String): Bluebird[R] = js.native
    def timeout(ms: Double, message: js.Error): Bluebird[R] = js.native
    
    /**
      * This is implicitly called by `JSON.stringify` when serializing the object. Returns a serialized representation of the `Promise`.
      */
    def toJSON(): js.Object = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: Object = js.native
  }
  
  type CatchFilter[E] = (js.Function1[/* error */ E, Boolean]) | E
  
  trait ConcurrencyOption extends StObject {
    
    var concurrency: Double
  }
  object ConcurrencyOption {
    
    inline def apply(concurrency: Double): ConcurrencyOption = {
      val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcurrencyOption]
    }
    
    extension [Self <: ConcurrencyOption](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    }
  }
  
  type Constructor[E] = Instantiable1[/* args (repeated) */ Any, E]
  
  trait CoroutineOptions extends StObject {
    
    def yieldHandler(value: Any): Any
  }
  object CoroutineOptions {
    
    inline def apply(yieldHandler: Any => Any): CoroutineOptions = {
      val __obj = js.Dynamic.literal(yieldHandler = js.Any.fromFunction1(yieldHandler))
      __obj.asInstanceOf[CoroutineOptions]
    }
    
    extension [Self <: CoroutineOptions](x: Self) {
      
      inline def setYieldHandler(value: Any => Any): Self = StObject.set(x, "yieldHandler", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (args : infer A): any ? bluebird.bluebird.PromiseMethod<A, bluebird.bluebird.ExtractCallbackValueType<bluebird.bluebird.Last<std.Required<A>>>[0]> : never
    }}}
    */
  @js.native
  trait ExtractAsyncMethod[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (error : any, data : infer D): any ? D : never
    }}}
    */
  @js.native
  trait ExtractCallbackValueType[T] extends StObject
  
  trait FromNodeOptions extends StObject {
    
    var multiArgs: js.UndefOr[Boolean] = js.undefined
  }
  object FromNodeOptions {
    
    inline def apply(): FromNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromNodeOptions]
    }
    
    extension [Self <: FromNodeOptions](x: Self) {
      
      inline def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      inline def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
    }
  }
  
  trait Inspection[R] extends StObject {
    
    /**
      * See if the underlying promise was cancelled at the creation time of this inspection object.
      */
    def isCancelled(): Boolean
    
    /**
      * See if the underlying promise was fulfilled at the creation time of this inspection object.
      */
    def isFulfilled(): Boolean
    
    /**
      * See if the underlying promise was defer at the creation time of this inspection object.
      */
    def isPending(): Boolean
    
    /**
      * See if the underlying promise was rejected at the creation time of this inspection object.
      */
    def isRejected(): Boolean
    
    /**
      * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    def reason(): Any
    
    /**
      * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    def value(): R
  }
  object Inspection {
    
    inline def apply[R](
      isCancelled: () => Boolean,
      isFulfilled: () => Boolean,
      isPending: () => Boolean,
      isRejected: () => Boolean,
      reason: () => Any,
      value: () => R
    ): Inspection[R] = {
      val __obj = js.Dynamic.literal(isCancelled = js.Any.fromFunction0(isCancelled), isFulfilled = js.Any.fromFunction0(isFulfilled), isPending = js.Any.fromFunction0(isPending), isRejected = js.Any.fromFunction0(isRejected), reason = js.Any.fromFunction0(reason), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[Inspection[R]]
    }
    
    extension [Self <: Inspection[?], R](x: Self & Inspection[R]) {
      
      inline def setIsCancelled(value: () => Boolean): Self = StObject.set(x, "isCancelled", js.Any.fromFunction0(value))
      
      inline def setIsFulfilled(value: () => Boolean): Self = StObject.set(x, "isFulfilled", js.Any.fromFunction0(value))
      
      inline def setIsPending(value: () => Boolean): Self = StObject.set(x, "isPending", js.Any.fromFunction0(value))
      
      inline def setIsRejected(value: () => Boolean): Self = StObject.set(x, "isRejected", js.Any.fromFunction0(value))
      
      inline def setReason(value: () => Any): Self = StObject.set(x, "reason", js.Any.fromFunction0(value))
      
      inline def setValue(value: () => R): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ Double, /* arrayLength */ Double, Resolvable[R]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends [...std.Array<any>, infer L] ? L : never
    }}}
    */
  @js.native
  trait Last[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as T[K] extends never? never : K ]: T[K]}
    }}}
    */
  @js.native
  trait NonNeverValues[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TReturn extends never ? never : (args : bluebird.bluebird.WithoutLast<TArgs>): std.Promise<TReturn>
    }}}
    */
  type PromiseMethod[TArgs, TReturn] = js.Function1[/* args */ WithoutLast[TArgs], js.Promise[TReturn]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as bluebird.bluebird.PromisifyAllKeys<K> ]: bluebird.bluebird.ExtractAsyncMethod<T[K]>}
    }}}
    */
  @js.native
  trait PromisifyAllItems[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends string ? / * template literal string: ${T}Async * / string : never
    }}}
    */
  type PromisifyAllKeys[T] = /* template literal string: ${T}Async */ String
  
  trait PromisifyAllOptions[T]
    extends StObject
       with PromisifyOptions {
    
    var filter: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* func */ js.Function1[/* repeated */ Any, Any], 
          /* target */ js.UndefOr[Any], 
          /* passesDefaultFilter */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.undefined
    
    // The promisifier gets a reference to the original method and should return a function which returns a promise
    var promisifier: js.UndefOr[
        js.ThisFunction2[
          /* this */ T, 
          /* originalMethod */ js.Function1[/* repeated */ Any, Any], 
          /* defaultPromisifer */ js.Function1[/* repeated */ Any, js.Function1[/* repeated */ Any, Bluebird[Any]]], 
          js.Function0[PromiseLike[Any]]
        ]
      ] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object PromisifyAllOptions {
    
    inline def apply[T](): PromisifyAllOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyAllOptions[T]]
    }
    
    extension [Self <: PromisifyAllOptions[?], T](x: Self & PromisifyAllOptions[T]) {
      
      inline def setFilter(
        value: (/* name */ String, /* func */ js.Function1[/* repeated */ Any, Any], /* target */ js.UndefOr[Any], /* passesDefaultFilter */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPromisifier(
        value: js.ThisFunction2[
              /* this */ T, 
              /* originalMethod */ js.Function1[/* repeated */ Any, Any], 
              /* defaultPromisifer */ js.Function1[/* repeated */ Any, js.Function1[/* repeated */ Any, Bluebird[Any]]], 
              js.Function0[PromiseLike[Any]]
            ]
      ): Self = StObject.set(x, "promisifier", value.asInstanceOf[js.Any])
      
      inline def setPromisifierUndefined: Self = StObject.set(x, "promisifier", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  // Drop `never` values
  type PromisifyAll_[T] = NonNeverValues[PromisifyAllItems[T]] & T
  
  trait PromisifyOptions extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var multiArgs: js.UndefOr[Boolean] = js.undefined
  }
  object PromisifyOptions {
    
    inline def apply(): PromisifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyOptions]
    }
    
    extension [Self <: PromisifyOptions](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      inline def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
    }
  }
  
  type Resolvable[R] = R | PromiseLike[R]
  
  type ResolvableProps[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: bluebird.bluebird.Resolvable<T[K]>} */ js.Any
  
  @js.native
  trait Resolver[R] extends StObject {
    
    /**
      * Gives you a callback representation of the `PromiseResolver`. Note that this is not a method but a property.
      * The callback accepts error object in first argument and success values on the 2nd parameter and the rest, I.E. node js conventions.
      *
      * If the the callback is called with multiple success values, the resolver fulfills its promise with an array of the values.
      */
    // TODO specify resolver callback
    def callback(err: Any, value: R, values: R*): Unit = js.native
    
    /**
      * Returns a reference to the controlled promise that can be passed to clients.
      */
    var promise: Bluebird[R] = js.native
    
    /**
      * Reject the underlying promise with `reason` as the rejection reason.
      */
    def reject(reason: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    /**
      * Resolve the underlying promise with `value` as the resolution value. If `value` is a thenable or a promise, the underlying promise will assume its state.
      */
    def resolve(value: R): Unit = js.native
  }
  
  trait SpreadOption extends StObject {
    
    var spread: Boolean
  }
  object SpreadOption {
    
    inline def apply(spread: Boolean): SpreadOption = {
      val __obj = js.Dynamic.literal(spread = spread.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpreadOption]
    }
    
    extension [Self <: SpreadOption](x: Self) {
      
      inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    }
  }
  
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = PromiseLike[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [...infer A, any] ? A : []
    }}}
    */
  type WithoutLast[T] = js.Array[Any]
}
