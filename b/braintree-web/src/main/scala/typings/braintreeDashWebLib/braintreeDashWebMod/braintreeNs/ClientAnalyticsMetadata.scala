package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object is returned by {@link Client#getConfiguration|getConfiguration}. This information is used extensively by other Braintree modules to properly configure themselves.
  * @property {object} client The braintree-web/client parameters.
  * @property {string} client.authorization A tokenizationKey or clientToken.
  * @property {object} gatewayConfiguration Gateway-supplied configuration.
  * @property {object} analyticsMetadata Analytics-specific data.
  * @property {string} analyticsMetadata.sessionId Uniquely identifies a browsing session.
  * @property {string} analyticsMetadata.sdkVersion The braintree.js version.
  * @property {string} analyticsMetadata.merchantAppId Identifies the merchant's web app.
  */
trait ClientAnalyticsMetadata extends js.Object {
  var merchantAppId: java.lang.String
  var sdkVersion: java.lang.String
  var sessionId: java.lang.String
}

object ClientAnalyticsMetadata {
  @scala.inline
  def apply(merchantAppId: java.lang.String, sdkVersion: java.lang.String, sessionId: java.lang.String): ClientAnalyticsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("merchantAppId")(merchantAppId)
    __obj.updateDynamic("sdkVersion")(sdkVersion)
    __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[ClientAnalyticsMetadata]
  }
}

