package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentProxiesResult extends ResultStatus {
  var proxies: js.Array[AgentProxyInfo] = js.native
}

object AgentProxiesResult {
  @scala.inline
  def apply(errorMessage: String, proxies: js.Array[AgentProxyInfo], success: Boolean): AgentProxiesResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentProxiesResult]
  }
  @scala.inline
  implicit class AgentProxiesResultOps[Self <: AgentProxiesResult] (val x: Self) extends AnyVal {
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
    def setProxiesVarargs(value: AgentProxyInfo*): Self = this.set("proxies", js.Array(value :_*))
    @scala.inline
    def setProxies(value: js.Array[AgentProxyInfo]): Self = this.set("proxies", value.asInstanceOf[js.Any])
  }
  
}

