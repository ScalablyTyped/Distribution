package typings.backoff

import org.scalablytyped.runtime.Instantiable3
import typings.backoff.backoffStrings.abort
import typings.backoff.backoffStrings.call
import typings.backoff.backoffStrings.callback
import typings.backoff.backoffStrings.fail
import typings.backoff.backoffStrings.ready
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backoff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("backoff", "Backoff")
  @js.native
  open class Backoff protected () extends EventEmitter {
    /**
      * Constructs a new backoff object from a specific backoff strategy. The backoff
      * strategy must implement the `BackoffStrategy`interface defined bellow.
      *
      * @param strategy: the backoff strategy to use
      */
    def this(strategy: BackoffStrategy) = this()
    
    /**
      * Emitted when a backoff operation is started. Signals to the client how long
      * the next backoff delay will be.
      * @param number: number of backoffs since last reset, starting at 0
      * @param delay: backoff delay in milliseconds
      * @param err: optional error parameter passed to `backoff.backoff([err])`
      */
    @JSName("addListener")
    def addListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    /**
      * Emitted when the maximum number of backoffs is reached. This event will only
      * be emitted if the client has set a limit on the number of backoffs by calling
      * `backoff.failAfter(numberOfBackoffs)`. The backoff instance is automatically
      * reset after this event is emitted.
      *
      * @param err: optional error parameter passed to `backoff.backoff([err])`
      */
    @JSName("addListener")
    def addListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[Any], Unit]): this.type = js.native
    /**
      * Emitted when a backoff operation is done. Signals that the failing operation
      * should be retried.
      *
      * @param number: number of backoffs since last reset, starting at 0
      * @param delay: backoff delay in milliseconds
      */
    @JSName("addListener")
    def addListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    /**
      * Starts a backoff operation. If provided, the error parameter will be emitted
      * as the last argument of the `backoff` and `fail` events to let the listeners
      * know why the backoff operation was attempted.
      *
      * An error will be thrown if a backoff operation is already in progress.
      *
      * In practice, this method should be called after a failed attempt to perform a
      * sensitive operation (connecting to a database, downloading a resource over the
      * network, etc.).
      */
    def backoff(): Unit = js.native
    def backoff(error: Any): Unit = js.native
    
    @JSName("emit")
    def emit_backoff(event: typings.backoff.backoffStrings.backoff, number: Double, delay: Double): Boolean = js.native
    @JSName("emit")
    def emit_backoff(event: typings.backoff.backoffStrings.backoff, number: Double, delay: Double, error: Any): Boolean = js.native
    @JSName("emit")
    def emit_fail(event: fail): Boolean = js.native
    @JSName("emit")
    def emit_fail(event: fail, error: Any): Boolean = js.native
    @JSName("emit")
    def emit_ready(event: ready, number: Double, delay: Double): Boolean = js.native
    
    /**
      * Sets a limit on the maximum number of backoffs that can be performed before
      * a fail event gets emitted and the backoff instance is reset. By default, there
      * is no limit on the number of backoffs that can be performed.
      *
      * @param numberOfBackoffs: maximum number of backoffs before the fail event gets
      * emitted, must be greater than 0
      */
    def failAfter(numberOfBackoffs: Double): Unit = js.native
    
    def listenerCount(`type`: typings.backoff.backoffStrings.backoff | ready | fail): Double = js.native
    
    @JSName("listeners")
    def listeners_backoff(event: typings.backoff.backoffStrings.backoff): js.Array[
        js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
      ] = js.native
    @JSName("listeners")
    def listeners_fail(event: fail): js.Array[js.Function1[/* error */ js.UndefOr[Any], Unit]] = js.native
    @JSName("listeners")
    def listeners_ready(event: ready): js.Array[js.Function2[/* number */ Double, /* delay */ Double, Unit]] = js.native
    
    @JSName("on")
    def on_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[Any], Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[Any], Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    def removeAllListeners(event: typings.backoff.backoffStrings.backoff | ready | fail): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[Any], Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    /**
      * Resets the backoff delay to the initial backoff delay and stop any backoff
      * operation in progress. After reset, a backoff instance can and should be
      * reused.
      *
      * In practice, this method should be called after having successfully completed
      * the sensitive operation guarded by the backoff instance or if the client code
      * request to stop any reconnection attempt.
      */
    def reset(): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("backoff", "BackoffStrategy")
  @js.native
  /**
    * The options are the following.
    *
    * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
    * @param options.initialDelay: defaults to 100 ms
    * @param options.maxDelay: defaults to 10000 ms
    */
  open class BackoffStrategy () extends StObject {
    def this(options: Options) = this()
    
    def getInitialDelay(): Double = js.native
    
    def getMaxDelay(): Double = js.native
    
    /**
      * Computes and returns the next backoff delay.
      */
    def next(): Double = js.native
    
    /* protected */ def next_(): Double = js.native
    
    /**
      * Resets the backoff delay to its initial value.
      */
    def reset(): Unit = js.native
    
    /* protected */ def reset_(): Unit = js.native
  }
  
  @JSImport("backoff", "ExponentialStrategy")
  @js.native
  /**
    * The options are the following.
    *
    * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
    * @param options.initialDelay: defaults to 100 ms
    * @param options.maxDelay: defaults to 10000 ms
    * @param options.factor: defaults to 2, must be greater than 1
    */
  open class ExponentialStrategy () extends BackoffStrategy {
    def this(options: ExponentialOptions) = this()
  }
  
  @JSImport("backoff", "FibonacciStrategy")
  @js.native
  /**
    * The options are the following.
    *
    * @param options.randomisationFactor: defaults to 0, must be between 0 and 1
    * @param options.initialDelay: defaults to 100 ms
    * @param options.maxDelay: defaults to 10000 ms
    */
  open class FibonacciStrategy () extends BackoffStrategy {
    def this(options: Options) = this()
  }
  
  @js.native
  trait FunctionCall[T] extends EventEmitter {
    
    /**
      * Aborts the call and causes the completion callback to be invoked with an abort
      * error if the call was pending or running; does nothing otherwise. This method
      * can safely be called multiple times.
      */
    def abort(): Unit = js.native
    
    /**
      * Emitted when a call is aborted.
      */
    @JSName("addListener")
    def addListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    /**
      * Emitted each time a backoff operation is started.
      *
      * @param number: backoff number, starts at 0
      * @param delay: backoff delay in milliseconds
      * @param err: the error that triggered the backoff operation
      */
    @JSName("addListener")
    def addListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    /**
      * Emitted each time the wrapped function is called.
      * @param args: wrapped function's arguments
      */
    @JSName("addListener")
    def addListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_abort(event: abort): Boolean = js.native
    @JSName("emit")
    def emit_backoff(event: typings.backoff.backoffStrings.backoff, number: Double, delay: Double): Boolean = js.native
    @JSName("emit")
    def emit_backoff(event: typings.backoff.backoffStrings.backoff, number: Double, delay: Double, error: Any): Boolean = js.native
    @JSName("emit")
    def emit_call(event: call, args: T): Boolean = js.native
    
    /**
      * Sets the maximum number of backoffs before the call is aborted. By default,
      * there is no limit on the number of backoffs that can be performed.
      *
      * This method should be called before `call.start()` otherwise an exception will
      * be thrown.
      *
      * @param maxNumberOfBackoffs: maximum number of backoffs before the call is aborted
      */
    def failAfter(maxNumberOfBackoffs: Double): this.type = js.native
    
    /**
      * Returns the number of times the wrapped function call was retried. For a
      * wrapped function that succeeded immediately, this would return 0. This
      * method can be called at any point in time during the call life cycle, i.e.
      * before, during and after the wrapped function invocation.
      */
    def getNumRetries(): Double = js.native
    
    /**
      * Returns whether the call is aborted.
      */
    def isAborted(): Boolean = js.native
    
    /**
      * Returns whether the call is completed.
      */
    def isCompleted(): Boolean = js.native
    
    /**
      * Returns whether the call is pending, i.e. hasn't been started.
      */
    def isPending(): Boolean = js.native
    
    /**
      * Returns whether the call is in progress.
      */
    def isRunning(): Boolean = js.native
    
    def listenerCount(`type`: call | callback | typings.backoff.backoffStrings.backoff | abort): Double = js.native
    
    @JSName("listeners")
    def listeners_abort(event: abort): js.Array[js.Function0[Unit]] = js.native
    @JSName("listeners")
    def listeners_backoff(event: typings.backoff.backoffStrings.backoff): js.Array[
        js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
      ] = js.native
    @JSName("listeners")
    def listeners_call(event: call): js.Array[js.Function1[/* args */ T, Unit]] = js.native
    
    @JSName("on")
    def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("once")
    def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    def removeAllListeners(event: call | callback | typings.backoff.backoffStrings.backoff | abort): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_backoff(
      event: typings.backoff.backoffStrings.backoff,
      listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_call(event: call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
    
    /**
      * Sets the predicate which will be invoked to determine whether a given error
      * should be retried or not, e.g. a network error would be retriable while a type
      * error would stop the function call. By default, all errors are considered to be
      * retriable.
      *
      * This method should be called before `call.start()` otherwise an exception will
      * be thrown.
      *
      * @param predicate: a function which takes in as its argument the error returned
      * by the wrapped function and determines whether it is retriable.
      */
    def retryIf(predicate: js.Function1[/* error */ Any, Boolean]): this.type = js.native
    
    /**
      * Sets the backoff strategy to use. This method should be called before
      * `call.start()` otherwise an exception will be thrown.
      *
      * @param strategy: strategy instance to use, defaults to `FibonacciStrategy`.
      */
    def setStrategy(strategy: BackoffStrategy): this.type = js.native
    
    /**
      * Initiates the call the wrapped function. This method should only be called
      * once otherwise an exception will be thrown.
      */
    def start(): Unit = js.native
  }
  @JSImport("backoff", "FunctionCall")
  @js.native
  val FunctionCall: FunctionCallConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("backoff", "FunctionCall")
  @js.native
  open class FunctionCallCls[T1, T2, T3, R1, R2, R3, E] protected ()
    extends TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, R3] {
    def this(
      wrappedFunction: js.Function4[
            /* t1 */ T1, 
            /* t2 */ T2, 
            /* t3 */ T3, 
            /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
            Unit
          ],
      args: js.Tuple3[T1, T2, T3],
      callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
    ) = this()
    
    /**
      * Emitted each time the wrapped function invokes its callback
      * @param results: wrapped function's return values
      */
    /* CompleteClass */
    @JSName("addListener")
    override def addListener_callback(
      event: typings.backoff.backoffStrings.callback,
      listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]
    ): this.type = js.native
    
    /* CompleteClass */
    @JSName("emit")
    override def emit_callback(event: typings.backoff.backoffStrings.callback, results: js.Tuple4[E, R1, R2, R3]): Boolean = js.native
    
    /**
      * Returns an array containing the last arguments passed to the completion callback
      * of the wrapped function. For example, to get the error code returned by the last
      * call, one would do the following.
      *
      * ``` js
      * var results = call.getLastResult();
      * // The error code is the first parameter of the callback.
      * var error = results[0];
      * ```
      *
      * Note that if the call was aborted, it will contain the abort error and not the
      * last error returned by the wrapped function.
      */
    /* CompleteClass */
    override def getLastResult(): js.Tuple4[E, R1, R2, R3] = js.native
    
    /* CompleteClass */
    @JSName("listeners")
    override def listeners_callback(event: typings.backoff.backoffStrings.callback): js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]] = js.native
    
    /* CompleteClass */
    @JSName("on")
    override def on_callback(
      event: typings.backoff.backoffStrings.callback,
      listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]
    ): this.type = js.native
    
    /* CompleteClass */
    @JSName("once")
    override def once_callback(
      event: typings.backoff.backoffStrings.callback,
      listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]
    ): this.type = js.native
    
    /* CompleteClass */
    @JSName("prependListener")
    override def prependListener_callback(
      event: typings.backoff.backoffStrings.callback,
      listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]
    ): this.type = js.native
    
    /* CompleteClass */
    @JSName("prependOnceListener")
    override def prependOnceListener_callback(
      event: typings.backoff.backoffStrings.callback,
      listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]
    ): this.type = js.native
    
    /* CompleteClass */
    @JSName("removeListener")
    override def removeListener_callback(
      event: typings.backoff.backoffStrings.callback,
      listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]
    ): this.type = js.native
  }
  
  inline def call(wrappedFunction: js.Function1[/* repeated */ Any, Unit], args: Any*): FunctionCallAny = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(scala.List(wrappedFunction.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FunctionCallAny]
  inline def call[E](
    wrappedFunction: js.Function1[/* cb */ js.Function1[/* err */ E, Unit], Unit],
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[js.Array[Unit], E, Unit, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[Unit], E, Unit, Unit, Unit]]
  inline def call[R1, E](
    wrappedFunction: js.Function1[/* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], Unit],
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[js.Array[Unit], E, R1, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[Unit], E, R1, Unit, Unit]]
  inline def call[T1, E](
    wrappedFunction: js.Function2[/* t1 */ T1, /* cb */ js.Function1[/* err */ E, Unit], Unit],
    t1: T1,
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[js.Array[T1], E, Unit, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[T1], E, Unit, Unit, Unit]]
  inline def call[R1, R2, E](
    wrappedFunction: js.Function1[/* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], Unit],
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Array[Unit], E, R1, R2, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[Unit], E, R1, R2, Unit]]
  inline def call[T1, R1, E](
    wrappedFunction: js.Function2[/* t1 */ T1, /* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], Unit],
    t1: T1,
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[T1], E, R1, Unit, Unit]]
  inline def call[T1, T2, E](
    wrappedFunction: js.Function3[/* t1 */ T1, /* t2 */ T2, /* cb */ js.Function1[/* err */ E, Unit], Unit],
    t1: T1,
    t2: T2,
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, Unit, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple2[T1, T2], E, Unit, Unit, Unit]]
  inline def call[R1, R2, R3, E](
    wrappedFunction: js.Function1[
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Array[Unit], E, R1, R2, R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[Unit], E, R1, R2, R3]]
  inline def call[T1, R1, R2, E](
    wrappedFunction: js.Function2[
      /* t1 */ T1, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], 
      Unit
    ],
    t1: T1,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, R2, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[T1], E, R1, R2, Unit]]
  inline def call[T1, T2, R1, E](
    wrappedFunction: js.Function3[/* t1 */ T1, /* t2 */ T2, /* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], Unit],
    t1: T1,
    t2: T2,
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple2[T1, T2], E, R1, Unit, Unit]]
  inline def call[T1, T2, T3, E](
    wrappedFunction: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* cb */ js.Function1[/* err */ E, Unit], Unit],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function1[/* err */ E, Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, Unit, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple3[T1, T2, T3], E, Unit, Unit, Unit]]
  inline def call[T1, R1, R2, R3, E](
    wrappedFunction: js.Function2[
      /* t1 */ T1, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    t1: T1,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Array[T1], E, R1, R2, R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Array[T1], E, R1, R2, R3]]
  inline def call[T1, T2, R1, R2, E](
    wrappedFunction: js.Function3[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, Unit]]
  inline def call[T1, T2, T3, R1, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function2[/* err */ E, /* r1 */ R1, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function2[/* error */ E, /* r1 */ R1, Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, Unit, Unit]]
  inline def call[T1, T2, R1, R2, R3, E](
    wrappedFunction: js.Function3[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple2[T1, T2], E, R1, R2, R3]]
  inline def call[T1, T2, T3, R1, R2, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function3[/* err */ E, /* r1 */ R1, /* r2 */ R2, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function3[/* error */ E, /* r1 */ R1, /* r2 */ R2, Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, Unit]]
  inline def call[T1, T2, T3, R1, R2, R3, E](
    wrappedFunction: js.Function4[
      /* t1 */ T1, 
      /* t2 */ T2, 
      /* t3 */ T3, 
      /* cb */ js.Function4[/* err */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit], 
      Unit
    ],
    t1: T1,
    t2: T2,
    t3: T3,
    callback: js.Function4[/* error */ E, /* r1 */ R1, /* r2 */ R2, /* r3 */ R3, Unit]
  ): TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, R3] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(wrappedFunction.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedFunctionCall[js.Tuple3[T1, T2, T3], E, R1, R2, R3]]
  
  inline def exponential(): Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")().asInstanceOf[Backoff]
  inline def exponential(options: ExponentialOptions): Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")(options.asInstanceOf[js.Any]).asInstanceOf[Backoff]
  
  inline def fibonacci(): Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("fibonacci")().asInstanceOf[Backoff]
  inline def fibonacci(options: Options): Backoff = ^.asInstanceOf[js.Dynamic].applyDynamic("fibonacci")(options.asInstanceOf[js.Any]).asInstanceOf[Backoff]
  
  trait ExponentialOptions
    extends StObject
       with Options {
    
    var factor: js.UndefOr[Double] = js.undefined
  }
  object ExponentialOptions {
    
    inline def apply(): ExponentialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExponentialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExponentialOptions] (val x: Self) extends AnyVal {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    }
  }
  
  @js.native
  trait FunctionCallAny
    extends typings.backoff.mod.FunctionCall[js.Array[Any]]
       with FunctionCallArgsAny
  
  trait FunctionCallArgs[E, R1, R2, R3] extends StObject {
    
    /**
      * Emitted each time the wrapped function invokes its callback
      * @param results: wrapped function's return values
      */
    @JSName("addListener")
    def addListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type
    
    @JSName("emit")
    def emit_callback(event: callback, results: js.Tuple4[E, R1, R2, R3]): Boolean
    
    /**
      * Returns an array containing the last arguments passed to the completion callback
      * of the wrapped function. For example, to get the error code returned by the last
      * call, one would do the following.
      *
      * ``` js
      * var results = call.getLastResult();
      * // The error code is the first parameter of the callback.
      * var error = results[0];
      * ```
      *
      * Note that if the call was aborted, it will contain the abort error and not the
      * last error returned by the wrapped function.
      */
    def getLastResult(): js.Tuple4[E, R1, R2, R3]
    
    @JSName("listeners")
    def listeners_callback(event: callback): js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]]
    
    @JSName("on")
    def on_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type
    
    @JSName("once")
    def once_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type
    
    @JSName("prependListener")
    def prependListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type
    
    @JSName("prependOnceListener")
    def prependOnceListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type
    
    @JSName("removeListener")
    def removeListener_callback(event: callback, listener: js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]): this.type
  }
  object FunctionCallArgs {
    
    inline def apply[E, R1, R2, R3](
      addListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      emit: (callback, js.Tuple4[E, R1, R2, R3]) => Boolean,
      getLastResult: () => js.Tuple4[E, R1, R2, R3],
      listeners: callback => js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]],
      on: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      once: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      prependListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      prependOnceListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3],
      removeListener: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
    ): FunctionCallArgs[E, R1, R2, R3] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), getLastResult = js.Any.fromFunction0(getLastResult), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[FunctionCallArgs[E, R1, R2, R3]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionCallArgs[?, ?, ?, ?], E, R1, R2, R3] (val x: Self & (FunctionCallArgs[E, R1, R2, R3])) extends AnyVal {
      
      inline def setAddListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setEmit(value: (callback, js.Tuple4[E, R1, R2, R3]) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setGetLastResult(value: () => js.Tuple4[E, R1, R2, R3]): Self = StObject.set(x, "getLastResult", js.Any.fromFunction0(value))
      
      inline def setListeners(value: callback => js.Array[js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      inline def setOn(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPrependListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      inline def setPrependOnceListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(
        value: (callback, js.Function1[/* results */ js.Tuple4[E, R1, R2, R3], Unit]) => FunctionCallArgs[E, R1, R2, R3]
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  trait FunctionCallArgsAny extends StObject {
    
    /**
      * Emitted each time the wrapped function invokes its callback
      * @param results: wrapped function's return values
      */
    @JSName("addListener")
    def addListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[Any], Unit]): this.type
    
    @JSName("emit")
    def emit_callback(event: callback, results: js.Array[Any]): Boolean
    
    /**
      * Returns an array containing the last arguments passed to the completion callback
      * of the wrapped function. For example, to get the error code returned by the last
      * call, one would do the following.
      *
      * ``` js
      * var results = call.getLastResult();
      * // The error code is the first parameter of the callback.
      * var error = results[0];
      * ```
      *
      * Note that if the call was aborted, it will contain the abort error and not the
      * last error returned by the wrapped function.
      */
    def getLastResult(): js.Array[Any]
    
    @JSName("listeners")
    def listeners_callback(event: callback): js.Array[js.Function1[/* results */ js.Array[Any], Unit]]
    
    @JSName("on")
    def on_callback(event: callback, listener: js.Function1[/* results */ js.Array[Any], Unit]): this.type
    
    @JSName("once")
    def once_callback(event: callback, listener: js.Function1[/* results */ js.Array[Any], Unit]): this.type
    
    @JSName("prependListener")
    def prependListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[Any], Unit]): this.type
    
    @JSName("prependOnceListener")
    def prependOnceListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[Any], Unit]): this.type
    
    @JSName("removeListener")
    def removeListener_callback(event: callback, listener: js.Function1[/* results */ js.Array[Any], Unit]): this.type
  }
  object FunctionCallArgsAny {
    
    inline def apply(
      addListener: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny,
      emit: (callback, js.Array[Any]) => Boolean,
      getLastResult: () => js.Array[Any],
      listeners: callback => js.Array[js.Function1[/* results */ js.Array[Any], Unit]],
      on: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny,
      once: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny,
      prependListener: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny,
      prependOnceListener: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny,
      removeListener: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny
    ): FunctionCallArgsAny = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), getLastResult = js.Any.fromFunction0(getLastResult), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[FunctionCallArgsAny]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionCallArgsAny] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setEmit(value: (callback, js.Array[Any]) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setGetLastResult(value: () => js.Array[Any]): Self = StObject.set(x, "getLastResult", js.Any.fromFunction0(value))
      
      inline def setListeners(value: callback => js.Array[js.Function1[/* results */ js.Array[Any], Unit]]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      inline def setOn(value: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPrependListener(value: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      inline def setPrependOnceListener(value: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(value: (callback, js.Function1[/* results */ js.Array[Any], Unit]) => FunctionCallArgsAny): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait FunctionCallConstructor
    extends StObject
       with Instantiable3[
          (/* wrappedFunction */ js.Function1[
            (/* repeated */ Any) | (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]) | (/* wrappedFunction */ js.Function2[
            /* t1 */ js.Object, 
            (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]) | (/* wrappedFunction */ js.Function3[
            /* t1 */ js.Object, 
            /* t2 */ js.Object, 
            (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]) | (/* wrappedFunction */ js.Function4[
            /* t1 */ js.Object, 
            /* t2 */ js.Object, 
            /* t3 */ js.Object, 
            (/* cb */ js.Function1[/* err */ js.Object, Unit]) | (/* cb */ js.Function2[/* err */ js.Object, /* r1 */ js.Object, Unit]) | (/* cb */ js.Function3[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* cb */ js.Function4[/* err */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
            Unit
          ]), 
          (/* args */ js.Array[Any | js.Object | Unit]) | (/* args */ js.Tuple2[js.Object, js.Object]) | (/* args */ js.Tuple3[js.Object, js.Object, js.Object]), 
          (/* callback */ js.Function1[/* err */ js.Object, Unit]) | (/* callback */ js.Function2[
            (/* error */ Any) | (/* error */ js.Object), 
            (/* repeated */ Any) | (/* r1 */ js.Object), 
            Unit
          ]) | (/* callback */ js.Function3[/* error */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, Unit]) | (/* callback */ js.Function4[/* error */ js.Object, /* r1 */ js.Object, /* r2 */ js.Object, /* r3 */ js.Object, Unit]), 
          FunctionCallAny | (TypedFunctionCall[
            (js.Array[js.Object | Unit]) | (js.Tuple2[js.Object, js.Object]) | (js.Tuple3[js.Object, js.Object, js.Object]), 
            js.Object, 
            js.Object | Unit, 
            js.Object | Unit, 
            js.Object | Unit
          ])
        ]
  
  trait Options extends StObject {
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    var randomisationFactor: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setRandomisationFactor(value: Double): Self = StObject.set(x, "randomisationFactor", value.asInstanceOf[js.Any])
      
      inline def setRandomisationFactorUndefined: Self = StObject.set(x, "randomisationFactor", js.undefined)
    }
  }
  
  @js.native
  trait TypedFunctionCall[T, E, R1, R2, R3]
    extends typings.backoff.mod.FunctionCall[T]
       with FunctionCallArgs[E, R1, R2, R3]
}
