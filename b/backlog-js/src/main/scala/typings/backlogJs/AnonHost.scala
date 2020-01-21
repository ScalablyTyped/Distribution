package typings.backlogJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var redirectUri: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object AnonHost {
  @scala.inline
  def apply(host: String, redirectUri: String = null, state: String = null): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

