package typings
package backoffLib.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCall[T]
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * Aborts the call and causes the completion callback to be invoked with an abort
       * error if the call was pending or running; does nothing otherwise. This method
       * can safely be called multiple times.
       */
  def abort(): scala.Unit = js.native
  /**
       * Emitted when a call is aborted.
       */
  @JSName("addListener")
  def addListener_abort(event: backoffLib.backoffLibStrings.abort, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
       * Emitted each time a backoff operation is started.
       *
       * @param number: backoff number, starts at 0
       * @param delay: backoff delay in milliseconds
       * @param err: the error that triggered the backoff operation
       */
  @JSName("addListener")
  def addListener_backoff(
    event: backoffLib.backoffLibStrings.backoff,
    listener: js.Function3[
      /* number */ scala.Double, 
      /* delay */ scala.Double, 
      /* error */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
       * Emitted each time the wrapped function is called.
       * @param args: wrapped function's arguments
       */
  @JSName("addListener")
  def addListener_call(event: backoffLib.backoffLibStrings.call, listener: js.Function1[/* args */ T, scala.Unit]): this.type = js.native
  @JSName("emit")
  def emit_abort(event: backoffLib.backoffLibStrings.abort): scala.Boolean = js.native
  @JSName("emit")
  def emit_backoff(event: backoffLib.backoffLibStrings.backoff, number: scala.Double, delay: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_backoff(
    event: backoffLib.backoffLibStrings.backoff,
    number: scala.Double,
    delay: scala.Double,
    error: js.Any
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_call(event: backoffLib.backoffLibStrings.call, args: T): scala.Boolean = js.native
  /**
       * Sets the maximum number of backoffs before the call is aborted. By default,
       * there is no limit on the number of backoffs that can be performed.
       *
       * This method should be called before `call.start()` otherwise an exception will
       * be thrown.
       *
       * @param maxNumberOfBackoffs: maximum number of backoffs before the call is aborted
       */
  def failAfter(maxNumberOfBackoffs: scala.Double): this.type = js.native
  /**
       * Returns the number of times the wrapped function call was retried. For a
       * wrapped function that succeeded immediately, this would return 0. This
       * method can be called at any point in time during the call life cycle, i.e.
       * before, during and after the wrapped function invocation.
       */
  def getNumRetries(): scala.Double = js.native
  /**
       * Returns whether the call is aborted.
       */
  def isAborted(): scala.Boolean = js.native
  /**
       * Returns whether the call is completed.
       */
  def isCompleted(): scala.Boolean = js.native
  /**
       * Returns whether the call is pending, i.e. hasn't been started.
       */
  def isPending(): scala.Boolean = js.native
  /**
       * Returns whether the call is in progress.
       */
  def isRunning(): scala.Boolean = js.native
  @JSName("listenerCount")
  def listenerCount_abort(`type`: backoffLib.backoffLibStrings.abort): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_backoff(`type`: backoffLib.backoffLibStrings.backoff): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_call(`type`: backoffLib.backoffLibStrings.call): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_callback(`type`: backoffLib.backoffLibStrings.callback): scala.Double = js.native
  @JSName("listeners")
  def listeners_abort(event: backoffLib.backoffLibStrings.abort): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_backoff(event: backoffLib.backoffLibStrings.backoff): js.Array[
    js.Function3[
      /* number */ scala.Double, 
      /* delay */ scala.Double, 
      /* error */ js.UndefOr[_], 
      scala.Unit
    ]
  ] = js.native
  @JSName("listeners")
  def listeners_call(event: backoffLib.backoffLibStrings.call): js.Array[js.Function1[/* args */ T, scala.Unit]] = js.native
  @JSName("on")
  def on_abort(event: backoffLib.backoffLibStrings.abort, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_backoff(
    event: backoffLib.backoffLibStrings.backoff,
    listener: js.Function3[
      /* number */ scala.Double, 
      /* delay */ scala.Double, 
      /* error */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_call(event: backoffLib.backoffLibStrings.call, listener: js.Function1[/* args */ T, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_abort(event: backoffLib.backoffLibStrings.abort, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_backoff(
    event: backoffLib.backoffLibStrings.backoff,
    listener: js.Function3[
      /* number */ scala.Double, 
      /* delay */ scala.Double, 
      /* error */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_call(event: backoffLib.backoffLibStrings.call, listener: js.Function1[/* args */ T, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_abort(event: backoffLib.backoffLibStrings.abort, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_backoff(
    event: backoffLib.backoffLibStrings.backoff,
    listener: js.Function3[
      /* number */ scala.Double, 
      /* delay */ scala.Double, 
      /* error */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_call(event: backoffLib.backoffLibStrings.call, listener: js.Function1[/* args */ T, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_abort(event: backoffLib.backoffLibStrings.abort, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backoff(
    event: backoffLib.backoffLibStrings.backoff,
    listener: js.Function3[
      /* number */ scala.Double, 
      /* delay */ scala.Double, 
      /* error */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_call(event: backoffLib.backoffLibStrings.call, listener: js.Function1[/* args */ T, scala.Unit]): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_abort(event: backoffLib.backoffLibStrings.abort): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_backoff(event: backoffLib.backoffLibStrings.backoff): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_call(event: backoffLib.backoffLibStrings.call): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_callback(event: backoffLib.backoffLibStrings.callback): this.type = js.native
  @JSName("removeListener")
  def removeListener_abort(event: backoffLib.backoffLibStrings.abort, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_backoff(
    event: backoffLib.backoffLibStrings.backoff,
    listener: js.Function3[
      /* number */ scala.Double, 
      /* delay */ scala.Double, 
      /* error */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_call(event: backoffLib.backoffLibStrings.call, listener: js.Function1[/* args */ T, scala.Unit]): this.type = js.native
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
  def retryIf(predicate: js.Function1[/* error */ js.Any, scala.Boolean]): this.type = js.native
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
  def start(): scala.Unit = js.native
}

