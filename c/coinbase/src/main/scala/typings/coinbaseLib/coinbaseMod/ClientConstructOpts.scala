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

