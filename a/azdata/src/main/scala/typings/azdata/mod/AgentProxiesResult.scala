package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentProxiesResult extends ResultStatus {
  var proxies: js.Array[AgentProxyInfo]
}

object AgentProxiesResult {
  @scala.inline
  def apply(errorMessage: String, proxies: js.Array[AgentProxyInfo], success: Boolean): AgentProxiesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentProxiesResult]
  }
}

