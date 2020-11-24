package typings.awsSdk.configBaseMod

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The number of milliseconds a request can take before automatically being terminated.
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
  def apply(): HTTPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPOptions]
  }
  
  @scala.inline
  implicit class HTTPOptionsOps[Self <: HTTPOptions] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setXhrAsync(value: Boolean): Self = this.set("xhrAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrAsync: Self = this.set("xhrAsync", js.undefined)
    
    @scala.inline
    def setXhrWithCredentials(value: Boolean): Self = this.set("xhrWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrWithCredentials: Self = this.set("xhrWithCredentials", js.undefined)
  }
}
