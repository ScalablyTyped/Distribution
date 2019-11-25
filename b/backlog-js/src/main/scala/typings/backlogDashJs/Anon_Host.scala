package typings.backlogDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: String
  var redirectUri: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(host: String, redirectUri: String = null, state: String = null): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Host]
  }
}

