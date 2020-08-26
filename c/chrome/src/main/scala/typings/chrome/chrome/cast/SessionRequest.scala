package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionRequest extends js.Object {
  var appId: String = js.native
  var capabilities: js.Array[Capability] = js.native
  var language: String | Null = js.native
  var requestSessionTimeout: Double = js.native
}

object SessionRequest {
  @scala.inline
  def apply(appId: String, capabilities: js.Array[Capability], requestSessionTimeout: Double): SessionRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], requestSessionTimeout = requestSessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionRequest]
  }
  @scala.inline
  implicit class SessionRequestOps[Self <: SessionRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[Capability]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestSessionTimeout(value: Double): Self = this.set("requestSessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageNull: Self = this.set("language", null)
  }
  
}

