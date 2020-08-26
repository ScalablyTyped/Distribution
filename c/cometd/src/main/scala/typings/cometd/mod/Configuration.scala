package typings.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * Determines whether or not the Bayeux message type (handshake, connect, disconnect) is
    * appended to the URL of the Bayeux server (see above).
    */
  var appendMessageTypeToURL: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether multiple publishes that get queued are sent as a batch on the first
    * occasion, without requiring explicit batching.
    */
  var autoBatch: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds that the backoff time increments every time a connection with the
    * Bayeux server fails. CometD attempts to reconnect after the backoff time elapses.
    */
  var backoffIncrement: js.UndefOr[Double] = js.native
  /**
    * The maximum number of milliseconds to wait for a WebSocket connection to be opened. It does
    * not apply to HTTP connections. A timeout value of 0 means to wait forever.
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  /**
    * The log level. Possible values are: "warn", "info", "debug". Output to `window.console` if
    * available.
    */
  var logLevel: js.UndefOr[String] = js.native
  /**
    * The maximum number of milliseconds of the backoff time after which the backoff time is not
    * incremented further.
    */
  var maxBackoff: js.UndefOr[Double] = js.native
  /**
    * The maximum number of connections used to connect to the Bayeux server. Change this value
    * only if you know exactly the client’s connection limit and what "request queued behind long
    * poll" means.
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * The maximum number of milliseconds to wait before considering a request to the Bayeux server
    * failed.
    */
  var maxNetworkDelay: js.UndefOr[Double] = js.native
  /**
    * The max length of the URI for a request made with the callback-polling transport. Microsoft
    * Internet Explorer 7 and 8 are known to limit the URI length, so single large messages sent by
    * CometD may fail to remain within the max URI length when encoded in JSON.
    */
  var maxURILength: js.UndefOr[Double] = js.native
  /**
    * An object containing the request headers to be sent for every Bayeux request (for example,
    * `{"My-Custom-Header": "MyValue"}`).
    */
  var requestHeaders: js.UndefOr[js.Object] = js.native
  /**
    * Only applies to the websocket transport. Determines whether to stick using the websocket
    * transport when a websocket transport failure has been detected after the websocket transport
    * was able to successfully connect to the server.
    */
  var stickyReconnect: js.UndefOr[Boolean] = js.native
  /**
    * The URL of the Bayeux server this client will connect to.
    */
  var url: String = js.native
  /**
    * Uses the scheduler service available in Web Workers via Worker.setTimeout(fn, delay) rather
    * than using that available via Window.setTimeout(fn, delay). Browsers are now throttling the
    * Window scheduler in background tabs to save battery in mobile devices, so the Window scheduler
    * events are delayed by possibly several seconds, causing CometD sessions to timeout on the
    * server. The Worker scheduler is not throttled and guarantees that scheduler events happen
    * on time.
    */
  var useWorkerScheduler: js.UndefOr[Boolean] = js.native
}

object Configuration {
  @scala.inline
  def apply(url: String): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendMessageTypeToURL(value: Boolean): Self = this.set("appendMessageTypeToURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendMessageTypeToURL: Self = this.set("appendMessageTypeToURL", js.undefined)
    @scala.inline
    def setAutoBatch(value: Boolean): Self = this.set("autoBatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBatch: Self = this.set("autoBatch", js.undefined)
    @scala.inline
    def setBackoffIncrement(value: Double): Self = this.set("backoffIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoffIncrement: Self = this.set("backoffIncrement", js.undefined)
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setMaxBackoff(value: Double): Self = this.set("maxBackoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBackoff: Self = this.set("maxBackoff", js.undefined)
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    @scala.inline
    def setMaxNetworkDelay(value: Double): Self = this.set("maxNetworkDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNetworkDelay: Self = this.set("maxNetworkDelay", js.undefined)
    @scala.inline
    def setMaxURILength(value: Double): Self = this.set("maxURILength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxURILength: Self = this.set("maxURILength", js.undefined)
    @scala.inline
    def setRequestHeaders(value: js.Object): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    @scala.inline
    def setStickyReconnect(value: Boolean): Self = this.set("stickyReconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyReconnect: Self = this.set("stickyReconnect", js.undefined)
    @scala.inline
    def setUseWorkerScheduler(value: Boolean): Self = this.set("useWorkerScheduler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWorkerScheduler: Self = this.set("useWorkerScheduler", js.undefined)
  }
  
}

