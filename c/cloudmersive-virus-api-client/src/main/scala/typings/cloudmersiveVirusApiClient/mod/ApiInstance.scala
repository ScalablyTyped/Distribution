package typings.cloudmersiveVirusApiClient.mod

import typings.cloudmersiveVirusApiClient.anon.Apikey
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiInstance extends js.Object {
  /**
    * @param agent http.Agent - Used to save and return cookies in a node.js (
    * non-browser) setting, if this.enableCookies is set to true.
    */
  var agent: Agent = js.native
  /**
    * @param authentications object - The authentication methods to be included for all API calls.
    */
  var authentications: Apikey = js.native
  /**
    * @param basePath string - The base URL against which to resolve every API
    * call's (relative) path.
    * default https://api.cloudmersive.com
    */
  var basePath: String = js.native
  /**
    * If set to false an additional timestamp parameter is added to all API GET calls to
    * prevent browser caching
    * @param cache boolean - If set to false an additional timestamp parameter is added to
    * all API GET calls to prevent browser caching
    * default true
    */
  var cache: Boolean = js.native
  /**
    * @param defaultHeaders string[] - The default HTTP headers to be included for all API calls.
    * default {}
    */
  var defaultHeaders: js.Array[String] = js.native
  /**
    * @param enableCookies boolean - If set to true, the client will save the cookies
    * from each server response, and return them in the next request.
    * default false
    */
  var enableCookies: Boolean = js.native
  /**
    * @param requestAgent null | http.Agent - Allow user to override superagent agent
    */
  var requestAgent: Null | Agent = js.native
  /**
    * @param timeout number - The default HTTP timeout for all API calls.
    * default 60000
    */
  var timeout: Double = js.native
}

object ApiInstance {
  @scala.inline
  def apply(
    agent: Agent,
    authentications: Apikey,
    basePath: String,
    cache: Boolean,
    defaultHeaders: js.Array[String],
    enableCookies: Boolean,
    timeout: Double
  ): ApiInstance = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], authentications = authentications.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any], enableCookies = enableCookies.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInstance]
  }
  @scala.inline
  implicit class ApiInstanceOps[Self <: ApiInstance] (val x: Self) extends AnyVal {
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
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthentications(value: Apikey): Self = this.set("authentications", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultHeadersVarargs(value: String*): Self = this.set("defaultHeaders", js.Array(value :_*))
    @scala.inline
    def setDefaultHeaders(value: js.Array[String]): Self = this.set("defaultHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableCookies(value: Boolean): Self = this.set("enableCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestAgent(value: Agent): Self = this.set("requestAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestAgentNull: Self = this.set("requestAgent", null)
  }
  
}

