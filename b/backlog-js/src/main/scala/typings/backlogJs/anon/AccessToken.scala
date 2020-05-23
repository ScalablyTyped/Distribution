package typings.backlogJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var apiKey: js.UndefOr[String] = js.undefined
  var host: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object AccessToken {
  @scala.inline
  def apply(
    host: String,
    accessToken: String = null,
    apiKey: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): AccessToken = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
}

