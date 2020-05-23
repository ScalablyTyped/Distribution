package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionRequest extends js.Object {
  var appId: String
  var capabilities: js.Array[Capability]
  var language: js.UndefOr[String] = js.undefined
  var requestSessionTimeout: Double
}

object SessionRequest {
  @scala.inline
  def apply(
    appId: String,
    capabilities: js.Array[Capability],
    requestSessionTimeout: Double,
    language: String = null
  ): SessionRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], requestSessionTimeout = requestSessionTimeout.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionRequest]
  }
}

