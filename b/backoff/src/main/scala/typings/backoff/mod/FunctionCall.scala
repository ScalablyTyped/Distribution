package typings.backoff.mod

import org.scalablytyped.runtime.TopLevel
import typings.backoff.backoffStrings.abort
import typings.backoff.backoffStrings.backoff
import typings.backoff.backoffStrings.callback
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  /**
    * Emitted each time the wrapped function is called.
    * @param args: wrapped function's arguments
    */
  @JSName("addListener")
  def addListener_call(event: typings.backoff.backoffStrings.call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
  
  @JSName("emit")
  def emit_abort(event: abort): Boolean = js.native
  @JSName("emit")
  def emit_backoff(event: backoff, number: Double, delay: Double): Boolean = js.native
  @JSName("emit")
  def emit_backoff(event: backoff, number: Double, delay: Double, error: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_call(event: typings.backoff.backoffStrings.call, args: T): Boolean = js.native
  
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
  
  @JSName("listenerCount")
  def listenerCount_abort(`type`: abort): Double = js.native
  @JSName("listenerCount")
  def listenerCount_backoff(`type`: backoff): Double = js.native
  @JSName("listenerCount")
  def listenerCount_call(`type`: typings.backoff.backoffStrings.call): Double = js.native
  @JSName("listenerCount")
  def listenerCount_callback(`type`: callback): Double = js.native
  
  @JSName("listeners")
  def listeners_abort(event: abort): js.Array[js.Function0[Unit]] = js.native
  @JSName("listeners")
  def listeners_backoff(event: backoff): js.Array[
    js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[_], Unit]
  ] = js.native
  @JSName("listeners")
  def listeners_call(event: typings.backoff.backoffStrings.call): js.Array[js.Function1[/* args */ T, Unit]] = js.native
  
  @JSName("on")
  def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_call(event: typings.backoff.backoffStrings.call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
  
  @JSName("once")
  def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_call(event: typings.backoff.backoffStrings.call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_call(event: typings.backoff.backoffStrings.call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_call(event: typings.backoff.backoffStrings.call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
  
  @JSName("removeAllListeners")
  def removeAllListeners_abort(event: abort): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_backoff(event: backoff): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_call(event: typings.backoff.backoffStrings.call): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_callback(event: callback): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_call(event: typings.backoff.backoffStrings.call, listener: js.Function1[/* args */ T, Unit]): this.type = js.native
  
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
  def retryIf(predicate: js.Function1[/* error */ js.Any, Boolean]): this.type = js.native
  
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
object FunctionCall extends TopLevel[FunctionCallConstructor]
