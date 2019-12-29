package typings.backoff.backoffMod

import typings.backoff.backoffStrings.backoff
import typings.backoff.backoffStrings.fail
import typings.backoff.backoffStrings.ready
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backoff", "Backoff")
@js.native
class Backoff protected () extends EventEmitter {
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
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
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
  def addListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
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
  def backoff(error: js.Any): Unit = js.native
  @JSName("emit")
  def emit_backoff(event: backoff, number: Double, delay: Double): Boolean = js.native
  @JSName("emit")
  def emit_backoff(event: backoff, number: Double, delay: Double, error: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_fail(event: fail): Boolean = js.native
  @JSName("emit")
  def emit_fail(event: fail, error: js.Any): Boolean = js.native
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
  @JSName("listenerCount")
  def listenerCount_backoff(`type`: backoff): Double = js.native
  @JSName("listenerCount")
  def listenerCount_fail(`type`: fail): Double = js.native
  @JSName("listenerCount")
  def listenerCount_ready(`type`: ready): Double = js.native
  @JSName("listeners")
  def listeners_backoff(event: backoff): js.Array[
    js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[_], Unit]
  ] = js.native
  @JSName("listeners")
  def listeners_fail(event: fail): js.Array[js.Function1[/* error */ js.UndefOr[_], Unit]] = js.native
  @JSName("listeners")
  def listeners_ready(event: ready): js.Array[js.Function2[/* number */ Double, /* delay */ Double, Unit]] = js.native
  @JSName("on")
  def on_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ready(event: ready, listener: js.Function2[/* number */ Double, /* delay */ Double, Unit]): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_backoff(event: backoff): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_fail(event: fail): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_ready(event: ready): this.type = js.native
  @JSName("removeListener")
  def removeListener_backoff(
    event: backoff,
    listener: js.Function3[/* number */ Double, /* delay */ Double, /* error */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_fail(event: fail, listener: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): this.type = js.native
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

