package typings.cloudmersiveVirusApiClient.mod

import typings.cloudmersiveVirusApiClient.AnonApikey
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiInstance extends js.Object {
  /**
    * @param agent http.Agent - Used to save and return cookies in a node.js (
    * non-browser) setting, if this.enableCookies is set to true.
    */
  var agent: Agent
  /**
    * @param authentications object - The authentication methods to be included for all API calls.
    */
  var authentications: AnonApikey
  /**
    * @param basePath string - The base URL against which to resolve every API
    * call's (relative) path.
    * default https://api.cloudmersive.com
    */
  var basePath: String
  /**
    * If set to false an additional timestamp parameter is added to all API GET calls to
    * prevent browser caching
    * @param cache boolean - If set to false an additional timestamp parameter is added to
    * all API GET calls to prevent browser caching
    * default true
    */
  var cache: Boolean
  /**
    * @param defaultHeaders string[] - The default HTTP headers to be included for all API calls.
    * default {}
    */
  var defaultHeaders: js.Array[String]
  /**
    * @param enableCookies boolean - If set to true, the client will save the cookies
    * from each server response, and return them in the next request.
    * default false
    */
  var enableCookies: Boolean
  /**
    * @param requestAgent null | http.Agent - Allow user to override superagent agent
    */
  var requestAgent: Null | Agent
  /**
    * @param timeout number - The default HTTP timeout for all API calls.
    * default 60000
    */
  var timeout: Double
}

object ApiInstance {
  @scala.inline
  def apply(
    agent: Agent,
    authentications: AnonApikey,
    basePath: String,
    cache: Boolean,
    defaultHeaders: js.Array[String],
    enableCookies: Boolean,
    timeout: Double,
    requestAgent: Agent = null
  ): ApiInstance = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], authentications = authentications.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], defaultHeaders = defaultHeaders.asInstanceOf[js.Any], enableCookies = enableCookies.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    if (requestAgent != null) __obj.updateDynamic("requestAgent")(requestAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInstance]
  }
}

