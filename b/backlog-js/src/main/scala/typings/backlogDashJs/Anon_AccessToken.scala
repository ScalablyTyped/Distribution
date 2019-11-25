package typings.backlogDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var apiKey: js.UndefOr[String] = js.undefined
  var host: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_AccessToken {
  @scala.inline
  def apply(host: String, accessToken: String = null, apiKey: String = null, timeout: Int | Double = null): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

