package typings.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * Determines whether or not the Bayeux message type (handshake, connect, disconnect) is
    * appended to the URL of the Bayeux server (see above).
    */
  var appendMessageTypeToURL: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether multiple publishes that get queued are sent as a batch on the first
    * occasion, without requiring explicit batching.
    */
  var autoBatch: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds that the backoff time increments every time a connection with the
    * Bayeux server fails. CometD attempts to reconnect after the backoff time elapses.
    */
  var backoffIncrement: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of milliseconds to wait for a WebSocket connection to be opened. It does
    * not apply to HTTP connections. A timeout value of 0 means to wait forever.
    */
  var connectTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The log level. Possible values are: "warn", "info", "debug". Output to `window.console` if
    * available.
    */
  var logLevel: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of milliseconds of the backoff time after which the backoff time is not
    * incremented further.
    */
  var maxBackoff: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of connections used to connect to the Bayeux server. Change this value
    * only if you know exactly the client’s connection limit and what "request queued behind long
    * poll" means.
    */
  var maxConnections: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of milliseconds to wait before considering a request to the Bayeux server
    * failed.
    */
  var maxNetworkDelay: js.UndefOr[Double] = js.undefined
  /**
    * The max length of the URI for a request made with the callback-polling transport. Microsoft
    * Internet Explorer 7 and 8 are known to limit the URI length, so single large messages sent by
    * CometD may fail to remain within the max URI length when encoded in JSON.
    */
  var maxURILength: js.UndefOr[Double] = js.undefined
  /**
    * An object containing the request headers to be sent for every Bayeux request (for example,
    * `{"My-Custom-Header": "MyValue"}`).
    */
  var requestHeaders: js.UndefOr[js.Object] = js.undefined
  /**
    * Only applies to the websocket transport. Determines whether to stick using the websocket
    * transport when a websocket transport failure has been detected after the websocket transport
    * was able to successfully connect to the server.
    */
  var stickyReconnect: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL of the Bayeux server this client will connect to.
    */
  var url: String
  /**
    * Uses the scheduler service available in Web Workers via Worker.setTimeout(fn, delay) rather
    * than using that available via Window.setTimeout(fn, delay). Browsers are now throttling the
    * Window scheduler in background tabs to save battery in mobile devices, so the Window scheduler
    * events are delayed by possibly several seconds, causing CometD sessions to timeout on the
    * server. The Worker scheduler is not throttled and guarantees that scheduler events happen
    * on time.
    */
  var useWorkerScheduler: js.UndefOr[Boolean] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    url: String,
    appendMessageTypeToURL: js.UndefOr[Boolean] = js.undefined,
    autoBatch: js.UndefOr[Boolean] = js.undefined,
    backoffIncrement: Int | Double = null,
    connectTimeout: Int | Double = null,
    logLevel: String = null,
    maxBackoff: Int | Double = null,
    maxConnections: Int | Double = null,
    maxNetworkDelay: Int | Double = null,
    maxURILength: Int | Double = null,
    requestHeaders: js.Object = null,
    stickyReconnect: js.UndefOr[Boolean] = js.undefined,
    useWorkerScheduler: js.UndefOr[Boolean] = js.undefined
  ): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(appendMessageTypeToURL)) __obj.updateDynamic("appendMessageTypeToURL")(appendMessageTypeToURL.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBatch)) __obj.updateDynamic("autoBatch")(autoBatch.asInstanceOf[js.Any])
    if (backoffIncrement != null) __obj.updateDynamic("backoffIncrement")(backoffIncrement.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (maxBackoff != null) __obj.updateDynamic("maxBackoff")(maxBackoff.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (maxNetworkDelay != null) __obj.updateDynamic("maxNetworkDelay")(maxNetworkDelay.asInstanceOf[js.Any])
    if (maxURILength != null) __obj.updateDynamic("maxURILength")(maxURILength.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyReconnect)) __obj.updateDynamic("stickyReconnect")(stickyReconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(useWorkerScheduler)) __obj.updateDynamic("useWorkerScheduler")(useWorkerScheduler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

