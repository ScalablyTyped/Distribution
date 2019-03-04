package typings
package backlogDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessToken extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AccessToken {
  @scala.inline
  def apply(
    host: java.lang.String,
    accessToken: java.lang.String = null,
    apiKey: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Anon_AccessToken = {
    val __obj = js.Dynamic.literal(host = host)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessToken]
  }
}

