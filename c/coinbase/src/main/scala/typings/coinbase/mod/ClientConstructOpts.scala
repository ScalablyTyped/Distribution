package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConstructOpts extends js.Object {
  /**
    * OAuth2 access token
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    * API key (obtain this from the coinbase website)
    */
  var apiKey: js.UndefOr[String] = js.undefined
  /**
    * API key secret (obtain this from the coinbase website)
    */
  var apiSecret: js.UndefOr[String] = js.undefined
  /**
    * API version in 'yyyy-mm-dd' format, see https://developers.coinbase.com/api/v2#changelog
    */
  var version: js.UndefOr[String] = js.undefined
}

object ClientConstructOpts {
  @scala.inline
  def apply(
    accessToken: String = null,
    apiKey: String = null,
    apiSecret: String = null,
    version: String = null
  ): ClientConstructOpts = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (apiSecret != null) __obj.updateDynamic("apiSecret")(apiSecret.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConstructOpts]
  }
}

