package typings.awsSdk.configMod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPOptions extends js.Object {
  /**
    * the Agent object to perform HTTP requests with.
    * Used for connection pooling.
    * Defaults to the global agent (http.globalAgent) for non-SSL connections.
    */
  var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.native
  /**
    * The maximum time in milliseconds that the connection phase of the request
    * should be allowed to take. This only limits the connection phase and has
    * no impact once the socket has established a connection.
    * Used in node.js environments only.
    */
  var connectTimeout: js.UndefOr[Double] = js.native
  /**
    * the URL to proxy requests through.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds to wait before giving up on a connection attempt.
    * Defaults to two minutes (120000).
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Whether the SDK will send asynchronous HTTP requests.
    * Used in the browser environment only.
    * Set to false to send requests synchronously.
    * Defaults to true (async on).
    */
  var xhrAsync: js.UndefOr[Boolean] = js.native
  /**
    * Sets the 'withCredentials' property of an XMLHttpRequest object.
    * Used in the browser environment only.
    * Defaults to false.
    */
  var xhrWithCredentials: js.UndefOr[Boolean] = js.native
}

object HTTPOptions {
  @scala.inline
  def apply(
    agent: Agent | typings.node.httpsMod.Agent = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    proxy: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    xhrAsync: js.UndefOr[Boolean] = js.undefined,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): HTTPOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrAsync)) __obj.updateDynamic("xhrAsync")(xhrAsync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPOptions]
  }
}

