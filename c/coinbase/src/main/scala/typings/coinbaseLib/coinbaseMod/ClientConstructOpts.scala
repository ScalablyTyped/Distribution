package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConstructOpts extends js.Object {
  /**
    * OAuth2 access token
    */
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * API key (obtain this from the coinbase website)
    */
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * API key secret (obtain this from the coinbase website)
    */
  var apiSecret: js.UndefOr[java.lang.String] = js.undefined
  /**
    * API version in 'yyyy-mm-dd' format, see https://developers.coinbase.com/api/v2#changelog
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ClientConstructOpts {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    apiKey: java.lang.String = null,
    apiSecret: java.lang.String = null,
    version: java.lang.String = null
  ): ClientConstructOpts = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (apiSecret != null) __obj.updateDynamic("apiSecret")(apiSecret)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ClientConstructOpts]
  }
}

