package typings.bluebird

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.bluebird.anon.Cancellation
import typings.bluebird.anon.FnCall
import typings.bluebird.bluebirdStrings.Object
import typings.std.ArrayLike
import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import typings.std.PromiseLike
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bluebird", JSImport.Namespace)
  @js.native
  class ^[R] protected () extends Bluebird[R] {
    /**
      * Create a new promise. The passed in function will receive functions
      * `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
      *
      * If promise cancellation is enabled, passed in function will receive
      * one more function argument `onCancel` that allows to register an optional cancellation callback.
      */
    def this(callback: js.Function3[
            /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[Resolvable[R]], Unit], 
            /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
            /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
            Unit
          ]) = this()
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
  class AggregateError ()
    extends ArrayLike[Error]
       with Error {
    
    def every(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
    def every(
      callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def filter(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
    def filter(
      callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): AggregateError = js.native
    
    def forEach(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Unit]): js.UndefOr[scala.Nothing] = js.native
    def forEach(
      callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Unit],
      thisArg: js.Any
    ): js.UndefOr[scala.Nothing] = js.native
    
    def indexOf(searchElement: Error): Double = js.native
    def indexOf(searchElement: Error, fromIndex: Double): Double = js.native
    
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    def lastIndexOf(searchElement: Error): Double = js.native
    def lastIndexOf(searchElement: Error, fromIndex: Double): Double = js.native
    
    def map(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
    def map(
      callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): AggregateError = js.native
    
    def pop(): Error = js.native
    
    def push(errors: Error*): Double = js.native
    
    def reduce(
      callback: js.Function4[
          /* accumulator */ js.Any, 
          /* element */ Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ]
    ): js.Any = js.native
    def reduce(
      callback: js.Function4[
          /* accumulator */ js.Any, 
          /* element */ Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ js.Any, 
          /* element */ Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ]
    ): js.Any = js.native
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ js.Any, 
          /* element */ Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def reverse(): AggregateError = js.native
    
    def shift(): Error = js.native
    
    def slice(): AggregateError = js.native
    def slice(begin: js.UndefOr[scala.Nothing], end: Double): AggregateError = js.native
    def slice(begin: Double): AggregateError = js.native
    def slice(begin: Double, end: Double): AggregateError = js.native
    
    def some(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
    def some(
      callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def sort(): AggregateError = js.native
    def sort(compareFunction: js.Function2[/* errLeft */ Error, /* errRight */ Error, Double]): AggregateError = js.native
    
    def unshift(errors: Error*): Double = js.native
  }
  
  /**
    * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
    */
  @JSImport("bluebird", "CancellationError")
  @js.native
  class CancellationError () extends Error
  
  /**
    * returned by `Bluebird.disposer()`.
    */
  @JSImport("bluebird", "Disposer")
  @js.native
  class Disposer[R] () extends StObject
  
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
  class OperationalError () extends Error
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bluebird", "Promise")
  @js.native
  class Promise[R] protected () extends Bluebird[R] {
    /**
      * Create a new promise. The passed in function will receive functions
      * `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
      *
      * If promise cancellation is enabled, passed in function will receive
      * one more function argument `onCancel` that allows to register an optional cancellation callback.
      */
    def this(callback: js.Function3[
            /* resolve */ js.Function1[
              /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ _]], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
            /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
            Unit
          ]) = this()
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
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  @scala.inline
  def Promise_=(
    x: Instantiable1[
      /* callback */ js.Function3[
        /* resolve */ js.Function1[
          /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
          Unit
        ], 
        /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
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
  class TimeoutError () extends Error
  
  /* static member */
  @JSImport("bluebird", "all")
  @js.native
  def all[T1](values: js.Array[Resolvable[T1]]): Bluebird[js.Array[T1]] = js.native
  // array with values
  /* static member */
  @JSImport("bluebird", "all")
  @js.native
  def all[R](values: Resolvable[Iterable[Resolvable[R]]]): Bluebird[js.Array[R]] = js.native
  /* static member */
  @JSImport("bluebird", "all")
  @js.native
  def all[T1, T2](values: js.Tuple2[Resolvable[T1], Resolvable[T2]]): Bluebird[js.Tuple2[T1, T2]] = js.native
  /* static member */
  @JSImport("bluebird", "all")
  @js.native
  def all[T1, T2, T3](values: js.Tuple3[Resolvable[T1], Resolvable[T2], Resolvable[T3]]): Bluebird[js.Tuple3[T1, T2, T3]] = js.native
  /* static member */
  @JSImport("bluebird", "all")
  @js.native
  def all[T1, T2, T3, T4](values: js.Tuple4[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4]]): Bluebird[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is fulfilled when all the items in the array are fulfilled.
    * The promise's fulfillment value is an array with fulfillment values at respective positions to the original array.
    * If any promise in the array rejects, the returned promise is rejected with the rejection reason.
    */
  // TODO enable more overloads
  // array with promises of different types
  /* static member */
  @JSImport("bluebird", "all")
  @js.native
  def all[T1, T2, T3, T4, T5](values: js.Tuple5[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4], Resolvable[T5]]): Bluebird[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  
  /* static member */
  @JSImport("bluebird", "allSettled")
  @js.native
  def allSettled[T1](values: js.Array[Resolvable[T1]]): Bluebird[js.Array[Inspection[T1]]] = js.native
  /* static member */
  @JSImport("bluebird", "allSettled")
  @js.native
  def allSettled[R](values: Resolvable[Iterable[Resolvable[R]]]): Bluebird[js.Array[Inspection[R]]] = js.native
  /* static member */
  @JSImport("bluebird", "allSettled")
  @js.native
  def allSettled[T1, T2](values: js.Tuple2[Resolvable[T1], Resolvable[T2]]): Bluebird[js.Tuple2[Inspection[T1], Inspection[T2]]] = js.native
  /* static member */
  @JSImport("bluebird", "allSettled")
  @js.native
  def allSettled[T1, T2, T3](values: js.Tuple3[Resolvable[T1], Resolvable[T2], Resolvable[T3]]): Bluebird[js.Tuple3[Inspection[T1], Inspection[T2], Inspection[T3]]] = js.native
  /* static member */
  @JSImport("bluebird", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4](values: js.Tuple4[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4]]): Bluebird[js.Tuple4[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4]]] = js.native
  /* static member */
  @JSImport("bluebird", "allSettled")
  @js.native
  def allSettled[T1, T2, T3, T4, T5](values: js.Tuple5[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4], Resolvable[T5]]): Bluebird[
    js.Tuple5[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4], Inspection[T5]]
  ] = js.native
  
  // tslint:disable-line:unified-signatures
  /**
    * Like `Promise.some()`, with 1 as `count`. However, if the promise fulfills, the fulfillment value is not an array of 1 but the value directly.
    */
  /* static member */
  @JSImport("bluebird", "any")
  @js.native
  def any[R](values: Resolvable[Iterable[Resolvable[R]]]): Bluebird[R] = js.native
  
  /* static member */
  @JSImport("bluebird", "attempt")
  @js.native
  def attempt[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
  
  /**
    * Sugar for `Promise.resolve(undefined).bind(thisArg);`. See `.bind()`.
    */
  /* static member */
  @JSImport("bluebird", "bind")
  @js.native
  def bind(thisArg: js.Any): Bluebird[Unit] = js.native
  
  /**
    * Cast the given `value` to a trusted promise.
    *
    * If `value` is already a trusted `Promise`, it is returned as is. If `value` is not a thenable, a fulfilled is: Promise returned with `value` as its fulfillment value.
    * If `value` is a thenable (Promise-like object, like those returned by jQuery's `$.ajax`), returns a trusted that: Promise assimilates the state of the thenable.
    */
  /* static member */
  @JSImport("bluebird", "cast")
  @js.native
  def cast[R](value: Resolvable[R]): Bluebird[R] = js.native
  
  /**
    * Configure long stack traces, warnings, monitoring and cancellation.
    * Note that even though false is the default here, a development environment might be detected which automatically
    *  enables long stack traces and warnings.
    */
  /* static member */
  @JSImport("bluebird", "config")
  @js.native
  def config(options: Cancellation): Unit = js.native
  
  /**
    * Returns a function that can use `yield` to run asynchronous code synchronously.
    *
    * This feature requires the support of generators which are drafted in the next version of the language.
    * Node version greater than `0.11.2` is required and needs to be executed with the `--harmony-generators` (or `--harmony`) command-line switch.
    */
  // TODO: After https://github.com/Microsoft/TypeScript/issues/2983 is implemented, we can use
  // the return type propagation of generators to automatically infer the return type T.
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T](generatorFunction: js.Function0[IterableIterator[_]]): js.Function0[Bluebird[T]] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T](generatorFunction: js.Function0[IterableIterator[_]], options: CoroutineOptions): js.Function0[Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[_]]): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[_]], options: CoroutineOptions): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2](generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[_]]): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2](
    generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3](generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[_]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3](
    generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[_]]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[_]]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[_]
    ]
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[_]
    ],
    options: CoroutineOptions
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[_]
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
  ] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[_]
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
  ] = js.native
  /* static member */
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[_]
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
  ] = js.native
  @JSImport("bluebird", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[_]
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
  ] = js.native
  
  /**
    * @deprecated
    * Create a promise with undecided fate and return a `PromiseResolver` to control it. See resolution?: Promise(#promise-resolution).
    * @see http://bluebirdjs.com/docs/deprecated-apis.html#promise-resolution
    */
  /* static member */
  @JSImport("bluebird", "defer")
  @js.native
  def defer[R](): Resolver[R] = js.native
  
  /* static member */
  @JSImport("bluebird", "delay")
  @js.native
  def delay(ms: Double): Bluebird[Unit] = js.native
  /**
    * Returns a promise that will be resolved with value (or undefined) after given ms milliseconds.
    * If value is a promise, the delay will start counting down when it is fulfilled and the returned
    *  promise will be fulfilled with the fulfillment value of the value promise.
    */
  /* static member */
  @JSImport("bluebird", "delay")
  @js.native
  def delay[R](ms: Double, value: Resolvable[R]): Bluebird[R] = js.native
  
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
  @JSImport("bluebird", "each")
  @js.native
  def each[R](values: Resolvable[Iterable[Resolvable[R]]], iterator: IterateFunction[R, _]): Bluebird[js.Array[R]] = js.native
  
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
  @JSImport("bluebird", "filter")
  @js.native
  def filter[R](values: Resolvable[Iterable[Resolvable[R]]], filterer: IterateFunction[R, Boolean]): Bluebird[js.Array[R]] = js.native
  @JSImport("bluebird", "filter")
  @js.native
  def filter[R](
    values: Resolvable[Iterable[Resolvable[R]]],
    filterer: IterateFunction[R, Boolean],
    option: ConcurrencyOption
  ): Bluebird[js.Array[R]] = js.native
  
  /* static member */
  @JSImport("bluebird", "fromCallback")
  @js.native
  def fromCallback[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): Bluebird[T] = js.native
  @JSImport("bluebird", "fromCallback")
  @js.native
  def fromCallback[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[T] = js.native
  
  /**
    * Returns a promise that is resolved by a node style callback function.
    */
  /* static member */
  @JSImport("bluebird", "fromNode")
  @js.native
  def fromNode[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): Bluebird[T] = js.native
  @JSImport("bluebird", "fromNode")
  @js.native
  def fromNode[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[T] = js.native
  
  /**
    * Returns a new independent copy of the Bluebird library.
    *
    * This method should be used before you use any of the methods which would otherwise alter the global Bluebird object - to avoid polluting global state.
    */
  @JSImport("bluebird", "getNewLibraryCopy")
  @js.native
  def getNewLibraryCopy(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  
  /**
    * See if `value` is a trusted Promise.
    */
  /* static member */
  @JSImport("bluebird", "is")
  @js.native
  def is(value: js.Any): Boolean = js.native
  
  // variadic array
  /** @deprecated use .all instead */
  /* static member */
  @JSImport("bluebird", "join")
  @js.native
  def join[R](values: Resolvable[R]*): Bluebird[js.Array[R]] = js.native
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
  @JSImport("bluebird", "join")
  @js.native
  def join[R, A1](arg1: Resolvable[A1], handler: js.Function1[/* arg1 */ A1, Resolvable[R]]): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird", "join")
  @js.native
  def join[R, A1, A2](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    arg4: Resolvable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    arg4: Resolvable[A4],
    arg5: Resolvable[A5],
    handler: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
  ): Bluebird[R] = js.native
  
  /**
    * Call this right after the library is loaded to enabled long stack traces.
    *
    * Long stack traces cannot be disabled after being enabled, and cannot be enabled after promises have already been created.
    * Long stack traces imply a substantial performance penalty, around 4-5x for throughput and 0.5x for latency.
    */
  /* static member */
  @JSImport("bluebird", "longStackTraces")
  @js.native
  def longStackTraces(): Unit = js.native
  
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
  @JSImport("bluebird", "map")
  @js.native
  def map[R, U](values: Resolvable[Iterable[Resolvable[R]]], mapper: IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
  @JSImport("bluebird", "map")
  @js.native
  def map[R, U](
    values: Resolvable[Iterable[Resolvable[R]]],
    mapper: IterateFunction[R, U],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = js.native
  
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
  @JSImport("bluebird", "mapSeries")
  @js.native
  def mapSeries[R, U](values: Resolvable[Iterable[Resolvable[R]]], iterator: IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
  
  /**
    * Returns a new function that wraps the given function `fn`.
    * The new function will always return a promise that is fulfilled with the original functions return values or rejected with thrown exceptions from the original function.
    * This method is convenient when a function can sometimes return synchronously or throw synchronously.
    */
  /* static member */
  @JSImport("bluebird", "method")
  @js.native
  def method[R](fn: js.Function0[Resolvable[R]]): js.Function0[Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird", "method")
  @js.native
  def method[R](fn: js.Function1[/* repeated */ js.Any, Resolvable[R]]): js.Function1[/* repeated */ js.Any, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird", "method")
  @js.native
  def method[R, A1, A2](fn: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird", "method")
  @js.native
  def method[R, A1, A2, A3](fn: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird", "method")
  @js.native
  def method[R, A1, A2, A3, A4](fn: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird", "method")
  @js.native
  def method[R, A1, A2, A3, A4, A5](
    fn: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird", "method")
  @js.native
  def method_RA1[R, A1](fn: js.Function1[/* arg1 */ A1, Resolvable[R]]): js.Function1[/* arg1 */ A1, Bluebird[R]] = js.native
  
  /**
    * This is relevant to browser environments with no module loader.
    *
    * Release control of the Promise namespace to whatever it was before this library was loaded.
    * Returns a reference to the library namespace so you can attach it to something else.
    */
  @JSImport("bluebird", "noConflict")
  @js.native
  def noConflict(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  
  /**
    * Add handler as the handler to call when there is a possibly unhandled rejection.
    * The default handler logs the error stack to stderr or console.error in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    *
    * Note: this hook is specific to the bluebird instance its called on, application developers should use global rejection events.
    */
  /* static member */
  @JSImport("bluebird", "onPossiblyUnhandledRejection")
  @js.native
  def onPossiblyUnhandledRejection(): Unit = js.native
  /**
    * Add `handler` as the handler to call when there is a possibly unhandled rejection. The default handler logs the error stack to stderr or `console.error` in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    */
  /* static member */
  @JSImport("bluebird", "onPossiblyUnhandledRejection")
  @js.native
  def onPossiblyUnhandledRejection(handler: js.Function1[/* reason */ js.Any, _]): Unit = js.native
  @JSImport("bluebird", "onPossiblyUnhandledRejection")
  @js.native
  def onPossiblyUnhandledRejection(handler: js.Function2[/* error */ Error, /* promise */ Bluebird[_], Unit]): Unit = js.native
  
  /* static member */
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Bluebird[_]] = js.native
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ js.Any, Bluebird[_]] = js.native
  /* static member */
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
  
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
  @JSImport("bluebird", "promisifyAll")
  @js.native
  def promisifyAll[T /* <: js.Object */](target: T): T = js.native
  @JSImport("bluebird", "promisifyAll")
  @js.native
  def promisifyAll[T /* <: js.Object */](target: T, options: PromisifyAllOptions[T]): T = js.native
  
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
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify_T_Function0[T](
    func: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function0[Bluebird[T]] = js.native
  @JSImport("bluebird", "promisify")
  @js.native
  def promisify_T_Function0[T](
    func: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function0[Bluebird[T]] = js.native
  
  // trusted promise for object
  /* static member */
  @JSImport("bluebird", "props")
  @js.native
  def props[T](`object`: js.Thenable[ResolvableProps[T]]): Bluebird[T] = js.native
  // object
  /* static member */
  @JSImport("bluebird", "props")
  @js.native
  def props[T](`object`: ResolvableProps[T]): Bluebird[T] = js.native
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
  @JSImport("bluebird", "props")
  @js.native
  def props[K, V](map: Resolvable[Map[K, Resolvable[V]]]): Bluebird[Map[K, V]] = js.native
  
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is
    * fulfilled or rejected as soon as a promise in the array is fulfilled or rejected with the respective rejection reason or fulfillment value.
    *
    * **Note** If you pass empty array or a sparse array with no values, or a promise/thenable for such, it will be forever pending.
    */
  /* static member */
  @JSImport("bluebird", "race")
  @js.native
  def race[R](values: Resolvable[Iterable[Resolvable[R]]]): Bluebird[R] = js.native
  
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
  @JSImport("bluebird", "reduce")
  @js.native
  def reduce[R, U](
    values: Resolvable[Iterable[Resolvable[R]]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Resolvable[U]
    ]
  ): Bluebird[U] = js.native
  @JSImport("bluebird", "reduce")
  @js.native
  def reduce[R, U](
    values: Resolvable[Iterable[Resolvable[R]]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Resolvable[U]
    ],
    initialValue: U
  ): Bluebird[U] = js.native
  
  /**
    * Create a promise that is rejected with the given `reason`.
    */
  /* static member */
  @JSImport("bluebird", "reject")
  @js.native
  def reject(reason: js.Any): Bluebird[scala.Nothing] = js.native
  
  /**
    * Create a promise that is resolved with the given `value`. If `value` is a thenable or promise, the returned promise will assume its state.
    */
  /* static member */
  @JSImport("bluebird", "resolve")
  @js.native
  def resolve(): Bluebird[Unit] = js.native
  /* static member */
  @JSImport("bluebird", "resolve")
  @js.native
  def resolve[R](value: Resolvable[R]): Bluebird[R] = js.native
  
  /**
    * Changes how bluebird schedules calls a-synchronously.
    *
    * @param scheduler Should be a function that asynchronously schedules
    *                  the calling of the passed in function
    */
  @JSImport("bluebird", "setScheduler")
  @js.native
  def setScheduler(scheduler: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit]): Unit = js.native
  
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
  @JSImport("bluebird", "some")
  @js.native
  def some[R](values: Resolvable[Iterable[Resolvable[R]]], count: Double): Bluebird[js.Array[R]] = js.native
  
  /**
    * In conjunction with `.disposer`, using will make sure that no matter what, the specified disposer
    *  will be called when the promise returned by the callback passed to using has settled. The disposer is
    *  necessary because there is no standard interface in node for disposing resources.
    */
  /* static member */
  @JSImport("bluebird", "using")
  @js.native
  def using[R, T](disposer: Disposer[R], executor: js.Function1[/* transaction */ R, js.Thenable[T]]): Bluebird[T] = js.native
  /* static member */
  @JSImport("bluebird", "using")
  @js.native
  def using[R1, R2, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    executor: js.Function2[/* transaction1 */ R1, /* transaction2 */ R2, js.Thenable[T]]
  ): Bluebird[T] = js.native
  /* static member */
  @JSImport("bluebird", "using")
  @js.native
  def using[R1, R2, R3, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    disposer3: Disposer[R3],
    executor: js.Function3[/* transaction1 */ R1, /* transaction2 */ R2, /* transaction3 */ R3, js.Thenable[T]]
  ): Bluebird[T] = js.native
  
  /**
    * The version number of the library
    */
  /* static member */
  @JSImport("bluebird", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Bluebird[R]
    extends PromiseLike[R]
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
    
    def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
    def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
    def asCallback(sink: js.Any*): this.type = js.native
    
    /**
      * Create a promise that follows this promise, but is bound to the given `thisArg` value.
      * A bound promise will call its handlers with the bound value set to `this`.
      *
      * Additionally promises derived from a bound promise will also be bound promises with the same `thisArg` binding as the original promise.
      */
    def bind(thisArg: js.Any): Bluebird[R] = js.native
    
    /**
      * This is a convenience method for doing:
      *
      * <code>
      * promise.then(function(obj){
      *     return obj[propertyName].call(obj, arg...);
      * });
      * </code>
      */
    def call[U /* <: /* keyof Q */ String */, Q](propertyName: U, args: js.Any*): Bluebird[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: Q[U] */ js.Any
        ]
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
    def `catch`[U](onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U | R] = js.native
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
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[Error], filter2: CatchFilter[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: CatchFilter[Error], filter2: Constructor[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: CatchFilter[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], filter3: Constructor[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[Error], filter2: CatchFilter[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: CatchFilter[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      value: U
    ): Bluebird[R | U] = js.native
    // No need to be specific about Error types in these overrides, since there's no handler function
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      value: U
    ): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], filter3: Constructor[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[Error], filter2: Constructor[Error], value: U): Bluebird[R | U] = js.native
    def catchReturn[U](filter1: Constructor[Error], value: U): Bluebird[R | U] = js.native
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
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: CatchFilter[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: CatchFilter[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: CatchFilter[Error], filter2: Constructor[Error], reason: Error): Bluebird[R] = js.native
    def catchThrow(// tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[Error], reason: Error): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: CatchFilter[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: Constructor[Error], filter2: CatchFilter[Error], reason: Error): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: CatchFilter[Error],
      reason: Error
    ): Bluebird[R] = js.native
    // No need to be specific about Error types in these overrides, since there's no handler function
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      filter5: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      filter4: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(
      filter1: Constructor[Error],
      filter2: Constructor[Error],
      filter3: Constructor[Error],
      reason: Error
    ): Bluebird[R] = js.native
    def catchThrow(filter1: Constructor[Error], filter2: Constructor[Error], reason: Error): Bluebird[R] = js.native
    def catchThrow(filter1: Constructor[Error], reason: Error): Bluebird[R] = js.native
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
    def catchThrow(reason: Error): Bluebird[R] = js.native
    
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise.
      *
      * Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def caught[U](): Bluebird[U | R] = js.native
    def caught[U](onReject: js.Function1[/* error */ js.Any, Resolvable[U]]): Bluebird[U | R] = js.native
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
    def done[U](
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
    ): Unit = js.native
    def done[U](onFulfilled: js.Function1[/* value */ R, Resolvable[U]]): Unit = js.native
    def done[U](
      onFulfilled: js.Function1[/* value */ R, Resolvable[U]],
      onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
    ): Unit = js.native
    
    /**
      * Same as calling ``Bluebird.each(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def each[Q](iterator: IterateFunction[Q, _]): Bluebird[R] = js.native
    
    /**
      * Like `.catch` but instead of catching all types of exceptions,
      * it only catches those that don't originate from thrown errors but rather from explicit rejections.
      */
    def error[U](onReject: js.Function1[/* reason */ js.Any, Resolvable[U]]): Bluebird[U] = js.native
    
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
    def `finally`(handler: js.Function0[Resolvable[_]]): Bluebird[R] = js.native
    
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
    
    def lastly(handler: js.Function0[Resolvable[_]]): Bluebird[R] = js.native
    @JSName("lastly")
    var lastly_Original: js.Function1[/* handler */ js.Function0[Resolvable[_]], Bluebird[R]] = js.native
    
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
    def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
    def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
    def nodeify(sink: js.Any*): this.type = js.native
    
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
    def tap(onFulFill: js.Function1[/* value */ R, Resolvable[_]]): Bluebird[R] = js.native
    
    /**
      * Like `.catch()` but rethrows the error
      */
    def tapCatch(onReject: js.Function1[/* error */ js.UndefOr[js.Any], Resolvable[_]]): Bluebird[R] = js.native
    def tapCatch[E1](
      // tslint:disable-next-line:unified-signatures
    filter1: CatchFilter[E1],
      onReject: js.Function1[/* error */ E1, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1](filter1: Constructor[E1], onReject: js.Function1[/* error */ E1, Resolvable[_]]): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      onReject: js.Function1[/* error */ E1 | E2, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: CatchFilter[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: CatchFilter[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: CatchFilter[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: CatchFilter[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: CatchFilter[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    def tapCatch[E1, E2, E3, E4, E5](
      filter1: Constructor[E1],
      filter2: Constructor[E2],
      filter3: Constructor[E3],
      filter4: Constructor[E4],
      filter5: Constructor[E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, Resolvable[_]]
    ): Bluebird[R] = js.native
    
    def thenReturn(): Bluebird[Unit] = js.native
    def thenReturn[U](value: U): Bluebird[U] = js.native
    
    def thenThrow(reason: Error): Bluebird[scala.Nothing] = js.native
    
    // For simpler signature help.
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, Resolvable[TResult2]]
    ): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](onfulfilled: js.Function1[/* value */ R, Resolvable[TResult1]]): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ R, Resolvable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, Resolvable[TResult2]]
    ): Bluebird[TResult1 | TResult2] = js.native
    
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
    def `throw`(reason: Error): Bluebird[scala.Nothing] = js.native
    
    /**
      * Returns a promise that will be fulfilled with this promise's fulfillment value or rejection reason.
      *  However, if this promise is not fulfilled or rejected within ms milliseconds, the returned promise
      *  is rejected with a TimeoutError or the error as the reason.
      *
      * You may specify a custom error message with the `message` parameter.
      */
    def timeout(ms: Double): Bluebird[R] = js.native
    def timeout(ms: Double, message: String): Bluebird[R] = js.native
    def timeout(ms: Double, message: Error): Bluebird[R] = js.native
    
    /**
      * This is implicitly called by `JSON.stringify` when serializing the object. Returns a serialized representation of the `Promise`.
      */
    def toJSON(): js.Object = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: Object = js.native
  }
  
  type CatchFilter[E] = (js.Function1[/* error */ E, Boolean]) | (js.Object with E)
  
  @js.native
  trait ConcurrencyOption extends StObject {
    
    var concurrency: Double = js.native
  }
  object ConcurrencyOption {
    
    @scala.inline
    def apply(concurrency: Double): ConcurrencyOption = {
      val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcurrencyOption]
    }
    
    @scala.inline
    implicit class ConcurrencyOptionMutableBuilder[Self <: ConcurrencyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    }
  }
  
  type Constructor[E] = Instantiable1[/* args (repeated) */ js.Any, E]
  
  @js.native
  trait CoroutineOptions extends StObject {
    
    def yieldHandler(value: js.Any): js.Any = js.native
  }
  object CoroutineOptions {
    
    @scala.inline
    def apply(yieldHandler: js.Any => js.Any): CoroutineOptions = {
      val __obj = js.Dynamic.literal(yieldHandler = js.Any.fromFunction1(yieldHandler))
      __obj.asInstanceOf[CoroutineOptions]
    }
    
    @scala.inline
    implicit class CoroutineOptionsMutableBuilder[Self <: CoroutineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setYieldHandler(value: js.Any => js.Any): Self = StObject.set(x, "yieldHandler", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FromNodeOptions extends StObject {
    
    var multiArgs: js.UndefOr[Boolean] = js.native
  }
  object FromNodeOptions {
    
    @scala.inline
    def apply(): FromNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromNodeOptions]
    }
    
    @scala.inline
    implicit class FromNodeOptionsMutableBuilder[Self <: FromNodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
    }
  }
  
  @js.native
  trait Inspection[R] extends StObject {
    
    /**
      * See if the underlying promise was cancelled at the creation time of this inspection object.
      */
    def isCancelled(): Boolean = js.native
    
    /**
      * See if the underlying promise was fulfilled at the creation time of this inspection object.
      */
    def isFulfilled(): Boolean = js.native
    
    /**
      * See if the underlying promise was defer at the creation time of this inspection object.
      */
    def isPending(): Boolean = js.native
    
    /**
      * See if the underlying promise was rejected at the creation time of this inspection object.
      */
    def isRejected(): Boolean = js.native
    
    /**
      * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    def reason(): js.Any = js.native
    
    /**
      * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    def value(): R = js.native
  }
  object Inspection {
    
    @scala.inline
    def apply[R](
      isCancelled: () => Boolean,
      isFulfilled: () => Boolean,
      isPending: () => Boolean,
      isRejected: () => Boolean,
      reason: () => js.Any,
      value: () => R
    ): Inspection[R] = {
      val __obj = js.Dynamic.literal(isCancelled = js.Any.fromFunction0(isCancelled), isFulfilled = js.Any.fromFunction0(isFulfilled), isPending = js.Any.fromFunction0(isPending), isRejected = js.Any.fromFunction0(isRejected), reason = js.Any.fromFunction0(reason), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[Inspection[R]]
    }
    
    @scala.inline
    implicit class InspectionMutableBuilder[Self <: Inspection[_], R] (val x: Self with Inspection[R]) extends AnyVal {
      
      @scala.inline
      def setIsCancelled(value: () => Boolean): Self = StObject.set(x, "isCancelled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFulfilled(value: () => Boolean): Self = StObject.set(x, "isFulfilled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPending(value: () => Boolean): Self = StObject.set(x, "isPending", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRejected(value: () => Boolean): Self = StObject.set(x, "isRejected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReason(value: () => js.Any): Self = StObject.set(x, "reason", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: () => R): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ Double, /* arrayLength */ Double, Resolvable[R]]
  
  @js.native
  trait PromisifyAllOptions[T] extends PromisifyOptions {
    
    var filter: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* func */ js.Function1[/* repeated */ js.Any, _], 
          /* target */ js.UndefOr[js.Any], 
          /* passesDefaultFilter */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.native
    
    // The promisifier gets a reference to the original method and should return a function which returns a promise
    var promisifier: js.UndefOr[
        js.ThisFunction2[
          /* this */ T, 
          /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
          /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
          js.Function0[js.Thenable[_]]
        ]
      ] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object PromisifyAllOptions {
    
    @scala.inline
    def apply[T](): PromisifyAllOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyAllOptions[T]]
    }
    
    @scala.inline
    implicit class PromisifyAllOptionsMutableBuilder[Self <: PromisifyAllOptions[_], T] (val x: Self with PromisifyAllOptions[T]) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* name */ String, /* func */ js.Function1[/* repeated */ js.Any, _], /* target */ js.UndefOr[js.Any], /* passesDefaultFilter */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setPromisifier(
        value: js.ThisFunction2[
              /* this */ T, 
              /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
              /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
              js.Function0[js.Thenable[_]]
            ]
      ): Self = StObject.set(x, "promisifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromisifierUndefined: Self = StObject.set(x, "promisifier", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait PromisifyOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var multiArgs: js.UndefOr[Boolean] = js.native
  }
  object PromisifyOptions {
    
    @scala.inline
    def apply(): PromisifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyOptions]
    }
    
    @scala.inline
    implicit class PromisifyOptionsMutableBuilder[Self <: PromisifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
    }
  }
  
  type Resolvable[R] = R | js.Thenable[R]
  
  type ResolvableProps[T] = js.Object with typings.bluebird.bluebirdStrings.ResolvableProps with TopLevel[T]
  
  @js.native
  trait Resolver[R] extends StObject {
    
    /**
      * Gives you a callback representation of the `PromiseResolver`. Note that this is not a method but a property.
      * The callback accepts error object in first argument and success values on the 2nd parameter and the rest, I.E. node js conventions.
      *
      * If the the callback is called with multiple success values, the resolver fulfills its promise with an array of the values.
      */
    // TODO specify resolver callback
    def callback(err: js.Any, value: R, values: R*): Unit = js.native
    
    /**
      * Returns a reference to the controlled promise that can be passed to clients.
      */
    var promise: Bluebird[R] = js.native
    
    /**
      * Reject the underlying promise with `reason` as the rejection reason.
      */
    def reject(reason: js.Any): Unit = js.native
    
    def resolve(): Unit = js.native
    /**
      * Resolve the underlying promise with `value` as the resolution value. If `value` is a thenable or a promise, the underlying promise will assume its state.
      */
    def resolve(value: R): Unit = js.native
  }
  
  @js.native
  trait SpreadOption extends StObject {
    
    var spread: Boolean = js.native
  }
  object SpreadOption {
    
    @scala.inline
    def apply(spread: Boolean): SpreadOption = {
      val __obj = js.Dynamic.literal(spread = spread.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpreadOption]
    }
    
    @scala.inline
    implicit class SpreadOptionMutableBuilder[Self <: SpreadOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    }
  }
  
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
  
  /**
    * Start the chain of promises with `Promise.try`. Any synchronous exceptions will be turned into rejections on the returned promise.
    *
    * Note about second argument: if it's specifically a true array, its values become respective arguments for the function call.
    * Otherwise it is passed as is as the first argument for the function call.
    *
    * Alias for `attempt();` for compatibility with earlier ECMAScript version.
    */
  /* static member */
  @JSImport("bluebird", "try")
  @js.native
  def `try`[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
}
